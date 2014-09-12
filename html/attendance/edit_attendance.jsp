<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String cmd = ParamUtil.getString(request, Constants.CMD, Constants.ADD);

long basicId = ParamUtil.getLong(request, "basicId");
long attendanceId = ParamUtil.getLong(request, "attendanceId");

BasicInformation basicInformation = null;
Attendance attendance = null;

if(cmd.equals(Constants.ADD)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(basicId);
}else{
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(basicId);
	attendance = AttendanceLocalServiceUtil.getAttendance(attendanceId);
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="editAttendance" />
	<portlet:param name="attendanceId" value="<%=String.valueOf(attendanceId) %>" />
	<portlet:param name="basicId" value="<%=String.valueOf(basicId) %>" />
	<portlet:param name="cmd" value="<%= cmd %>" />
	<c:if test='<%= !cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	</c:if>
	<c:if test='<%= cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />
	</c:if>
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"
	title='<%= (basicInformation == null) ? "考勤信息登记" : "员工信息： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:fieldset cssClass="span5" style="float:none;">
		<aui:input name="attendanceMonthly" label="出勤月份" value="<%=attendance!=null?attendance.getAttendanceMonthly():StringPool.BLANK %>" />
		<aui:input name="actualAttendance" label="实出勤天数" value="<%=attendance!=null?attendance.getActualAttendance():StringPool.BLANK %>" />
		<aui:input name="shouldAttendance" label="应出勤天数" value="<%=attendance!=null?attendance.getShouldAttendance():StringPool.BLANK %>"/>
		<aui:button type="submit" value="保存" />
	</aui:fieldset>
</aui:form>


