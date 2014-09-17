<%@ include file="/html/attendance/init-ext.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Map<String,String> att = (Map<String,String>) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />
		<portlet:param name="basicId" value='<%= att.get("biId") %>' />
		<portlet:param name="attendanceId" value='<%= att.get("id") %>' />
		<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.EDIT %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
</liferay-ui:icon-menu>
