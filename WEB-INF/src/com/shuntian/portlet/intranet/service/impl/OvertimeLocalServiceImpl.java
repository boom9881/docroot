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
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.NoSuchAttendanceException;
import com.shuntian.portlet.intranet.NoSuchOvertimeException;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.service.base.OvertimeLocalServiceBaseImpl;

/**
 * The implementation of the overtime local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.OvertimeLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.OvertimeLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil
 */
public class OvertimeLocalServiceImpl extends OvertimeLocalServiceBaseImpl {
	public void addOvertime(long userId, long basicId, long overtimeYear,
			long overtimeMonthly, double usuallyOvertime, double restOvertime,
			double legalOvertime) throws SystemException {

		long id = counterLocalService.increment();

		Overtime overtime = overtimeLocalService.createOvertime(id);

		overtime.setUserId(basicId);
		overtime.setOvertimeYear(overtimeYear);
		overtime.setOvertimeMonthly(overtimeMonthly);
		overtime.setUsuallyOvertime(usuallyOvertime);
		overtime.setRestOvertime(restOvertime);
		overtime.setLegalOvertime(legalOvertime);
		overtime.setCreateUserId(userId);
		overtime.setCreateDate(new Date());
		overtimeLocalService.updateOvertime(overtime);
	}

	public void updateOvertime(long userId, long overtimeId, long overtimeYear,
			long overtimeMonthly, double usuallyOvertime, double restOvertime,
			double legalOvertime) throws SystemException, PortalException {
		Overtime overtime = overtimeLocalService.getOvertime(overtimeId);
		
		overtime.setOvertimeYear(overtimeYear);
		overtime.setOvertimeMonthly(overtimeMonthly);
		overtime.setUsuallyOvertime(usuallyOvertime);
		overtime.setRestOvertime(restOvertime);
		overtime.setLegalOvertime(legalOvertime);
		overtime.setModifiedUserId(userId);
		overtime.setModifiedDate(new Date());
		overtimeLocalService.updateOvertime(overtime);
	}

	public Overtime findByU_M(long userId, long overtimeMonthly)
			throws SystemException, NoSuchAttendanceException,
			NoSuchOvertimeException {
		return overtimePersistence.findByU_M(userId, overtimeMonthly);
	}

	public List<Overtime> findByUserId(long userId) throws SystemException,
			NoSuchAttendanceException {
		return overtimePersistence.findByUserId(userId);
	}
	
	public Overtime findByY_M(long userId, long overtimeYear, long overtimeMonthly)
			throws SystemException, NoSuchAttendanceException, NoSuchOvertimeException {
		return overtimePersistence.findByY_M(userId,overtimeYear, overtimeMonthly);
	}
}