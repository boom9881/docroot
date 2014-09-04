<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
/**
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	PortletURL randerURL = renderResponse.createRenderURL();

	randerURL.setWindowState(WindowState.MAXIMIZED);

	randerURL.setParameter("mvcPath","/html/satff/edit_satff.jsp");
	
	
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/satff/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("编号");

	headerNames.add("姓名");

	headerNames.add("离职时间");

	headerNames.add("入职时间");

	headerNames.add("");

	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, null);

	int total = BasicInformationLocalServiceUtil.getSatffsCount();;

	searchContainer.setTotal(total);

	List results = SatffLocalServiceUtil.getSatffs(searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		Satff satff = (Satff) results.get(i);

		ResultRow row = new ResultRow(satff,satff.getId(), i);

		PortletURL rowURL = renderResponse.createRenderURL();

		rowURL.setWindowState(WindowState.MAXIMIZED);

		rowURL.setParameter("mvcPath","/html/satff/action.jsp");

		rowURL.setParameter("id", String.valueOf(satff.getId()));

		row.addText(String.valueOf(satff.getId()), rowURL);

		row.addText(satff.getName(), rowURL);

		row.addText(sdf.format(satff.getTurnover_time()), rowURL);

		row.addText(sdf.format(satff.getEntry_time()), rowURL);

		//row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/satff/action.jsp");

		resultRows.add(row);

	}
	*/
%>

<portlet:actionURL var="deleteUserActionURL">
	<portlet:param name="action" value="deleteUser" />
</portlet:actionURL>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">

	<aui:input name="searchDep" label="部门" value="" />
	
	<aui:input name="searchName" label="姓名" value="" />
	
	<aui:button type="submit" value="搜索" />

	<%
	String addUserURL = renderResponse.getNamespace()+"onSub('"+addUserRenderURL.toString()+"');";
	%>

	<aui:button value="添加员工" onClick="<%= addUserURL %>" />
</aui:form>
<%--
<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
--%>
<aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>