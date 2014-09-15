<%@ include file="/html/overtime/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String cmd = ParamUtil.getString(request, Constants.CMD, Constants.ADD);

long basicId = ParamUtil.getLong(request, "basicId");
long overtimeId = ParamUtil.getLong(request, "overtimeId");

BasicInformation basicInformation = null;
Overtime overtime = null;
List<BasicInformation> basicList = null;

if(cmd.equals(Constants.ADD)){
	basicList = BasicInformationLocalServiceUtil.getBasicInformations(0, BasicInformationLocalServiceUtil.getBasicInformationsCount());
}else{
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(basicId);
	overtime = OvertimeLocalServiceUtil.getOvertime(overtimeId);
}
%>

<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="editOvertime" />
	<portlet:param name="overtimeId" value="<%=String.valueOf(overtimeId) %>" />
	<portlet:param name="cmd" value="<%= cmd %>" />
	<c:if test='<%= !cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
	</c:if>
	<c:if test='<%= cmd.equals(Constants.EDIT) %>'>
		<portlet:param name="basicId" value="<%=String.valueOf(basicId) %>" />
		<portlet:param name="mvcPath" value="/html/overtime/edit_attendance.jsp" />
	</c:if>
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL.toString() %>"
	title='<%= (basicInformation == null) ? "加班记录登记" : "员工信息： " + basicInformation.getName() %>'
/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<aui:fieldset cssClass="span5" style="float:none;">
		<c:if test='<%= Validator.isNotNull(basicList) %>'>
			<aui:select label="选择员工" name="basicId">
			<% 
				for(BasicInformation basic : basicList){
			%>
				<aui:option label="<%= basic.getName() %>" value="<%= basic.getId() %>" />
			<%
				}
			%>
			</aui:select>
		</c:if>
		<aui:select label="加班月份" name="overtimeMonthly">
			<% 
				for(int i=1;i<13;i++){
					if(overtime!=null&&overtime.getOvertimeMonthly()==i){
			%>
					<aui:option label="<%= i %>" value="<%= i %>" />
			<%			
					}else{
			%>
					<aui:option label="<%= i %>" value="<%= i %>" />
			<%
					}
				}
			%>
		</aui:select>
		<aui:input name="usuallyOvertime" label="平常加班" value="<%=overtime!=null?overtime.getUsuallyOvertime():StringPool.BLANK %>" />
		<aui:input name="restOvertime" label="周末加班" value="<%=overtime!=null?overtime.getRestOvertime():StringPool.BLANK %>"/>
		<aui:input name="legalOvertime" label="法定加班" value="<%=overtime!=null?overtime.getLegalOvertime():StringPool.BLANK %>"/>
		<aui:button type="submit" value="保存" />
	</aui:fieldset>
</aui:form>

