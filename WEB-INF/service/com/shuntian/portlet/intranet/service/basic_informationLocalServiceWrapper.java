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
 * Provides a wrapper for {@link basic_informationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see basic_informationLocalService
 * @generated
 */
public class basic_informationLocalServiceWrapper
	implements basic_informationLocalService,
		ServiceWrapper<basic_informationLocalService> {
	public basic_informationLocalServiceWrapper(
		basic_informationLocalService basic_informationLocalService) {
		_basic_informationLocalService = basic_informationLocalService;
	}

	/**
	* Adds the basic_information to the database. Also notifies the appropriate model listeners.
	*
	* @param basic_information the basic_information
	* @return the basic_information that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information addbasic_information(
		com.shuntian.portlet.intranet.model.basic_information basic_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.addbasic_information(basic_information);
	}

	/**
	* Creates a new basic_information with the primary key. Does not add the basic_information to the database.
	*
	* @param staffId the primary key for the new basic_information
	* @return the new basic_information
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information createbasic_information(
		long staffId) {
		return _basic_informationLocalService.createbasic_information(staffId);
	}

	/**
	* Deletes the basic_information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param staffId the primary key of the basic_information
	* @return the basic_information that was removed
	* @throws PortalException if a basic_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information deletebasic_information(
		long staffId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.deletebasic_information(staffId);
	}

	/**
	* Deletes the basic_information from the database. Also notifies the appropriate model listeners.
	*
	* @param basic_information the basic_information
	* @return the basic_information that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information deletebasic_information(
		com.shuntian.portlet.intranet.model.basic_information basic_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.deletebasic_information(basic_information);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _basic_informationLocalService.dynamicQuery();
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
		return _basic_informationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basic_informationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basic_informationLocalService.dynamicQuery(dynamicQuery, start,
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
		return _basic_informationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _basic_informationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.basic_information fetchbasic_information(
		long staffId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.fetchbasic_information(staffId);
	}

	/**
	* Returns the basic_information with the matching UUID and company.
	*
	* @param uuid the basic_information's UUID
	* @param companyId the primary key of the company
	* @return the matching basic_information, or <code>null</code> if a matching basic_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information fetchbasic_informationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.fetchbasic_informationByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the basic_information with the primary key.
	*
	* @param staffId the primary key of the basic_information
	* @return the basic_information
	* @throws PortalException if a basic_information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information getbasic_information(
		long staffId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.getbasic_information(staffId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the basic_information with the matching UUID and company.
	*
	* @param uuid the basic_information's UUID
	* @param companyId the primary key of the company
	* @return the matching basic_information
	* @throws PortalException if a matching basic_information could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information getbasic_informationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.getbasic_informationByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of all the basic_informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basic_informations
	* @param end the upper bound of the range of basic_informations (not inclusive)
	* @return the range of basic_informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.basic_information> getbasic_informations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.getbasic_informations(start, end);
	}

	/**
	* Returns the number of basic_informations.
	*
	* @return the number of basic_informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getbasic_informationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.getbasic_informationsCount();
	}

	/**
	* Updates the basic_information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param basic_information the basic_information
	* @return the basic_information that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.basic_information updatebasic_information(
		com.shuntian.portlet.intranet.model.basic_information basic_information)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_informationLocalService.updatebasic_information(basic_information);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _basic_informationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_basic_informationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _basic_informationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public basic_informationLocalService getWrappedbasic_informationLocalService() {
		return _basic_informationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedbasic_informationLocalService(
		basic_informationLocalService basic_informationLocalService) {
		_basic_informationLocalService = basic_informationLocalService;
	}

	@Override
	public basic_informationLocalService getWrappedService() {
		return _basic_informationLocalService;
	}

	@Override
	public void setWrappedService(
		basic_informationLocalService basic_informationLocalService) {
		_basic_informationLocalService = basic_informationLocalService;
	}

	private basic_informationLocalService _basic_informationLocalService;
}