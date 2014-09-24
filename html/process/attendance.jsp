<%@ include file="/html/process/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long userId = themeDisplay.getUserId();
long searchDepId = ParamUtil.getLong(request, "searchDep");
String searchName = ParamUtil.getString(request, "searchName");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/process/view.jsp");
portletURL.setParameter("tabs","attTab1");
portletURL.setParameter("searchName",searchName);
portletURL.setParameter("searchDep",String.valueOf(searchDepId));

List headerNames = new ArrayList();
headerNames.add("姓名");
headerNames.add("部门");
headerNames.add("考勤时间");
headerNames.add("应出勤天数");
headerNames.add("实出勤天数");
headerNames.add("操作");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有考勤被显示。");

int total = AttendanceLocalServiceUtil.search(searchDepId, 0, IntranetUtil.STATUS_0, userId, StringPool.BLANK, StringPool.BLANK, searchName);

searchContainer.setTotal(total);

List<Map<String,String>> results = AttendanceLocalServiceUtil.search(searchDepId, 0, IntranetUtil.STATUS_0, userId, StringPool.BLANK, StringPool.BLANK, searchName, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	Map<String,String> obj = (Map<String,String>) results.get(i);

	ResultRow row = new ResultRow(obj,obj.get("id"), i);
	
	row.setParameter("className", "attendance");
	row.setParameter("tabs", "attTab1");
	
	row.addText(obj.get("name"));
	
	row.addText(obj.get("department"));
	
	row.addText(obj.get("year")+"-"+(Integer.parseInt(obj.get("month"))+1));
	
	row.addText(obj.get("should"));
	
	row.addText(obj.get("actual"));
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/process/action.jsp");
	
	resultRows.add(row);
}
%>
	
<liferay-ui:search-iterator searchContainer="<%= searchContainer%>" />
