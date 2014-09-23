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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.NoSuchAttendanceException;
import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.service.base.AttendanceLocalServiceBaseImpl;

/**
 * The implementation of the attendance local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.AttendanceLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.AttendanceLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil
 */
public class AttendanceLocalServiceImpl extends AttendanceLocalServiceBaseImpl {

	public void editAttendance(long userId, long attendanceId,
			long attendanceYear, long attendanceMonth, double actualAttendance,
			double shouldAttendance) throws SystemException, PortalException {

		Attendance attendance = null;

		try {
			attendance = attendanceLocalService.getAttendance(attendanceId);
		} catch (NoSuchAttendanceException nsae) {
			attendance = attendanceLocalService
					.createAttendance(counterLocalService.increment());

			attendance.setCreateUserId(userId);
			attendance.setCreateDate(new Date());
		}

		BasicInformation bi = basicInformationPersistence.findByUserId(userId);

		long approver = departmentPersistence.findByPrimaryKey(
				bi.getDepartmentId()).getLeader();

		attendance.setUserId(bi.getId());
		attendance.setActualAttendance(actualAttendance);
		attendance.setAttendanceYear(attendanceYear);
		attendance.setAttendanceMonth(attendanceMonth);
		attendance.setShouldAttendance(shouldAttendance);
		attendance.setStatus(0);
		attendance.setApprover(approver);
		attendance.setModifiedUserId(userId);
		attendance.setModifiedDate(new Date());

		attendanceLocalService.updateAttendance(attendance);
	}

	public void updateAttendanceStatus(long id, int status)
			throws PortalException, SystemException {

		Attendance attendance = attendancePersistence.findByPrimaryKey(id);

		attendance.setStatus(status);

		attendancePersistence.update(attendance);
	}

	public List<Attendance> findByUserId(long userId) throws SystemException,
			NoSuchAttendanceException {
		return attendancePersistence.findByUserId(userId);
	}

	public int search(long departmentId, long searchUserId, int status,
			long approver, String attendanceYear, String attendanceMonth,
			String name) throws SystemException {

		return attendanceFinder.search(departmentId, searchUserId, status,
				approver, attendanceYear, attendanceMonth, name);
	}

	public List<Map<String, String>> search(long departmentId,
			long searchUserId, int status, long approver,
			String attendanceYear, String attendanceMonth, String name,
			int start, int end) throws SystemException {

		return attendanceFinder.search(departmentId, searchUserId, status,
				approver, attendanceYear, attendanceMonth, name, start, end);
	}

	public Attendance findByY_M(long userId, long attendanceYear,
			long attendanceMonthly) throws SystemException {
		try {
			return attendancePersistence.findByY_M(userId, attendanceYear,
					attendanceMonthly);
		} catch (NoSuchAttendanceException nsae) {
			return null;
		}
	}

}