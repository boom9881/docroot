<%@ include file="/html/wages/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Map<String,String> att = (Map<String,String>) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="mvcPath" value="/html/wages/detail.jsp" />
		<portlet:param name="wageId" value='<%= att.get("id") %>' />
	</portlet:renderURL>

	<liferay-ui:icon image="view" message="详细" url="<%= editEntryURL %>" />
</liferay-ui:icon-menu>
