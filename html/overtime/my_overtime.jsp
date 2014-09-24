<%@ include file="/html/overtime/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String tab2 = ParamUtil.getString(request, "tabs2", "attTab21");

long userId = themeDisplay.getUserId();
int status = IntranetUtil.STATUS_1;
String searchYear = ParamUtil.getString(request, "searchOTimeYear");
String searchMonth = ParamUtil.getString(request, "searchOTimeMonth");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/overtime/view.jsp");
portletURL.setParameter("searchAttendanceYear",searchYear);
portletURL.setParameter("searchAttendanceMonth",searchMonth);

List headerNames = new ArrayList();
headerNames.add("姓名");
headerNames.add("部门");
headerNames.add("加班时间");
headerNames.add("平常加班");
headerNames.add("周末加班");
headerNames.add("法定加班");
headerNames.add("加班合计");
if(tab2.equals("attTab21")){
	headerNames.add("操作");
	status = IntranetUtil.STATUS_0;
}

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有加班信息被显示。");

int total = OvertimeLocalServiceUtil.search(0, userId, status, 0, searchYear, searchMonth, StringPool.BLANK);

searchContainer.setTotal(total);

List<Map<String, String>> results = OvertimeLocalServiceUtil.search(0, userId, status, 0, searchYear, searchMonth, StringPool.BLANK, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	Map<String, String> map = results.get(i);

	ResultRow row = new ResultRow(map,map.get("id"), i);

	row.addText(map.get("name"));
	
	row.addText(map.get("dep"));
	row.addText(map.get("year")+"-"+(Integer.parseInt(map.get("month"))+1));
	
	String usuallyOvertime = map.get("usuallyOvertime");
	String restOvertime = map.get("restOvertime");
	String legalOvertime = map.get("legalOvertime");
	
	row.addText(usuallyOvertime);
	
	row.addText(restOvertime);
	
	row.addText(legalOvertime);
	
	row.addText(OverTimeSum.sum(usuallyOvertime, restOvertime, legalOvertime));
		
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/overtime/action.jsp");
	
	resultRows.add(row);
}
%>

<portlet:renderURL var="tabs2URL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
	<portlet:param name="tabs" value="attTab2" />
</portlet:renderURL>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
	<portlet:param name="tabs" value="attTab2" />
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td>
				<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
					<liferay-util:param name="name" value="searchOTime" />
					<liferay-util:param name="label" value="加班时间" />
					<liferay-util:param name="showMonthEmpty" value="true" />
					<liferay-util:param name="year_start" value="2014" />
					<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
				</liferay-util:include>
			</td>
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
				</div>
			</td>
		</tr>
	</table>
	
	<liferay-ui:tabs names="attTab21,attTab22" value="<%= tab2 %>" url="<%= tabs2URL.toString() %>" param="tabs2" />
	
	<div style="margin-top:-20px;">
		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
	</div>
</aui:form>
