<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Map<String,String> att = (Map<String,String>) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteEntryURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="deleteOT" />
		<portlet:param name="mvcPath" value="/html/overtime/edit_overtime.jsp" />
		<portlet:param name="id" value='<%= att.get("id") %>' />
		<portlet:param name="tabs" value="attTab2" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
	</portlet:actionURL>
	
	<liferay-ui:icon-delete url="<%=deleteEntryURL %>" />
</liferay-ui:icon-menu>
