<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String cmd = ParamUtil.getString(request, Constants.CMD, Constants.ADD);

long attendanceId = ParamUtil.getLong(request, "attendanceId");

Attendance attendance = null;

String attendanceYear = String.valueOf(IntranetUtil.getCurYear());
String attendanceMonth = String.valueOf(IntranetUtil.getCurMonth());

if(Validator.isNotNull(attendanceId)){
	attendance = AttendanceLocalServiceUtil.getAttendance(attendanceId);
	
	attendanceYear = String.valueOf(attendance.getAttendanceYear());
	attendanceMonth = String.valueOf(attendance.getAttendanceMonth());
}
%>

<portlet:renderURL var="redirectURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="attTab1" />
</portlet:renderURL>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editAttendance" />
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="attTab1" />
	<portlet:param name="redirect" value="<%= redirectURL.toString() %>" />
</portlet:actionURL>

<liferay-ui:error key="dhst.intranet.attendance.rep" message="不能重复添加考勤。" />
<liferay-ui:error key="dhst.intranet.attendance.ad.number" message="实际出勤天数只能是数字。" />

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:input type="hidden" name="attendanceId" value="<%= attendanceId %>" />
	
	<table>
		<tr>
			<td>
				<% 
				String changeYear = renderResponse.getNamespace()+"changeYear(this.value,'attendance');";
				%>
				
				<aui:select name="attendanceYear" label="时间" style="width:70px;">
					<% 
					for(int j = IntranetUtil.getAttendanceYearStart(); j <= IntranetUtil.getCurYear(); j++){
					%>
						<aui:option label="<%= j %>" value="<%= j %>"  selected='<%= Boolean.parseBoolean(attendanceYear.equals(String.valueOf(j)) ? "true":"false") %>' />
					<%
					}
					%>
				</aui:select>
			</td>
			<td>
				<aui:select name="attendanceMonth" label="&nbsp;" style="width:60px;" >
					<%
					int monthStart = IntranetUtil.getCurMonth() - 1;
					if(monthStart < 0){
						monthStart = 0;
					}
					
					for(int j = monthStart; j <= IntranetUtil.getCurMonth(); j++){
						String v = String.valueOf(j+1);
						if(v.length() == 1){
							v = "0" + v;
						}
					%>
						<aui:option label="<%= v %>" value="<%= j %>" selected='<%= Boolean.parseBoolean(attendanceMonth.equals(String.valueOf(j)) ? "true":"false") %>' />
					<%
					}
					%>
				</aui:select>
			</td>
		</tr>
	</table>
	<aui:input type="hidden" name="shouldAttendance" value="<%= OverTimeSum.SHOULDATTENDANCE %>" />
	<aui:input name="sa" label="应出勤天数" value="<%= OverTimeSum.SHOULDATTENDANCE %>" disabled="true" />
	<aui:input name="actualAttendance" label="实出勤天数" value="<%=attendance!=null?attendance.getActualAttendance():OverTimeSum.SHOULDATTENDANCE %>" />
	
	<aui:button type="submit" value="保存" style="margin-top:23px;" />
</aui:form>

<aui:script>
	var curYear = '<%= attendanceYear %>';
	var curMonth = '<%= attendanceMonth %>';
	
	function <portlet:namespace />changeYear(yearValue,eleName){
		var monthEle = document.getElementById('<portlet:namespace />'+eleName+'Month');
		
		if((curMonth - 1) < 0){
			if(yearValue == (curYear - 1)){
				monthEle.options.remove(0);
				monthEle.add(new Option(12,11));
			}
		}
	}
</aui:script>
