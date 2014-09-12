<%@ include file="/html/department/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
String cmd = ParamUtil.getString(request, Constants.CMD, Constants.ADD);
long id = ParamUtil.getLong(request, "id");

Department department = null;

if(Validator.isNotNull(id)){
	department = DepartmentLocalServiceUtil.getDepartment(id);
}
%>

<portlet:actionURL var="editDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editDepartment" />
	<portlet:param name="cmd" value="<%= cmd %>" />
	<portlet:param name="id" value="<%= String.valueOf(id) %>" />
	<c:if test='<%= cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/department/view.jsp" />
	</c:if>
	<c:if test='<%= !cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
	</c:if>
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/view.jsp" />
</portlet:renderURL>

<aui:form action="" method="post" name="fm">
	<aui:input type="hidden" name="cmd" value="<%= cmd %>" />
	<aui:input type="hidden" name="id" value="<%= id %>" />
	
	<aui:input name="name" label="部门名称" value="" />	
	<aui:select label="部门负责人" name="leader">
		<%
		BasicInformationLocalServiceUtil.
		%>
		<aui:option label="male" value="true" />
		<%
		
		%>
	</aui:select>
	
	<aui:button type="submit" value="保存" />
	<aui:button type="button" value="取消" onClick="" />
</aui:form>