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

<liferay-ui:error key="dhst-intranet-department-name-null" message="部门名称不能为空。" />
<liferay-ui:error key="dhst-intranet-department-name-len" message="部门名称长度不能超过10个字。" />
<liferay-ui:error key="dhst-intranet-department-name-rep" message="部门名称不能重复。" />

<portlet:renderURL var="redirectURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="cmd" value="<%= cmd %>" />
	<portlet:param name="id" value="<%= String.valueOf(id) %>" />
	<c:if test='<%= cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/department/view.jsp" />
	</c:if>
	<c:if test='<%= !cmd.equals(Constants.ADD) %>'>
		<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
	</c:if>
</portlet:renderURL>

<portlet:actionURL var="editDepartmentURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editDepartment" />
	<portlet:param name="cmd" value="<%= cmd %>" />
	<portlet:param name="id" value="<%= String.valueOf(id) %>" />
	<portlet:param name="mvcPath" value="/html/department/edit.jsp" />
	<portlet:param name="redirect" value="<%= redirectURL.toString() %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/department/view.jsp" />
</portlet:renderURL>

<aui:form action="<%= editDepartmentURL.toString() %>" method="post" name="fm">
	<aui:input type="hidden" name="cmd" value="<%= cmd %>" />
	<aui:input type="hidden" name="id" value="<%= id %>" />
	
	<aui:input bean="<%= department %>" name="name" label="部门名称" value="" />	
	<aui:select bean="<%= department %>" label="部门负责人" name="leader">
		<%
		List<BasicInformation> biResult = BasicInformationLocalServiceUtil.findByIsLeave(false);
		for(BasicInformation bi : biResult){
		%>
			<aui:option label="<%= bi.getName() %>" value="<%= bi.getUserId() %>" />
		<%
		}
		%>
	</aui:select>
	
	<aui:button type="submit" value="保存" />
	
	<%
	String backButton = renderResponse.getNamespace()+"onSub('"+backURL.toString()+"');";
	%>
	
	<aui:button type="button" value="返回" onClick="<%= backButton %>" />
</aui:form>

<aui:script>
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>