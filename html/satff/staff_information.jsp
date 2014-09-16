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
		<table>
			<tr>
				<td colspan="7">
					<h3>劳动合同期限</h3>
				</td>
			</tr>
			<tr>
				<td>
					<aui:input name="laborContractStartYear" label="年" value=""  style="width:60px;"/>
				</td>
				<td>
					<aui:input name="laborContractStartMonth" label="月" value="" style="width:40px;"/>
				</td>
				<td>
					<aui:input name="laborContractStartDay" label="日" value="" style="width:40px;"/>
				</td>
				<td>
					至
				</td>
				<td>
					<aui:input name="laborContractEndYear" label="年" value=""  style="width:60px;"/>
				</td>
				<td>
					<aui:input name="laborContractEndMonth" label="月" value="" style="width:40px;"/>
				</td>
				<td>
					<aui:input name="laborContractEndDay" label="日" value="" style="width:40px;"/>
				</td>
			</tr>
			<tr>
				<td colspan="7">
					<h3>试用期限</h3>
				</td>
			</tr>
			<tr>
				<td>
					<aui:input name="probationPeriodStartYear" label="年" value=""  style="width:60px;"/>
				</td>
				<td>
					<aui:input name="probationPeriodStartMonth" label="月" value="" style="width:40px;"/>
				</td>
				<td>
					<aui:input name="probationPeriodStartDay" label="日" value="" style="width:40px;"/>
				</td>
				<td>
					至
				</td>
				<td>
					<aui:input name="probationPeriodEndYear" label="年" value=""  style="width:60px;"/>
				</td>
				<td>
					<aui:input name="probationPeriodEndMonth" label="月" value="" style="width:40px;"/>
				</td>
				<td>
					<aui:input name="probationPeriodEndDay" label="日" value="" style="width:40px;"/>
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
		</liferay-util:include>
		
	</liferay-ui:section>
	<liferay-ui:section>
		<aui:input bean="<%= extInformation %>" name="basicWage" label="基本工资" />
		<aui:input bean="<%= extInformation %>" name="otherWage" label="绩效工资" />
	</liferay-ui:section>
</liferay-ui:tabs>
