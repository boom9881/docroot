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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.NoSuchEducationException;
import com.shuntian.portlet.intranet.model.Education;
import com.shuntian.portlet.intranet.service.base.EducationLocalServiceBaseImpl;

/**
 * The implementation of the education local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.EducationLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.EducationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.EducationLocalServiceUtil
 */
public class EducationLocalServiceImpl extends EducationLocalServiceBaseImpl {

	public void editEducation(long userId, List<Education> edus)
			throws SystemException, NoSuchEducationException {

		Set<Long> eduIds = new HashSet<Long>();

		for (Education edu : edus) {
			long id = edu.getId();
			String witness = edu.getEWitness();
			String professional = edu.getEProfessional();
			String university = edu.getEUniversity();
			String contactPhone = edu.getEContactPhone();
			String startTimeYear = edu.getEStartTimeYear();
			String startTimeMonth = edu.getEStartTimeMonth();
			String stopTimeYear = edu.getEStopTimeYear();
			String stopTimeMonth = edu.getEStopTimeMonth();

			edu = updateEducation(id, userId, witness, professional,
					university, contactPhone, startTimeYear, startTimeMonth,
					stopTimeYear, stopTimeMonth);

			eduIds.add(edu.getId());
		}

		edus = findByUserId(userId);

		for (Education edu : edus) {
			if (!eduIds.contains(edu.getId())) {
				educationPersistence.remove(edu.getId());
			}
		}
	}

	private Education updateEducation(long id, long userId, String witness,
			String professional, String university, String contactPhone,
			String startTimeYear, String startTimeMonth, String stopTimeYear,
			String stopTimeMonth) throws SystemException,
			NoSuchEducationException {

		Education edu = null;

		if (id <= 0) {
			id = counterLocalService.increment();

			edu = educationPersistence.create(id);
		} else {
			edu = educationPersistence.findByPrimaryKey(id);
		}

		edu.setUserId(userId);
		edu.setEWitness(witness);
		edu.setEProfessional(professional);
		edu.setEUniversity(university);
		edu.setEContactPhone(contactPhone);
		edu.setEStartTimeYear(startTimeYear);
		edu.setEStartTimeMonth(startTimeMonth);
		edu.setEStopTimeYear(stopTimeYear);
		edu.setEStopTimeMonth(stopTimeMonth);

		return educationPersistence.update(edu);
	}

	public List<Education> findByUserId(long userId) throws SystemException {
		return educationPersistence.findByUserId(userId);
	}
}