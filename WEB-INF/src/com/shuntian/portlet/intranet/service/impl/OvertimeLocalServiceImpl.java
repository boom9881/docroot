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
import java.util.Map;

import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.NoSuchAttendanceException;
import com.shuntian.portlet.intranet.NoSuchOvertimeException;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.Department;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.service.DepartmentLocalServiceUtil;
import com.shuntian.portlet.intranet.service.base.OvertimeLocalServiceBaseImpl;
import com.shuntian.portlet.intranet.util.IntranetUtil;

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

	public void editOvertime(long userId, long overtimeId, long overtimeYear,
			long overtimeMonthly, double usuallyOvertime, double restOvertime,
			double legalOvertime) throws SystemException {

		Overtime overtime = null;

		try {
			overtime = overtimePersistence.findByPrimaryKey(overtimeId);
		} catch (Exception e) {
			long id = counterLocalService.increment();

			overtime = overtimePersistence.create(id);

			overtime.setCreateUserId(userId);
			overtime.setCreateDate(new Date());
		}

		try {
			BasicInformation bi = basicInformationPersistence
					.findByUserId(userId);
			Department dep = DepartmentLocalServiceUtil.getDepartment(bi
					.getDepartmentId());

			overtime.setApprover(dep.getLeader());
			overtime.setUserId(bi.getId());
		} catch (Exception e) {
		}

		overtime.setStatus(IntranetUtil.STATUS_0);
		overtime.setOvertimeYear(overtimeYear);
		overtime.setOvertimeMonthly(overtimeMonthly);
		overtime.setUsuallyOvertime(usuallyOvertime);
		overtime.setRestOvertime(restOvertime);
		overtime.setLegalOvertime(legalOvertime);
		overtime.setModifiedUserId(userId);
		overtime.setModifiedDate(new Date());

		overtimePersistence.update(overtime);
	}

	public void updateOTStatus(long overtimeId, int status)
			throws NoSuchOvertimeException, SystemException {

		Overtime overtime = overtimePersistence.findByPrimaryKey(overtimeId);

		overtime.setStatus(status);

		overtimePersistence.update(overtime);
	}

	public List<Overtime> findByUserId(long userId) throws SystemException,
			NoSuchAttendanceException {

		return overtimePersistence.findByUserId(userId);
	}

	public Overtime findByY_M(long userId, long overtimeYear,
			long overtimeMonthly) throws SystemException {

		try {
			return overtimePersistence.findByY_M(userId, overtimeYear,
					overtimeMonthly, 1);
		} catch (NoSuchOvertimeException e) {
			return null;
		}
	}

	public int search(long departmentId, long searchUserId, int status,
			long approver, String searchYear, String searchMonth, String name)
			throws SystemException {

		return overtimeFinder.search(departmentId, searchUserId, status,
				approver, searchYear, searchMonth, name);
	}

	public List<Map<String, String>> search(long departmentId,
			long searchUserId, int status, long approver, String searchYear,
			String searchMonth, String name, int start, int end)
			throws SystemException {

		return overtimeFinder.search(departmentId, searchUserId, status,
				approver, searchYear, searchMonth, name, start, end);
	}
}