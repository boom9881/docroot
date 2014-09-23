<%@ include file="/html/process/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long searchDepId = ParamUtil.getLong(request, "searchDep");
String searchName = ParamUtil.getString(request, "searchName");
String tab = ParamUtil.getString(request, "tabs", "attTab1");
%>

<portlet:renderURL var="tabsURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/process/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="searchRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/attendance/view.jsp" />
	<portlet:param name="tabs" value="<%= tab %>" />
</portlet:renderURL>

<aui:form action="<%= searchRenderURL.toString() %>" method="post" name="fm">
	<table>
		<tr>
			<td>
				<aui:select label="部门" name="searchDep" style="width:120px;margin-right:10px;">
					<aui:option label="所有" value="" />
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
			</td>
			<td>
				<aui:input name="searchName" label="姓名" value="" style="width:120px;margin-right:10px;" />
			</td>
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
				</div>
			</td>
		</tr>
	</table>

	<liferay-ui:tabs names="attTab1,attTab2" value="<%= tab %>" url="<%= tabsURL.toString() %>" param="tabs" />
	
	<c:choose>
		<c:when test='<%= tab.equals("attTab1") %>'>
			<liferay-util:include page="/html/process/attendance.jsp"  servletContext="<%= application %>">
				<liferay-util:param name="searchDep" value="<%= String.valueOf(searchDepId) %>" />
				<liferay-util:param name="searchName" value="<%= searchName %>" />
			</liferay-util:include>
		</c:when>
		<c:when test='<%= tab.equals("attTab2") %>'>
			<liferay-util:include page="/html/process/overtime.jsp"  servletContext="<%= application %>">
				<liferay-util:param name="searchDep" value="<%=  String.valueOf(searchDepId)  %>" />
				<liferay-util:param name="searchName" value="<%= searchName %>" />
			</liferay-util:include>
		</c:when>
	</c:choose>
</aui:form>