<%@ include file="/html/department/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<portlet:renderURL var="searchDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchDepartmentURL.toString() %>" method="post" name="fm">
	<aui:button type="submit" value="搜索" />
	
	<%
	String addURL = renderResponse.getNamespace()+"onSub('"+addDepartmentURL.toString()+"');";
	%>
	
	<aui:button value="添加部门" onClick="<%= addURL %>" />
</aui:form>
