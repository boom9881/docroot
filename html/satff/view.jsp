<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long searchDep = ParamUtil.getLong(request, "searchDep");
String searchName = ParamUtil.getString(request, "searchName");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("searchName",searchName);
portletURL.setParameter("searchDep",String.valueOf(searchDep));
portletURL.setParameter("mvcPath","/html/department/view.jsp");

List<String> headerNames = new ArrayList<String>();

headerNames.add("姓名");
headerNames.add("部门");
headerNames.add("联系电话");
headerNames.add("邮箱");
headerNames.add("身份证号");
headerNames.add("操作");

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, "没有员工被显示。");

int total = BasicInformationLocalServiceUtil.countByDepAndName(searchDep, searchName);

searchContainer.setTotal(total);

List<BasicInformation> results = BasicInformationLocalServiceUtil.findByDepAndName(searchDep, searchName, searchContainer.getStart(), searchContainer.getEnd());

searchContainer.setResults(results);

List resultRows = searchContainer.getResultRows();

for (int i = 0; i < results.size(); i++) {
	BasicInformation bi = (BasicInformation) results.get(i);
		
	ResultRow row = new ResultRow(bi,bi.getId(), i);

	row.addText(bi.getName());
	
	if(Validator.isNotNull(bi.getDepartmentId())){
		Department dep = DepartmentLocalServiceUtil.getDepartment(bi.getDepartmentId());
		
		row.addText(dep.getName());
	}else{
		row.addText(StringPool.BLANK);
	}
	row.addText(bi.getContactPhone());
	row.addText(bi.getMail());
	row.addText(bi.getIdNumber());
	
	row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/satff/action.jsp");

	resultRows.add(row);
}
%>

<portlet:actionURL var="deleteUserActionURL">
	<portlet:param name="action" value="deleteUser" />
</portlet:actionURL>

<portlet:renderURL var="searchUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addUserRenderURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/edit_satff.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchUserRenderURL.toString() %>" method="post" name="fm">
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
				<aui:input name="searchName" label="姓名" style="width:150px;margin-right:10px;" />
			</td>
			<td>
				<div style="margin-bottom:12px;">
					<aui:button type="submit" value="搜索" />
		
					<%
					String addUserURL = renderResponse.getNamespace()+"onSub('"+addUserRenderURL.toString()+"');";
					%>
				
					<aui:button value="添加员工" onClick="<%= addUserURL %>" />
				</div>
			</td>
		</tr>
	</table>
	
	<div style="margin-top:-20px;">
		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
	</div>
</aui:form>

<aui:script>
	function <portlet:namespace />leave(url){
		if(confirm("您确定此人离职？")){
			<portlet:namespace />onSub(url);
		}
	}
	
	function <portlet:namespace />onSub(url){
		document.<portlet:namespace />fm.action = url;

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>