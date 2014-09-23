<%@ include file="/html/overtime/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long overtimeId = ParamUtil.getLong(request, "overtimeId");

Overtime overtime = null;

String overtimeYear = String.valueOf(IntranetUtil.getCurYear());
String overtimeMonthly = String.valueOf(IntranetUtil.getCurMonth());

if(Validator.isNotNull(overtimeId)){
	overtime = OvertimeLocalServiceUtil.getOvertime(overtimeId);

	overtimeYear = String.valueOf(overtime.getOvertimeYear());
	overtimeMonthly = String.valueOf(overtime.getOvertimeMonthly());
}
%>

<portlet:actionURL var="editActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editOvertime" />
	<portlet:param name="overtimeId" value="<%= String.valueOf(overtimeId) %>" />
	<portlet:param name="tabs" value="attTab1" />
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<aui:form action="<%= editActionURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td>
				<% 
				String changeYear = renderResponse.getNamespace()+"changeYear(this.value);";
				%>
				
				<aui:select name="overtimeYear" label="时间" style="width:70px;">
					<% 
					for(int j = IntranetUtil.getAttendanceYearStart(); j <= IntranetUtil.getCurYear(); j++){
					%>
						<aui:option label="<%= j %>" value="<%= j %>"  selected='<%= Boolean.parseBoolean(overtimeYear.equals(String.valueOf(j)) ? "true":"false") %>' />
					<%
					}
					%>
				</aui:select>
			</td>
			<td>
				<aui:select name="overtimeMonthly" label="&nbsp;" style="width:60px;" >
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
						<aui:option label="<%= v %>" value="<%= j %>" selected='<%= Boolean.parseBoolean(overtimeMonthly.equals(String.valueOf(j)) ? "true":"false") %>' />
					<%
					}
					%>
				</aui:select>
			</td>
		</tr>
	</table>
	
	<aui:input name="usuallyOvertime" label="平常加班" bean="<%= overtime %>" />
	<aui:input name="restOvertime" label="周末加班" bean="<%= overtime %>" />
	<aui:input name="legalOvertime" label="法定加班" bean="<%= overtime %>" />
	
	<aui:button type="submit" value="保存" />
</aui:form>

<aui:script>
	var curYear = '<%= overtimeYear %>';
	var curMonth = '<%= overtimeMonthly %>';
	
	function <portlet:namespace />changeYear(yearValue){
		var monthEle = document.getElementById('<portlet:namespace />overtimeMonthly');
		
		if((curMonth - 1) < 0){
			if(yearValue == (curYear - 1)){
				monthEle.options.remove(0);
				monthEle.add(new Option(12,11));
			}
		}
	}
</aui:script>