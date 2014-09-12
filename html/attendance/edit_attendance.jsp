<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = ParamUtil.getLong(request, "id");

BasicInformation basicInformation = null;
Attendance attendance = null;
if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(userId);
	attendance = AttendanceLocalServiceUtil.getAttendance(1);
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"	title='<%="考勤记录： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:fieldset cssClass="span5" style="float:none;">
		<aui:input name="attendanceMonthly" label="出勤月份" value="<%=attendance!=null?attendance.getAttendanceMonthly():StringPool.BLANK %>" />
		<aui:input name="actualAttendance" label="实出勤天数" value="<%=attendance!=null?attendance.getShouldAttendance():StringPool.BLANK %>" />
		<aui:input name="shouldAttendance" label="应出勤天数" value="<%=attendance!=null?attendance.getActualAttendance():StringPool.BLANK %>"/>
		<aui:button type="submit" value="保存" />
	</aui:fieldset>
</aui:form>

