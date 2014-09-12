<%@ include file="/html/overtime/init-ext.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	BasicInformation basicInformation = (BasicInformation) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">

		<portlet:param name="mvcPath" value="/html/overtime/edit_overtime.jsp" />

		<portlet:param name="id" value="<%=String.valueOf(basicInformation.getId()) %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
	
</liferay-ui:icon-menu>
