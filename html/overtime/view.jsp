<%@ include file="/html/overtime/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/overtime/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("姓名");

	headerNames.add("月份");

	headerNames.add("平常加班");

	headerNames.add("周末加班");
	
	headerNames.add("法定加班");
	
	headerNames.add("加班合计");

	headerNames.add("操作");

	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, null);

	int total = BasicInformationLocalServiceUtil.getBasicInformationsCount();

	searchContainer.setTotal(total);

	List results = BasicInformationLocalServiceUtil.getBasicInformations(searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		BasicInformation basicInformation = (BasicInformation) results.get(i);

		List<Overtime> overtime = OvertimeLocalServiceUtil.findByU_M(basicInformation.getId());

		for (int j = 0; j < overtime.size(); j++) {
		
			Overtime over= overtime.get(j);
		
			ResultRow row = new ResultRow(basicInformation,basicInformation.getId(), i);
	
			row.addText(basicInformation.getName());
			
			row.addText(String.valueOf(over.getOvertimeMonthly()));
			
			row.addText(String.valueOf(over.getUsuallyOvertime()));
			
			row.addText(String.valueOf(over.getRestOvertime()));
			
			row.addText(String.valueOf(over.getLegalOvertime()));
			
			row.addText(String.valueOf(OverTimeSum.sum(over.getUsuallyOvertime(), over.getRestOvertime(), over.getLegalOvertime())));
			
			row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/overtime/action.jsp");
	
			resultRows.add(row);
		}
	}
	
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
</portlet:renderURL>


<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<aui:input name="searchName" label="姓名" value="" />
	<aui:input name="searchDep" label="部门" value="" />
	<aui:button type="submit" value="搜索" />
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>