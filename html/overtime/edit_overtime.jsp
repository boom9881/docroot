<%@ include file="/html/overtime/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = ParamUtil.getLong(request, "id");

BasicInformation basicInformation = null;
Overtime overtime = null;
if(Validator.isNotNull(userId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(userId);
	overtime = OvertimeLocalServiceUtil.getOvertime(1L);
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"	title='<%="加班记录： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:fieldset cssClass="span5" style="float:none;">
		<aui:input name="overtimeMonthly" label="加班月份" value="<%=overtime!=null?overtime.getOvertimeMonthly():StringPool.BLANK %>" />
		<aui:input name="usuallyOvertime" label="平常加班" value="<%=overtime!=null?overtime.getUsuallyOvertime():StringPool.BLANK %>" />
		<aui:input name="restOvertime" label="周末加班" value="<%=overtime!=null?overtime.getRestOvertime():StringPool.BLANK %>"/>
		<aui:input name="legalOvertime" label="法定加班" value="<%=overtime!=null?overtime.getLegalOvertime():StringPool.BLANK %>"/>
		<aui:button type="submit" value="保存" />
	</aui:fieldset>
</aui:form>

