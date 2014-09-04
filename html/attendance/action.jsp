<%@ include file="/html/init.jsp" %>
<%

	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	BasicInformation basicInformation = (BasicInformation) row.getObject();

%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="addEntryURL">

		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />

		<portlet:param name="id" value="<%=String.valueOf(basicInformation.getId()) %>" />

		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="add" message="add" url="<%= addEntryURL %>" />
	
	
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">

		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />

		<portlet:param name="id" value="<%=String.valueOf(basicInformation.getId()) %>" />

		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
	
</liferay-ui:icon-menu>
