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
					<aui:input name="startTimed" label="开始时间（年月）" />
					<aui:input name="university" label="毕业院校" value="" />
					<aui:input name="witness" label="证明人" value="" />
				</aui:fieldset>
				<aui:fieldset cssClass="span5">
					<aui:input name="stopTimed" label="结束时间（年月）" />
					<aui:input name="professional" label="专业" value="" />
					<aui:input name="contactPhone" label="联系电话" value="" />
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