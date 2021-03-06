<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));
long biId = Long.parseLong(String.valueOf(request.getAttribute("bi.id")));

BasicInformation basicInformation = null;

if(Validator.isNotNull(biId)){
	basicInformation = BasicInformationLocalServiceUtil.getBasicInformation(biId);
}
%>

<aui:fieldset cssClass="span5">
	<aui:input bean="<%= basicInformation %>" name="name" label="姓名">
		<aui:validator name="required" />
	</aui:input>
	<aui:input bean="<%= basicInformation %>" name="idNumber" label="身份证号" >
		<aui:validator name="required" />
	</aui:input>
	<%--
	<aui:input bean="<%= basicInformation %>" name="birthDate" label="出生年月(yyyyMMdd)" value="<%= birthDateValue %>" />
	--%>
	<% 
	Calendar birthDate = CalendarFactoryUtil.getCalendar();
	if(basicInformation != null)
		birthDate.setTime(basicInformation.getBirthDate());
	%>
	<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
		<liferay-util:param name="name" value="birthDate" />
		<liferay-util:param name="label" value="出生日期" />
		<liferay-util:param name="showDay" value="true" />
		<liferay-util:param name="year_start" value="<%= String.valueOf(IntranetUtil.getCurYear() - 65) %>" />
		<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear() - 16) %>" />
		<liferay-util:param name="yearValue" value="<%= String.valueOf(birthDate.get(Calendar.YEAR)) %>" />
		<liferay-util:param name="monthValue" value="<%= String.valueOf(birthDate.get(Calendar.MONTH)) %>" />
		<liferay-util:param name="dayValue" value="<%= String.valueOf(birthDate.get(Calendar.DATE)) %>" />
	</liferay-util:include>
	
	<aui:input bean="<%= basicInformation %>" name="maritalStatus" label="婚姻状况"/>
	<aui:input bean="<%= basicInformation %>" name="nation" label="民族" />
	<aui:input bean="<%= basicInformation %>" name="health" label="健康状况" />
	<aui:input bean="<%= basicInformation %>" name="placeOfOrigin" label="籍贯" />
	<aui:input bean="<%= basicInformation %>" name="accountProperties" label="户口性质" />
	<aui:input bean="<%= basicInformation %>" name="highestDegree" label="最高学历" />
	<aui:input bean="<%= basicInformation %>" name="politicalBackground" label="政治面貌" />
	<aui:input bean="<%= basicInformation %>" name="fileLocation" label="存档地点" />
</aui:fieldset>
<aui:fieldset  cssClass="span5">
	<aui:input bean="<%= basicInformation %>" name="mail" label="常用邮箱" >
		<aui:validator name="required" />
	</aui:input>
	<aui:input bean="<%= basicInformation %>" name="contactPhone" label="联系电话" />
	<aui:select bean="<%= basicInformation %>" name="sex" label="性别">
		<aui:option label="男" value="1" />
		<aui:option label="女" value="0" />
	</aui:select>
	<aui:input bean="<%= basicInformation %>" name="domicile" label="户籍所在地" />
	<aui:input bean="<%= basicInformation %>" name="residencePhone" label="户籍所在地联系电话" />
	<aui:input bean="<%= basicInformation %>" name="currentResidentialAddress" label="现居住地址" />
	<aui:input bean="<%= basicInformation %>" name="currentResidentialAddressPhone" label="现居住地址联系电话" />
	<aui:input bean="<%= basicInformation %>" name="emergencyContact" label="紧急联系人" />
	<aui:input bean="<%= basicInformation %>" name="emergencyContactRelation" label="紧急联系人关系" />
	<aui:input bean="<%= basicInformation %>" name="emergencyContactPhone" label="紧急联系人电话" />
</aui:fieldset>