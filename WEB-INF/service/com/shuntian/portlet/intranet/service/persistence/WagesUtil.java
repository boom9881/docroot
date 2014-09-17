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

import com.shuntian.portlet.intranet.model.Wages;

import java.util.List;

/**
 * The persistence utility for the wages service. This utility wraps {@link WagesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WagesPersistence
 * @see WagesPersistenceImpl
 * @generated
 */
public class WagesUtil {
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
	public static void clearCache(Wages wages) {
		getPersistence().clearCache(wages);
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
	public static List<Wages> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Wages> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Wages> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Wages update(Wages wages) throws SystemException {
		return getPersistence().update(wages);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Wages update(Wages wages, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(wages, serviceContext);
	}

	/**
	* Returns all the wageses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the wageses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @return the range of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the wageses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first wages in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first wages in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wages, or <code>null</code> if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last wages in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last wages in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wages, or <code>null</code> if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the wageses before and after the current wages in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current wages
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages[] findByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence()
				   .findByUserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the wageses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of wageses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the wageses where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @return the matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByY_M(
		long distributionYear, long distributionMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByY_M(distributionYear, distributionMonth);
	}

	/**
	* Returns a range of all the wageses where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @return the range of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByY_M(
		long distributionYear, long distributionMonth, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByY_M(distributionYear, distributionMonth, start, end);
	}

	/**
	* Returns an ordered range of all the wageses where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findByY_M(
		long distributionYear, long distributionMonth, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByY_M(distributionYear, distributionMonth, start, end,
			orderByComparator);
	}

	/**
	* Returns the first wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages findByY_M_First(
		long distributionYear, long distributionMonth,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence()
				   .findByY_M_First(distributionYear, distributionMonth,
			orderByComparator);
	}

	/**
	* Returns the first wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wages, or <code>null</code> if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages fetchByY_M_First(
		long distributionYear, long distributionMonth,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByY_M_First(distributionYear, distributionMonth,
			orderByComparator);
	}

	/**
	* Returns the last wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages findByY_M_Last(
		long distributionYear, long distributionMonth,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence()
				   .findByY_M_Last(distributionYear, distributionMonth,
			orderByComparator);
	}

	/**
	* Returns the last wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wages, or <code>null</code> if a matching wages could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages fetchByY_M_Last(
		long distributionYear, long distributionMonth,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByY_M_Last(distributionYear, distributionMonth,
			orderByComparator);
	}

	/**
	* Returns the wageses before and after the current wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param id the primary key of the current wages
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages[] findByY_M_PrevAndNext(
		long id, long distributionYear, long distributionMonth,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence()
				   .findByY_M_PrevAndNext(id, distributionYear,
			distributionMonth, orderByComparator);
	}

	/**
	* Removes all the wageses where distributionYear = &#63; and distributionMonth = &#63; from the database.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByY_M(long distributionYear, long distributionMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByY_M(distributionYear, distributionMonth);
	}

	/**
	* Returns the number of wageses where distributionYear = &#63; and distributionMonth = &#63;.
	*
	* @param distributionYear the distribution year
	* @param distributionMonth the distribution month
	* @return the number of matching wageses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByY_M(long distributionYear, long distributionMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByY_M(distributionYear, distributionMonth);
	}

	/**
	* Caches the wages in the entity cache if it is enabled.
	*
	* @param wages the wages
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.Wages wages) {
		getPersistence().cacheResult(wages);
	}

	/**
	* Caches the wageses in the entity cache if it is enabled.
	*
	* @param wageses the wageses
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.Wages> wageses) {
		getPersistence().cacheResult(wageses);
	}

	/**
	* Creates a new wages with the primary key. Does not add the wages to the database.
	*
	* @param id the primary key for the new wages
	* @return the new wages
	*/
	public static com.shuntian.portlet.intranet.model.Wages create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the wages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the wages
	* @return the wages that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence().remove(id);
	}

	public static com.shuntian.portlet.intranet.model.Wages updateImpl(
		com.shuntian.portlet.intranet.model.Wages wages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wages);
	}

	/**
	* Returns the wages with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchWagesException} if it could not be found.
	*
	* @param id the primary key of the wages
	* @return the wages
	* @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchWagesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the wages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the wages
	* @return the wages, or <code>null</code> if a wages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.Wages fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the wageses.
	*
	* @return the wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wageses
	* @param end the upper bound of the range of wageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.Wages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wageses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wageses.
	*
	* @return the number of wageses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WagesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WagesPersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					WagesPersistence.class.getName());

			ReferenceRegistry.registerReference(WagesUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(WagesPersistence persistence) {
	}

	private static WagesPersistence _persistence;
}