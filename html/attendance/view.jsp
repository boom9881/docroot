<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	long userId = themeDisplay.getUserId();
				
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/attendance/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("姓名");

	headerNames.add("月份");

	headerNames.add("应出勤天数");

	headerNames.add("实出勤天数");

	headerNames.add("操作");

	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, null);

	int total = BasicInformationLocalServiceUtil.getBasicInformationsCount();

	searchContainer.setTotal(total);

	List results = BasicInformationLocalServiceUtil.getBasicInformations(searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		BasicInformation basicInformation = (BasicInformation) results.get(i);

		List<Attendance> attendance = AttendanceLocalServiceUtil.findByUserId(basicInformation.getId());

		for (int j = 0; j < attendance.size(); j++) {
		
			Attendance att = attendance.get(j);
			
			ResultRow row = new ResultRow(att,att.getId(), i);
	
			row.addText(basicInformation.getName());
			
			row.addText(String.valueOf(att.getAttendanceMonthly()));
			
			row.addText(String.valueOf(att.getShouldAttendance()));
			
			row.addText(String.valueOf(att.getActualAttendance()));
			
			row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");
	
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
	<c:if test='<%= basicInformation!=null %>'>
		<portlet:param name="basicId" value="<%=String.valueOf(basicInformation.getId()) %>" />
	</c:if>
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<aui:input name="searchName" label="姓名" value="" />
	<aui:input name="searchDep" label="部门" value="" />
	<aui:button type="submit" value="搜索" />
	<%
	String addURL = renderResponse.getNamespace()+"onSub('"+addAttendancetURL.toString()+"');";
	%>
	
	<aui:button value="添加考勤" onClick="<%= addURL %>" />
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>


<aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>


