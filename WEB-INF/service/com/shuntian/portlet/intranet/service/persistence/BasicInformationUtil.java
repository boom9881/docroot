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

import com.shuntian.portlet.intranet.model.BasicInformation;

import java.util.List;

/**
 * The persistence utility for the basic information service. This utility wraps {@link BasicInformationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformationPersistence
 * @see BasicInformationPersistenceImpl
 * @generated
 */
public class BasicInformationUtil {
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
	public static void clearCache(BasicInformation basicInformation) {
		getPersistence().clearCache(basicInformation);
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
	public static List<BasicInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BasicInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BasicInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BasicInformation update(BasicInformation basicInformation)
		throws SystemException {
		return getPersistence().update(basicInformation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BasicInformation update(BasicInformation basicInformation,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(basicInformation, serviceContext);
	}

	/**
	* Returns the basic information where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchBasicInformationException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching basic information
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns the basic information where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching basic information, or <code>null</code> if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation fetchByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	* Returns the basic information where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching basic information, or <code>null</code> if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation fetchByUserId(
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId, retrieveFromCache);
	}

	/**
	* Removes the basic information where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the basic information that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation removeByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of basic informations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the basic informations where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @return the matching basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		int isLeave) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIsLeave(isLeave);
	}

	/**
	* Returns a range of all the basic informations where isLeave = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeave the is leave
	* @param start the lower bound of the range of basic informations
	* @param end the upper bound of the range of basic informations (not inclusive)
	* @return the range of matching basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		int isLeave, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIsLeave(isLeave, start, end);
	}

	/**
	* Returns an ordered range of all the basic informations where isLeave = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeave the is leave
	* @param start the lower bound of the range of basic informations
	* @param end the upper bound of the range of basic informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		int isLeave, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIsLeave(isLeave, start, end, orderByComparator);
	}

	/**
	* Returns the first basic information in the ordered set where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching basic information
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation findByIsLeave_First(
		int isLeave,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().findByIsLeave_First(isLeave, orderByComparator);
	}

	/**
	* Returns the first basic information in the ordered set where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching basic information, or <code>null</code> if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation fetchByIsLeave_First(
		int isLeave,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIsLeave_First(isLeave, orderByComparator);
	}

	/**
	* Returns the last basic information in the ordered set where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching basic information
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation findByIsLeave_Last(
		int isLeave,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().findByIsLeave_Last(isLeave, orderByComparator);
	}

	/**
	* Returns the last basic information in the ordered set where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching basic information, or <code>null</code> if a matching basic information could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation fetchByIsLeave_Last(
		int isLeave,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIsLeave_Last(isLeave, orderByComparator);
	}

	/**
	* Returns the basic informations before and after the current basic information in the ordered set where isLeave = &#63;.
	*
	* @param id the primary key of the current basic information
	* @param isLeave the is leave
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next basic information
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation[] findByIsLeave_PrevAndNext(
		long id, int isLeave,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence()
				   .findByIsLeave_PrevAndNext(id, isLeave, orderByComparator);
	}

	/**
	* Removes all the basic informations where isLeave = &#63; from the database.
	*
	* @param isLeave the is leave
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIsLeave(int isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIsLeave(isLeave);
	}

	/**
	* Returns the number of basic informations where isLeave = &#63;.
	*
	* @param isLeave the is leave
	* @return the number of matching basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIsLeave(int isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIsLeave(isLeave);
	}

	/**
	* Caches the basic information in the entity cache if it is enabled.
	*
	* @param basicInformation the basic information
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation) {
		getPersistence().cacheResult(basicInformation);
	}

	/**
	* Caches the basic informations in the entity cache if it is enabled.
	*
	* @param basicInformations the basic informations
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> basicInformations) {
		getPersistence().cacheResult(basicInformations);
	}

	/**
	* Creates a new basic information with the primary key. Does not add the basic information to the database.
	*
	* @param id the primary key for the new basic information
	* @return the new basic information
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the basic information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the basic information
	* @return the basic information that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().remove(id);
	}

	public static com.shuntian.portlet.intranet.model.BasicInformation updateImpl(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(basicInformation);
	}

	/**
	* Returns the basic information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchBasicInformationException} if it could not be found.
	*
	* @param id the primary key of the basic information
	* @return the basic information
	* @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchBasicInformationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the basic information with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the basic information
	* @return the basic information, or <code>null</code> if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the basic informations.
	*
	* @return the basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the basic informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basic informations
	* @param end the upper bound of the range of basic informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the basic informations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of basic informations.
	*
	* @return the number of basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BasicInformationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BasicInformationPersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					BasicInformationPersistence.class.getName());

			ReferenceRegistry.registerReference(BasicInformationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BasicInformationPersistence persistence) {
	}

	private static BasicInformationPersistence _persistence;
}