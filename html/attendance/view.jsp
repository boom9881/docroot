<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	long userId = themeDisplay.getUserId();
	int userRole = OverTimeSum.isSatff(userId);
	
	long searchUserId = 0;
	long searchDepId = ParamUtil.getLong(request, "searchDep");
	String searchAttendanceYear = ParamUtil.getString(request, "searchAttendanceYear");
	String searchAttendanceMonth = ParamUtil.getString(request, "searchAttendanceMonth");
	String searchName = ParamUtil.getString(request, "searchName");
	
	if(userRole == 2){
		searchUserId = userId;
	}
	
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("mvcPath","/html/attendance/view.jsp");
	portletURL.setParameter("searchDepId",String.valueOf(searchDepId));
	portletURL.setParameter("searchAttendanceYear",searchAttendanceYear);
	portletURL.setParameter("searchAttendanceMonth",searchAttendanceMonth);
	portletURL.setParameter("searchName",searchName);

	List headerNames = new ArrayList();
	headerNames.add("姓名");
	headerNames.add("部门");
	headerNames.add("考勤时间");
	headerNames.add("应出勤天数");
	headerNames.add("实出勤天数");
	if(userRole == 1){
		headerNames.add("操作");
	}
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 5, portletURL,headerNames, "没有考勤被显示。");
	
	int total = AttendanceLocalServiceUtil.search(searchDepId, searchUserId, searchAttendanceYear, searchAttendanceMonth, searchName);
	
	searchContainer.setTotal(total);

	List<Map<String,String>> results = AttendanceLocalServiceUtil.search(searchDepId, searchUserId, searchAttendanceYear, searchAttendanceMonth, searchName, searchContainer.getStart(), searchContainer.getEnd());

	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {
		Map<String,String> obj = (Map<String,String>) results.get(i);

		ResultRow row = new ResultRow(obj,obj.get("id"), i);

		row.addText(obj.get("name"));
		
		row.addText(obj.get("department"));
		
		row.addText(obj.get("year")+"/"+obj.get("month"));
		
		row.addText(obj.get("should"));
		
		row.addText(obj.get("actual"));
		
		if(userRole == 1){
			row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");
		}

		resultRows.add(row);
	}
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addAttendancetURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/edit_attendance.jsp" />
	<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD %>" />
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td>
				<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
					<liferay-util:param name="name" value="searchAttendance" />
					<liferay-util:param name="label" value="考勤时间（年月）" />
					<liferay-util:param name="showMonthEmpty" value="true" />
				</liferay-util:include>
			</td>
			<c:if test='<%= userRole == 1 %>'>
				<td>
					<aui:select label="部门" name="searchDep" style="width:120px;margin-right:10px;">
						<aui:option label="所有" value="" />
						<%
						int end = DepartmentLocalServiceUtil.getDepartmentsCount();
						List<Department> depResult = DepartmentLocalServiceUtil.getDepartments(0, end);
						
						for(Department d : depResult){
						%>
							<aui:option label="<%= d.getName() %>" value="<%= d.getId() %>" />
						<%
						}
						%>
					</aui:select>
				</td>
				<td>
					<aui:input name="searchName" label="姓名" value="" style="width:120px;margin-right:10px;" />
				</td>
			</c:if>
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
					<c:if test='<%= userRole == 1 %>'>
						<%
						String addURL = renderResponse.getNamespace()+"onSub('"+addAttendancetURL.toString()+"');";
						%>
						<aui:button value="添加考勤" onClick="<%= addURL %>" />
					</c:if>
				</div>
			</td>
		</tr>
	</table>
	
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
