<%@ include file="/html/wages/init-ext.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Wages wage = (Wages) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="mvcPath" value="/html/wages/detail.jsp" />
		<portlet:param name="wageId" value='<%= String.valueOf(wage.getId()) %>' />
		<portlet:param name="<%= Constants.CMD %>" value="detail" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="detail" url="<%= editEntryURL %>" />
</liferay-ui:icon-menu>
