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

import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.NoSuchAttendanceException;
import com.shuntian.portlet.intranet.NoSuchWagesException;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.model.Wages;
import com.shuntian.portlet.intranet.service.base.WagesLocalServiceBaseImpl;

/**
 * The implementation of the wages local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.WagesLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.WagesLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.WagesLocalServiceUtil
 */
public class WagesLocalServiceImpl extends WagesLocalServiceBaseImpl {

	public List<Wages> findByY_M(long distributionYear, long distributionMonth)
			throws SystemException, NoSuchWagesException {
		return wagesPersistence.findByY_M(distributionYear, distributionMonth);
	}

	public List<Wages> findByU_M(long userId) throws SystemException,
			NoSuchAttendanceException {
		return wagesPersistence.findByUserId(userId);
	}

	public int search(long departmentId, long searchUserId, String searchYear,
			String searchMonth, String name) throws SystemException {

		return wagesFinder.search(departmentId, searchUserId, searchYear,
				searchMonth, name);
	}

	public List<Map<String, String>> search(long departmentId,
			long searchUserId, String searchYear, String searchMonth,
			String name, int start, int end) throws SystemException {

		return wagesFinder.search(departmentId, searchUserId, searchYear,
				searchMonth, name, start, end);
	}
}