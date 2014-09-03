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
 * Provides a wrapper for {@link WorkExperienceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperienceLocalService
 * @generated
 */
public class WorkExperienceLocalServiceWrapper
	implements WorkExperienceLocalService,
		ServiceWrapper<WorkExperienceLocalService> {
	public WorkExperienceLocalServiceWrapper(
		WorkExperienceLocalService workExperienceLocalService) {
		_workExperienceLocalService = workExperienceLocalService;
	}

	/**
	* Adds the work experience to the database. Also notifies the appropriate model listeners.
	*
	* @param workExperience the work experience
	* @return the work experience that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience addWorkExperience(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.addWorkExperience(workExperience);
	}

	/**
	* Creates a new work experience with the primary key. Does not add the work experience to the database.
	*
	* @param id the primary key for the new work experience
	* @return the new work experience
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience createWorkExperience(
		long id) {
		return _workExperienceLocalService.createWorkExperience(id);
	}

	/**
	* Deletes the work experience with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the work experience
	* @return the work experience that was removed
	* @throws PortalException if a work experience with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience deleteWorkExperience(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.deleteWorkExperience(id);
	}

	/**
	* Deletes the work experience from the database. Also notifies the appropriate model listeners.
	*
	* @param workExperience the work experience
	* @return the work experience that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience deleteWorkExperience(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.deleteWorkExperience(workExperience);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _workExperienceLocalService.dynamicQuery();
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
		return _workExperienceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _workExperienceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _workExperienceLocalService.dynamicQuery(dynamicQuery, start,
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
		return _workExperienceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _workExperienceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience fetchWorkExperience(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.fetchWorkExperience(id);
	}

	/**
	* Returns the work experience with the primary key.
	*
	* @param id the primary key of the work experience
	* @return the work experience
	* @throws PortalException if a work experience with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience getWorkExperience(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.getWorkExperience(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the work experiences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of work experiences
	* @param end the upper bound of the range of work experiences (not inclusive)
	* @return the range of work experiences
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> getWorkExperiences(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.getWorkExperiences(start, end);
	}

	/**
	* Returns the number of work experiences.
	*
	* @return the number of work experiences
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWorkExperiencesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.getWorkExperiencesCount();
	}

	/**
	* Updates the work experience in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param workExperience the work experience
	* @return the work experience that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience updateWorkExperience(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperienceLocalService.updateWorkExperience(workExperience);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _workExperienceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_workExperienceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _workExperienceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WorkExperienceLocalService getWrappedWorkExperienceLocalService() {
		return _workExperienceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWorkExperienceLocalService(
		WorkExperienceLocalService workExperienceLocalService) {
		_workExperienceLocalService = workExperienceLocalService;
	}

	@Override
	public WorkExperienceLocalService getWrappedService() {
		return _workExperienceLocalService;
	}

	@Override
	public void setWrappedService(
		WorkExperienceLocalService workExperienceLocalService) {
		_workExperienceLocalService = workExperienceLocalService;
	}

	private WorkExperienceLocalService _workExperienceLocalService;
}