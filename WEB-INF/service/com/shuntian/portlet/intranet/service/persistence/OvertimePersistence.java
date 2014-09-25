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

import com.shuntian.portlet.intranet.model.Overtime;

/**
 * The persistence interface for the overtime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OvertimePersistenceImpl
 * @see OvertimeUtil
 * @generated
 */
public interface OvertimePersistence extends BasePersistence<Overtime> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OvertimeUtil} to access the overtime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the overtimes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the first overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the last overtime in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.shuntian.portlet.intranet.model.Overtime[] findByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Removes all the overtimes where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of overtimes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; and status = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param status the status
	* @return the matching overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime findByY_M(long userId,
		long overtimeYear, long overtimeMonthly, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; and status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param status the status
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByY_M(
		long userId, long overtimeYear, long overtimeMonthly, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; and status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param status the status
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByY_M(
		long userId, long overtimeYear, long overtimeMonthly, int status,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param status the status
	* @return the overtime that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime removeByY_M(
		long userId, long overtimeYear, long overtimeMonthly, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the number of overtimes where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @param status the status
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByY_M(long userId, long overtimeYear, long overtimeMonthly,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.shuntian.portlet.intranet.model.Overtime findByU_Y_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the matching overtime, or <code>null</code> if a matching overtime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByU_Y_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.shuntian.portlet.intranet.model.Overtime fetchByU_Y_M(
		long userId, long overtimeYear, long overtimeMonthly,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the overtime where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63; from the database.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the overtime that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime removeByU_Y_M(
		long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the number of overtimes where userId = &#63; and overtimeYear = &#63; and overtimeMonthly = &#63;.
	*
	* @param userId the user ID
	* @param overtimeYear the overtime year
	* @param overtimeMonthly the overtime monthly
	* @return the number of matching overtimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_Y_M(long userId, long overtimeYear, long overtimeMonthly)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the overtime in the entity cache if it is enabled.
	*
	* @param overtime the overtime
	*/
	public void cacheResult(
		com.shuntian.portlet.intranet.model.Overtime overtime);

	/**
	* Caches the overtimes in the entity cache if it is enabled.
	*
	* @param overtimes the overtimes
	*/
	public void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.Overtime> overtimes);

	/**
	* Creates a new overtime with the primary key. Does not add the overtime to the database.
	*
	* @param id the primary key for the new overtime
	* @return the new overtime
	*/
	public com.shuntian.portlet.intranet.model.Overtime create(long id);

	/**
	* Removes the overtime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the overtime
	* @return the overtime that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	public com.shuntian.portlet.intranet.model.Overtime updateImpl(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the overtime with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	*
	* @param id the primary key of the overtime
	* @return the overtime
	* @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchOvertimeException;

	/**
	* Returns the overtime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the overtime
	* @return the overtime, or <code>null</code> if a overtime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.Overtime fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the overtimes.
	*
	* @return the overtimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.Overtime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the overtimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of overtimes.
	*
	* @return the number of overtimes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}