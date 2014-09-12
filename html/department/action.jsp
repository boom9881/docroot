<%@ include file="/html/department/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Department department = (Department)row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editDepartmentURL">
		<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
		<portlet:param name="cmd" value="<%= Constants.CMD %>" />
		<portlet:param name="id" value="<%= String.valueOf(department.getId()) %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%= editDepartmentURL %>" />
	
	<portlet:renderURL var="redirectURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
			<portlet:param name="mvcPath" value="/html/department/view.jsp" />
	</portlet:renderURL>
	
	<portlet:actionURL var="deleteDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="deleteDepartment" />
		<portlet:param name="id" value="<%= String.valueOf(department.getId()) %>" />
		<portlet:param name="mvcPath" value="/html/department/view.jsp" />
		<portlet:param name="redirect" value="<%= redirectURL.toString() %>" />
	</portlet:actionURL>
	
	<liferay-ui:icon-delete url="<%= deleteDepartmentURL %>" />
</liferay-ui:icon-menu>