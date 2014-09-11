<%@ include file="/html/attendance/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	
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

		Attendance attendance = AttendanceLocalServiceUtil.getAttendance(1L);

		ResultRow row = new ResultRow(basicInformation,basicInformation.getId(), i);

		row.addText(basicInformation.getName());
		
		row.addText(String.valueOf(attendance.getAttendanceMonthly()));
		
		row.addText(String.valueOf(attendance.getShouldAttendance()));
		
		row.addText(String.valueOf(attendance.getActualAttendance()));
		
		row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");

		resultRows.add(row);

	}
	
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>


<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<aui:input name="searchName" label="姓名" value="" />
	<aui:input name="searchDep" label="部门" value="" />
	<aui:button type="submit" value="搜索" />
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>