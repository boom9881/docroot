<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));

List<Education> edus = Collections.emptyList();

int[] edusIndexes = null;

String edusIndexesParam = ParamUtil.getString(request, "edusIndexes");

if (Validator.isNotNull(edusIndexesParam)) {
	edus = new ArrayList<Education>();

	edusIndexes = StringUtil.split(edusIndexesParam, 0);

	for (int i : edusIndexes) {
		edus.add(new EducationImpl());
	}
}
else {
	edus = EducationLocalServiceUtil.findByUserId(userId);

	edusIndexes = new int[edus.size()];

	for (int i = 0; i < edus.size() ; i++) {
		edusIndexes[i] = i;
	}

	if (edus.isEmpty()) {
		edus = new ArrayList<Education>();

		edus.add(new EducationImpl());

		edusIndexes = new int[] {0};
	}

	if (edusIndexes == null) {
		edusIndexes = new int[0];
	}
}
%>

<liferay-ui:error-marker key="errorSection" value="phoneNumbers" />

<h3><liferay-ui:message key="教育经历" /></h3>

<div class="alert alert-info">
	由最高学历开始填写，自高而低
</div>

<aui:fieldset id="eduNumbers">

	<%
	for (int i = 0; i < edusIndexes.length; i++) {
		int edusIndex = edusIndexes[i];

		Education edu = edus.get(i);
	%>
 		<%--
		<aui:model-context bean="<%= edu %>" model="<%= Education.class %>" />
		--%>
		<div class="lfr-form-row lfr-form-row-inline">
			<div class="row-fields">
				<aui:input name='<%= "eduId" + edusIndex %>' type="hidden" value="<%= edu.getId() %>" />
				
				<aui:fieldset cssClass="span5">
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="eStartTime" />
						<liferay-util:param name="index" value="<%= String.valueOf(edusIndex) %>" />
						<liferay-util:param name="label" value="开始时间（年月）" />
						<liferay-util:param name="year_start" value="1980" />
						<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
						<liferay-util:param name="yearValue" value="<%= edu.getEStartTimeYear() %>" />
						<liferay-util:param name="monthValue" value="<%= edu.getEStartTimeMonth() %>" />
					</liferay-util:include>
					
					<aui:input name='<%= "eUniversity" + edusIndex %>' label="毕业院校" value="<%= edu.getEUniversity() %>" />
					<aui:input name='<%= "eWitness" + edusIndex %>' label="证明人" value="<%= edu.getEWitness() %>" />
				</aui:fieldset>
				<aui:fieldset cssClass="span5">
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="eStopTime" />
						<liferay-util:param name="index" value="<%= String.valueOf(edusIndex) %>" />
						<liferay-util:param name="label" value="结束时间（年月）" />
						<liferay-util:param name="year_start" value="1980" />
						<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
						<liferay-util:param name="yearValue" value="<%= edu.getEStopTimeYear() %>" />
						<liferay-util:param name="monthValue" value="<%= edu.getEStopTimeMonth() %>" />
					</liferay-util:include>
					
					<aui:input name='<%= "eProfessional" + edusIndex %>' label="专业" value="<%= edu.getEProfessional() %>" />
					<aui:input name='<%= "eContactPhone" + edusIndex %>' label="联系电话" value="<%= edu.getEContactPhone() %>" />
				</aui:fieldset>
			</div>
		</div>

	<%
	}
	%>

	<aui:input name="edusIndexes" type="hidden" value="<%= StringUtil.merge(edusIndexes) %>" />
</aui:fieldset>

<aui:script use="liferay-auto-fields">
	Liferay.once(
		'formNavigator:reveal<portlet:namespace />education',
		function() {
			new Liferay.AutoFields(
				{
					contentBox: '#<portlet:namespace />eduNumbers',
					fieldIndexes: '<portlet:namespace />edusIndexes',
					namespace: '<portlet:namespace />'
				}
			).render();
		}
	);
</aui:script>