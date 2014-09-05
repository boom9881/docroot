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
<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>