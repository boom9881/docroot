<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long userId = themeDisplay.getUserId();
long searchDepId = ParamUtil.getLong(request, "searchDep");
String searchName = ParamUtil.getString(request, "searchName");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/attendance/view.jsp");
portletURL.setParameter("tabs","attTab2");
portletURL.setParameter("searchName",searchName);
portletURL.setParameter("searchDepId",String.valueOf(searchDepId));

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

	row.addText(obj.get("name"));
	
	row.addText(obj.get("department"));
	
	row.addText(obj.get("year")+"-"+(Integer.parseInt(obj.get("month"))+1));
	
	row.addText(obj.get("should"));
	
	row.addText(obj.get("actual"));
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/attendance/action.jsp");
	
	resultRows.add(row);
}
%>

<portlet:renderURL var="searchRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="attTab2" />
</portlet:renderURL>

<aui:form action="<%= searchRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
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
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
				</div>
			</td>
		</tr>
	</table>
	
	<liferay-ui:search-iterator searchContainer="<%= searchContainer%>" />
</aui:form>