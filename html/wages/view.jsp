<%@ include file="/html/wages/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
DecimalFormat df = new DecimalFormat("0.00");

long userId = themeDisplay.getUserId();

int userRole = OverTimeSum.isSatff(userId);

long searchUserId = 0;
long searchDepId = ParamUtil.getLong(request, "searchDep");
String searchWagesYear = ParamUtil.getString(request, "searchWagesYear");
String searchWagesMonth = ParamUtil.getString(request, "searchWagesMonth");
String searchName = ParamUtil.getString(request, "searchName");

if(userRole == 2){
	searchUserId = userId;
}

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("mvcPath","/html/attendance/view.jsp");
portletURL.setParameter("searchDepId",String.valueOf(searchDepId));
portletURL.setParameter("searchWagesYear",searchWagesYear);
portletURL.setParameter("searchWagesMonth",searchWagesMonth);
portletURL.setParameter("searchName",searchName);

List headerNames = new ArrayList();
headerNames.add("姓名");
headerNames.add("发工资月份");
//headerNames.add("入职日期");
//headerNames.add("离职日期");
//headerNames.add("基本工资");
//headerNames.add("绩效工资");
//headerNames.add("工资小计");
//headerNames.add("应出勤(天）");
//headerNames.add("实出勤(天）");
headerNames.add("应发基本工资");
//headerNames.add("绩效得分");
headerNames.add("应发绩效工资");
headerNames.add("应发工资合计");
headerNames.add("社保公司承担部分");
headerNames.add("社保个人承担部分");
//headerNames.add("应纳税所得额");
//headerNames.add("税率");
headerNames.add("税金");
headerNames.add("实发工资");
headerNames.add("操作");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有工资信息被显示。");

int total = WagesLocalServiceUtil.getWagesesCount();

searchContainer.setTotal(total);

List results = WagesLocalServiceUtil.getWageses(searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {

	Wages wages = (Wages) results.get(i);

	ResultRow row = new ResultRow(wages,wages.getId(), i);

	row.addText(wages.getWageName());
	row.addText(String.valueOf(wages.getDistributionYear())+"-"+String.valueOf(wages.getDistributionMonth()));
	//row.addText(sdf.format(wages.getEntryDate()));
	//row.addText(wages.getDepartureDate()!=null?sdf.format(wages.getDepartureDate()):StringPool.BLANK);
	//row.addText(String.valueOf(df.format(wages.getUserWage())));
	//row.addText(String.valueOf(df.format(wages.getUserPerformance())));
	//row.addText(String.valueOf(df.format(wages.getUserTotalWage())));
	//row.addText(String.valueOf(wages.getAttendance()));
	//row.addText(String.valueOf(wages.getRealAttendance()));
	//row.addText(String.valueOf(df.format(wages.getOvertimeWages())));
	row.addText(String.valueOf(df.format(wages.getBasePay())));
	row.addText(String.valueOf(df.format(wages.getPerformanceSalary())));
	row.addText(String.valueOf(df.format(wages.getTotalWages())));
	row.addText(String.valueOf(df.format(wages.getSocialCompanyBearPart())));
	row.addText(String.valueOf(df.format(wages.getSocialIndividualsBearPart())));
	//row.addText(String.valueOf(df.format(wages.getTaxableIncome())));
	//row.addText(String.valueOf(wages.getTaxRate())+"%");
	row.addText(String.valueOf(df.format((wages.getTaxes()))));
	row.addText(String.valueOf(df.format(wages.getRealWages())));
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/wages/action.jsp");
	
	resultRows.add(row);
}
%>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<liferay-portlet:renderURL var="addWagestURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/html/wages/edit_wages.jsp" />
	<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD %>" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td width="145px">
				<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
					<liferay-util:param name="name" value="searchWages" />
					<liferay-util:param name="label" value="时间" />
					<liferay-util:param name="showMonthEmpty" value="true" />
					<liferay-util:param name="year_start" value="2012" />
					<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
				</liferay-util:include>
			</td>
			<c:if test='<%= userRole == 1 %>'>
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
			</c:if>
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
					<c:if test='<%= userRole == 1 %>'>
						<%
						String addURL = renderResponse.getNamespace()+"generateWages('"+addWagestURL.toString()+"');";
						%>
						<aui:button value="生成工资" onClick="<%= addURL %>" />
					</c:if>
				</div>
			</td>
		</tr>
	</table>
	<div style="margin-top:-20px;">
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</div>
</aui:form>
 
 <aui:script use="aui-base">
 	Liferay.provide(
		window,
		'<portlet:namespace />generateWages',
		function(url) {
			var instance = this;

			Liferay.Util.openWindow(
				{
					cache: false,
					dialog: {
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 50);
							}
						},
						width: 1020
					},
					dialogIframe: {
						id: 'generateWagesIframe',
						uri: url
					},
					title: '生成工资',
					uri: url
				}
			);
		},
		['liferay-util-window']
	);
</aui:script>
 