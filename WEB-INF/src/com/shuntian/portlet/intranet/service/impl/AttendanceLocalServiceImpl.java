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
	public void addAttendance(long userId, long basicId, long attendanceYear,
			long attendanceMonthly, double actualAttendance,
			double shouldAttendance) throws SystemException {

		long id = counterLocalService.increment();

		Attendance attendance = attendanceLocalService.createAttendance(id);

		attendance.setUserId(basicId);
		attendance.setActualAttendance(actualAttendance);
		attendance.setAttendanceYear(attendanceYear);
		attendance.setAttendanceMonthly(attendanceMonthly);
		attendance.setShouldAttendance(shouldAttendance);
		attendance.setCreateUserId(userId);
		attendance.setCreateDate(new Date());
		attendanceLocalService.updateAttendance(attendance);
	}

	public void updateAttendance(long userId, long attendanceId,
			long attendanceYear, long attendanceMonthly,
			double actualAttendance, double shouldAttendance)
			throws SystemException, PortalException {
		Attendance attendance = attendanceLocalService
				.getAttendance(attendanceId);

		attendance.setActualAttendance(actualAttendance);
		attendance.setAttendanceYear(attendanceYear);
		attendance.setAttendanceMonthly(attendanceMonthly);
		attendance.setShouldAttendance(shouldAttendance);
		attendance.setModifiedUserId(userId);
		attendance.setModifiedDate(new Date());
		attendanceLocalService.updateAttendance(attendance);
	}

	public List<Attendance> findByUserId(long userId) throws SystemException,
			NoSuchAttendanceException {
		return attendancePersistence.findByUserId(userId);
	}

	public int search(long departmentId, long searchUserId,
			String attendanceYear, String attendanceMonth, String name)
			throws SystemException {

		return attendanceFinder.search(departmentId, searchUserId,
				attendanceYear, attendanceMonth, name);
	}

	public List<Map<String, String>> search(long departmentId,
			long searchUserId, String attendanceYear, String attendanceMonth,
			String name, int start, int end) throws SystemException {

		return attendanceFinder.search(departmentId, searchUserId,
				attendanceYear, attendanceMonth, name, start, end);
	}

	public Attendance findByY_M(long userId,long attendanceYear, long attendanceMonthly)
			throws SystemException, NoSuchAttendanceException {
		return attendancePersistence.findByY_M(userId,attendanceYear, attendanceMonthly);
	}

}