<%@ include file="/html/overtime/init-ext.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<portlet:actionURL var="editUserActionURL" windowState="<%= WindowState.MAXIMIZED.toString() %>">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="editWages" />
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/wages/view.jsp" />
</portlet:renderURL>

<liferay-ui:header	backURL="<%= backURL.toString() %>"	title='生成工资'/>

<aui:form action="<%= editUserActionURL.toString() %>" method="post" name="fm">
	<div style="overflow:hidden;">
		<aui:fieldset cssClass="span5">
			<aui:select label="加班年份" name="distributionYear">
			<% 
			for(int i=2010;i<2015;i++){
				%>
					<aui:option label="<%= i %>" value="<%= i %>" />
				<%
			}
			%>
			</aui:select>
			<aui:select label="加班月份" name="distributionMonth">
			<% 
				for(int i=1;i<13;i++){
			%>
					<aui:option label="<%= i %>" value="<%= i %>" />
			<%
				}
			%>
			</aui:select>
			<aui:button type="submit" value="保存" />
		</aui:fieldset>
	</div>
</aui:form>

