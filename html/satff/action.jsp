<%@page import="com.liferay.portal.util.Constants"%>
<%@ include file="/html/init.jsp" %>

<%
	//得到用户操作的那一行记录

	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Object result = row.getObject();

	Satff satff = (Satff) result;
%>

<liferay-ui:icon-menu>

	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editEntryURL">

		<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />

		<portlet:param name="id" value="<%=Long.toString(satff.getId()) %>" />

		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT %>" />

	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="edit" url="<%= editEntryURL %>" />

	<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteEntryURL">
	
		<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
		
		<portlet:param name="id" value="<%=Long.toString(satff.getId()) %>" />
		
		<portlet:param name="<%=Constants.CMD %>" value="<%=Constants.DELETE %>" />
		
	</portlet:renderURL>

	<liferay-ui:icon-delete url="<%=deleteEntryURL %>" />

</liferay-ui:icon-menu>
