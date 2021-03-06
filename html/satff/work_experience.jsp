<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));

List<WorkExperience> works = Collections.emptyList();

int[] worksIndexes = null;

String worksIndexesParam = ParamUtil.getString(request, "worksIndexes");

if (Validator.isNotNull(worksIndexesParam)) {
	works = new ArrayList<WorkExperience>();

	worksIndexes = StringUtil.split(worksIndexesParam, 0);

	for (int i : worksIndexes) {
		works.add(new WorkExperienceImpl());
	}
}
else {
	works = WorkExperienceLocalServiceUtil.findByUserId(userId);

	worksIndexes = new int[works.size()];

	for (int i = 0; i < works.size() ; i++) {
		worksIndexes[i] = i;
	}

	if (works.isEmpty()) {
		works = new ArrayList<WorkExperience>();

		works.add(new WorkExperienceImpl());

		worksIndexes = new int[] {0};
	}

	if (worksIndexes == null) {
		worksIndexes = new int[0];
	}
}
%>

<liferay-ui:error-marker key="errorSection" value="phoneNumbers" />

<h3><liferay-ui:message key="工作经验" /></h3>

<div class="alert alert-info">
	由最近的工作经历开始填写，自近而远
</div>

<aui:fieldset id="workNumbers">

	<%
	for (int i = 0; i < worksIndexes.length; i++) {
		int worksIndex = worksIndexes[i];

		WorkExperience work = works.get(i);
	%>
 		<%--
		<aui:model-context bean="<%= work %>" model="<%= WorkExperience.class %>" />
		--%>
		<div class="lfr-form-row lfr-form-row-inline">
			<div class="row-fields">
				<aui:input name='<%= "workId" + worksIndex %>' type="hidden" value="<%= work.getId() %>" />
				
				<aui:fieldset cssClass="span5">
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="weStartTime" />
						<liferay-util:param name="index" value="<%= String.valueOf(worksIndex) %>" />
						<liferay-util:param name="label" value="开始时间（年月）" />
						<liferay-util:param name="year_start" value="1980" />
						<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
						<liferay-util:param name="yearValue" value="<%= work.getWeStartTimeYear() %>" />
						<liferay-util:param name="monthValue" value="<%= work.getWeStartTimeMonth() %>" />
					</liferay-util:include>
					
					<aui:input name='<%= "weWorkUnit" + worksIndex %>' label="工作单位" value="<%= work.getWeWorkUnit() %>" />
					<aui:input name='<%= "weWitness" + worksIndex %>' label="证明人" value="<%= work.getWeWitness() %>" />
				</aui:fieldset>
				<aui:fieldset cssClass="span5">
					<liferay-util:include page="/html/satff/date.jsp"  servletContext="<%= application %>" >
						<liferay-util:param name="name" value="weStopTime" />
						<liferay-util:param name="index" value="<%= String.valueOf(worksIndex) %>" />
						<liferay-util:param name="label" value="结束时间（年月）" />
						<liferay-util:param name="year_start" value="1980" />
						<liferay-util:param name="year_end" value="<%= String.valueOf(IntranetUtil.getCurYear()) %>" />
						<liferay-util:param name="yearValue" value="<%= work.getWeStopTimeYear() %>" />
						<liferay-util:param name="monthValue" value="<%= work.getWeStopTimeMonth() %>" />
					</liferay-util:include>
					
					<aui:input name='<%= "weOnceJob" + worksIndex %>' label="曾任职务" value="<%= work.getWeOnceJob() %>" />
					<aui:input name='<%= "weContactPhone" + worksIndex %>' label="联系电话" value="<%= work.getWeContactPhone() %>" />
				</aui:fieldset>
			</div>
		</div>

	<%
	}
	%>

	<aui:input name="worksIndexes" type="hidden" value="<%= StringUtil.merge(worksIndexes) %>" />
</aui:fieldset>

<aui:script use="liferay-auto-fields">
	Liferay.once(
		'formNavigator:reveal<portlet:namespace />work_experience',
		function() {
			new Liferay.AutoFields(
				{
					contentBox: '#<portlet:namespace />workNumbers',
					fieldIndexes: '<portlet:namespace />worksIndexes',
					namespace: '<portlet:namespace />'
				}
			).render();
		}
	);
</aui:script>