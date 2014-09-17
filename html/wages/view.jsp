<%@ include file="/html/wages/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	long userId = themeDisplay.getUserId();
	//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	PortletURL portletURL = renderResponse.createRenderURL();

	int userRole = OverTimeSum.isSatff(userId);

	Date nowDate = new Date();
	int year = nowDate.getYear()+1900;
	int month = nowDate.getMonth();
	
	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/attendance/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("姓名");
	//headerNames.add("发工资月份");
	//headerNames.add("入职日期");
	//headerNames.add("离职日期");
	//headerNames.add("基本工资");
	//headerNames.add("绩效工资");
	//headerNames.add("工资小计");
	//headerNames.add("应出勤(天）");
	//headerNames.add("实出勤(天）");
	//headerNames.add("应发基本工资");
	//headerNames.add("绩效得分应发");
	//headerNames.add("绩效工资");
	headerNames.add("应发工资合计");
	//headerNames.add("社保公司承担部分");
	headerNames.add("社保个人承担部分");
	//headerNames.add("应纳税所得额");
	//headerNames.add("税率");
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
		//row.addText(String.valueOf(wages.getUserWage()));
		//row.addText(String.valueOf(wages.getUserPerformance()));
		//row.addText(String.valueOf(wages.getUserTotalWage()));
		//row.addText(String.valueOf(wages.getAttendance()));
		//row.addText(String.valueOf(wages.getRealAttendance()));
		//row.addText(String.valueOf(wages.getBasePay()));
		//row.addText(String.valueOf(wages.getOvertimeWages()));
		//row.addText(String.valueOf(wages.getPerformanceSalary()));
		row.addText(String.valueOf(wages.getTotalWages()));
		//row.addText(String.valueOf(wages.getSocialCompanyBearPart()));
		row.addText(String.valueOf(wages.getSocialIndividualsBearPart()));
		//row.addText(String.valueOf(wages.getTaxableIncome()));
		//row.addText(String.valueOf(wages.getTaxRate())+"%");
		row.addText(String.valueOf(wages.getTaxes()));
		row.addText(String.valueOf(wages.getRealWages()));
		
		resultRows.add(row);

	}
	
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addWagestURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
	<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD %>" />
</portlet:renderURL>
<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<c:if test='<%= userRole == 1 %>'>
		<table>
			<tr>
				<td>
					<aui:input name="searchDep" label="部门" value="" style="width:120px;margin-right:10px;" />
				</td>
				<td>
					<aui:select label="工资年份" name="attendanceYear" style="width:120px;margin-right:10px;">
					<% 
					for(int i=2010;i<2015;i++){
						if(year==i){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" selected="" />
					<%			
						}else{
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
						}
					}
					%>
					</aui:select>
				</td>
				<td>
					<aui:select label="工资月份" name="attendanceMonthly" style="width:120px;margin-right:10px;">
					<% 
					for(int i=1;i<13;i++){
						if(month==i){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" selected="" />
					<%			
						}else{
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
						}
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
			
						<%
						String addURL = renderResponse.getNamespace()+"onSub('"+addWagestURL.toString()+"');";
						%>
						<aui:button value="生成工资" onClick="<%= addURL %>" />
					</div>
				</td>
			</tr>
		</table>
	</c:if>
	<c:if test='<%= userRole == 2 %>'>
		<table>
			<tr>
				<td>
					<aui:select label="工资年份" name="distributionYear" style="width:120px;margin-right:10px;">
					<% 
					for(int i=2010;i<2015;i++){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
					}
					%>
					</aui:select>
					</td>
				<td>
					<aui:select label="工资月份" name="distributionMonth" style="width:120px;margin-right:10px;">
					<% 
					for(int i=1;i<13;i++){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
					}
					%>
					</aui:select>
				</td>
				<td>
					<aui:button type="submit" value="搜索" style="margin-top:-15px;"/>
				</td>
			</tr>
		</table>
	</c:if>
	
	<div style="margin-top:-20px;">
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</div>
</aui:form>
 