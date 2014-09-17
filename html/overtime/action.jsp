<%@ include file="/html/overtime/init-ext.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Map<String, String> map = (Map<String, String>) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="mvcPath" value="/html/overtime/edit_overtime.jsp" />
		<portlet:param name="basicId" value='<%= map.get("biId") %>' />
		<portlet:param name="overtimeId" value='<%= map.get("id") %>' />
		<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.EDIT %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
</liferay-ui:icon-menu>
