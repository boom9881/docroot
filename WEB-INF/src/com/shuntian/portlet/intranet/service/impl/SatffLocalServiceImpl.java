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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.shuntian.portlet.intranet.model.Satff;
import com.shuntian.portlet.intranet.service.base.SatffLocalServiceBaseImpl;

/**
 * The implementation of the satff local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.SatffLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.SatffLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.SatffLocalServiceUtil
 */
public class SatffLocalServiceImpl extends SatffLocalServiceBaseImpl {
	public Satff addsatff(String city, String name, double base_pay,
			double performance_pay, double wage_subtotal,
			double insurance_base, double endowment_insurance,
			double unemployment_insurance, double work_injury_insurance,
			double birth_insurance, double medical_insurance,
			double individual_insurance, double housing_accumulation_fund_base,
			double individual_pay, double amount_payable,
			double people_together, long userId ,ServiceContext serviceContext)
			throws PortalException, SystemException {

		Satff satff = satffPersistence.create(counterLocalService.increment());
		
		satff.setUserId(userId);
		satff.setCity(city);
		satff.setName(name);
		satff.setBase_pay(base_pay);
		satff.setPerformance_pay(performance_pay);
		satff.setBase_pay(wage_subtotal);
		satff.setBase_pay(insurance_base);
		satff.setBase_pay(endowment_insurance);
		satff.setBase_pay(unemployment_insurance);
		satff.setBase_pay(work_injury_insurance);
		satff.setBase_pay(birth_insurance);
		satff.setBase_pay(medical_insurance);
		satff.setBase_pay(individual_insurance);
		satff.setBase_pay(housing_accumulation_fund_base);
		satff.setBase_pay(individual_pay);
		satff.setBase_pay(amount_payable);
		satff.setBase_pay(people_together);

		return satffPersistence.update(satff);
	}
}