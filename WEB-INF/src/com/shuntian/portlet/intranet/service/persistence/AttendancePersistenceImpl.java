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

import com.shuntian.portlet.intranet.NoSuchAttendanceException;
import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.impl.AttendanceImpl;
import com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the attendance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendancePersistence
 * @see AttendanceUtil
 * @generated
 */
public class AttendancePersistenceImpl extends BasePersistenceImpl<Attendance>
	implements AttendancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AttendanceUtil} to access the attendance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AttendanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			AttendanceModelImpl.USERID_COLUMN_BITMASK |
			AttendanceModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the attendances where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attendances where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of attendances
	 * @param end the upper bound of the range of attendances (not inclusive)
	 * @return the range of matching attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the attendances where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of attendances
	 * @param end the upper bound of the range of attendances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findByUserId(long userId, int start, int end,
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

		List<Attendance> list = (List<Attendance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Attendance attendance : list) {
				if ((userId != attendance.getUserId())) {
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

			query.append(_SQL_SELECT_ATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AttendanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Attendance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Attendance>(list);
				}
				else {
					list = (List<Attendance>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first attendance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = fetchByUserId_First(userId, orderByComparator);

		if (attendance != null) {
			return attendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttendanceException(msg.toString());
	}

	/**
	 * Returns the first attendance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Attendance> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last attendance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = fetchByUserId_Last(userId, orderByComparator);

		if (attendance != null) {
			return attendance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttendanceException(msg.toString());
	}

	/**
	 * Returns the last attendance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Attendance> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the attendances before and after the current attendance in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current attendance
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance[] findByUserId_PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Attendance[] array = new AttendanceImpl[3];

			array[0] = getByUserId_PrevAndNext(session, attendance, userId,
					orderByComparator, true);

			array[1] = attendance;

			array[2] = getByUserId_PrevAndNext(session, attendance, userId,
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

	protected Attendance getByUserId_PrevAndNext(Session session,
		Attendance attendance, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ATTENDANCE_WHERE);

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
			query.append(AttendanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(attendance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Attendance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the attendances where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (Attendance attendance : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(attendance);
		}
	}

	/**
	 * Returns the number of attendances where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching attendances
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

			query.append(_SQL_COUNT_ATTENDANCE_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "attendance.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_U_M = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByU_M",
			new String[] { Long.class.getName(), Long.class.getName() },
			AttendanceModelImpl.USERID_COLUMN_BITMASK |
			AttendanceModelImpl.ATTENDANCEMONTHLY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_M = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_M",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the attendance where userId = &#63; and attendanceMonthly = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchAttendanceException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param attendanceMonthly the attendance monthly
	 * @return the matching attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByU_M(long userId, long attendanceMonthly)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = fetchByU_M(userId, attendanceMonthly);

		if (attendance == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", attendanceMonthly=");
			msg.append(attendanceMonthly);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAttendanceException(msg.toString());
		}

		return attendance;
	}

	/**
	 * Returns the attendance where userId = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param attendanceMonthly the attendance monthly
	 * @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByU_M(long userId, long attendanceMonthly)
		throws SystemException {
		return fetchByU_M(userId, attendanceMonthly, true);
	}

	/**
	 * Returns the attendance where userId = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param attendanceMonthly the attendance monthly
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByU_M(long userId, long attendanceMonthly,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId, attendanceMonthly };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_U_M,
					finderArgs, this);
		}

		if (result instanceof Attendance) {
			Attendance attendance = (Attendance)result;

			if ((userId != attendance.getUserId()) ||
					(attendanceMonthly != attendance.getAttendanceMonthly())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_U_M_USERID_2);

			query.append(_FINDER_COLUMN_U_M_ATTENDANCEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(attendanceMonthly);

				List<Attendance> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AttendancePersistenceImpl.fetchByU_M(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Attendance attendance = list.get(0);

					result = attendance;

					cacheResult(attendance);

					if ((attendance.getUserId() != userId) ||
							(attendance.getAttendanceMonthly() != attendanceMonthly)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
							finderArgs, attendance);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M,
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
			return (Attendance)result;
		}
	}

	/**
	 * Removes the attendance where userId = &#63; and attendanceMonthly = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param attendanceMonthly the attendance monthly
	 * @return the attendance that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance removeByU_M(long userId, long attendanceMonthly)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = findByU_M(userId, attendanceMonthly);

		return remove(attendance);
	}

	/**
	 * Returns the number of attendances where userId = &#63; and attendanceMonthly = &#63;.
	 *
	 * @param userId the user ID
	 * @param attendanceMonthly the attendance monthly
	 * @return the number of matching attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU_M(long userId, long attendanceMonthly)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_M;

		Object[] finderArgs = new Object[] { userId, attendanceMonthly };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_U_M_USERID_2);

			query.append(_FINDER_COLUMN_U_M_ATTENDANCEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(attendanceMonthly);

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

	private static final String _FINDER_COLUMN_U_M_USERID_2 = "attendance.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_M_ATTENDANCEMONTHLY_2 = "attendance.attendanceMonthly = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_Y_M = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, AttendanceImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByY_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AttendanceModelImpl.USERID_COLUMN_BITMASK |
			AttendanceModelImpl.ATTENDANCEYEAR_COLUMN_BITMASK |
			AttendanceModelImpl.ATTENDANCEMONTHLY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_Y_M = new FinderPath(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByY_M",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchAttendanceException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param attendanceYear the attendance year
	 * @param attendanceMonthly the attendance monthly
	 * @return the matching attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByY_M(long userId, long attendanceYear,
		long attendanceMonthly)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = fetchByY_M(userId, attendanceYear,
				attendanceMonthly);

		if (attendance == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", attendanceYear=");
			msg.append(attendanceYear);

			msg.append(", attendanceMonthly=");
			msg.append(attendanceMonthly);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAttendanceException(msg.toString());
		}

		return attendance;
	}

	/**
	 * Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param attendanceYear the attendance year
	 * @param attendanceMonthly the attendance monthly
	 * @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByY_M(long userId, long attendanceYear,
		long attendanceMonthly) throws SystemException {
		return fetchByY_M(userId, attendanceYear, attendanceMonthly, true);
	}

	/**
	 * Returns the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param attendanceYear the attendance year
	 * @param attendanceMonthly the attendance monthly
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching attendance, or <code>null</code> if a matching attendance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByY_M(long userId, long attendanceYear,
		long attendanceMonthly, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				userId, attendanceYear, attendanceMonthly
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_Y_M,
					finderArgs, this);
		}

		if (result instanceof Attendance) {
			Attendance attendance = (Attendance)result;

			if ((userId != attendance.getUserId()) ||
					(attendanceYear != attendance.getAttendanceYear()) ||
					(attendanceMonthly != attendance.getAttendanceMonthly())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_Y_M_ATTENDANCEYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_ATTENDANCEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(attendanceYear);

				qPos.add(attendanceMonthly);

				List<Attendance> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AttendancePersistenceImpl.fetchByY_M(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Attendance attendance = list.get(0);

					result = attendance;

					cacheResult(attendance);

					if ((attendance.getUserId() != userId) ||
							(attendance.getAttendanceYear() != attendanceYear) ||
							(attendance.getAttendanceMonthly() != attendanceMonthly)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
							finderArgs, attendance);
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
			return (Attendance)result;
		}
	}

	/**
	 * Removes the attendance where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param attendanceYear the attendance year
	 * @param attendanceMonthly the attendance monthly
	 * @return the attendance that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance removeByY_M(long userId, long attendanceYear,
		long attendanceMonthly)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = findByY_M(userId, attendanceYear,
				attendanceMonthly);

		return remove(attendance);
	}

	/**
	 * Returns the number of attendances where userId = &#63; and attendanceYear = &#63; and attendanceMonthly = &#63;.
	 *
	 * @param userId the user ID
	 * @param attendanceYear the attendance year
	 * @param attendanceMonthly the attendance monthly
	 * @return the number of matching attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByY_M(long userId, long attendanceYear,
		long attendanceMonthly) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_Y_M;

		Object[] finderArgs = new Object[] {
				userId, attendanceYear, attendanceMonthly
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTENDANCE_WHERE);

			query.append(_FINDER_COLUMN_Y_M_USERID_2);

			query.append(_FINDER_COLUMN_Y_M_ATTENDANCEYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_ATTENDANCEMONTHLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(attendanceYear);

				qPos.add(attendanceMonthly);

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

	private static final String _FINDER_COLUMN_Y_M_USERID_2 = "attendance.userId = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_ATTENDANCEYEAR_2 = "attendance.attendanceYear = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_ATTENDANCEMONTHLY_2 = "attendance.attendanceMonthly = ?";

	public AttendancePersistenceImpl() {
		setModelClass(Attendance.class);
	}

	/**
	 * Caches the attendance in the entity cache if it is enabled.
	 *
	 * @param attendance the attendance
	 */
	@Override
	public void cacheResult(Attendance attendance) {
		EntityCacheUtil.putResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceImpl.class, attendance.getPrimaryKey(), attendance);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
			new Object[] {
				attendance.getUserId(), attendance.getAttendanceMonthly()
			}, attendance);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M,
			new Object[] {
				attendance.getUserId(), attendance.getAttendanceYear(),
				attendance.getAttendanceMonthly()
			}, attendance);

		attendance.resetOriginalValues();
	}

	/**
	 * Caches the attendances in the entity cache if it is enabled.
	 *
	 * @param attendances the attendances
	 */
	@Override
	public void cacheResult(List<Attendance> attendances) {
		for (Attendance attendance : attendances) {
			if (EntityCacheUtil.getResult(
						AttendanceModelImpl.ENTITY_CACHE_ENABLED,
						AttendanceImpl.class, attendance.getPrimaryKey()) == null) {
				cacheResult(attendance);
			}
			else {
				attendance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all attendances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AttendanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AttendanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the attendance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Attendance attendance) {
		EntityCacheUtil.removeResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceImpl.class, attendance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(attendance);
	}

	@Override
	public void clearCache(List<Attendance> attendances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Attendance attendance : attendances) {
			EntityCacheUtil.removeResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
				AttendanceImpl.class, attendance.getPrimaryKey());

			clearUniqueFindersCache(attendance);
		}
	}

	protected void cacheUniqueFindersCache(Attendance attendance) {
		if (attendance.isNew()) {
			Object[] args = new Object[] {
					attendance.getUserId(), attendance.getAttendanceMonthly()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M, args, attendance);

			args = new Object[] {
					attendance.getUserId(), attendance.getAttendanceYear(),
					attendance.getAttendanceMonthly()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_Y_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M, args, attendance);
		}
		else {
			AttendanceModelImpl attendanceModelImpl = (AttendanceModelImpl)attendance;

			if ((attendanceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_U_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attendance.getUserId(),
						attendance.getAttendanceMonthly()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M, args,
					attendance);
			}

			if ((attendanceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_Y_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attendance.getUserId(), attendance.getAttendanceYear(),
						attendance.getAttendanceMonthly()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_Y_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Y_M, args,
					attendance);
			}
		}
	}

	protected void clearUniqueFindersCache(Attendance attendance) {
		AttendanceModelImpl attendanceModelImpl = (AttendanceModelImpl)attendance;

		Object[] args = new Object[] {
				attendance.getUserId(), attendance.getAttendanceMonthly()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M, args);

		if ((attendanceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_U_M.getColumnBitmask()) != 0) {
			args = new Object[] {
					attendanceModelImpl.getOriginalUserId(),
					attendanceModelImpl.getOriginalAttendanceMonthly()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M, args);
		}

		args = new Object[] {
				attendance.getUserId(), attendance.getAttendanceYear(),
				attendance.getAttendanceMonthly()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Y_M, args);

		if ((attendanceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_Y_M.getColumnBitmask()) != 0) {
			args = new Object[] {
					attendanceModelImpl.getOriginalUserId(),
					attendanceModelImpl.getOriginalAttendanceYear(),
					attendanceModelImpl.getOriginalAttendanceMonthly()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Y_M, args);
		}
	}

	/**
	 * Creates a new attendance with the primary key. Does not add the attendance to the database.
	 *
	 * @param id the primary key for the new attendance
	 * @return the new attendance
	 */
	@Override
	public Attendance create(long id) {
		Attendance attendance = new AttendanceImpl();

		attendance.setNew(true);
		attendance.setPrimaryKey(id);

		return attendance;
	}

	/**
	 * Removes the attendance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the attendance
	 * @return the attendance that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance remove(long id)
		throws NoSuchAttendanceException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the attendance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attendance
	 * @return the attendance that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance remove(Serializable primaryKey)
		throws NoSuchAttendanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Attendance attendance = (Attendance)session.get(AttendanceImpl.class,
					primaryKey);

			if (attendance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttendanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(attendance);
		}
		catch (NoSuchAttendanceException nsee) {
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
	protected Attendance removeImpl(Attendance attendance)
		throws SystemException {
		attendance = toUnwrappedModel(attendance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attendance)) {
				attendance = (Attendance)session.get(AttendanceImpl.class,
						attendance.getPrimaryKeyObj());
			}

			if (attendance != null) {
				session.delete(attendance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (attendance != null) {
			clearCache(attendance);
		}

		return attendance;
	}

	@Override
	public Attendance updateImpl(
		com.shuntian.portlet.intranet.model.Attendance attendance)
		throws SystemException {
		attendance = toUnwrappedModel(attendance);

		boolean isNew = attendance.isNew();

		AttendanceModelImpl attendanceModelImpl = (AttendanceModelImpl)attendance;

		Session session = null;

		try {
			session = openSession();

			if (attendance.isNew()) {
				session.save(attendance);

				attendance.setNew(false);
			}
			else {
				session.merge(attendance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AttendanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((attendanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attendanceModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { attendanceModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
			AttendanceImpl.class, attendance.getPrimaryKey(), attendance);

		clearUniqueFindersCache(attendance);
		cacheUniqueFindersCache(attendance);

		return attendance;
	}

	protected Attendance toUnwrappedModel(Attendance attendance) {
		if (attendance instanceof AttendanceImpl) {
			return attendance;
		}

		AttendanceImpl attendanceImpl = new AttendanceImpl();

		attendanceImpl.setNew(attendance.isNew());
		attendanceImpl.setPrimaryKey(attendance.getPrimaryKey());

		attendanceImpl.setId(attendance.getId());
		attendanceImpl.setUserId(attendance.getUserId());
		attendanceImpl.setShouldAttendance(attendance.getShouldAttendance());
		attendanceImpl.setActualAttendance(attendance.getActualAttendance());
		attendanceImpl.setAttendanceYear(attendance.getAttendanceYear());
		attendanceImpl.setAttendanceMonthly(attendance.getAttendanceMonthly());
		attendanceImpl.setCreateUserId(attendance.getCreateUserId());
		attendanceImpl.setCreateDate(attendance.getCreateDate());
		attendanceImpl.setModifiedUserId(attendance.getModifiedUserId());
		attendanceImpl.setModifiedDate(attendance.getModifiedDate());

		return attendanceImpl;
	}

	/**
	 * Returns the attendance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attendance
	 * @return the attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttendanceException, SystemException {
		Attendance attendance = fetchByPrimaryKey(primaryKey);

		if (attendance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttendanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return attendance;
	}

	/**
	 * Returns the attendance with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchAttendanceException} if it could not be found.
	 *
	 * @param id the primary key of the attendance
	 * @return the attendance
	 * @throws com.shuntian.portlet.intranet.NoSuchAttendanceException if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance findByPrimaryKey(long id)
		throws NoSuchAttendanceException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the attendance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attendance
	 * @return the attendance, or <code>null</code> if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Attendance attendance = (Attendance)EntityCacheUtil.getResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
				AttendanceImpl.class, primaryKey);

		if (attendance == _nullAttendance) {
			return null;
		}

		if (attendance == null) {
			Session session = null;

			try {
				session = openSession();

				attendance = (Attendance)session.get(AttendanceImpl.class,
						primaryKey);

				if (attendance != null) {
					cacheResult(attendance);
				}
				else {
					EntityCacheUtil.putResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
						AttendanceImpl.class, primaryKey, _nullAttendance);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AttendanceModelImpl.ENTITY_CACHE_ENABLED,
					AttendanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return attendance;
	}

	/**
	 * Returns the attendance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the attendance
	 * @return the attendance, or <code>null</code> if a attendance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attendance fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the attendances.
	 *
	 * @return the attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attendances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attendances
	 * @param end the upper bound of the range of attendances (not inclusive)
	 * @return the range of attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attendances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.AttendanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attendances
	 * @param end the upper bound of the range of attendances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attendances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attendance> findAll(int start, int end,
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

		List<Attendance> list = (List<Attendance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ATTENDANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTENDANCE;

				if (pagination) {
					sql = sql.concat(AttendanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Attendance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Attendance>(list);
				}
				else {
					list = (List<Attendance>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the attendances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Attendance attendance : findAll()) {
			remove(attendance);
		}
	}

	/**
	 * Returns the number of attendances.
	 *
	 * @return the number of attendances
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

				Query q = session.createQuery(_SQL_COUNT_ATTENDANCE);

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
	 * Initializes the attendance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.Attendance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Attendance>> listenersList = new ArrayList<ModelListener<Attendance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Attendance>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AttendanceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ATTENDANCE = "SELECT attendance FROM Attendance attendance";
	private static final String _SQL_SELECT_ATTENDANCE_WHERE = "SELECT attendance FROM Attendance attendance WHERE ";
	private static final String _SQL_COUNT_ATTENDANCE = "SELECT COUNT(attendance) FROM Attendance attendance";
	private static final String _SQL_COUNT_ATTENDANCE_WHERE = "SELECT COUNT(attendance) FROM Attendance attendance WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attendance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Attendance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Attendance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AttendancePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Attendance _nullAttendance = new AttendanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Attendance> toCacheModel() {
				return _nullAttendanceCacheModel;
			}
		};

	private static CacheModel<Attendance> _nullAttendanceCacheModel = new CacheModel<Attendance>() {
			@Override
			public Attendance toEntityModel() {
				return _nullAttendance;
			}
		};
}