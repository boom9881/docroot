<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Map<String,String> att = (Map<String,String>) row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="processAttendance" />
		<portlet:param name="status" value='<%= String.valueOf(IntranetUtil.STATUS_1) %>' />
		<portlet:param name="attendanceId" value='<%= att.get("id") %>' />
		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />
		<portlet:param name="tabs" value="attTab2" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
	</portlet:actionURL>

	<liferay-ui:icon image="edit" message="确认" url="<%= editEntryURL %>" />
	
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteEntryURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="deleteAttendance" />
		<portlet:param name="attId" value='<%= att.get("id") %>' />
		<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
		<portlet:param name="tabs" value="attTab2" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
	</portlet:actionURL>
	
	<liferay-ui:icon-delete url="<%=deleteEntryURL %>" />
</liferay-ui:icon-menu>
