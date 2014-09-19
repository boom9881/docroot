<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

BasicInformation obj = (BasicInformation)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test='<%= obj.getIsLeave() == 0 %>'>
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">
			<portlet:param name="biId" value="<%=String.valueOf(obj.getId()) %>" />
			<portlet:param name="userId" value="<%=String.valueOf(obj.getUserId()) %>" />
			<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
		</portlet:renderURL>
	
		<liferay-ui:icon image="edit" message="编辑" url="<%= editEntryURL %>" />
	
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="leaveURL">
			<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="leaveSatff" />
			<portlet:param name="biId" value="<%=String.valueOf(obj.getId()) %>" />
			<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
		</portlet:actionURL>
	
		<%
		String leaveURLValue = "javascript:"+renderResponse.getNamespace()+"leave('"+leaveURL.toString()+"');";
		%>
		
		<liferay-ui:icon image="activate" message="离职" url="<%= leaveURLValue %>" />
	</c:if>
	
	<liferay-ui:icon image="view" message="打印" url="alert('');" />
	
	<%--
	<liferay-ui:icon-deactivate url="<%= leaveURL %>" />
	
	<c:if test='<%= obj.getIsLeave() == 1 %>'>
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteEntryURL">
			<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="deleteSatff" />
			<portlet:param name="biId" value="<%=String.valueOf(obj.getId()) %>" />
			<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
		</portlet:actionURL>
		
		<liferay-ui:icon-delete url="<%=deleteEntryURL %>" />
	</c:if>
	--%>
</liferay-ui:icon-menu>
