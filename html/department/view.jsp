<%@ include file="/html/department/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
String searchName = ParamUtil.getString(request, "searchName");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("searchName",searchName);
portletURL.setParameter("mvcPath","/html/department/view.jsp");

List<String> headerNames = new ArrayList<String>();

headerNames.add("部门名称");
headerNames.add("负责人");
headerNames.add("操作");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有部门被显示。");

int total = DepartmentLocalServiceUtil.countByName(searchName);

searchContainer.setTotal(total);

List<Department> results = DepartmentLocalServiceUtil.findByName(searchName, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	Department department = (Department) results.get(i);
		
	ResultRow row = new ResultRow(department,department.getId(), i);

	row.addText(department.getName());
	
	BasicInformation bi = BasicInformationLocalServiceUtil.findByUserId(department.getLeader());
	
	row.addText(bi.getName());
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/department/action.jsp");

	resultRows.add(row);
}
%>

<portlet:renderURL var="searchDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchDepartmentURL.toString() %>" method="post" name="fm">
	<aui:input name="searchName" label="部门名称"  value="<%= searchName %>" />
	
	<aui:button type="submit" value="搜索" />
	
	<%
	String addURL = renderResponse.getNamespace()+"onSub('"+addDepartmentURL.toString()+"');";
	%>
	
	<aui:button value="添加部门" onClick="<%= addURL %>" />
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>

<aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>