package com.shuntian.portlet.intranet.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.DuplicateUserEmailAddressException;
import com.liferay.portal.UserEmailAddressException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.Education;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.FamilyRelationship;
import com.shuntian.portlet.intranet.model.WorkExperience;
import com.shuntian.portlet.intranet.model.impl.BasicInformationImpl;
import com.shuntian.portlet.intranet.model.impl.ExtInformationImpl;
import com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.EducationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.FamilyRelationshipLocalServiceUtil;
import com.shuntian.portlet.intranet.service.WorkExperienceLocalServiceUtil;

public class SatffPortlet extends MVCPortlet {

	public void editSatff(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		long biId = ParamUtil.getLong(request, "biId");
		long userId = ParamUtil.getLong(request, "userId");
		long curUserId = themeDisplay.getUserId();
		String newPassword1 = ParamUtil.getString(request, "newPassword1");
		String newPassword2 = ParamUtil.getString(request, "newPassword2");
		String portletName = ParamUtil.getString(request, "portletName");

		BasicInformation bi = getBasicInformation(request);
		ExtInformation ei = null;
		if (!portletName.equals("individual_info")) {
			ei = getExtInformation(request);
		}
		List<FamilyRelationship> frs = getFamilyRelationships(request);
		List<WorkExperience> wes = getWorkExperiences(request);
		List<Education> edus = getEducations(request);

		validatorPassword(request, newPassword1, newPassword2);

		if (SessionErrors.isEmpty(request)) {
			try {
				ServiceContext serviceContext = ServiceContextFactory
						.getInstance(BasicInformation.class.getName(), request);

				BasicInformationLocalServiceUtil.editStaff(
						themeDisplay.getCompanyId(), biId, userId, curUserId,
						newPassword1, newPassword2, bi, ei, edus, wes, frs,
						serviceContext);
			} catch (Exception e) {
				if (e instanceof DuplicateUserEmailAddressException
						|| e instanceof UserEmailAddressException) {
					SessionErrors.add(request, e.getClass(), e);
				}
			}
		}
	}

	public void leaveSatff(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		long biId = ParamUtil.getLong(request, "biId");

		BasicInformationLocalServiceUtil.leave(biId, themeDisplay.getUserId());
	}

	// public void deleteSatff(ActionRequest request, ActionResponse response)
	// throws PortalException, SystemException {
	// long id = ParamUtil.getLong(request, "biId");
	// BasicInformationLocalServiceUtil.deleteBasicInformation(id);
	// }

	private BasicInformation getBasicInformation(ActionRequest request) {
		int sex = ParamUtil.getInteger(request, "sex");
		int birthDateYear = ParamUtil.getInteger(request, "birthDateYear");
		int birthDateMonth = ParamUtil.getInteger(request, "birthDateMonth");
		int birthDateDay = ParamUtil.getInteger(request, "birthDateDay");
		long departmentId = ParamUtil.getLong(request, "departmentId");
		String health = ParamUtil.getString(request, "health");
		String name = ParamUtil.getString(request, "name");
		String nation = ParamUtil.getString(request, "nation");
		String maritalStatus = ParamUtil.getString(request, "maritalStatus");
		String placeOfOrigin = ParamUtil.getString(request, "placeOfOrigin");
		String idNumber = ParamUtil.getString(request, "idNumber");
		String accountProperties = ParamUtil.getString(request,
				"accountProperties");
		String highestDegree = ParamUtil.getString(request, "highestDegree");
		String politicalBackground = ParamUtil.getString(request,
				"politicalBackground");
		String fileLocation = ParamUtil.getString(request, "fileLocation");
		String mail = ParamUtil.getString(request, "mail");
		String contactPhone = ParamUtil.getString(request, "contactPhone");
		String domicile = ParamUtil.getString(request, "domicile");
		String residencePhone = ParamUtil.getString(request, "residencePhone");
		String currentResidentialAddress = ParamUtil.getString(request,
				"currentResidentialAddress");
		String currentResidentialAddressPhone = ParamUtil.getString(request,
				"currentResidentialAddressPhone");
		String emergencyContact = ParamUtil.getString(request,
				"emergencyContact");
		String emergencyContactRelation = ParamUtil.getString(request,
				"emergencyContactRelation");
		String emergencyContactPhone = ParamUtil.getString(request,
				"emergencyContactPhone");

		BasicInformation bi = new BasicInformationImpl();
		bi.setSex(sex);
		bi.setDepartmentId(departmentId);
		bi.setName(name);
		bi.setNation(nation);
		bi.setMaritalStatus(maritalStatus);
		bi.setHealth(health);
		bi.setPlaceOfOrigin(placeOfOrigin);
		bi.setIdNumber(idNumber);
		bi.setAccountProperties(accountProperties);
		bi.setHighestDegree(highestDegree);
		bi.setPoliticalBackground(politicalBackground);
		bi.setFileLocation(fileLocation);
		bi.setMail(mail);
		bi.setContactPhone(contactPhone);
		bi.setDomicile(domicile);
		bi.setResidencePhone(residencePhone);
		bi.setCurrentResidentialAddress(currentResidentialAddress);
		bi.setCurrentResidentialAddressPhone(currentResidentialAddressPhone);
		bi.setEmergencyContact(emergencyContact);
		bi.setEmergencyContactPhone(emergencyContactPhone);
		bi.setEmergencyContactRelation(emergencyContactRelation);
		bi.setBirthDate(PortalUtil.getDate(birthDateMonth, birthDateDay,
				birthDateYear));

		return bi;
	}

	private ExtInformation getExtInformation(ActionRequest request) {
		long basicWage = ParamUtil.getLong(request, "basicWage");
		long otherWage = ParamUtil.getLong(request, "otherWage");
		String openCity = ParamUtil.getString(request, "openCity");
		String bankName = ParamUtil.getString(request, "bankName");
		String bankId = ParamUtil.getString(request, "bankId");
		int laborContractStartYear = ParamUtil.getInteger(request,
				"laborContractStartYear");
		int laborContractStartMonth = ParamUtil.getInteger(request,
				"laborContractStartMonth");
		int laborContractStartDay = ParamUtil.getInteger(request,
				"laborContractStartDay");
		int laborContractEndYear = ParamUtil.getInteger(request,
				"laborContractEndYear");
		int laborContractEndMonth = ParamUtil.getInteger(request,
				"laborContractEndMonth");
		int laborContractEndDay = ParamUtil.getInteger(request,
				"laborContractEndDay");
		int probationPeriodStartYear = ParamUtil.getInteger(request,
				"probationPeriodStartYear");
		int probationPeriodStartMonth = ParamUtil.getInteger(request,
				"probationPeriodStartMonth");
		int probationPeriodStartDay = ParamUtil.getInteger(request,
				"probationPeriodStartDay");
		int probationPeriodEndYear = ParamUtil.getInteger(request,
				"probationPeriodEndYear");
		int probationPeriodEndMonth = ParamUtil.getInteger(request,
				"probationPeriodEndMonth");
		int probationPeriodEndDay = ParamUtil.getInteger(request,
				"probationPeriodEndDay");
		String induredLocation = ParamUtil
				.getString(request, "induredLocation");
		String isInsured = ParamUtil.getString(request, "isInsured");
		String fristInsuredYear = ParamUtil.getString(request,
				"fristInsuredYear");
		String fristInsuredMonth = ParamUtil.getString(request,
				"fristInsuredMonth");
		Date laborContractStart = PortalUtil.getDate(laborContractStartMonth,
				laborContractStartDay, laborContractStartYear);
		Date laborContractEnd = PortalUtil.getDate(laborContractEndMonth,
				laborContractEndDay, laborContractEndYear);
		Date probationPeriodStart = PortalUtil.getDate(
				probationPeriodStartMonth, probationPeriodStartDay,
				probationPeriodStartYear);
		Date probationPeriodEnd = PortalUtil.getDate(probationPeriodEndMonth,
				probationPeriodEndDay, probationPeriodEndYear);

		if (laborContractStart.compareTo(laborContractEnd) > 0) {
			SessionErrors.add(request,
					"dhst.intranet.satff.time.invalid.ei.laborContract");
		}
		if (probationPeriodStart.compareTo(probationPeriodEnd) > 0) {
			SessionErrors.add(request,
					"dhst.intranet.satff.time.invalid.ei.probationPeriod");
		}

		ExtInformation ei = new ExtInformationImpl();
		ei.setBankId(bankId);
		ei.setBankName(bankName);
		ei.setBasicWage(basicWage);
		ei.setOtherWage(otherWage);
		ei.setOpenCity(openCity);
		ei.setInduredLocation(induredLocation);
		ei.setIsInsured(isInsured);
		ei.setLaborContractStart(laborContractStart);
		ei.setLaborContractEnd(laborContractEnd);
		ei.setProbationPeriodStart(probationPeriodStart);
		ei.setProbationPeriodEnd(probationPeriodEnd);

		ei.setFristInsuredYear(fristInsuredYear);
		ei.setFristInsuredMonth(fristInsuredMonth);

		return ei;
	}

	private List<Education> getEducations(ActionRequest request) {

		String edusIndexesString = request.getParameter("edusIndexes");

		if (edusIndexesString == null) {
			Collections.<Education> emptyList();
		}

		List<Education> edus = new ArrayList<Education>();

		int[] edusIndexes = StringUtil.split(edusIndexesString, 0);

		for (int edusIndex : edusIndexes) {
			String edusIndexValue = String.valueOf(edusIndex);
			if (edusIndexValue.equals("0")) {
				edusIndexValue = StringPool.BLANK;
			}

			long eduId = ParamUtil.getLong(request, "eduId" + edusIndexValue);
			String startTimeYear = ParamUtil.getString(request,
					"eStartTimeYear" + edusIndexValue);
			String startTimeMonth = ParamUtil.getString(request,
					"eStartTimeMonth" + edusIndexValue);
			String stopTimeYear = ParamUtil.getString(request, "eStopTimeYear"
					+ edusIndexValue);
			String stopTimeMonth = ParamUtil.getString(request,
					"eStopTimeMonth" + edusIndexValue);
			String university = ParamUtil.getString(request, "eUniversity"
					+ edusIndexValue);
			String witness = ParamUtil.getString(request, "eWitness"
					+ edusIndexValue);
			String professional = ParamUtil.getString(request, "eProfessional"
					+ edusIndexValue);
			String contactPhone = ParamUtil.getString(request, "eContactPhone"
					+ edusIndexValue);

			if (Validator.isNull(university) && Validator.isNull(professional)
					&& Validator.isNull(witness)
					&& Validator.isNull(contactPhone)) {
				continue;
			}

			if (Validator.isNull(university)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.edu.university.null");
			}
			if (Validator.isNull(professional)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.edu.professional.null");
			}
			validatorDate(request, "edu", startTimeYear, startTimeMonth,
					stopTimeYear, stopTimeMonth);

			Education edu = EducationLocalServiceUtil.createEducation(eduId);

			edu.setEUniversity(university);
			edu.setEWitness(witness);
			edu.setEProfessional(professional);
			edu.setEContactPhone(contactPhone);
			edu.setEStartTimeYear(startTimeYear);
			edu.setEStartTimeMonth(startTimeMonth);
			edu.setEStopTimeYear(stopTimeYear);
			edu.setEStopTimeMonth(stopTimeMonth);

			edus.add(edu);
		}

		return edus;
	}

	private List<WorkExperience> getWorkExperiences(ActionRequest request) {

		String worksIndexesString = request.getParameter("worksIndexes");

		if (worksIndexesString == null) {
			Collections.<WorkExperience> emptyList();
		}

		List<WorkExperience> wes = new ArrayList<WorkExperience>();

		int[] worksIndexes = StringUtil.split(worksIndexesString, 0);

		for (int worksIndex : worksIndexes) {
			String worksIndexValue = String.valueOf(worksIndex);
			if (worksIndexValue.equals("0")) {
				worksIndexValue = StringPool.BLANK;
			}

			long workId = ParamUtil
					.getLong(request, "workId" + worksIndexValue);
			String startTimeYear = ParamUtil.getString(request,
					"weStartTimeYear" + worksIndexValue);
			String startTimeMonth = ParamUtil.getString(request,
					"weStartTimeMonth" + worksIndexValue);
			String stopTimeYear = ParamUtil.getString(request, "weStopTimeYear"
					+ worksIndexValue);
			String stopTimeMonth = ParamUtil.getString(request,
					"weStopTimeMonth" + worksIndexValue);
			String workUnit = ParamUtil.getString(request, "weWorkUnit"
					+ worksIndexValue);
			String witness = ParamUtil.getString(request, "weWitness"
					+ worksIndexValue);
			String onceJob = ParamUtil.getString(request, "weOnceJob"
					+ worksIndexValue);
			String contactPhone = ParamUtil.getString(request, "weContactPhone"
					+ worksIndexValue);

			if (Validator.isNull(workUnit) && Validator.isNull(witness)
					&& Validator.isNull(onceJob)
					&& Validator.isNull(contactPhone)) {
				continue;
			}

			if (Validator.isNull(workUnit)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.we.workUnit.null");
			}
			if (Validator.isNull(onceJob)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.we.onceJob.null");
			}

			validatorDate(request, "we", startTimeYear, startTimeMonth,
					stopTimeYear, stopTimeMonth);

			WorkExperience we = WorkExperienceLocalServiceUtil
					.createWorkExperience(workId);

			we.setWeWitness(witness);
			we.setWeWorkUnit(workUnit);
			we.setWeContactPhone(contactPhone);
			we.setWeOnceJob(onceJob);
			we.setWeStartTimeYear(startTimeYear);
			we.setWeStartTimeMonth(startTimeMonth);
			we.setWeStopTimeYear(stopTimeYear);
			we.setWeStopTimeMonth(stopTimeMonth);

			wes.add(we);
		}

		return wes;
	}

	private List<FamilyRelationship> getFamilyRelationships(
			ActionRequest request) {

		String frsIndexesString = request.getParameter("frsIndexes");

		if (frsIndexesString == null) {
			Collections.<FamilyRelationship> emptyList();
		}

		List<FamilyRelationship> frs = new ArrayList<FamilyRelationship>();

		int[] frsIndexes = StringUtil.split(frsIndexesString, 0);

		for (int frsIndex : frsIndexes) {
			String frsIndexValue = String.valueOf(frsIndex);
			if (frsIndexValue.equals("0")) {
				frsIndexValue = StringPool.BLANK;
			}

			long frId = ParamUtil.getLong(request, "frId" + frsIndexValue);
			String name = ParamUtil
					.getString(request, "frName" + frsIndexValue);
			String workUnit = ParamUtil.getString(request, "frWorkUnit"
					+ frsIndexValue);
			String contactPhone = ParamUtil.getString(request, "frContactPhone"
					+ frsIndexValue);
			String relationship = ParamUtil.getString(request, "frRelationship"
					+ frsIndexValue);
			String onceJob = ParamUtil.getString(request, "frOnceJob"
					+ frsIndexValue);

			if (Validator.isNull(workUnit) && Validator.isNull(name)
					&& Validator.isNull(onceJob)
					&& Validator.isNull(contactPhone)
					&& Validator.isNull(relationship)) {
				continue;
			}

			if (Validator.isNull(name)) {
				SessionErrors.add(request, "dhst.intranet.satff.fr.name.null");
			}
			if (Validator.isNull(relationship)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.fr.relationship.null");
			}
			if (Validator.isNull(contactPhone)) {
				SessionErrors.add(request,
						"dhst.intranet.satff.fr.contactPhone.null");
			}

			FamilyRelationship fr = FamilyRelationshipLocalServiceUtil
					.createFamilyRelationship(frId);

			fr.setFrName(name);
			fr.setFrWorkUnit(workUnit);
			fr.setFrContactPhone(contactPhone);
			fr.setFrRelationship(relationship);
			fr.setFrOnceJob(onceJob);

			frs.add(fr);
		}

		return frs;
	}

	private void validatorPassword(ActionRequest request, String password1,
			String password2) {
		if (!password1.equals(password2)) {
			SessionErrors.add(request, "dhst.intranet.satff.pwd.invalid");
		}
	}

	private void validatorDate(ActionRequest request, String obj,
			String startYear, String startMonth, String endYear, String endMonth) {
		int sy = Integer.parseInt(startYear);
		int sm = Integer.parseInt(startMonth);
		int ey = Integer.parseInt(endYear);
		int em = Integer.parseInt(endMonth);

		if ((sy == ey && sm >= em) || sy > ey) {
			SessionErrors.add(request, "dhst.intranet.satff.time.invalid."
					+ obj);
		}
	}
}
