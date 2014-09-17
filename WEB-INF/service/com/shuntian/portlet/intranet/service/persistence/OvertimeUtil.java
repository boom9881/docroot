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

import com.shuntian.portlet.intranet.model.Overtime;

import java.util.List;

/**
 * The persistence utility for the overtime service. This utility wraps {@link OvertimePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OvertimePersistence
 * @see OvertimePersistenceImpl
 * @generated
 */
public class OvertimeUtil {
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
	public static void clearCache(Overtime overtime) {
		getPersistence().clearCache(overtime);
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
	public static List<Overtime> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Overtime> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Overtime> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Overtime update(Overtime overtime) throws SystemException {
		return getPersistence().update(overtime);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Overtime update(Overtime overtime,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(overtime, serviceContext);
	}

	/**
	* Returns all the overtimes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the overtimes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of overtimes
	* @param end the upper bound of the range of overtimes (not inclusive)
	* @return the range of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the overtimes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of overtimes
	* @param end the upper bound of the range of overtimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the overtimes before and after the current overtime in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current overtime
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime[] findByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence()
				   .findByUserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the overtimes where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of overtimes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeMonthly = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	*
	* @param userId the user ID
	* @param overtimeMonthly the overtime monthly
	* @return the matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime findByU_M(
		long userId, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().findByU_M(userId, overtimeMonthly);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param overtimeMonthly the overtime monthly
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByU_M(
		long userId, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_M(userId, overtimeMonthly);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeMonthly = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param overtimeMonthly the overtime monthly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByU_M(
		long userId, long overtimeMonthly, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByU_M(userId, overtimeMonthly, retrieveFromCache);
	}

	/**
	* Removes the overtime where userId = &#63; and overtimeMonthly = &#63; from the database.
	*
	* @param userId the user ID
	* @param overtimeMonthly the overtime monthly
	* @return the overtime that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime removeByU_M(
		long userId, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().removeByU_M(userId, overtimeMonthly);
	}

	/**
	* Returns the number of overtimes where userId = &#63; and overtimeMonthly = &#63;.
	*
	* @param userId the user ID
	* @param overtimeMonthly the overtime monthly
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_M(long userId, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_M(userId, overtimeMonthly);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime findByY_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().findByY_M(userId, overtimeYear, overtimeMonthly);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByY_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByY_M(userId, overtimeYear, overtimeMonthly);
	}

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByY_M(
		long userId, long overtimeYear, long overtimeMonthly,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByY_M(userId, overtimeYear, overtimeMonthly,
			retrieveFromCache);
	}

	/**
	* Removes the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; from the database.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the overtime that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime removeByY_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence()
				   .removeByY_M(userId, overtimeYear, overtimeMonthly);
	}

	/**
	* Returns the number of overtimes where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63;.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByY_M(long userId, long overtimeYear,
		long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByY_M(userId, overtimeYear, overtimeMonthly);
	}

	/**
	* Caches the overtime in the entity cache if it is enabled.
	*
	* @param overtime the overtime
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.Overtime overtime) {
		getPersistence().cacheResult(overtime);
	}

	/**
	* Caches the overtimes in the entity cache if it is enabled.
	*
	* @param overtimes the overtimes
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.Overtime> overtimes) {
		getPersistence().cacheResult(overtimes);
	}

	/**
	* Creates a new overtime with the primary key. Does not add the overtime to the database.
	*
	* @param id the primary key for the new overtime
	* @return the new overtime
	*/
	public static com.shuntian.portlet.intranet.model.Overtime create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the overtime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the overtime
	* @return the overtime that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().remove(id);
	}

	public static com.shuntian.portlet.intranet.model.Overtime updateImpl(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(overtime);
	}

	/**
	* Returns the overtime with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	*
	* @param id the primary key of the overtime
	* @return the overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the overtime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the overtime
	* @return the overtime, or <code>null</code> if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Overtime fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the overtimes.
	*
	* @return the overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the overtimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of overtimes
	* @param end the upper bound of the range of overtimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the overtimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of overtimes.
	*
	* @return the number of overtimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OvertimePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OvertimePersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					OvertimePersistence.class.getName());

			ReferenceRegistry.registerReference(OvertimeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OvertimePersistence persistence) {
	}

	private static OvertimePersistence _persistence;
}