<%@ include file="/html/wages/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
DecimalFormat df = new DecimalFormat("0.00");
boolean isAttIdNull = false;

long distributionYear = ParamUtil.getLong(request, "distributionYear");
long distributionMonth = ParamUtil.getLong(request, "distributionMonth");

boolean isDone = false;
String cmd = ParamUtil.getString(request, "cmd",StringPool.BLANK);

PortletURL detailURL = renderResponse.createRenderURL();
detailURL.setWindowState(WindowState.MAXIMIZED);
detailURL.setParameter("mvcPath","/html/wages/edit_wages.jsp");

List headerNames = new ArrayList();
headerNames.add("姓名");
headerNames.add("发工资月份");
//headerNames.add("入职日期");
//headerNames.add("离职日期");
headerNames.add("基本工资");
headerNames.add("绩效工资");
headerNames.add("工资小计");
headerNames.add("应出勤(天）");
headerNames.add("实出勤(天）");
headerNames.add("应发基本工资");
headerNames.add("绩效得分");
headerNames.add("应发绩效工资");
headerNames.add("应发工资合计");
headerNames.add("社保公司承担部分");
headerNames.add("社保个人承担部分");
headerNames.add("应纳税所得额");
headerNames.add("税率");
headerNames.add("税金");
headerNames.add("实发工资");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, detailURL,headerNames, "没有工资信息被显示。");

if(cmd.equals(Constants.PREVIEW)){
	int total = BasicInformationLocalServiceUtil.countByIsLeave(false);
	
	searchContainer.setTotal(total);
	
	List results = BasicInformationLocalServiceUtil.findByIsLeave(false, searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();
	List<Wages> wageList = WagesLocalServiceUtil.findByY_M(distributionYear, distributionMonth);

	if(wageList.size() == 0){
		for (int i = 0; i < results.size(); i++) {
			BasicInformation basicInformation = (BasicInformation) results.get(i);
			
			ResultRow row = new ResultRow(basicInformation,basicInformation.getId(), i);
			
			long userId = basicInformation.getUserId();
						
			ExtInformation extInformation = ExtInformationLocalServiceUtil.findByUserId(userId);
			Attendance attendance = AttendanceLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
			Overtime overtime = OvertimeLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
			
			row.addText(basicInformation.getName());
			row.addText(String.valueOf(distributionYear+"-"+(distributionMonth+1)));
			row.addText(String.valueOf(df.format(extInformation.getBasicWage())));
			row.addText(String.valueOf(df.format(extInformation.getOtherWage())));
			row.addText(String.valueOf(df.format(extInformation.getBasicWage()+extInformation.getOtherWage())));
			
			if(Validator.isNotNull(attendance)){
				double basePay = OverTimeSum.getBasePay(extInformation, attendance);
				double performanceSalary = OverTimeSum.getPerformanceSalary(extInformation, attendance);
				double overtimeWages = OverTimeSum.getOvertimeWages(extInformation, attendance, overtime);
				
				row.addText(String.valueOf(attendance.getShouldAttendance()));
				row.addText(String.valueOf(attendance.getActualAttendance()));
				row.addText(String.valueOf(df.format(basePay)));
				row.addText(String.valueOf(df.format(OverTimeSum.getPerformanceScores())));
				row.addText(String.valueOf(df.format(performanceSalary)));
				row.addText(String.valueOf(df.format(OverTimeSum.getTotalWages(basePay, performanceSalary, overtimeWages))));
				row.addText(String.valueOf(df.format(OverTimeSum.getSocialCompanyBearPart(extInformation))));
				row.addText(String.valueOf(df.format(OverTimeSum.getSocialIndividualsBearPart(extInformation))));
				row.addText(String.valueOf(df.format(OverTimeSum.getTaxableIncome(extInformation, overtimeWages))));
				row.addText(String.valueOf(OverTimeSum.getTaxRate(extInformation, overtimeWages))+"%");
				row.addText(String.valueOf(df.format(OverTimeSum.getTaxes(extInformation, overtimeWages))));
				row.addText(String.valueOf(df.format(OverTimeSum.getRealWages(extInformation, overtimeWages))));
			}else{
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
				row.addText("--");
			}
			
			resultRows.add(row);
		}	
	}else{
		isDone = true;
	}
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="editWages" />
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<portlet:renderURL var="previewURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/edit_wages.jsp" />
	<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.PREVIEW %>" />
</portlet:renderURL>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td width="145px">
				<aui:select label="工资年份" name="distributionYear" style="width:120px;margin-right:10px;">
				<% 
				for(int i=2012;i<2015;i++){
					%>
						<aui:option label="<%= i %>" value="<%= i %>" />
					<%
				}
				%>
				</aui:select> 
			</td>
			<td width="145px">
				<aui:select label="工资月份" name="distributionMonth" style="width:120px;margin-right:10px;">
				<% 
					for(int i=1;i<13;i++){
				%>
						<aui:option label="<%= i %>" value="<%= i-1 %>" />
				<%
					}
				%>
				</aui:select>
			</td>
			<td>
				<div style="margin-bottom:12px;">
					<%
					String preURL = renderResponse.getNamespace()+"onSub('"+previewURL.toString()+"');";
					%>
					<aui:button value="生成工资预览" onClick="<%= preURL %>" />
				</div>
			</td>
		</tr>
	</table>
	
	<c:if test='<%= !isDone %>'>
		<c:if test='<%= cmd.equals(Constants.PREVIEW)%>'>
			<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />	
			<br/>
			<aui:button type="submit" value="保存" />
		</c:if>
	</c:if>
	<c:if test='<%= isDone %>'>
		该月工资已生成
	</c:if>
</aui:form>

 <aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>

