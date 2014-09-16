<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
int ys = Integer.parseInt(PropsUtil.get("dhst.intranet.date.year.start"));
int ye = Integer.parseInt(PropsUtil.get("dhst.intranet.date.year.end"));
String name = ParamUtil.getString(request, "name");
String label = ParamUtil.getString(request, "label");
%>

<table>
	<tr>
		<td>
			<aui:select name='<%= name + "Year" %>' label="<%= label %>" style="width:70px;">
				<% 
				for(int j = ys; j <= ye; j++){
				%>
					<aui:option label="<%= j %>" value="<%= j %>" />
				<%
				}
				%>
			</aui:select>
		</td>
		<td>
			<aui:select name='<%= name + "Month" %>' label="&nbsp;" style="width:50px;">
				<% 
				for(int j = 1; j < 13; j++){
					String v = String.valueOf(j);
					if(v.length() == 1){
						v = "0" + v;
					}
				%>
					<aui:option label="<%= v %>" value="<%= v %>" />
				<%
				}
				%>
			</aui:select>
		</td>
	</tr>
</table>