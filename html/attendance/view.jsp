<%@ include file="/html/attendance/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String tab = ParamUtil.getString(request, "tabs", "attTab2");
%>

<portlet:renderURL var="tabsURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
</portlet:renderURL>

<liferay-ui:tabs names="attTab1,attTab2,attTab3" value="<%= tab %>" url="<%= tabsURL.toString() %>" param="tabs" />

<c:choose>
	<c:when test='<%= tab.equals("attTab1") %>'>
		<liferay-util:include page="/html/attendance/edit_attendance.jsp"  servletContext="<%= application %>" />
	</c:when>
	<c:when test='<%= tab.equals("attTab2") %>'>
		<liferay-util:include page="/html/attendance/process_attendance.jsp"  servletContext="<%= application %>" />
	</c:when>
	<c:when test='<%= tab.equals("attTab3") %>'>
		4
	</c:when>
</c:choose>
