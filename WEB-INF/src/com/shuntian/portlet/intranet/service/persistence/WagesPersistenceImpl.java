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

import com.shuntian.portlet.intranet.NoSuchWagesException;
import com.shuntian.portlet.intranet.model.Wages;
import com.shuntian.portlet.intranet.model.impl.WagesImpl;
import com.shuntian.portlet.intranet.model.impl.WagesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the wages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WagesPersistence
 * @see WagesUtil
 * @generated
 */
public class WagesPersistenceImpl extends BasePersistenceImpl<Wages>
	implements WagesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WagesUtil} to access the wages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WagesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			WagesModelImpl.USERID_COLUMN_BITMASK |
			WagesModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the wageses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching wageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Wages> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Wages> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
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
	@Override
	public List<Wages> findByUserId(long userId, int start, int end,
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

		List<Wages> list = (List<Wages>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Wages wages : list) {
				if ((userId != wages.getUserId())) {
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

			query.append(_SQL_SELECT_WAGES_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Wages>(list);
				}
				else {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first wages in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wages
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = fetchByUserId_First(userId, orderByComparator);

		if (wages != null) {
			return wages;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWagesException(msg.toString());
	}

	/**
	 * Returns the first wages in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wages, or <code>null</code> if a matching wages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Wages> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Wages findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = fetchByUserId_Last(userId, orderByComparator);

		if (wages != null) {
			return wages;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWagesException(msg.toString());
	}

	/**
	 * Returns the last wages in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wages, or <code>null</code> if a matching wages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Wages> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Wages[] findByUserId_PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Wages[] array = new WagesImpl[3];

			array[0] = getByUserId_PrevAndNext(session, wages, userId,
					orderByComparator, true);

			array[1] = wages;

			array[2] = getByUserId_PrevAndNext(session, wages, userId,
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

	protected Wages getByUserId_PrevAndNext(Session session, Wages wages,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WAGES_WHERE);

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
			query.append(WagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(wages);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Wages> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wageses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (Wages wages : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(wages);
		}
	}

	/**
	 * Returns the number of wageses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching wageses
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

			query.append(_SQL_COUNT_WAGES_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "wages.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_Y_M = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByY_M",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Y_M = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, WagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByY_M",
			new String[] { Long.class.getName(), Long.class.getName() },
			WagesModelImpl.DISTRIBUTIONYEAR_COLUMN_BITMASK |
			WagesModelImpl.DISTRIBUTIONMONTH_COLUMN_BITMASK |
			WagesModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_Y_M = new FinderPath(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByY_M",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the wageses where distributionYear = &#63; and distributionMonth = &#63;.
	 *
	 * @param distributionYear the distribution year
	 * @param distributionMonth the distribution month
	 * @return the matching wageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Wages> findByY_M(long distributionYear, long distributionMonth)
		throws SystemException {
		return findByY_M(distributionYear, distributionMonth,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Wages> findByY_M(long distributionYear, long distributionMonth,
		int start, int end) throws SystemException {
		return findByY_M(distributionYear, distributionMonth, start, end, null);
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
	@Override
	public List<Wages> findByY_M(long distributionYear, long distributionMonth,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Y_M;
			finderArgs = new Object[] { distributionYear, distributionMonth };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_Y_M;
			finderArgs = new Object[] {
					distributionYear, distributionMonth,
					
					start, end, orderByComparator
				};
		}

		List<Wages> list = (List<Wages>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Wages wages : list) {
				if ((distributionYear != wages.getDistributionYear()) ||
						(distributionMonth != wages.getDistributionMonth())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_WAGES_WHERE);

			query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONMONTH_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(distributionYear);

				qPos.add(distributionMonth);

				if (!pagination) {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Wages>(list);
				}
				else {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first wages in the ordered set where distributionYear = &#63; and distributionMonth = &#63;.
	 *
	 * @param distributionYear the distribution year
	 * @param distributionMonth the distribution month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wages
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a matching wages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages findByY_M_First(long distributionYear, long distributionMonth,
		OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = fetchByY_M_First(distributionYear, distributionMonth,
				orderByComparator);

		if (wages != null) {
			return wages;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("distributionYear=");
		msg.append(distributionYear);

		msg.append(", distributionMonth=");
		msg.append(distributionMonth);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWagesException(msg.toString());
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
	@Override
	public Wages fetchByY_M_First(long distributionYear,
		long distributionMonth, OrderByComparator orderByComparator)
		throws SystemException {
		List<Wages> list = findByY_M(distributionYear, distributionMonth, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Wages findByY_M_Last(long distributionYear, long distributionMonth,
		OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = fetchByY_M_Last(distributionYear, distributionMonth,
				orderByComparator);

		if (wages != null) {
			return wages;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("distributionYear=");
		msg.append(distributionYear);

		msg.append(", distributionMonth=");
		msg.append(distributionMonth);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWagesException(msg.toString());
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
	@Override
	public Wages fetchByY_M_Last(long distributionYear, long distributionMonth,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByY_M(distributionYear, distributionMonth);

		if (count == 0) {
			return null;
		}

		List<Wages> list = findByY_M(distributionYear, distributionMonth,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Wages[] findByY_M_PrevAndNext(long id, long distributionYear,
		long distributionMonth, OrderByComparator orderByComparator)
		throws NoSuchWagesException, SystemException {
		Wages wages = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Wages[] array = new WagesImpl[3];

			array[0] = getByY_M_PrevAndNext(session, wages, distributionYear,
					distributionMonth, orderByComparator, true);

			array[1] = wages;

			array[2] = getByY_M_PrevAndNext(session, wages, distributionYear,
					distributionMonth, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Wages getByY_M_PrevAndNext(Session session, Wages wages,
		long distributionYear, long distributionMonth,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WAGES_WHERE);

		query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONYEAR_2);

		query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONMONTH_2);

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
			query.append(WagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(distributionYear);

		qPos.add(distributionMonth);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(wages);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Wages> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wageses where distributionYear = &#63; and distributionMonth = &#63; from the database.
	 *
	 * @param distributionYear the distribution year
	 * @param distributionMonth the distribution month
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByY_M(long distributionYear, long distributionMonth)
		throws SystemException {
		for (Wages wages : findByY_M(distributionYear, distributionMonth,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wages);
		}
	}

	/**
	 * Returns the number of wageses where distributionYear = &#63; and distributionMonth = &#63;.
	 *
	 * @param distributionYear the distribution year
	 * @param distributionMonth the distribution month
	 * @return the number of matching wageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByY_M(long distributionYear, long distributionMonth)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_Y_M;

		Object[] finderArgs = new Object[] { distributionYear, distributionMonth };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_WAGES_WHERE);

			query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONYEAR_2);

			query.append(_FINDER_COLUMN_Y_M_DISTRIBUTIONMONTH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(distributionYear);

				qPos.add(distributionMonth);

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

	private static final String _FINDER_COLUMN_Y_M_DISTRIBUTIONYEAR_2 = "wages.distributionYear = ? AND ";
	private static final String _FINDER_COLUMN_Y_M_DISTRIBUTIONMONTH_2 = "wages.distributionMonth = ?";

	public WagesPersistenceImpl() {
		setModelClass(Wages.class);
	}

	/**
	 * Caches the wages in the entity cache if it is enabled.
	 *
	 * @param wages the wages
	 */
	@Override
	public void cacheResult(Wages wages) {
		EntityCacheUtil.putResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesImpl.class, wages.getPrimaryKey(), wages);

		wages.resetOriginalValues();
	}

	/**
	 * Caches the wageses in the entity cache if it is enabled.
	 *
	 * @param wageses the wageses
	 */
	@Override
	public void cacheResult(List<Wages> wageses) {
		for (Wages wages : wageses) {
			if (EntityCacheUtil.getResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
						WagesImpl.class, wages.getPrimaryKey()) == null) {
				cacheResult(wages);
			}
			else {
				wages.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wageses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WagesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WagesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Wages wages) {
		EntityCacheUtil.removeResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesImpl.class, wages.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Wages> wageses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Wages wages : wageses) {
			EntityCacheUtil.removeResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
				WagesImpl.class, wages.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wages with the primary key. Does not add the wages to the database.
	 *
	 * @param id the primary key for the new wages
	 * @return the new wages
	 */
	@Override
	public Wages create(long id) {
		Wages wages = new WagesImpl();

		wages.setNew(true);
		wages.setPrimaryKey(id);

		return wages;
	}

	/**
	 * Removes the wages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the wages
	 * @return the wages that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages remove(long id) throws NoSuchWagesException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the wages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wages
	 * @return the wages that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages remove(Serializable primaryKey)
		throws NoSuchWagesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Wages wages = (Wages)session.get(WagesImpl.class, primaryKey);

			if (wages == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wages);
		}
		catch (NoSuchWagesException nsee) {
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
	protected Wages removeImpl(Wages wages) throws SystemException {
		wages = toUnwrappedModel(wages);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wages)) {
				wages = (Wages)session.get(WagesImpl.class,
						wages.getPrimaryKeyObj());
			}

			if (wages != null) {
				session.delete(wages);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wages != null) {
			clearCache(wages);
		}

		return wages;
	}

	@Override
	public Wages updateImpl(com.shuntian.portlet.intranet.model.Wages wages)
		throws SystemException {
		wages = toUnwrappedModel(wages);

		boolean isNew = wages.isNew();

		WagesModelImpl wagesModelImpl = (WagesModelImpl)wages;

		Session session = null;

		try {
			session = openSession();

			if (wages.isNew()) {
				session.save(wages);

				wages.setNew(false);
			}
			else {
				session.merge(wages);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WagesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wagesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { wagesModelImpl.getOriginalUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { wagesModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((wagesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Y_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wagesModelImpl.getOriginalDistributionYear(),
						wagesModelImpl.getOriginalDistributionMonth()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Y_M,
					args);

				args = new Object[] {
						wagesModelImpl.getDistributionYear(),
						wagesModelImpl.getDistributionMonth()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_Y_M, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Y_M,
					args);
			}
		}

		EntityCacheUtil.putResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
			WagesImpl.class, wages.getPrimaryKey(), wages);

		return wages;
	}

	protected Wages toUnwrappedModel(Wages wages) {
		if (wages instanceof WagesImpl) {
			return wages;
		}

		WagesImpl wagesImpl = new WagesImpl();

		wagesImpl.setNew(wages.isNew());
		wagesImpl.setPrimaryKey(wages.getPrimaryKey());

		wagesImpl.setId(wages.getId());
		wagesImpl.setUserId(wages.getUserId());
		wagesImpl.setWageName(wages.getWageName());
		wagesImpl.setDistributionMonth(wages.getDistributionMonth());
		wagesImpl.setDistributionYear(wages.getDistributionYear());
		wagesImpl.setEntryDate(wages.getEntryDate());
		wagesImpl.setDepartureDate(wages.getDepartureDate());
		wagesImpl.setUserWage(wages.getUserWage());
		wagesImpl.setUserPerformance(wages.getUserPerformance());
		wagesImpl.setUserTotalWage(wages.getUserTotalWage());
		wagesImpl.setAttendance(wages.getAttendance());
		wagesImpl.setRealAttendance(wages.getRealAttendance());
		wagesImpl.setBasePay(wages.getBasePay());
		wagesImpl.setOvertimeWages(wages.getOvertimeWages());
		wagesImpl.setPerformanceScores(wages.getPerformanceScores());
		wagesImpl.setPerformanceSalary(wages.getPerformanceSalary());
		wagesImpl.setAllowance(wages.getAllowance());
		wagesImpl.setTotalWages(wages.getTotalWages());
		wagesImpl.setSocialCompanyBearPart(wages.getSocialCompanyBearPart());
		wagesImpl.setSocialIndividualsBearPart(wages.getSocialIndividualsBearPart());
		wagesImpl.setTaxableIncome(wages.getTaxableIncome());
		wagesImpl.setTaxRate(wages.getTaxRate());
		wagesImpl.setTaxes(wages.getTaxes());
		wagesImpl.setRealWages(wages.getRealWages());
		wagesImpl.setCreateUserId(wages.getCreateUserId());
		wagesImpl.setCreateDate(wages.getCreateDate());
		wagesImpl.setModifiedUserId(wages.getModifiedUserId());
		wagesImpl.setModifiedDate(wages.getModifiedDate());

		return wagesImpl;
	}

	/**
	 * Returns the wages with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wages
	 * @return the wages
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWagesException, SystemException {
		Wages wages = fetchByPrimaryKey(primaryKey);

		if (wages == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wages;
	}

	/**
	 * Returns the wages with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchWagesException} if it could not be found.
	 *
	 * @param id the primary key of the wages
	 * @return the wages
	 * @throws com.shuntian.portlet.intranet.NoSuchWagesException if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages findByPrimaryKey(long id)
		throws NoSuchWagesException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the wages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wages
	 * @return the wages, or <code>null</code> if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Wages wages = (Wages)EntityCacheUtil.getResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
				WagesImpl.class, primaryKey);

		if (wages == _nullWages) {
			return null;
		}

		if (wages == null) {
			Session session = null;

			try {
				session = openSession();

				wages = (Wages)session.get(WagesImpl.class, primaryKey);

				if (wages != null) {
					cacheResult(wages);
				}
				else {
					EntityCacheUtil.putResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
						WagesImpl.class, primaryKey, _nullWages);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WagesModelImpl.ENTITY_CACHE_ENABLED,
					WagesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wages;
	}

	/**
	 * Returns the wages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the wages
	 * @return the wages, or <code>null</code> if a wages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Wages fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the wageses.
	 *
	 * @return the wageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Wages> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Wages> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Wages> findAll(int start, int end,
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

		List<Wages> list = (List<Wages>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WAGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WAGES;

				if (pagination) {
					sql = sql.concat(WagesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Wages>(list);
				}
				else {
					list = (List<Wages>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the wageses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Wages wages : findAll()) {
			remove(wages);
		}
	}

	/**
	 * Returns the number of wageses.
	 *
	 * @return the number of wageses
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

				Query q = session.createQuery(_SQL_COUNT_WAGES);

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
	 * Initializes the wages persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.Wages")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Wages>> listenersList = new ArrayList<ModelListener<Wages>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Wages>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(WagesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_WAGES = "SELECT wages FROM Wages wages";
	private static final String _SQL_SELECT_WAGES_WHERE = "SELECT wages FROM Wages wages WHERE ";
	private static final String _SQL_COUNT_WAGES = "SELECT COUNT(wages) FROM Wages wages";
	private static final String _SQL_COUNT_WAGES_WHERE = "SELECT COUNT(wages) FROM Wages wages WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wages.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Wages exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Wages exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WagesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Wages _nullWages = new WagesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Wages> toCacheModel() {
				return _nullWagesCacheModel;
			}
		};

	private static CacheModel<Wages> _nullWagesCacheModel = new CacheModel<Wages>() {
			@Override
			public Wages toEntityModel() {
				return _nullWages;
			}
		};
}