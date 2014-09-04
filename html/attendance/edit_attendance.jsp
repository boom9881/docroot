<%@page import="com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil"%>
<%@ include file="/html/init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = ParamUtil.getLong(request, "id");

BasicInformation basicInformation = null;

if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(userId);
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"	title='<%="考勤记录 员工信息： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:fieldset cssClass="span5">
		<aui:input name="attendanceMonthly" label="出勤月份" value="" />
		<aui:input name="actualAttendance" label="实出勤天数" value="" />
		<aui:input name="shouldAttendance" label="应出勤天数" value=""/>
	</aui:fieldset>
</aui:form>

