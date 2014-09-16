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
 * Provides a wrapper for {@link ExtInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExtInformationLocalService
 * @generated
 */
public class ExtInformationLocalServiceWrapper
	implements ExtInformationLocalService,
		ServiceWrapper<ExtInformationLocalService> {
	public ExtInformationLocalServiceWrapper(
		ExtInformationLocalService extInformationLocalService) {
		_extInformationLocalService = extInformationLocalService;
	}

	/**
	* Adds the ext information to the database. Also notifies the appropriate model listeners.
	*
	* @param extInformation the ext information
	* @return the ext information that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation addExtInformation(
		com.shuntian.portlet.intranet.model.ExtInformation extInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.addExtInformation(extInformation);
	}

	/**
	* Creates a new ext information with the primary key. Does not add the ext information to the database.
	*
	* @param id the primary key for the new ext information
	* @return the new ext information
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation createExtInformation(
		long id) {
		return _extInformationLocalService.createExtInformation(id);
	}

	/**
	* Deletes the ext information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ext information
	* @return the ext information that was removed
	* @throws PortalException if a ext information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation deleteExtInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.deleteExtInformation(id);
	}

	/**
	* Deletes the ext information from the database. Also notifies the appropriate model listeners.
	*
	* @param extInformation the ext information
	* @return the ext information that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation deleteExtInformation(
		com.shuntian.portlet.intranet.model.ExtInformation extInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.deleteExtInformation(extInformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _extInformationLocalService.dynamicQuery();
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
		return _extInformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extInformationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _extInformationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _extInformationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _extInformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation fetchExtInformation(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.fetchExtInformation(id);
	}

	/**
	* Returns the ext information with the primary key.
	*
	* @param id the primary key of the ext information
	* @return the ext information
	* @throws PortalException if a ext information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation getExtInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.getExtInformation(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ext informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext informations
	* @param end the upper bound of the range of ext informations (not inclusive)
	* @return the range of ext informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.ExtInformation> getExtInformations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.getExtInformations(start, end);
	}

	/**
	* Returns the number of ext informations.
	*
	* @return the number of ext informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getExtInformationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.getExtInformationsCount();
	}

	/**
	* Updates the ext information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param extInformation the ext information
	* @return the ext information that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation updateExtInformation(
		com.shuntian.portlet.intranet.model.ExtInformation extInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformationLocalService.updateExtInformation(extInformation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _extInformationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_extInformationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _extInformationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public void editExtInformation(long userId,
		com.shuntian.portlet.intranet.model.ExtInformation ei)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchExtInformationException {
		_extInformationLocalService.editExtInformation(userId, ei);
	}

	@Override
	public void editExtInformation(long userId, java.lang.String openCity,
		java.lang.String bankName, java.lang.String bankId,
		java.util.Date laborContractStart, java.util.Date laborContractEnd,
		java.util.Date probationPeriodStart, java.util.Date probationPeriodEnd,
		java.lang.String induredLocation, java.lang.String fristInsuredYear,
		java.lang.String fristInsuredMonth, java.lang.String isInsured,
		long basicWage, long otherWage)
		throws com.liferay.portal.kernel.exception.SystemException {
		_extInformationLocalService.editExtInformation(userId, openCity,
			bankName, bankId, laborContractStart, laborContractEnd,
			probationPeriodStart, probationPeriodEnd, induredLocation,
			fristInsuredYear, fristInsuredMonth, isInsured, basicWage, otherWage);
	}

	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchExtInformationException {
		return _extInformationLocalService.findByUserId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ExtInformationLocalService getWrappedExtInformationLocalService() {
		return _extInformationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExtInformationLocalService(
		ExtInformationLocalService extInformationLocalService) {
		_extInformationLocalService = extInformationLocalService;
	}

	@Override
	public ExtInformationLocalService getWrappedService() {
		return _extInformationLocalService;
	}

	@Override
	public void setWrappedService(
		ExtInformationLocalService extInformationLocalService) {
		_extInformationLocalService = extInformationLocalService;
	}

	private ExtInformationLocalService _extInformationLocalService;
}