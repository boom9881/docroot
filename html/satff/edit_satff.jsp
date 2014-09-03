<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = ParamUtil.getLong(request, "userId");

BasicInformation basicInformation = null;

if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(userId);
}
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
	<aui:input name="name" label="姓名" value="" />
	<aui:input name="sex" label="性别" value="" />
	<aui:input name="name" label="民族" value="" />
	<aui:input name="sex" label="婚姻状况" value=""/>
	<aui:input name="name" label="健康状况" value="" />
	<aui:input name="sex" label="籍贯" value="" />
	<aui:input name="name" label="出生年月" value="" />
	<aui:input name="name" label="身份证号" value="" />
	<aui:input name="sex" label="户口性质" value="" />
	<aui:input name="name" label="最高学历" value="" />
	<aui:input name="sex" label="政治面貌" value="" />
	<aui:input name="sex" label="存档地点" value="" />
	
	
	<aui:button type="submit" value="保存" />
	<aui:button value="取消" />
</aui:form>