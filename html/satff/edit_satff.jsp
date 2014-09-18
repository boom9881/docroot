<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
int userRole = OverTimeSum.isSatff(themeDisplay.getUserId());// 1=hr;2=satff

long biId = ParamUtil.getLong(request, "biId");
long userId = ParamUtil.getLong(request, "userId");

if(userRole == 2){
	userId = themeDisplay.getUserId();
}

BasicInformation basicInformation = null;

if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.findByUserId(userId);
	
	biId = basicInformation.getId();
}

request.setAttribute("user.id", userId);
request.setAttribute("bi.id", biId);

String[] _CATEGORY_NAMES = {""};
//基本信息、（个人收款信息、劳动关系（合同信息）、社保信息）、教育经历、工作经历、家庭关系
String[] mainSections = "basic_information,staff_information,education,work_experience,family_relationship".split(",");

if(userRole == 2){
	mainSections = "basic_information,education,work_experience,family_relationship".split(",");
}

String[][] categorySections = {mainSections};
%>

<portlet:renderURL var="redirectURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="biId" value="<%= String.valueOf(biId) %>" />
	<portlet:param name="userId" value="<%= String.valueOf(userId) %>" />
	<c:if test='<%= Validator.isNull(biId) %>'>
		<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
	</c:if>
	<c:if test='<%= Validator.isNotNull(biId) %>'>
		<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
	</c:if>
</portlet:renderURL>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editSatff" />
	<portlet:param name="biId" value="<%= String.valueOf(biId) %>" />
	<portlet:param name="userId" value="<%= String.valueOf(userId) %>" />
	<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
	<portlet:param name="redirect" value="<%= redirectURL.toString() %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"
	title='<%= (basicInformation == null) ? "员工信息登记" : "员工信息： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:input type="hidden" name="biId" value="<%= biId %>" />
	<aui:input type="hidden" name="userId" value="<%= userId %>" />
	
	<liferay-util:buffer var="htmlTop">
		<c:if test="<%= basicInformation != null %>">
			<div class="user-info">
				<div class="float-container">
					<span class="user-name"><%= HtmlUtil.escape(basicInformation.getName()) %></span>
				</div>
			</div>
		</c:if>
	</liferay-util:buffer>
	
	<liferay-util:buffer var="htmlBottom">
	</liferay-util:buffer>
	
	<liferay-ui:form-navigator
		backURL="<%= backURL %>"
		categoryNames="<%= _CATEGORY_NAMES %>"
		categorySections="<%= categorySections %>"
		htmlBottom="<%= htmlBottom %>"
		htmlTop="<%= htmlTop %>"
		jspPath="/html/satff/"
	/>
</aui:form>
