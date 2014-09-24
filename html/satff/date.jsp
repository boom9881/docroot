<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
int ys = ParamUtil.getInteger(request, "year_start", Integer.parseInt(PropsUtil.get("dhst.intranet.date.year.start")));
int ye = ParamUtil.getInteger(request, "year_end", Integer.parseInt(PropsUtil.get("dhst.intranet.date.year.end")));

String index = ParamUtil.getString(request, "index", StringPool.BLANK);
String name = ParamUtil.getString(request, "name");
String label = ParamUtil.getString(request, "label");
boolean showDay = ParamUtil.getBoolean(request, "showDay", false);
boolean showYearEmpty = ParamUtil.getBoolean(request, "showYearEmpty", false);
boolean showMonthEmpty = ParamUtil.getBoolean(request, "showMonthEmpty", false);

String yearValue = ParamUtil.getString(request, "yearValue");
String monthValue = ParamUtil.getString(request, "monthValue");
String dayValue = ParamUtil.getString(request, "dayValue");
%>

<table>
	<tr>
		<td>
			<aui:select name='<%= name + "Year" + index %>' label="<%= label %>" style="width:70px;">
				<% 
				for(int j = ys; j <= ye; j++){
				%>
					<aui:option label="<%= j %>" value="<%= j %>"  selected='<%= Boolean.parseBoolean(yearValue.equals(String.valueOf(j)) ? "true":"false") %>' />
				<%
				}
				%>
			</aui:select>
		</td>
		<td>
			<% 
			String changeMonth = renderResponse.getNamespace()+"changeMonth(this.value,'"+name+"');";
			%>
			<aui:select name='<%= name + "Month" + index %>' label="&nbsp;" style="width:60px;" onChange="<%= changeMonth %>">
				<c:if test='<%= showMonthEmpty %>'>
					<aui:option label="所有" value="" />
				</c:if>
				<% 
				for(int j = 1; j < 13; j++){
					String v = String.valueOf(j);
					if(v.length() == 1){
						v = "0" + v;
					}
				%>
					<aui:option label="<%= v %>" value="<%= (j - 1) %>" selected='<%= Boolean.parseBoolean(monthValue.equals(String.valueOf(j-1)) ? "true":"false") %>' />
				<%
				}
				%>
			</aui:select>
		</td>
		<c:if test='<%= showDay %>'>
			<td>
				<aui:select name='<%= name + "Day" + index %>' label="&nbsp;" style="width:50px;">
					<% 
					for(int j = 1; j < 31; j++){
						String v = String.valueOf(j);
						if(v.length() == 1){
							v = "0" + v;
						}
					%>
						<aui:option label="<%= v %>" value="<%= v %>" selected='<%= Boolean.parseBoolean(dayValue.equals(String.valueOf(j)) || dayValue.equals(v) ? "true":"false") %>' />
					<%
					}
					%>
				</aui:select>
			</td>
		</c:if>
	</tr>
</table>

<aui:script>
	function <portlet:namespace />changeMonth(m,dayName){
		var dayEle = document.getElementById('<portlet:namespace />'+dayName+'Day');
		var yearEle = document.getElementById('<portlet:namespace />'+dayName+'Year');
		var index=yearEle.selectedIndex;
		var yearVal = yearEle.options[index].value;     
		
		var dayLength = dayEle.options.length;
		var day = 31;
		
		if(m == 4 || m == 6 || m == 9 || m == 11){
			day = 30;
		}else if(m == 2){
			if((yearVal%4 == 0 && yearVal%100 != 0) || yearVal%400 == 0){
				day = 29;
			}else{
				day = 28;
			}
		}
		
		if(dayLength < day){
			for(var i = dayLength; i < day; i++){
				dayEle.add(new Option((i+1),(i+1)));
			}
		}
		
		if(dayLength > day){
			dayEle.options.length=day;
		}
	}
</aui:script>