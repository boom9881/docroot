<%@ include file="/html/overtime/init-ext.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Overtime overtime = (Overtime) row.getObject();

	BasicInformation basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(overtime.getUserId());
%>

<liferay-ui:icon-menu>
	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">

		<portlet:param name="mvcPath" value="/html/overtime/edit_overtime.jsp" />

		<portlet:param name="basicId" value="<%=String.valueOf(basicInformation.getId()) %>" />
		
		<portlet:param name="overtimeId" value="<%=String.valueOf(overtime.getId()) %>" />
		
		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />
	
</liferay-ui:icon-menu>
