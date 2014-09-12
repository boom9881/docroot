<%@ include file="/html/attendance/init-ext.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Attendance att = (Attendance) row.getObject();
	
	BasicInformation basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(att.getUserId());
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">

		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />

		<portlet:param name="basicId" value="<%=String.valueOf(basicInformation.getId()) %>" />
		
		<portlet:param name="attendanceId" value="<%=String.valueOf(att.getId()) %>" />
		
		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
	
</liferay-ui:icon-menu>
