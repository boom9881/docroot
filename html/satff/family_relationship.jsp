<%@ include file="/html/satff/init-ext.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
long userId = Long.parseLong(String.valueOf(request.getAttribute("user.id")));

List<FamilyRelationship> frs = Collections.emptyList();

int[] frsIndexes = null;

String frsIndexesParam = ParamUtil.getString(request, "frsIndexes");

if (Validator.isNotNull(frsIndexesParam)) {
	frs = new ArrayList<FamilyRelationship>();

	frsIndexes = StringUtil.split(frsIndexesParam, 0);

	for (int i : frsIndexes) {
		frs.add(new FamilyRelationshipImpl());
	}
}
else {
	frs = FamilyRelationshipLocalServiceUtil.findByUserId(userId);

	frsIndexes = new int[frs.size()];

	for (int i = 0; i < frs.size() ; i++) {
		frsIndexes[i] = i;
	}

	if (frs.isEmpty()) {
		frs = new ArrayList<FamilyRelationship>();

		frs.add(new FamilyRelationshipImpl());

		frsIndexes = new int[] {0};
	}

	if (frsIndexes == null) {
		frsIndexes = new int[0];
	}
}
%>

<liferay-ui:error-marker key="errorSection" value="phoneNumbers" />

<h3><liferay-ui:message key="家庭关系" /></h3>

<div class="alert alert-info">
	包括本人的父母、子女、配偶
</div>

<aui:fieldset id="frNumbers">

	<%
	for (int i = 0; i < frsIndexes.length; i++) {
		int frsIndex = frsIndexes[i];

		FamilyRelationship fr = frs.get(i);
	%>
 		<%--
		<aui:model-context bean="<%= fr %>" model="<%= FamilyRelationship.class %>" />
		--%>
		<div class="lfr-form-row lfr-form-row-inline">
			<div class="row-fields">
				<aui:input name='<%= "frId" + frsIndex %>' type="hidden" value="<%= fr.getId() %>" />
				
				<aui:fieldset cssClass="span5">
					<aui:input name='<%= "frName" + frsIndex %>' label="姓名" value="<%= fr.getFrName() %>" />
					<aui:input name='<%= "frContactPhone" + frsIndex %>' label="联系电话" value="<%= fr.getFrContactPhone() %>" />
					<aui:input name='<%= "frWorkUnit" + frsIndex %>' label="工作单位" value="<%= fr.getFrWorkUnit() %>" />
				</aui:fieldset>
				<aui:fieldset cssClass="span5">
					<aui:input name='<%= "frRelationship" + frsIndex %>' label="与本人关系" value="<%= fr.getFrRelationship() %>" />
					<aui:input name='<%= "frOnceJob" + frsIndex %>' label="担任职务" value="<%= fr.getFrOnceJob() %>" />
				</aui:fieldset>
			</div>
		</div>

	<%
	}
	%>

	<aui:input name="frsIndexes" type="hidden" value="<%= StringUtil.merge(frsIndexes) %>" />
</aui:fieldset>

<aui:script use="liferay-auto-fields">
	Liferay.once(
		'formNavigator:reveal<portlet:namespace />family_relationship',
		function() {
			new Liferay.AutoFields(
				{
					contentBox: '#<portlet:namespace />frNumbers',
					fieldIndexes: '<portlet:namespace />frsIndexes',
					namespace: '<portlet:namespace />'
				}
			).render();
		}
	);
</aui:script>