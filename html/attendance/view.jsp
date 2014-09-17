<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	long userId = themeDisplay.getUserId();
	
	int userRole = OverTimeSum.isSatff(userId);
	
	Date nowDate = new Date();
	int year = nowDate.getYear()+1900;
	int month = nowDate.getMonth();
	
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/attendance/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("姓名");
	
	headerNames.add("考勤月份");

	headerNames.add("应出勤天数");

	headerNames.add("实出勤天数");
	if(userRole == 1){
	headerNames.add("操作");
	}
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 5, portletURL,headerNames, null);
	
	int total = 0;
	if(userRole == 1){
		total = BasicInformationLocalServiceUtil.getBasicInformationsCount();
	}else{
		total = BasicInformationLocalServiceUtil.countByListUserId(userId);
	}
	searchContainer.setTotal(total);

	List results = null;

	if(userRole == 1){
		results = BasicInformationLocalServiceUtil.getBasicInformations(searchContainer.getStart(), searchContainer.getEnd());
	}else{
		results = BasicInformationLocalServiceUtil.findListByUserId(userId);
	}
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		BasicInformation basicInformation = (BasicInformation) results.get(i);

		List<Attendance> attendance = AttendanceLocalServiceUtil.findByUserId(basicInformation.getId());

		for (int j = 0; j < attendance.size(); j++) {
		
			Attendance att = attendance.get(j);
			
			ResultRow row = new ResultRow(att,att.getId(), i);
	
			row.addText(basicInformation.getName());
			
			row.addText(String.valueOf(att.getAttendanceYear()+"-"+att.getAttendanceMonthly()));
			
			row.addText(String.valueOf(att.getShouldAttendance()));
			
			row.addText(String.valueOf(att.getActualAttendance()));
			
			if(userRole == 1){
				row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");
			}
	
			resultRows.add(row);
		}

	}
	
	BasicInformation basicInformation = BasicInformationLocalServiceUtil.findByUserId(userId);
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addAttendancetURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />
	<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD %>" />
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<c:if test='<%= userRole == 1 %>'>
		<table>
			<tr>
				
				<td>
					<aui:input name="searchDep" label="部门" value="" style="width:120px;margin-right:10px;" />
				</td>
				<td>
					<aui:select label="考勤年份" name="attendanceYear" style="width:120px;margin-right:10px;">
					<% 
					for(int i=2010;i<2014;i++){
						if(year==i){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" selected="" />
					<%			
						}else{
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
						}
					}
					%>
					</aui:select>
				</td>
				<td>
					<aui:select label="考勤月份" name="attendanceMonthly" style="width:120px;margin-right:10px;">
					<% 
					for(int i=1;i<13;i++){
						if(month==i){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" selected="" />
					<%			
						}else{
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
						}
					}
					%>
					</aui:select>
				</td>
				<td>
					<aui:input name="searchName" label="姓名" value="" style="width:120px;margin-right:10px;" />
				</td>
				<td>
					<div style="margin-bottom:12px;">
						<aui:button type="submit" value="搜索" />
			
						<%
						String addURL = renderResponse.getNamespace()+"onSub('"+addAttendancetURL.toString()+"');";
						%>
						<aui:button value="添加考勤" onClick="<%= addURL %>" />
					</div>
				</td>
			</tr>
		</table>
	</c:if>
	<c:if test='<%= userRole == 2 %>'>
		<table>
			<tr>
				<td>
					<aui:select label="考勤年份" name="attendanceYear" style="width:120px;margin-right:10px;">
						<% 
						for(int i=2010;i<2015;i++){
						%>
							<aui:option label="<%= i %>" value="<%= i %>" />
						<%
						}
						%>
						</aui:select>
						<aui:select label="考勤月份" name="attendanceMonthly" style="width:120px;margin-right:10px;">
						<% 
						for(int i=1;i<13;i++){
						%>
							<aui:option label="<%= i %>" value="<%= i %>" />
						<%
						}
						%>
					</aui:select>
				</td>
				<td>
					<aui:button type="submit" value="搜索" />
				</td>
			</tr>
		</table>
	</c:if>
	
	<div style="margin-top:-20px;">
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</div>
</aui:form>


<aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>


