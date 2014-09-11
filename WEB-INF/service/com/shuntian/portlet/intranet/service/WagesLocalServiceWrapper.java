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
 * Provides a wrapper for {@link WagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WagesLocalService
 * @generated
 */
public class WagesLocalServiceWrapper implements WagesLocalService,
	ServiceWrapper<WagesLocalService> {
	public WagesLocalServiceWrapper(WagesLocalService wagesLocalService) {
		_wagesLocalService = wagesLocalService;
	}

	/**
	* Adds the wages to the database. Also notifies the appropriate model listeners.
	*
	* @param wages the wages
	* @return the wages that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages addWages(
		com.shuntian.portlet.intranet.model.Wages wages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.addWages(wages);
	}

	/**
	* Creates a new wages with the primary key. Does not add the wages to the database.
	*
	* @param id the primary key for the new wages
	* @return the new wages
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages createWages(long id) {
		return _wagesLocalService.createWages(id);
	}

	/**
	* Deletes the wages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the wages
	* @return the wages that was removed
	* @throws PortalException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages deleteWages(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.deleteWages(id);
	}

	/**
	* Deletes the wages from the database. Also notifies the appropriate model listeners.
	*
	* @param wages the wages
	* @return the wages that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages deleteWages(
		com.shuntian.portlet.intranet.model.Wages wages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.deleteWages(wages);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wagesLocalService.dynamicQuery();
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
		return _wagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wagesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wagesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _wagesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _wagesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Wages fetchWages(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.fetchWages(id);
	}

	/**
	* Returns the wages with the primary key.
	*
	* @param id the primary key of the wages
	* @return the wages
	* @throws PortalException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages getWages(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.getWages(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the wageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @return the range of wageses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.Wages> getWageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.getWageses(start, end);
	}

	/**
	* Returns the number of wageses.
	*
	* @return the number of wageses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.getWagesesCount();
	}

	/**
	* Updates the wages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wages the wages
	* @return the wages that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.Wages updateWages(
		com.shuntian.portlet.intranet.model.Wages wages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wagesLocalService.updateWages(wages);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wagesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wagesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wagesLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.shuntian.portlet.intranet.model.Wages findByU_M(long userId,
		long distributionMonth)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return _wagesLocalService.findByU_M(userId, distributionMonth);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.Wages> findByU_M(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchAttendanceException {
		return _wagesLocalService.findByU_M(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WagesLocalService getWrappedWagesLocalService() {
		return _wagesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWagesLocalService(WagesLocalService wagesLocalService) {
		_wagesLocalService = wagesLocalService;
	}

	@Override
	public WagesLocalService getWrappedService() {
		return _wagesLocalService;
	}

	@Override
	public void setWrappedService(WagesLocalService wagesLocalService) {
		_wagesLocalService = wagesLocalService;
	}

	private WagesLocalService _wagesLocalService;
}