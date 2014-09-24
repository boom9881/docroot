<%@ include file="/html/process/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>


<% 
long userId = themeDisplay.getUserId();
long searchDepId = ParamUtil.getLong(request, "searchDep");
String searchName = ParamUtil.getString(request, "searchName");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/process/view.jsp");
portletURL.setParameter("tabs","attTab2");
portletURL.setParameter("searchName",searchName);
portletURL.setParameter("searchDep",String.valueOf(searchDepId));

List headerNames = new ArrayList();
headerNames.add("姓名");
headerNames.add("部门");
headerNames.add("加班时间");
headerNames.add("平常加班");
headerNames.add("周末加班");
headerNames.add("法定加班");
headerNames.add("加班合计");
headerNames.add("操作");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有加班信息被显示。");

int total = OvertimeLocalServiceUtil.search(searchDepId, 0, IntranetUtil.STATUS_0, userId, StringPool.BLANK, StringPool.BLANK, searchName);

searchContainer.setTotal(total);

List<Map<String, String>> results = OvertimeLocalServiceUtil.search(searchDepId, 0, IntranetUtil.STATUS_0, userId, StringPool.BLANK, StringPool.BLANK, searchName, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	Map<String, String> map = results.get(i);

	ResultRow row = new ResultRow(map,map.get("id"), i);

	row.setParameter("className", "overtime");
	row.setParameter("tabs", "attTab2");
	
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
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/process/action.jsp");
	
	resultRows.add(row);
}
%>

<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
