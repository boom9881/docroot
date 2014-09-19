/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.shuntian.portlet.intranet.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserServiceUtil;
import com.shuntian.portlet.intranet.NoSuchBasicInformationException;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.Education;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.FamilyRelationship;
import com.shuntian.portlet.intranet.model.WorkExperience;
import com.shuntian.portlet.intranet.model.impl.BasicInformationImpl;
import com.shuntian.portlet.intranet.service.base.BasicInformationLocalServiceBaseImpl;
import com.shuntian.portlet.intranet.util.IntranetUtil;
import com.shuntian.portlet.intranet.util.ProperiesUtil;

/**
 * The implementation of the basic information local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.BasicInformationLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.BasicInformationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil
 */
public class BasicInformationLocalServiceImpl extends
		BasicInformationLocalServiceBaseImpl {

	public void editStaff(long companyId, long id, long userId, long curUserId,
			BasicInformation bi, ExtInformation ei, List<Education> edus,
			List<WorkExperience> wes, List<FamilyRelationship> frs,
			ServiceContext serviceContext) throws SystemException,
			PortalException {

		BasicInformation model = null;

		if (id <= 0) {
			id = counterLocalService.increment();

			model = basicInformationPersistence.create(id);

			// user
			boolean male = true;
			if (bi.getSex() == 0) {
				male = false;
			}

			Calendar birthday = CalendarFactoryUtil.getCalendar();

			birthday.setTime(bi.getBirthDate());

			long[] roleIds = { IntranetUtil.getSatffRoleId(companyId) };

			User user = userLocalService.addUser(curUserId, companyId, false,
					ProperiesUtil.DEFAULT_PASSSWORD,
					ProperiesUtil.DEFAULT_PASSSWORD, true, BLANK, bi.getMail(),
					0, BLANK, LocaleUtil.getDefault(), bi.getName(), BLANK,
					BLANK, 0, 0, male, birthday.get(Calendar.MONTH),
					birthday.get(Calendar.DATE), birthday.get(Calendar.YEAR),
					BLANK, null, null, roleIds, null, false, serviceContext);

			userId = user.getUserId();
		} else {
			model = basicInformationPersistence.findByPrimaryKey(id);
		}

		model.setUserId(userId);
		model.setName(bi.getName());
		model.setSex(bi.getSex());
		model.setIdNumber(bi.getIdNumber());
		model.setNation(bi.getNation());
		model.setPlaceOfOrigin(bi.getPlaceOfOrigin());
		model.setAccountProperties(bi.getAccountProperties());
		model.setBirthDate(bi.getBirthDate());
		model.setMaritalStatus(bi.getMaritalStatus());
		model.setHighestDegree(bi.getHighestDegree());
		model.setPoliticalBackground(bi.getPoliticalBackground());
		model.setFileLocation(bi.getFileLocation());
		model.setBasePay(bi.getBasePay());
		model.setPerformancePay(bi.getPerformancePay());
		model.setHealth(bi.getHealth());
		model.setContactPhone(bi.getContactPhone());
		model.setMail(bi.getMail());
		model.setDomicile(bi.getDomicile());
		model.setResidencePhone(bi.getResidencePhone());
		model.setCurrentResidentialAddress(bi.getCurrentResidentialAddress());
		model.setCurrentResidentialAddressPhone(bi
				.getCurrentResidentialAddressPhone());
		model.setEmergencyContact(bi.getEmergencyContact());
		model.setEmergencyContactPhone(bi.getEmergencyContactPhone());
		model.setEmergencyContactRelation(bi.getEmergencyContactRelation());
		model.setDepartmentId(bi.getDepartmentId());
		model.setIsLeave(zero);

		Date now = new Date();

		model.setCreateDate(now);
		model.setModifiedDate(now);
		model.setCreateUserId(curUserId);
		model.setModifiedUserId(curUserId);

		basicInformationPersistence.update(model);

		extInformationLocalService.editExtInformation(userId, ei);
		educationLocalService.editEducation(userId, edus);
		workExperienceLocalService.editWorkExperience(userId, wes);
		familyRelationshipLocalService.editFamilyRelationship(userId, frs);
	}

	public void leave(long id, long userId) throws SystemException,
			PortalException {
		BasicInformation bi = basicInformationPersistence.findByPrimaryKey(id);

		bi.setIsLeave(isLeave);
		bi.setModifiedDate(new Date());
		bi.setModifiedUserId(userId);

		basicInformationPersistence.update(bi);

		UserServiceUtil.updateStatus(bi.getUserId(), WorkflowConstants.STATUS_INACTIVE);
	}

	public List<BasicInformation> findByIsLeave(boolean isLeave)
			throws SystemException {
		if (isLeave)
			return basicInformationPersistence.findByIsLeave(1);
		else
			return basicInformationPersistence.findByIsLeave(0);
	}

	public BasicInformation findByUserId(long userId) throws SystemException {
		BasicInformation basicInformation = null;

		try {
			basicInformation = basicInformationPersistence.findByUserId(userId);
		} catch (NoSuchBasicInformationException nsbie) {
			basicInformation = new BasicInformationImpl();
		}

		return basicInformation;
	}

	public int countByDepAndName(long departmentId, String name)
			throws SystemException {

		return basicInformationFinder.countByDepAndName(departmentId, name);
	}

	public List<BasicInformation> findByDepAndName(long departmentId,
			String name, int start, int end) throws SystemException {

		return basicInformationFinder.findByDepAndName(departmentId, name,
				start, end);
	}

	public List<BasicInformation> findListByUserId(long userId)
			throws SystemException {

		return basicInformationPersistence.findByU(userId);
	}

	public int countByListUserId(long userId) throws SystemException {

		return basicInformationPersistence.countByU(userId);
	}

	private static final int isLeave = 1;
	private static final int zero = 0;
	private static final String BLANK = "";
}