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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.shuntian.portlet.intranet.model.Education;

import java.util.List;

/**
 * The persistence utility for the education service. This utility wraps {@link EducationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EducationPersistence
 * @see EducationPersistenceImpl
 * @generated
 */
public class EducationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Education education) {
		getPersistence().clearCache(education);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Education> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Education> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Education> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Education update(Education education)
		throws SystemException {
		return getPersistence().update(education);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Education update(Education education,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(education, serviceContext);
	}

	/**
	* Returns all the educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.EducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of educations
	* @param end the upper bound of the range of educations (not inclusive)
	* @return the range of matching educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the educations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.EducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of educations
	* @param end the upper bound of the range of educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching education
	* @throws com.shuntian.portlet.intranet.NoSuchEducationException if a matching education could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchEducationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching education, or <code>null</code> if a matching education could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching education
	* @throws com.shuntian.portlet.intranet.NoSuchEducationException if a matching education could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchEducationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last education in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching education, or <code>null</code> if a matching education could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the educations before and after the current education in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current education
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next education
	* @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education[] findByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchEducationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the educations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of educations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching educations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the education in the entity cache if it is enabled.
	*
	* @param education the education
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.Education education) {
		getPersistence().cacheResult(education);
	}

	/**
	* Caches the educations in the entity cache if it is enabled.
	*
	* @param educations the educations
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.Education> educations) {
		getPersistence().cacheResult(educations);
	}

	/**
	* Creates a new education with the primary key. Does not add the education to the database.
	*
	* @param id the primary key for the new education
	* @return the new education
	*/
	public static com.shuntian.portlet.intranet.model.Education create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the education with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the education
	* @return the education that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchEducationException {
		return getPersistence().remove(id);
	}

	public static com.shuntian.portlet.intranet.model.Education updateImpl(
		com.shuntian.portlet.intranet.model.Education education)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(education);
	}

	/**
	* Returns the education with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchEducationException} if it could not be found.
	*
	* @param id the primary key of the education
	* @return the education
	* @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchEducationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the education with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the education
	* @return the education, or <code>null</code> if a education with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Education fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the educations.
	*
	* @return the educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.EducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of educations
	* @param end the upper bound of the range of educations (not inclusive)
	* @return the range of educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the educations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.EducationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of educations
	* @param end the upper bound of the range of educations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of educations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Education> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the educations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of educations.
	*
	* @return the number of educations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EducationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EducationPersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					EducationPersistence.class.getName());

			ReferenceRegistry.registerReference(EducationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EducationPersistence persistence) {
	}

	private static EducationPersistence _persistence;
}