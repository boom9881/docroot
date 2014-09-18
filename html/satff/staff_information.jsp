<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));
long biId = Long.parseLong(String.valueOf(request.getAttribute("bi.id")));

BasicInformation basicInformation = null;
ExtInformation extInformation = null;

if(Validator.isNotNull(biId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(biId);
}
if(Validator.isNotNull(userId)){
	extInformation = ExtInformationLocalServiceUtil.findByUserId(userId);
}

String fiy = StringPool.BLANK;
String fim = StringPool.BLANK;
Calendar laborContractStart = CalendarFactoryUtil.getCalendar();
Calendar laborContractEnd = CalendarFactoryUtil.getCalendar();
Calendar probationPeriodStart = CalendarFactoryUtil.getCalendar();
Calendar probationPeriodEnd = CalendarFactoryUtil.getCalendar();

if(extInformation != null){
	laborContractStart.setTime(extInformation.getLaborContractStart());
	laborContractEnd.setTime(extInformation.getLaborContractEnd());
	probationPeriodStart.setTime(extInformation.getProbationPeriodStart());
	probationPeriodEnd.setTime(extInformation.getProbationPeriodEnd());

	fiy = String.valueOf(extInformation.getFristInsuredYear());
	fim = String.valueOf(extInformation.getFristInsuredMonth());
}
%>

<portlet:renderURL var="portletURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
</portlet:renderURL>

<aui:select bean="<%= basicInformation %>" label="所属部门" name="departmentId">
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

<liferay-ui:tabs
	names="收款信息,劳动关系,社保信息,工资"
	url="<%= portletURL.toString() %>"
	refresh="false"
>
	<liferay-ui:section>
		<aui:input bean="<%= extInformation %>" name="openCity" label="开户城市" />
		<aui:input bean="<%= extInformation %>" name="bankName" label="开户行全称" />
		<aui:input bean="<%= extInformation %>" name="bankId" label="银行账号" />
	</liferay-ui:section>
	<liferay-ui:section>
		<table width="250px">
			<tr>
				<td colspan="7">
					<h3>劳动合同期限</h3>
				</td>
			</tr>
			<tr>
				<td>
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="laborContractStart" />
						<liferay-util:param name="label" value="&nbsp;" />
						<liferay-util:param name="showDay" value="true" />
						<liferay-util:param name="year_start" value="2012" />
						<liferay-util:param name="yearValue" value="<%= String.valueOf(laborContractStart.get(Calendar.YEAR)) %>" />
						<liferay-util:param name="monthValue" value="<%= String.valueOf(laborContractStart.get(Calendar.MONTH)) %>" />
						<liferay-util:param name="dayValue" value="<%= String.valueOf(laborContractStart.get(Calendar.DATE)) %>" />
					</liferay-util:include>
				</td>
				<td>
					至
				</td>
				<td>
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="laborContractEnd" />
						<liferay-util:param name="label" value="&nbsp;" />
						<liferay-util:param name="showDay" value="true" />
						<liferay-util:param name="year_start" value="2012" />
						<liferay-util:param name="yearValue" value="<%= String.valueOf(laborContractEnd.get(Calendar.YEAR)) %>" />
						<liferay-util:param name="monthValue" value="<%= String.valueOf(laborContractEnd.get(Calendar.MONTH)) %>" />
						<liferay-util:param name="dayValue" value="<%= String.valueOf(laborContractEnd.get(Calendar.DATE)) %>" />
					</liferay-util:include>
				</td>
			</tr>
			<tr>
				<td colspan="7">
					<h3>试用期限</h3>
				</td>
			</tr>
			<tr>
				<td>
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="probationPeriodStart" />
						<liferay-util:param name="label" value="&nbsp;" />
						<liferay-util:param name="showDay" value="true" />
						<liferay-util:param name="year_start" value="2012" />
						<liferay-util:param name="yearValue" value="<%= String.valueOf(probationPeriodStart.get(Calendar.YEAR)) %>" />
						<liferay-util:param name="monthValue" value="<%= String.valueOf(probationPeriodStart.get(Calendar.MONTH)) %>" />
						<liferay-util:param name="dayValue" value="<%= String.valueOf(probationPeriodStart.get(Calendar.DATE)) %>" />
					</liferay-util:include>
				</td>
				<td>
					至
				</td>
				<td>
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="probationPeriodEnd" />
						<liferay-util:param name="label" value="&nbsp;" />
						<liferay-util:param name="showDay" value="true" />
						<liferay-util:param name="year_start" value="2012" />
						<liferay-util:param name="yearValue" value="<%= String.valueOf(probationPeriodEnd.get(Calendar.YEAR)) %>" />
						<liferay-util:param name="monthValue" value="<%= String.valueOf(probationPeriodEnd.get(Calendar.MONTH)) %>" />
						<liferay-util:param name="dayValue" value="<%= String.valueOf(probationPeriodEnd.get(Calendar.DATE)) %>" />
					</liferay-util:include>
				</td>
			</tr>
		</table>
	</liferay-ui:section>
	<liferay-ui:section>
		<aui:input type="checkbox" bean="<%= extInformation %>" name="isInsured" label="从未参加过社会保险" />
		<aui:input bean="<%= extInformation %>" name="induredLocation" label="参加社保保险地点(城市)" />
		
		<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
			<liferay-util:param name="name" value="fristInsured" />
			<liferay-util:param name="label" value="参加社会保险时间" />
			<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
			<liferay-util:param name="yearValue" value="<%= fiy %>" />
			<liferay-util:param name="monthValue" value="<%= fim %>" />
		</liferay-util:include>
		
	</liferay-ui:section>
	<liferay-ui:section>
		<aui:input bean="<%= extInformation %>" name="basicWage" label="基本工资" />
		<aui:input bean="<%= extInformation %>" name="otherWage" label="绩效工资" />
	</liferay-ui:section>
</liferay-ui:tabs>
