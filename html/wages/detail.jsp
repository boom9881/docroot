<%@ include file="/html/wages/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
DecimalFormat df = new DecimalFormat("0.00");
long wageId = ParamUtil.getLong(request, "wageId");

Wages wage = WagesLocalServiceUtil.getWages(wageId);

StringBuffer title = new StringBuffer(wage.getWageName());
title.append(StringPool.FOUR_SPACES);
title.append(wage.getDistributionYear()+"年"+wage.getDistributionMonth()+"月");
title.append(StringPool.FOUR_SPACES);
title.append("工资信息详细");
%>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%= backURL.toString() %>" title='<%= HtmlUtil.stripHtml(title.toString()) %>' />

<table class="table table-bordered">
	<tr>
		<!--  
		<th>入职日期</th>
		<th>离职日期</th>
		-->
		<th>工资</th>
		<th>出勤</th>
		<th>绩效得分</th>
		<th>应发工资</th>
		<th>社保</th>
		<th>个人所得税</th>
		<th>实发工资</th>
	</tr>
	<tr>
		<td>
			基本工资:<%= df.format(wage.getUserWage())%><br/>
			绩效工资:<%= df.format(wage.getUserPerformance())%><br/>
			合计:<%= df.format(wage.getUserTotalWage())%>
		</td>
		<td>
			应出勤:<%= wage.getAttendance()%>天<br/>
			实出勤:<%= wage.getRealAttendance()%>天
		</td>
		<td><%= df.format(wage.getPerformanceScores())%></td>
		<td>
			基本工资:<%= df.format(wage.getBasePay())%><br/>
			绩效工资:<%= df.format(wage.getPerformanceSalary())%><br/>
			合计:<%= df.format(wage.getTotalWages())%>
		</td>
		<td>
			公司承担:<%= df.format(wage.getSocialCompanyBearPart())%><br/>
			个人承担:<%= df.format(wage.getSocialIndividualsBearPart())%>
		</td>
		<td>
			纳税额:<%= df.format(wage.getTaxableIncome())%><br/>
			税率:<%= df.format(wage.getTaxRate())%><br/>
			税金:<%= df.format(wage.getTaxes())%>
		</td>
		<td><%= df.format(wage.getRealWages())%></td>
	</tr>
</table>
