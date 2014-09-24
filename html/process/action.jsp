<%@ include file="/html/process/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Map<String,String> att = (Map<String,String>) row.getObject();

String className = (String)row.getParameter("className");
String tabs = (String)row.getParameter("tabs");
%>

<liferay-ui:icon-menu>
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="process" />
		<portlet:param name="id" value='<%= att.get("id") %>' />
		<portlet:param name="mvcPath" value="/html/process/view.jsp" />
		<portlet:param name="className" value="<%= className %>" />
		<portlet:param name="tabs" value="<%= tabs %>" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
	</portlet:actionURL>

	<liferay-ui:icon image="edit" message="确认" url="<%= editEntryURL %>" />
	
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteEntryURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="delete" />
		<portlet:param name="id" value='<%= att.get("id") %>' />
		<portlet:param name="mvcPath" value="/html/process/view.jsp" />
		<portlet:param name="className" value="<%= className %>" />
		<portlet:param name="tabs" value="<%= tabs %>" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
	</portlet:actionURL>
	
	<liferay-ui:icon-delete url="<%=deleteEntryURL %>" />
</liferay-ui:icon-menu>
