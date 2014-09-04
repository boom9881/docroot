<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = ParamUtil.getLong(request, "userId");

BasicInformation basicInformation = null;

if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(userId);
}

request.setAttribute("user.id", userId);
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"
	title='<%= (basicInformation == null) ? "员工信息登记" : "员工信息： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
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

<%!
private static final String[] _CATEGORY_NAMES = {""};
// 基本信息、（个人收款信息、劳动关系（合同信息）、社保信息）、教育经历、工作经历、家庭关系
private static final String[] mainSections = "basic_information,staff_information,education,work_experience,family_relationship".split(",");

private static final String[][] categorySections = {mainSections};
%>