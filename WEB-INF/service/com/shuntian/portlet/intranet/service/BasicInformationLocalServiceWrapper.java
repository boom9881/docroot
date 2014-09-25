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
 * Provides a wrapper for {@link BasicInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformationLocalService
 * @generated
 */
public class BasicInformationLocalServiceWrapper
	implements BasicInformationLocalService,
		ServiceWrapper<BasicInformationLocalService> {
	public BasicInformationLocalServiceWrapper(
		BasicInformationLocalService basicInformationLocalService) {
		_basicInformationLocalService = basicInformationLocalService;
	}

	/**
	* Adds the basic information to the database. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation addBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.addBasicInformation(basicInformation);
	}

	/**
	* Creates a new basic information with the primary key. Does not add the basic information to the database.
	*
	* @param id the primary key for the new basic information
	* @return the new basic information
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation createBasicInformation(
		long id) {
		return _basicInformationLocalService.createBasicInformation(id);
	}

	/**
	* Deletes the basic information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the basic information
	* @return the basic information that was removed
	* @throws PortalException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation deleteBasicInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.deleteBasicInformation(id);
	}

	/**
	* Deletes the basic information from the database. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation deleteBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.deleteBasicInformation(basicInformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _basicInformationLocalService.dynamicQuery();
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
		return _basicInformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basicInformationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basicInformationLocalService.dynamicQuery(dynamicQuery, start,
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
		return _basicInformationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _basicInformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation fetchBasicInformation(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.fetchBasicInformation(id);
	}

	/**
	* Returns the basic information with the primary key.
	*
	* @param id the primary key of the basic information
	* @return the basic information
	* @throws PortalException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation getBasicInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.getBasicInformation(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the basic informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basic informations
	* @param end the upper bound of the range of basic informations (not inclusive)
	* @return the range of basic informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> getBasicInformations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.getBasicInformations(start, end);
	}

	/**
	* Returns the number of basic informations.
	*
	* @return the number of basic informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBasicInformationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.getBasicInformationsCount();
	}

	/**
	* Updates the basic information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation updateBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.updateBasicInformation(basicInformation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _basicInformationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_basicInformationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _basicInformationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public void editStaff(long companyId, java.lang.String portletName,
		long id, long userId, long curUserId, java.lang.String newPassword1,
		java.lang.String newPassword2,
		com.shuntian.portlet.intranet.model.BasicInformation bi,
		com.shuntian.portlet.intranet.model.ExtInformation ei,
		java.util.List<com.shuntian.portlet.intranet.model.Education> edus,
		java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> wes,
		java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> frs,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_basicInformationLocalService.editStaff(companyId, portletName, id,
			userId, curUserId, newPassword1, newPassword2, bi, ei, edus, wes,
			frs, serviceContext);
	}

	@Override
	public void leave(long id, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_basicInformationLocalService.leave(id, userId);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		boolean isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.findByIsLeave(isLeave);
	}

	@Override
	public int countByIsLeave(boolean isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.countByIsLeave(isLeave);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		boolean isLeave, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.findByIsLeave(isLeave, start, end);
	}

	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.findByUserId(userId);
	}

	@Override
	public int countByDepAndName(long departmentId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.countByDepAndName(departmentId,
			name);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByDepAndName(
		long departmentId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.findByDepAndName(departmentId,
			name, start, end);
	}

	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findListByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.findListByUserId(userId);
	}

	@Override
	public int countByListUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformationLocalService.countByListUserId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BasicInformationLocalService getWrappedBasicInformationLocalService() {
		return _basicInformationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBasicInformationLocalService(
		BasicInformationLocalService basicInformationLocalService) {
		_basicInformationLocalService = basicInformationLocalService;
	}

	@Override
	public BasicInformationLocalService getWrappedService() {
		return _basicInformationLocalService;
	}

	@Override
	public void setWrappedService(
		BasicInformationLocalService basicInformationLocalService) {
		_basicInformationLocalService = basicInformationLocalService;
	}

	private BasicInformationLocalService _basicInformationLocalService;
}