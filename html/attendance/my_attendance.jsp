<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String tab3 = ParamUtil.getString(request, "tabs3", "attTab31");

long userId = themeDisplay.getUserId();
int status = IntranetUtil.STATUS_1;
String searchAttendanceYear = ParamUtil.getString(request, "searchAttendanceYear");
String searchAttendanceMonth = ParamUtil.getString(request, "searchAttendanceMonth");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/attendance/view.jsp");
portletURL.setParameter("tabs","attTab2");
portletURL.setParameter("tabs3",tab3);
portletURL.setParameter("searchAttendanceYear",searchAttendanceYear);
portletURL.setParameter("searchAttendanceMonth",searchAttendanceMonth);

List headerNames = new ArrayList();
headerNames.add("考勤时间");
headerNames.add("应出勤天数");
headerNames.add("实出勤天数");
if(tab3.equals("attTab31")){
	headerNames.add("操作");
	status = IntranetUtil.STATUS_0;
}

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 15, portletURL,headerNames, "没有考勤被显示。");

int total = AttendanceLocalServiceUtil.search(0, userId, status, 0, searchAttendanceYear, searchAttendanceMonth, StringPool.BLANK);

searchContainer.setTotal(total);

List<Map<String,String>> results = AttendanceLocalServiceUtil.search(0, userId, status, 0, searchAttendanceYear, searchAttendanceMonth, StringPool.BLANK, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	Map<String,String> obj = (Map<String,String>) results.get(i);

	ResultRow row = new ResultRow(obj,obj.get("id"), i);

	row.addText(obj.get("year")+"-"+(Integer.parseInt(obj.get("month"))+1));
	
	row.addText(obj.get("should"));
	
	row.addText(obj.get("actual"));
	
	if(tab3.equals("attTab31")){
		row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");
	}
	
	resultRows.add(row);
}
%>

<portlet:renderURL var="tabs3URL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="attTab2" />
</portlet:renderURL>

<portlet:renderURL var="searchRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="attTab2" />
</portlet:renderURL>

<aui:form action="<%= searchRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td>
				<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
					<liferay-util:param name="name" value="searchAttendance" />
					<liferay-util:param name="label" value="考勤时间" />
					<liferay-util:param name="showMonthEmpty" value="true" />
					<liferay-util:param name="year_start" value="2014" />
					<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
				</liferay-util:include>
			</td>
			<td>
				<aui:button type="submit" value="搜索" />
			</td>
		</tr>
	</table>
	
	<liferay-ui:tabs names="attTab31,attTab32" value="<%= tab3 %>" url="<%= tabs3URL.toString() %>" param="tabs3" />
	
	<liferay-ui:search-iterator searchContainer="<%= searchContainer%>" />
</aui:form>