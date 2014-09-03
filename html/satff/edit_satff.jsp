<%@ include file="/html/init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long satffId = ParamUtil.getLong(request, "satffId");

Satff satff = null;

if(Validator.isNotNull(satffId)){
		
}
%>

<portlet:actionURL var="editUserActionURL">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL %>"
	title='<%= (satff == null) ? "员工信息登记" : "员工信息： " + satff.getName() %>'
/>

<aui:form action="<%= backURL.toString() %>" method="post" name="fm">
	<aui:input name="name" label="姓名" value="" />
	<aui:input name="name" label="姓名" value="" />
	
	<input type="submit" value="submit" />
	
</aui:form>