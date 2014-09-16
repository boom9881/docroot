<%@ include file="/html/wages/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/attendance/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("姓名");
	//headerNames.add("发工资月份");
	//headerNames.add("入职日期");
	//headerNames.add("离职日期");
	headerNames.add("基本工资");
	headerNames.add("绩效工资");
	headerNames.add("小计");
	headerNames.add("应出勤(天）");
	headerNames.add("实出勤(天）");
	headerNames.add("应发基本工资");
	headerNames.add("绩效得分应发");
	headerNames.add("绩效工资");
	headerNames.add("应发工资合计");
	headerNames.add("社保公司承担部分");
	headerNames.add("社保个人承担部分");
	headerNames.add("应纳税所得额");
	headerNames.add("税率");
	headerNames.add("税金");
	headerNames.add("实发工资");
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, null);

	int total = WagesLocalServiceUtil.getWagesesCount();

	searchContainer.setTotal(total);

	List results = WagesLocalServiceUtil.getWageses(searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		Wages wages = (Wages) results.get(i);

		ResultRow row = new ResultRow(wages,wages.getId(), i);

		row.addText(wages.getWageName());
		//row.addText(String.valueOf(wages.getDistributionMonth()));
		//row.addText(sdf.format(wages.getEntryDate()));
		//row.addText(wages.getDepartureDate()!=null?sdf.format(wages.getDepartureDate()):StringPool.BLANK);
		row.addText(String.valueOf(wages.getUserWage()));
		row.addText(String.valueOf(wages.getUserPerformance()));
		row.addText(String.valueOf(wages.getUserTotalWage()));
		row.addText(String.valueOf(wages.getAttendance()));
		row.addText(String.valueOf(wages.getRealAttendance()));
		row.addText(String.valueOf(wages.getBasePay()));
		row.addText(String.valueOf(wages.getOvertimeWages()));
		row.addText(String.valueOf(wages.getPerformanceSalary()));
		row.addText(String.valueOf(wages.getTotalWages()));
		row.addText(String.valueOf(wages.getSocialCompanyBearPart()));
		row.addText(String.valueOf(wages.getSocialIndividualsBearPart()));
		row.addText(String.valueOf(wages.getTaxableIncome()));
		row.addText(String.valueOf(wages.getTaxRate())+"%");
		row.addText(String.valueOf(wages.getTaxes()));
		row.addText(String.valueOf(wages.getRealWages()));
		
		resultRows.add(row);

	}
	
%>

<portlet:renderURL var="createWagesURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<aui:form action="<%= createWagesURL.toString() %>" method="post" name="fm">
	<aui:select label="工资月份" name="attendanceMonthly">
	<% 
		for(int i=1;i<13;i++){
	%>
		<aui:option label="<%= i %>" value="<%= i %>" />
	<%
		}
	%>
	</aui:select>
	<aui:button type="submit" value="生成工资" />
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</aui:form>
 