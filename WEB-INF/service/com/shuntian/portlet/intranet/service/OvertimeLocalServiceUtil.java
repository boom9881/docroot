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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Overtime. This utility wraps
 * {@link com.shuntian.portlet.intranet.service.impl.OvertimeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OvertimeLocalService
 * @see com.shuntian.portlet.intranet.service.base.OvertimeLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.impl.OvertimeLocalServiceImpl
 * @generated
 */
public class OvertimeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.shuntian.portlet.intranet.service.impl.OvertimeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the overtime to the database. Also notifies the appropriate model listeners.
	*
	* @param overtime the overtime
	* @return the overtime that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime addOvertime(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOvertime(overtime);
	}

	/**
	* Creates a new overtime with the primary key. Does not add the overtime to the database.
	*
	* @param id the primary key for the new overtime
	* @return the new overtime
	*/
	public static com.shuntian.portlet.intranet.model.Overtime createOvertime(
		long id) {
		return getService().createOvertime(id);
	}

	/**
	* Deletes the overtime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the overtime
	* @return the overtime that was removed
	* @throws PortalException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime deleteOvertime(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOvertime(id);
	}

	/**
	* Deletes the overtime from the database. Also notifies the appropriate model listeners.
	*
	* @param overtime the overtime
	* @return the overtime that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime deleteOvertime(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOvertime(overtime);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.shuntian.portlet.intranet.model.Overtime fetchOvertime(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOvertime(id);
	}

	/**
	* Returns the overtime with the primary key.
	*
	* @param id the primary key of the overtime
	* @return the overtime
	* @throws PortalException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime getOvertime(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOvertime(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the overtimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of overtimes
	* @param end the upper bound of the range of overtimes (not inclusive)
	* @return the range of overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> getOvertimes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOvertimes(start, end);
	}

	/**
	* Returns the number of overtimes.
	*
	* @return the number of overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static int getOvertimesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOvertimesCount();
	}

	/**
	* Updates the overtime in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param overtime the overtime
	* @return the overtime that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime updateOvertime(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOvertime(overtime);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void addOvertime(long userId, long basicId,
		long overtimeYear, long overtimeMonthly, double usuallyOvertime,
		double restOvertime, double legalOvertime)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addOvertime(userId, basicId, overtimeYear, overtimeMonthly,
			usuallyOvertime, restOvertime, legalOvertime);
	}

	public static void updateOvertime(long userId, long overtimeId,
		long overtimeYear, long overtimeMonthly, double usuallyOvertime,
		double restOvertime, double legalOvertime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateOvertime(userId, overtimeId, overtimeYear, overtimeMonthly,
			usuallyOvertime, restOvertime, legalOvertime);
	}

	public static com.shuntian.portlet.intranet.model.Overtime findByU_M(
		long userId, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getService().findByU_M(userId, overtimeMonthly);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException {
		return getService().findByUserId(userId);
	}

	public static com.shuntian.portlet.intranet.model.Overtime findByY_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getService().findByY_M(userId, overtimeYear, overtimeMonthly);
	}

	public static int search(long departmentId, long searchUserId,
		java.lang.String searchYear, java.lang.String searchMonth,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(departmentId, searchUserId, searchYear, searchMonth,
			name);
	}

	public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> search(
		long departmentId, long searchUserId, java.lang.String searchYear,
		java.lang.String searchMonth, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(departmentId, searchUserId, searchYear, searchMonth,
			name, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static OvertimeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OvertimeLocalService.class.getName());

			if (invokableLocalService instanceof OvertimeLocalService) {
				_service = (OvertimeLocalService)invokableLocalService;
			}
			else {
				_service = new OvertimeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OvertimeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OvertimeLocalService service) {
	}

	private static OvertimeLocalService _service;
}