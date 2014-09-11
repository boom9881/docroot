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

package com.shuntian.portlet.intranet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttendanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttendanceLocalService
 * @generated
 */
public class AttendanceLocalServiceWrapper implements AttendanceLocalService,
	ServiceWrapper<AttendanceLocalService> {
	public AttendanceLocalServiceWrapper(
		AttendanceLocalService attendanceLocalService) {
		_attendanceLocalService = attendanceLocalService;
	}

	/**
	* Adds the attendance to the database. Also notifies the appropriate model listeners.
	*
	* @param attendance the attendance
	* @return the attendance that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance addAttendance(
		com.shuntian.portlet.intranet.model.Attendance attendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.addAttendance(attendance);
	}

	/**
	* Creates a new attendance with the primary key. Does not add the attendance to the database.
	*
	* @param id the primary key for the new attendance
	* @return the new attendance
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance createAttendance(
		long id) {
		return _attendanceLocalService.createAttendance(id);
	}

	/**
	* Deletes the attendance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the attendance
	* @return the attendance that was removed
	* @throws PortalException if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance deleteAttendance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.deleteAttendance(id);
	}

	/**
	* Deletes the attendance from the database. Also notifies the appropriate model listeners.
	*
	* @param attendance the attendance
	* @return the attendance that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance deleteAttendance(
		com.shuntian.portlet.intranet.model.Attendance attendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.deleteAttendance(attendance);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attendanceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Attendance fetchAttendance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.fetchAttendance(id);
	}

	/**
	* Returns the attendance with the primary key.
	*
	* @param id the primary key of the attendance
	* @return the attendance
	* @throws PortalException if a attendance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance getAttendance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.getAttendance(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> getAttendances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.getAttendances(start, end);
	}

	/**
	* Returns the number of attendances.
	*
	* @return the number of attendances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAttendancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.getAttendancesCount();
	}

	/**
	* Updates the attendance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param attendance the attendance
	* @return the attendance that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Attendance updateAttendance(
		com.shuntian.portlet.intranet.model.Attendance attendance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendanceLocalService.updateAttendance(attendance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _attendanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_attendanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _attendanceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Attendance findByU_M(
		long userId, long attendanceMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException {
		return _attendanceLocalService.findByU_M(userId, attendanceMonthly);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.Attendance> findByU_M(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException {
		return _attendanceLocalService.findByU_M(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AttendanceLocalService getWrappedAttendanceLocalService() {
		return _attendanceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAttendanceLocalService(
		AttendanceLocalService attendanceLocalService) {
		_attendanceLocalService = attendanceLocalService;
	}

	@Override
	public AttendanceLocalService getWrappedService() {
		return _attendanceLocalService;
	}

	@Override
	public void setWrappedService(AttendanceLocalService attendanceLocalService) {
		_attendanceLocalService = attendanceLocalService;
	}

	private AttendanceLocalService _attendanceLocalService;
}