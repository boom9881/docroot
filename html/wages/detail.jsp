<%@ include file="/html/wages/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
DecimalFormat df = new DecimalFormat("0.00");
long wageId = ParamUtil.getLong(request, "wageId");

Wages wage = WagesLocalServiceUtil.getWages(wageId);

%>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%= backURL.toString() %>"	title='工资信息详细' />

	<table class="table table-bordered">
		<tr>
			<th>姓名</th>
			<th>月份</th>
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
			<td><%= wage.getWageName()%></td>
			<td><%= wage.getDistributionYear()+"年"+wage.getDistributionMonth()%>月</td>
			
			<td>
				基本工资:<%= df.format(wage.getUserWage())%><br/>
				绩效工资:<%= df.format(wage.getUserPerformance())%><br/>
				工资合计:<%= df.format(wage.getUserTotalWage())%>
			</td>
			
			<td>
				应出勤:<%= wage.getAttendance()%>天<br/>
				实出勤:<%= wage.getRealAttendance()%>天
			</td>
			
			<td><%= df.format(wage.getPerformanceScores())%></td>
			
			
			<td>
				基本工资:<%= df.format(wage.getBasePay())%><br/>
				绩效工资:<%= df.format(wage.getPerformanceSalary())%><br/>
				工资合计:<%= df.format(wage.getTotalWages())%>
			</td>
			
			<td>
				社保公司:<%= df.format(wage.getSocialCompanyBearPart())%><br/>
				社保个人:<%= df.format(wage.getSocialIndividualsBearPart())%>
			</td>
			
			<td>
				纳税额:<%= df.format(wage.getTaxableIncome())%><br/>
				税率:<%= df.format(wage.getTaxRate())%><br/>
				税金:<%= df.format(wage.getTaxes())%>
			</td>
			
			<td><%= df.format(wage.getRealWages())%></td>
		</tr>
	</table>
