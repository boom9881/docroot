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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.shuntian.portlet.intranet.NoSuchOvertimeException;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.model.impl.OvertimeImpl;
import com.shuntian.portlet.intranet.model.impl.OvertimeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the overtime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OvertimePersistence
 * @see OvertimeUtil
 * @generated
 */
public class OvertimePersistenceImpl extends BasePersistenceImpl<Overtime>
	implements OvertimePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OvertimeUtil} to access the overtime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OvertimeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			OvertimeModelImpl.USERID_COLUMN_BITMASK |
			OvertimeModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the overtimes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching overtimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Overtime> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Overtime> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
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
	@Override
	public List<Overtime> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<Overtime> list = (List<Overtime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Overtime overtime : list) {
				if ((userId != overtime.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OvertimeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Overtime>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Overtime>(list);
				}
				else {
					list = (List<Overtime>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Overtime findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = fetchByUserId_First(userId, orderByComparator);

		if (overtime != null) {
			return overtime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOvertimeException(msg.toString());
	}

	/**
	 * Returns the first overtime in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching overtime, or <code>null</code> if a matching overtime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Overtime> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Overtime findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = fetchByUserId_Last(userId, orderByComparator);

		if (overtime != null) {
			return overtime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOvertimeException(msg.toString());
	}

	/**
	 * Returns the last overtime in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching overtime, or <code>null</code> if a matching overtime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Overtime> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Overtime[] findByUserId_PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Overtime[] array = new OvertimeImpl[3];

			array[0] = getByUserId_PrevAndNext(session, overtime, userId,
					orderByComparator, true);

			array[1] = overtime;

			array[2] = getByUserId_PrevAndNext(session, overtime, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Overtime getByUserId_PrevAndNext(Session session,
		Overtime overtime, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OVERTIME_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OvertimeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(overtime);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Overtime> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the overtimes where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (Overtime overtime : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(overtime);
		}
	}

	/**
	 * Returns the number of overtimes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching overtimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "overtime.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_Y_M = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByY_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			OvertimeModelImpl.USERID_COLUMN_BITMASK |
			OvertimeModelImpl.OVERTIMEYEAR_COLUMN_BITMASK |
			OvertimeModelImpl.OVERTIMEMONTHLY_COLUMN_BITMASK |
			OvertimeModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_Y_M = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByY_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

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
	@Override
	public Overtime findByY_M(long userId, long overtimeYear,
		long overtimeMonthly, int status)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = fetchByY_M(userId, overtimeYear, overtimeMonthly,
				status);

		if (overtime == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", overtimeYear=");
			msg.append(overtimeYear);

			msg.append(", overtimeMonthly=");
			msg.append(overtimeMonthly);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOvertimeException(msg.toString());
		}

		return overtime;
	}

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
	@Override
	public Overtime fetchByY_M(long userId, long overtimeYear,
		long overtimeMonthly, int status) throws SystemException {
		return fetchByY_M(userId, overtimeYear, overtimeMonthly, status, true);
	}

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
	@Override
	public Overtime fetchByY_M(long userId, long overtimeYear,
		long overtimeMonthly, int status, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				userId, overtimeYear, overtimeMonthly, status
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_Y_M,
					finderArgs, this);
		}

		if (result instanceof Overtime) {
			Overtime overtime = (Overtime)result;

			if ((userId != overtime.getUserId()) ||
					(overtimeYear != overtime.getOvertimeYear()) ||
					(overtimeMonthly != overtime.getOvertimeMonthly()) ||
					(status != overtime.getStatus())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_Y_M_OVERTIMEYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_OVERTIMEMONTHLY_2);

			query.append(_FINDER_COLUMN_Y_M_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(overtimeYear);

				qPos.add(overtimeMonthly);

				qPos.add(status);

				List<Overtime> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OvertimePersistenceImpl.fetchByY_M(long, long, long, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Overtime overtime = list.get(0);

					result = overtime;

					cacheResult(overtime);

					if ((overtime.getUserId() != userId) ||
							(overtime.getOvertimeYear() != overtimeYear) ||
							(overtime.getOvertimeMonthly() != overtimeMonthly) ||
							(overtime.getStatus() != status)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
							finderArgs, overtime);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Y_M,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Overtime)result;
		}
	}

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
	@Override
	public Overtime removeByY_M(long userId, long overtimeYear,
		long overtimeMonthly, int status)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = findByY_M(userId, overtimeYear, overtimeMonthly,
				status);

		return remove(overtime);
	}

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
	@Override
	public int countByY_M(long userId, long overtimeYear, long overtimeMonthly,
		int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_Y_M;

		Object[] finderArgs = new Object[] {
				userId, overtimeYear, overtimeMonthly, status
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_Y_M_OVERTIMEYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_OVERTIMEMONTHLY_2);

			query.append(_FINDER_COLUMN_Y_M_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(overtimeYear);

				qPos.add(overtimeMonthly);

				qPos.add(status);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_Y_M_USERID_2 = "overtime.userId = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_OVERTIMEYEAR_2 = "overtime.overtimeYear = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_OVERTIMEMONTHLY_2 = "overtime.overtimeMonthly = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_STATUS_2 = "overtime.status = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_U_Y_M = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, OvertimeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByU_Y_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			OvertimeModelImpl.USERID_COLUMN_BITMASK |
			OvertimeModelImpl.OVERTIMEYEAR_COLUMN_BITMASK |
			OvertimeModelImpl.OVERTIMEMONTHLY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_Y_M = new FinderPath(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_Y_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

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
	@Override
	public Overtime findByU_Y_M(long userId, long overtimeYear,
		long overtimeMonthly) throws NoSuchOvertimeException, SystemException {
		Overtime overtime = fetchByU_Y_M(userId, overtimeYear, overtimeMonthly);

		if (overtime == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", overtimeYear=");
			msg.append(overtimeYear);

			msg.append(", overtimeMonthly=");
			msg.append(overtimeMonthly);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOvertimeException(msg.toString());
		}

		return overtime;
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
	@Override
	public Overtime fetchByU_Y_M(long userId, long overtimeYear,
		long overtimeMonthly) throws SystemException {
		return fetchByU_Y_M(userId, overtimeYear, overtimeMonthly, true);
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
	@Override
	public Overtime fetchByU_Y_M(long userId, long overtimeYear,
		long overtimeMonthly, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId, overtimeYear, overtimeMonthly };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_U_Y_M,
					finderArgs, this);
		}

		if (result instanceof Overtime) {
			Overtime overtime = (Overtime)result;

			if ((userId != overtime.getUserId()) ||
					(overtimeYear != overtime.getOvertimeYear()) ||
					(overtimeMonthly != overtime.getOvertimeMonthly())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_U_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_U_Y_M_OVERTIMEYEAR_2);

			query.append(_FINDER_COLUMN_U_Y_M_OVERTIMEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(overtimeYear);

				qPos.add(overtimeMonthly);

				List<Overtime> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_Y_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OvertimePersistenceImpl.fetchByU_Y_M(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Overtime overtime = list.get(0);

					result = overtime;

					cacheResult(overtime);

					if ((overtime.getUserId() != userId) ||
							(overtime.getOvertimeYear() != overtimeYear) ||
							(overtime.getOvertimeMonthly() != overtimeMonthly)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_Y_M,
							finderArgs, overtime);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_Y_M,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Overtime)result;
		}
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
	@Override
	public Overtime removeByU_Y_M(long userId, long overtimeYear,
		long overtimeMonthly) throws NoSuchOvertimeException, SystemException {
		Overtime overtime = findByU_Y_M(userId, overtimeYear, overtimeMonthly);

		return remove(overtime);
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
	@Override
	public int countByU_Y_M(long userId, long overtimeYear, long overtimeMonthly)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_Y_M;

		Object[] finderArgs = new Object[] { userId, overtimeYear, overtimeMonthly };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OVERTIME_WHERE);

			query.append(_FINDER_COLUMN_U_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_U_Y_M_OVERTIMEYEAR_2);

			query.append(_FINDER_COLUMN_U_Y_M_OVERTIMEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(overtimeYear);

				qPos.add(overtimeMonthly);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_U_Y_M_USERID_2 = "overtime.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_Y_M_OVERTIMEYEAR_2 = "overtime.overtimeYear = ? AND ";
	private static final String _FINDER_COLUMN_U_Y_M_OVERTIMEMONTHLY_2 = "overtime.overtimeMonthly = ?";

	public OvertimePersistenceImpl() {
		setModelClass(Overtime.class);
	}

	/**
	 * Caches the overtime in the entity cache if it is enabled.
	 *
	 * @param overtime the overtime
	 */
	@Override
	public void cacheResult(Overtime overtime) {
		EntityCacheUtil.putResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeImpl.class, overtime.getPrimaryKey(), overtime);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
			new Object[] {
				overtime.getUserId(), overtime.getOvertimeYear(),
				overtime.getOvertimeMonthly(), overtime.getStatus()
			}, overtime);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_Y_M,
			new Object[] {
				overtime.getUserId(), overtime.getOvertimeYear(),
				overtime.getOvertimeMonthly()
			}, overtime);

		overtime.resetOriginalValues();
	}

	/**
	 * Caches the overtimes in the entity cache if it is enabled.
	 *
	 * @param overtimes the overtimes
	 */
	@Override
	public void cacheResult(List<Overtime> overtimes) {
		for (Overtime overtime : overtimes) {
			if (EntityCacheUtil.getResult(
						OvertimeModelImpl.ENTITY_CACHE_ENABLED,
						OvertimeImpl.class, overtime.getPrimaryKey()) == null) {
				cacheResult(overtime);
			}
			else {
				overtime.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all overtimes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OvertimeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OvertimeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the overtime.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Overtime overtime) {
		EntityCacheUtil.removeResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeImpl.class, overtime.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(overtime);
	}

	@Override
	public void clearCache(List<Overtime> overtimes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Overtime overtime : overtimes) {
			EntityCacheUtil.removeResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
				OvertimeImpl.class, overtime.getPrimaryKey());

			clearUniqueFindersCache(overtime);
		}
	}

	protected void cacheUniqueFindersCache(Overtime overtime) {
		if (overtime.isNew()) {
			Object[] args = new Object[] {
					overtime.getUserId(), overtime.getOvertimeYear(),
					overtime.getOvertimeMonthly(), overtime.getStatus()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_Y_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M, args, overtime);

			args = new Object[] {
					overtime.getUserId(), overtime.getOvertimeYear(),
					overtime.getOvertimeMonthly()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_Y_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_Y_M, args, overtime);
		}
		else {
			OvertimeModelImpl overtimeModelImpl = (OvertimeModelImpl)overtime;

			if ((overtimeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_Y_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						overtime.getUserId(), overtime.getOvertimeYear(),
						overtime.getOvertimeMonthly(), overtime.getStatus()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_Y_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M, args,
					overtime);
			}

			if ((overtimeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_U_Y_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						overtime.getUserId(), overtime.getOvertimeYear(),
						overtime.getOvertimeMonthly()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_Y_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_Y_M, args,
					overtime);
			}
		}
	}

	protected void clearUniqueFindersCache(Overtime overtime) {
		OvertimeModelImpl overtimeModelImpl = (OvertimeModelImpl)overtime;

		Object[] args = new Object[] {
				overtime.getUserId(), overtime.getOvertimeYear(),
				overtime.getOvertimeMonthly(), overtime.getStatus()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Y_M, args);

		if ((overtimeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_Y_M.getColumnBitmask()) != 0) {
			args = new Object[] {
					overtimeModelImpl.getOriginalUserId(),
					overtimeModelImpl.getOriginalOvertimeYear(),
					overtimeModelImpl.getOriginalOvertimeMonthly(),
					overtimeModelImpl.getOriginalStatus()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Y_M, args);
		}

		args = new Object[] {
				overtime.getUserId(), overtime.getOvertimeYear(),
				overtime.getOvertimeMonthly()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_Y_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_Y_M, args);

		if ((overtimeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_U_Y_M.getColumnBitmask()) != 0) {
			args = new Object[] {
					overtimeModelImpl.getOriginalUserId(),
					overtimeModelImpl.getOriginalOvertimeYear(),
					overtimeModelImpl.getOriginalOvertimeMonthly()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_Y_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_Y_M, args);
		}
	}

	/**
	 * Creates a new overtime with the primary key. Does not add the overtime to the database.
	 *
	 * @param id the primary key for the new overtime
	 * @return the new overtime
	 */
	@Override
	public Overtime create(long id) {
		Overtime overtime = new OvertimeImpl();

		overtime.setNew(true);
		overtime.setPrimaryKey(id);

		return overtime;
	}

	/**
	 * Removes the overtime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the overtime
	 * @return the overtime that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime remove(long id)
		throws NoSuchOvertimeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the overtime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the overtime
	 * @return the overtime that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime remove(Serializable primaryKey)
		throws NoSuchOvertimeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Overtime overtime = (Overtime)session.get(OvertimeImpl.class,
					primaryKey);

			if (overtime == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOvertimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(overtime);
		}
		catch (NoSuchOvertimeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Overtime removeImpl(Overtime overtime) throws SystemException {
		overtime = toUnwrappedModel(overtime);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(overtime)) {
				overtime = (Overtime)session.get(OvertimeImpl.class,
						overtime.getPrimaryKeyObj());
			}

			if (overtime != null) {
				session.delete(overtime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (overtime != null) {
			clearCache(overtime);
		}

		return overtime;
	}

	@Override
	public Overtime updateImpl(
		com.shuntian.portlet.intranet.model.Overtime overtime)
		throws SystemException {
		overtime = toUnwrappedModel(overtime);

		boolean isNew = overtime.isNew();

		OvertimeModelImpl overtimeModelImpl = (OvertimeModelImpl)overtime;

		Session session = null;

		try {
			session = openSession();

			if (overtime.isNew()) {
				session.save(overtime);

				overtime.setNew(false);
			}
			else {
				session.merge(overtime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OvertimeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((overtimeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						overtimeModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { overtimeModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
			OvertimeImpl.class, overtime.getPrimaryKey(), overtime);

		clearUniqueFindersCache(overtime);
		cacheUniqueFindersCache(overtime);

		return overtime;
	}

	protected Overtime toUnwrappedModel(Overtime overtime) {
		if (overtime instanceof OvertimeImpl) {
			return overtime;
		}

		OvertimeImpl overtimeImpl = new OvertimeImpl();

		overtimeImpl.setNew(overtime.isNew());
		overtimeImpl.setPrimaryKey(overtime.getPrimaryKey());

		overtimeImpl.setId(overtime.getId());
		overtimeImpl.setUserId(overtime.getUserId());
		overtimeImpl.setUsuallyOvertime(overtime.getUsuallyOvertime());
		overtimeImpl.setRestOvertime(overtime.getRestOvertime());
		overtimeImpl.setLegalOvertime(overtime.getLegalOvertime());
		overtimeImpl.setOvertimeYear(overtime.getOvertimeYear());
		overtimeImpl.setOvertimeMonthly(overtime.getOvertimeMonthly());
		overtimeImpl.setStatus(overtime.getStatus());
		overtimeImpl.setApprover(overtime.getApprover());
		overtimeImpl.setCreateUserId(overtime.getCreateUserId());
		overtimeImpl.setCreateDate(overtime.getCreateDate());
		overtimeImpl.setModifiedUserId(overtime.getModifiedUserId());
		overtimeImpl.setModifiedDate(overtime.getModifiedDate());

		return overtimeImpl;
	}

	/**
	 * Returns the overtime with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the overtime
	 * @return the overtime
	 * @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOvertimeException, SystemException {
		Overtime overtime = fetchByPrimaryKey(primaryKey);

		if (overtime == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOvertimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return overtime;
	}

	/**
	 * Returns the overtime with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchOvertimeException} if it could not be found.
	 *
	 * @param id the primary key of the overtime
	 * @return the overtime
	 * @throws com.shuntian.portlet.intranet.NoSuchOvertimeException if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime findByPrimaryKey(long id)
		throws NoSuchOvertimeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the overtime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the overtime
	 * @return the overtime, or <code>null</code> if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Overtime overtime = (Overtime)EntityCacheUtil.getResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
				OvertimeImpl.class, primaryKey);

		if (overtime == _nullOvertime) {
			return null;
		}

		if (overtime == null) {
			Session session = null;

			try {
				session = openSession();

				overtime = (Overtime)session.get(OvertimeImpl.class, primaryKey);

				if (overtime != null) {
					cacheResult(overtime);
				}
				else {
					EntityCacheUtil.putResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
						OvertimeImpl.class, primaryKey, _nullOvertime);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OvertimeModelImpl.ENTITY_CACHE_ENABLED,
					OvertimeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return overtime;
	}

	/**
	 * Returns the overtime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the overtime
	 * @return the overtime, or <code>null</code> if a overtime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Overtime fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the overtimes.
	 *
	 * @return the overtimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Overtime> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Overtime> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Overtime> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Overtime> list = (List<Overtime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OVERTIME);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OVERTIME;

				if (pagination) {
					sql = sql.concat(OvertimeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Overtime>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Overtime>(list);
				}
				else {
					list = (List<Overtime>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the overtimes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Overtime overtime : findAll()) {
			remove(overtime);
		}
	}

	/**
	 * Returns the number of overtimes.
	 *
	 * @return the number of overtimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OVERTIME);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the overtime persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.Overtime")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Overtime>> listenersList = new ArrayList<ModelListener<Overtime>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Overtime>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OvertimeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OVERTIME = "SELECT overtime FROM Overtime overtime";
	private static final String _SQL_SELECT_OVERTIME_WHERE = "SELECT overtime FROM Overtime overtime WHERE ";
	private static final String _SQL_COUNT_OVERTIME = "SELECT COUNT(overtime) FROM Overtime overtime";
	private static final String _SQL_COUNT_OVERTIME_WHERE = "SELECT COUNT(overtime) FROM Overtime overtime WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "overtime.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Overtime exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Overtime exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OvertimePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Overtime _nullOvertime = new OvertimeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Overtime> toCacheModel() {
				return _nullOvertimeCacheModel;
			}
		};

	private static CacheModel<Overtime> _nullOvertimeCacheModel = new CacheModel<Overtime>() {
			@Override
			public Overtime toEntityModel() {
				return _nullOvertime;
			}
		};
}