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
import com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;
import com.shuntian.portlet.intranet.model.FamilyRelationship;
import com.shuntian.portlet.intranet.service.base.FamilyRelationshipLocalServiceBaseImpl;

/**
 * The implementation of the family relationship local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.FamilyRelationshipLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.FamilyRelationshipLocalServiceUtil
 */
public class FamilyRelationshipLocalServiceImpl extends
		FamilyRelationshipLocalServiceBaseImpl {

	public void editFamilyRelationship(long userId, List<FamilyRelationship> frs)
			throws NoSuchFamilyRelationshipException, SystemException {

		Set<Long> frIds = new HashSet<Long>();

		for (FamilyRelationship fr : frs) {
			long id = fr.getId();
			String name = fr.getFrName();
			String relationship = fr.getFrRelationship();
			String workUnit = fr.getFrWorkUnit();
			String contactPhone = fr.getFrContactPhone();
			String onceJob = fr.getFrOnceJob();

			fr = updateFR(id, userId, name, relationship, workUnit,
					contactPhone, onceJob);

			frIds.add(fr.getId());
		}

		frs = findByUserId(userId);

		for (FamilyRelationship fr : frs) {
			if (!frIds.contains(fr.getId())) {
				familyRelationshipPersistence.remove(fr.getId());
			}
		}
	}

	private FamilyRelationship updateFR(long id, long userId, String name,
			String relationship, String workUnit, String contactPhone,
			String onceJob) throws NoSuchFamilyRelationshipException,
			SystemException {

		FamilyRelationship fr = null;

		if (id <= 0) {
			id = counterLocalService.increment();

			fr = familyRelationshipPersistence.create(id);
		} else {
			fr = familyRelationshipPersistence.findByPrimaryKey(id);
		}

		fr.setUserId(userId);
		fr.setFrName(name);
		fr.setFrRelationship(relationship);
		fr.setFrWorkUnit(workUnit);
		fr.setFrContactPhone(contactPhone);
		fr.setFrOnceJob(onceJob);

		return familyRelationshipPersistence.update(fr);
	}

	public List<FamilyRelationship> findByUserId(long userId)
			throws SystemException {
		return familyRelationshipPersistence.findByUserId(userId);
	}
}