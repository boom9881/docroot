<%@ include file="/html/overtime/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
String tab = ParamUtil.getString(request, "tabs", "attTab1");
%>

<portlet:renderURL var="tabsURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/overtime/view.jsp" />
</portlet:renderURL>

<liferay-ui:tabs names="attTab1,attTab2" value="<%= tab %>" url="<%= tabsURL.toString() %>" param="tabs" />

<c:choose>
	<c:when test='<%= tab.equals("attTab1") %>'>
		<liferay-util:include page="/html/overtime/edit_overtime.jsp"  servletContext="<%= application %>" />
	</c:when>
	<c:when test='<%= tab.equals("attTab2") %>'>
		<liferay-util:include page="/html/overtime/my_overtime.jsp"  servletContext="<%= application %>" />
	</c:when>
</c:choose>
