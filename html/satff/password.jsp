<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));

User u = UserLocalServiceUtil.getUser(userId);
%>

<aui:input name="newPassword1" label="新密码" />
<aui:input name="newPassword2" label="再次输入" />