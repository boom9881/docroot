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

import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.shuntian.portlet.intranet.NoSuchExtInformationException;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.service.base.ExtInformationLocalServiceBaseImpl;

/**
 * The implementation of the ext information local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.ExtInformationLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.ExtInformationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.ExtInformationLocalServiceUtil
 */
public class ExtInformationLocalServiceImpl extends
		ExtInformationLocalServiceBaseImpl {

	public void editExtInformation(long userId, ExtInformation ei)
			throws NoSuchExtInformationException, SystemException {
		editExtInformation(userId, ei.getOpenCity(), ei.getBankName(),
				ei.getBankId(), ei.getLaborContractStart(),
				ei.getLaborContractEnd(), ei.getProbationPeriodStart(),
				ei.getProbationPeriodEnd(), ei.getInduredLocation(),
				ei.getFristInsuredYear(), ei.getFristInsuredMonth(),
				ei.getIsInsured(), ei.getBasicWage(), ei.getOtherWage());
	}

	public void editExtInformation(long userId, String openCity,
			String bankName, String bankId, Date laborContractStart,
			Date laborContractEnd, Date probationPeriodStart,
			Date probationPeriodEnd, String induredLocation,
			String fristInsuredYear, String fristInsuredMonth,
			String isInsured, long basicWage, long otherWage)
			throws SystemException {

		ExtInformation ei = null;

		try {
			ei = extInformationPersistence.findByUserId(userId);
		} catch (NoSuchExtInformationException nseie) {
			long id = counterLocalService.increment();

			ei = extInformationPersistence.create(id);
		}

		ei.setOpenCity(openCity);
		ei.setBankName(bankName);
		ei.setBankId(bankId);
		ei.setLaborContractStart(laborContractStart);
		ei.setLaborContractEnd(laborContractEnd);
		ei.setProbationPeriodStart(probationPeriodStart);
		ei.setProbationPeriodEnd(probationPeriodEnd);
		ei.setInduredLocation(induredLocation);
		ei.setFristInsuredYear(fristInsuredYear);
		ei.setFristInsuredMonth(fristInsuredMonth);
		ei.setIsInsured(isInsured);
		ei.setBasicWage(basicWage);
		ei.setOtherWage(otherWage);
		ei.setUserId(userId);

		extInformationPersistence.update(ei);
	}

	public ExtInformation findByUserId(long userId)
			throws NoSuchExtInformationException, SystemException {
		return extInformationPersistence.findByUserId(userId);
	}
}