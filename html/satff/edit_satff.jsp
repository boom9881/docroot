<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long biId = ParamUtil.getLong(request, "biId");
long userId = ParamUtil.getLong(request, "userId");

if(portletName.equals("individual_info")){
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
if(Validator.isNotNull(basicInformation)){
	mainSections = "basic_information,password,staff_information,education,work_experience,family_relationship".split(",");
}

if(portletName.equals("individual_info")){
	mainSections = "basic_information,education,work_experience,family_relationship".split(",");
	
	if(Validator.isNotNull(basicInformation)){
		mainSections = "basic_information,password,education,work_experience,family_relationship".split(",");
	}
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

<liferay-ui:error exception="<%= com.liferay.portal.DuplicateUserEmailAddressException.class %>" message="常用邮箱已经存在。" focusField="mail" />
<liferay-ui:error exception="<%= com.liferay.portal.UserEmailAddressException.class %>" message="邮箱格式错误。" focusField="mail" />

<liferay-ui:error key="dhst.intranet.satff.pwd.invalid" message="修改密码失败：请确认输入密码是否一致。" />
<liferay-ui:error key="dhst.intranet.satff.time.invalid.ei.laborContract" message="劳动合同期限的开始时间不能晚于结束时间" />
<liferay-ui:error key="dhst.intranet.satff.time.invalid.ei.probationPeriod" message="试用期限的开始时间不能晚于结束时间" />
<liferay-ui:error key="dhst.intranet.satff.time.invalid.edu" message="教育经历的开始时间不能晚于结束时间。" />
<liferay-ui:error key="dhst.intranet.satff.edu.university.null" message="教育经历的毕业院校不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.edu.professional.null" message="教育经历的专业不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.time.invalid.we" message="工作经历的开始时间不能晚于结束时间。" />
<liferay-ui:error key="dhst.intranet.satff.we.workUnit.null" message="工作经历的工作单位不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.we.onceJob.null" message="工作经历的曾任职务不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.fr.name.null" message="家庭关系的姓名不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.fr.relationship.null" message="家庭关系的与本人关系不能为空。" />
<liferay-ui:error key="dhst.intranet.satff.fr.contactPhone.null" message="家庭关系的联系电话不能为空。" />

<c:choose>
	<c:when test='<%= portletName.equals("individual_info") %>'>
		<liferay-ui:header
			title='<%= (basicInformation == null) ? "员工信息登记" : "员工信息： " + basicInformation.getName() %>'
		/>
	</c:when>
	<c:otherwise>
		<liferay-ui:header
			backURL="<%= backURL.toString() %>"
			title='<%= (basicInformation == null) ? "员工信息登记" : "员工信息： " + basicInformation.getName() %>'
		/>
	</c:otherwise>
</c:choose>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:input type="hidden" name="biId" value="<%= biId %>" />
	<aui:input type="hidden" name="userId" value="<%= userId %>" />
	<aui:input type="hidden" name="portletName" value="<%= portletName %>" />
	
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
	
	<c:choose>
		<c:when test='<%= portletName.equals("individual_info") %>'>
			<liferay-ui:form-navigator
				categoryNames="<%= _CATEGORY_NAMES %>"
				categorySections="<%= categorySections %>"
				htmlBottom="<%= htmlBottom %>"
				htmlTop="<%= htmlTop %>"
				jspPath="/html/satff/"
			/>
		</c:when>
		<c:otherwise>
			<liferay-ui:form-navigator
				backURL="<%= backURL %>"
				categoryNames="<%= _CATEGORY_NAMES %>"
				categorySections="<%= categorySections %>"
				htmlBottom="<%= htmlBottom %>"
				htmlTop="<%= htmlTop %>"
				jspPath="/html/satff/"
			/>
		</c:otherwise>
	</c:choose>
</aui:form>
