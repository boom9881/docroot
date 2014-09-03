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
 * Provides a wrapper for {@link familyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see familyLocalService
 * @generated
 */
public class familyLocalServiceWrapper implements familyLocalService,
	ServiceWrapper<familyLocalService> {
	public familyLocalServiceWrapper(familyLocalService familyLocalService) {
		_familyLocalService = familyLocalService;
	}

	/**
	* Adds the family to the database. Also notifies the appropriate model listeners.
	*
	* @param family the family
	* @return the family that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family addfamily(
		com.shuntian.portlet.intranet.model.family family)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.addfamily(family);
	}

	/**
	* Creates a new family with the primary key. Does not add the family to the database.
	*
	* @param familyId the primary key for the new family
	* @return the new family
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family createfamily(
		long familyId) {
		return _familyLocalService.createfamily(familyId);
	}

	/**
	* Deletes the family with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familyId the primary key of the family
	* @return the family that was removed
	* @throws PortalException if a family with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family deletefamily(
		long familyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.deletefamily(familyId);
	}

	/**
	* Deletes the family from the database. Also notifies the appropriate model listeners.
	*
	* @param family the family
	* @return the family that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family deletefamily(
		com.shuntian.portlet.intranet.model.family family)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.deletefamily(family);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _familyLocalService.dynamicQuery();
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
		return _familyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.familyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _familyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.familyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _familyLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _familyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _familyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.family fetchfamily(long familyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.fetchfamily(familyId);
	}

	/**
	* Returns the family with the matching UUID and company.
	*
	* @param uuid the family's UUID
	* @param companyId the primary key of the company
	* @return the matching family, or <code>null</code> if a matching family could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family fetchfamilyByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.fetchfamilyByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the family with the primary key.
	*
	* @param familyId the primary key of the family
	* @return the family
	* @throws PortalException if a family with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family getfamily(long familyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.getfamily(familyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the family with the matching UUID and company.
	*
	* @param uuid the family's UUID
	* @param companyId the primary key of the company
	* @return the matching family
	* @throws PortalException if a matching family could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family getfamilyByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.getfamilyByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the families.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.familyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of families
	* @param end the upper bound of the range of families (not inclusive)
	* @return the range of families
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.family> getfamilies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.getfamilies(start, end);
	}

	/**
	* Returns the number of families.
	*
	* @return the number of families
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getfamiliesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.getfamiliesCount();
	}

	/**
	* Updates the family in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param family the family
	* @return the family that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.family updatefamily(
		com.shuntian.portlet.intranet.model.family family)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyLocalService.updatefamily(family);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _familyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_familyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _familyLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public familyLocalService getWrappedfamilyLocalService() {
		return _familyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedfamilyLocalService(
		familyLocalService familyLocalService) {
		_familyLocalService = familyLocalService;
	}

	@Override
	public familyLocalService getWrappedService() {
		return _familyLocalService;
	}

	@Override
	public void setWrappedService(familyLocalService familyLocalService) {
		_familyLocalService = familyLocalService;
	}

	private familyLocalService _familyLocalService;
}