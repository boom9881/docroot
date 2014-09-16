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
import com.shuntian.portlet.intranet.NoSuchWorkExperienceException;
import com.shuntian.portlet.intranet.model.WorkExperience;
import com.shuntian.portlet.intranet.service.base.WorkExperienceLocalServiceBaseImpl;

/**
 * The implementation of the work experience local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.WorkExperienceLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.WorkExperienceLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.WorkExperienceLocalServiceUtil
 */
public class WorkExperienceLocalServiceImpl extends
		WorkExperienceLocalServiceBaseImpl {

	public void editWorkExperience(long userId, List<WorkExperience> wes)
			throws SystemException, NoSuchWorkExperienceException {

		Set<Long> weIds = new HashSet<Long>();

		for (WorkExperience we : wes) {
			long id = we.getId();
			String witness = we.getWeWitness();
			String onceJob = we.getWeOnceJob();
			String workUnit = we.getWeWorkUnit();
			String contactPhone = we.getWeContactPhone();

			String startTimeYear = we.getWeStartTimeYear();
			String startTimeMonth = we.getWeStartTimeMonth();
			String stopTimeYear = we.getWeStopTimeYear();
			String stopTimeMonth = we.getWeStopTimeMonth();

			we = updateWE(id, userId, witness, onceJob, workUnit, contactPhone,
					startTimeYear, startTimeMonth, stopTimeYear, stopTimeMonth);

			weIds.add(we.getId());
		}

		wes = findByUserId(userId);

		for (WorkExperience we : wes) {
			if (!weIds.contains(we.getId())) {
				workExperiencePersistence.remove(we.getId());
			}
		}
	}

	private WorkExperience updateWE(long id, long userId, String witness,
			String onceJob, String workUnit, String contactPhone,
			String startTimeYear, String startTimeMonth, String stopTimeYear,
			String stopTimeMonth) throws SystemException,
			NoSuchWorkExperienceException {

		WorkExperience we = null;

		if (id <= 0) {
			id = counterLocalService.increment();

			we = workExperiencePersistence.create(id);
		} else {
			we = workExperiencePersistence.findByPrimaryKey(id);
		}

		we.setUserId(userId);
		we.setWeWitness(witness);
		we.setWeOnceJob(onceJob);
		we.setWeWorkUnit(workUnit);
		we.setWeContactPhone(contactPhone);
		we.setWeStartTimeYear(startTimeYear);
		we.setWeStartTimeMonth(startTimeMonth);
		we.setWeStopTimeYear(stopTimeYear);
		we.setWeStopTimeMonth(stopTimeMonth);

		return workExperiencePersistence.update(we);
	}

	public List<WorkExperience> findByUserId(long userId)
			throws SystemException {
		return workExperiencePersistence.findByUserId(userId);
	}
}