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

import com.shuntian.portlet.intranet.model.WorkExperience;

/**
 * The persistence interface for the work experience service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperiencePersistenceImpl
 * @see WorkExperienceUtil
 * @generated
 */
public interface WorkExperiencePersistence extends BasePersistence<WorkExperience> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WorkExperienceUtil} to access the work experience persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the work experience where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchWorkExperienceException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching work experience
	* @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a matching work experience could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWorkExperienceException;

	/**
	* Returns the work experience where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching work experience, or <code>null</code> if a matching work experience could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience fetchByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the work experience where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching work experience, or <code>null</code> if a matching work experience could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience fetchByUserId(
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the work experience where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the work experience that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience removeByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWorkExperienceException;

	/**
	* Returns the number of work experiences where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching work experiences
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the work experience in the entity cache if it is enabled.
	*
	* @param workExperience the work experience
	*/
	public void cacheResult(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience);

	/**
	* Caches the work experiences in the entity cache if it is enabled.
	*
	* @param workExperiences the work experiences
	*/
	public void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> workExperiences);

	/**
	* Creates a new work experience with the primary key. Does not add the work experience to the database.
	*
	* @param id the primary key for the new work experience
	* @return the new work experience
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience create(long id);

	/**
	* Removes the work experience with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the work experience
	* @return the work experience that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWorkExperienceException;

	public com.shuntian.portlet.intranet.model.WorkExperience updateImpl(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the work experience with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchWorkExperienceException} if it could not be found.
	*
	* @param id the primary key of the work experience
	* @return the work experience
	* @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWorkExperienceException;

	/**
	* Returns the work experience with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the work experience
	* @return the work experience, or <code>null</code> if a work experience with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.WorkExperience fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the work experiences.
	*
	* @return the work experiences
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the work experiences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of work experiences
	* @param end the upper bound of the range of work experiences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of work experiences
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the work experiences from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of work experiences.
	*
	* @return the number of work experiences
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}