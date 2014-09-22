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

package com.shuntian.portlet.intranet.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.shuntian.portlet.intranet.model.Attendance;

/**
 * The persistence interface for the attendance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendancePersistenceImpl
 * @see AttendanceUtil
 * @generated
 */
public interface AttendancePersistence extends BasePersistence<Attendance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttendanceUtil} to access the attendance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the attendances where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the attendances where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of attendances
	* @param end the upper bound of the range of attendances (not inclusive)
	* @return the range of matching attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the attendances where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of attendances
	* @param end the upper bound of the range of attendances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first attendance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attendance
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Returns the first attendance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attendance, or <code>null</code> if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last attendance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attendance
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Returns the last attendance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attendance, or <code>null</code> if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attendances before and after the current attendance in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current attendance
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next attendance
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance[] findByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Removes all the attendances where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of attendances where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchAttendanceException} if it could not be found.
	*
	* @param userId the user ID
	* @param attendanceYear the attendance year
	* @param attendanceMonthly the attendance monthly
	* @return the matching attendance
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance findByY_M(
		long userId, long attendanceYear, long attendanceMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param attendanceYear the attendance year
	* @param attendanceMonthly the attendance monthly
	* @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance fetchByY_M(
		long userId, long attendanceYear, long attendanceMonthly)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param attendanceYear the attendance year
	* @param attendanceMonthly the attendance monthly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance fetchByY_M(
		long userId, long attendanceYear, long attendanceMonthly,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; from the database.
	*
	* @param userId the user ID
	* @param attendanceYear the attendance year
	* @param attendanceMonthly the attendance monthly
	* @return the attendance that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance removeByY_M(
		long userId, long attendanceYear, long attendanceMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Returns the number of attendances where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63;.
	*
	* @param userId the user ID
	* @param attendanceYear the attendance year
	* @param attendanceMonthly the attendance monthly
	* @return the number of matching attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countByY_M(long userId, long attendanceYear,
		long attendanceMonthly)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the attendance in the entity cache if it is enabled.
	*
	* @param attendance the attendance
	*/
	public void cacheResult(
		com.shuntian.portlet.intranet.model.Attendance attendance);

	/**
	* Caches the attendances in the entity cache if it is enabled.
	*
	* @param attendances the attendances
	*/
	public void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.Attendance> attendances);

	/**
	* Creates a new attendance with the primary key. Does not add the attendance to the database.
	*
	* @param id the primary key for the new attendance
	* @return the new attendance
	*/
	public com.shuntian.portlet.intranet.model.Attendance create(long id);

	/**
	* Removes the attendance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the attendance
	* @return the attendance that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	public com.shuntian.portlet.intranet.model.Attendance updateImpl(
		com.shuntian.portlet.intranet.model.Attendance attendance)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attendance with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchAttendanceException} if it could not be found.
	*
	* @param id the primary key of the attendance
	* @return the attendance
	* @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException;

	/**
	* Returns the attendance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the attendance
	* @return the attendance, or <code>null</code> if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Attendance fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the attendances.
	*
	* @return the attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the attendances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendances
	* @param end the upper bound of the range of attendances (not inclusive)
	* @return the range of attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the attendances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendances
	* @param end the upper bound of the range of attendances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of attendances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the attendances from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of attendances.
	*
	* @return the number of attendances
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}