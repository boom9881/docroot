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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.shuntian.portlet.intranet.NoSuchbasic_informationException;
import com.shuntian.portlet.intranet.model.basic_information;
import com.shuntian.portlet.intranet.model.impl.basic_informationImpl;
import com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the basic_information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see basic_informationPersistence
 * @see basic_informationUtil
 * @generated
 */
public class basic_informationPersistenceImpl extends BasePersistenceImpl<basic_information>
	implements basic_informationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link basic_informationUtil} to access the basic_information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = basic_informationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			basic_informationModelImpl.UUID_COLUMN_BITMASK |
			basic_informationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the basic_informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basic_informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @return the range of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the basic_informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<basic_information> list = (List<basic_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (basic_information basic_information : list) {
				if (!Validator.equals(uuid, basic_information.getUuid())) {
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

			query.append(_SQL_SELECT_BASIC_INFORMATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(basic_informationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<basic_information>(list);
				}
				else {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first basic_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = fetchByUuid_First(uuid,
				orderByComparator);

		if (basic_information != null) {
			return basic_information;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbasic_informationException(msg.toString());
	}

	/**
	 * Returns the first basic_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic_information, or <code>null</code> if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<basic_information> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last basic_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = fetchByUuid_Last(uuid,
				orderByComparator);

		if (basic_information != null) {
			return basic_information;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbasic_informationException(msg.toString());
	}

	/**
	 * Returns the last basic_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic_information, or <code>null</code> if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<basic_information> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the basic_informations before and after the current basic_information in the ordered set where uuid = &#63;.
	 *
	 * @param staffId the primary key of the current basic_information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information[] findByUuid_PrevAndNext(long staffId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = findByPrimaryKey(staffId);

		Session session = null;

		try {
			session = openSession();

			basic_information[] array = new basic_informationImpl[3];

			array[0] = getByUuid_PrevAndNext(session, basic_information, uuid,
					orderByComparator, true);

			array[1] = basic_information;

			array[2] = getByUuid_PrevAndNext(session, basic_information, uuid,
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

	protected basic_information getByUuid_PrevAndNext(Session session,
		basic_information basic_information, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BASIC_INFORMATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

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
			query.append(basic_informationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(basic_information);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<basic_information> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the basic_informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (basic_information basic_information : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(basic_information);
		}
	}

	/**
	 * Returns the number of basic_informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BASIC_INFORMATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "basic_information.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "basic_information.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(basic_information.uuid IS NULL OR basic_information.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED,
			basic_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			basic_informationModelImpl.UUID_COLUMN_BITMASK |
			basic_informationModelImpl.COMPANYID_COLUMN_BITMASK |
			basic_informationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the basic_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basic_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @return the range of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the basic_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<basic_information> list = (List<basic_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (basic_information basic_information : list) {
				if (!Validator.equals(uuid, basic_information.getUuid()) ||
						(companyId != basic_information.getCompanyId())) {
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

			query.append(_SQL_SELECT_BASIC_INFORMATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(basic_informationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<basic_information>(list);
				}
				else {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first basic_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (basic_information != null) {
			return basic_information;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbasic_informationException(msg.toString());
	}

	/**
	 * Returns the first basic_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic_information, or <code>null</code> if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<basic_information> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last basic_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (basic_information != null) {
			return basic_information;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbasic_informationException(msg.toString());
	}

	/**
	 * Returns the last basic_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic_information, or <code>null</code> if a matching basic_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<basic_information> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the basic_informations before and after the current basic_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param staffId the primary key of the current basic_information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information[] findByUuid_C_PrevAndNext(long staffId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = findByPrimaryKey(staffId);

		Session session = null;

		try {
			session = openSession();

			basic_information[] array = new basic_informationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, basic_information,
					uuid, companyId, orderByComparator, true);

			array[1] = basic_information;

			array[2] = getByUuid_C_PrevAndNext(session, basic_information,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected basic_information getByUuid_C_PrevAndNext(Session session,
		basic_information basic_information, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BASIC_INFORMATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(basic_informationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(basic_information);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<basic_information> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the basic_informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (basic_information basic_information : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(basic_information);
		}
	}

	/**
	 * Returns the number of basic_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BASIC_INFORMATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "basic_information.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "basic_information.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(basic_information.uuid IS NULL OR basic_information.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "basic_information.companyId = ?";

	public basic_informationPersistenceImpl() {
		setModelClass(basic_information.class);
	}

	/**
	 * Caches the basic_information in the entity cache if it is enabled.
	 *
	 * @param basic_information the basic_information
	 */
	@Override
	public void cacheResult(basic_information basic_information) {
		EntityCacheUtil.putResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationImpl.class, basic_information.getPrimaryKey(),
			basic_information);

		basic_information.resetOriginalValues();
	}

	/**
	 * Caches the basic_informations in the entity cache if it is enabled.
	 *
	 * @param basic_informations the basic_informations
	 */
	@Override
	public void cacheResult(List<basic_information> basic_informations) {
		for (basic_information basic_information : basic_informations) {
			if (EntityCacheUtil.getResult(
						basic_informationModelImpl.ENTITY_CACHE_ENABLED,
						basic_informationImpl.class,
						basic_information.getPrimaryKey()) == null) {
				cacheResult(basic_information);
			}
			else {
				basic_information.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all basic_informations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(basic_informationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(basic_informationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the basic_information.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(basic_information basic_information) {
		EntityCacheUtil.removeResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationImpl.class, basic_information.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<basic_information> basic_informations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (basic_information basic_information : basic_informations) {
			EntityCacheUtil.removeResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
				basic_informationImpl.class, basic_information.getPrimaryKey());
		}
	}

	/**
	 * Creates a new basic_information with the primary key. Does not add the basic_information to the database.
	 *
	 * @param staffId the primary key for the new basic_information
	 * @return the new basic_information
	 */
	@Override
	public basic_information create(long staffId) {
		basic_information basic_information = new basic_informationImpl();

		basic_information.setNew(true);
		basic_information.setPrimaryKey(staffId);

		String uuid = PortalUUIDUtil.generate();

		basic_information.setUuid(uuid);

		return basic_information;
	}

	/**
	 * Removes the basic_information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffId the primary key of the basic_information
	 * @return the basic_information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information remove(long staffId)
		throws NoSuchbasic_informationException, SystemException {
		return remove((Serializable)staffId);
	}

	/**
	 * Removes the basic_information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the basic_information
	 * @return the basic_information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information remove(Serializable primaryKey)
		throws NoSuchbasic_informationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			basic_information basic_information = (basic_information)session.get(basic_informationImpl.class,
					primaryKey);

			if (basic_information == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbasic_informationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(basic_information);
		}
		catch (NoSuchbasic_informationException nsee) {
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
	protected basic_information removeImpl(basic_information basic_information)
		throws SystemException {
		basic_information = toUnwrappedModel(basic_information);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(basic_information)) {
				basic_information = (basic_information)session.get(basic_informationImpl.class,
						basic_information.getPrimaryKeyObj());
			}

			if (basic_information != null) {
				session.delete(basic_information);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (basic_information != null) {
			clearCache(basic_information);
		}

		return basic_information;
	}

	@Override
	public basic_information updateImpl(
		com.shuntian.portlet.intranet.model.basic_information basic_information)
		throws SystemException {
		basic_information = toUnwrappedModel(basic_information);

		boolean isNew = basic_information.isNew();

		basic_informationModelImpl basic_informationModelImpl = (basic_informationModelImpl)basic_information;

		if (Validator.isNull(basic_information.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			basic_information.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (basic_information.isNew()) {
				session.save(basic_information);

				basic_information.setNew(false);
			}
			else {
				session.merge(basic_information);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !basic_informationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((basic_informationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						basic_informationModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { basic_informationModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((basic_informationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						basic_informationModelImpl.getOriginalUuid(),
						basic_informationModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						basic_informationModelImpl.getUuid(),
						basic_informationModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
			basic_informationImpl.class, basic_information.getPrimaryKey(),
			basic_information);

		return basic_information;
	}

	protected basic_information toUnwrappedModel(
		basic_information basic_information) {
		if (basic_information instanceof basic_informationImpl) {
			return basic_information;
		}

		basic_informationImpl basic_informationImpl = new basic_informationImpl();

		basic_informationImpl.setNew(basic_information.isNew());
		basic_informationImpl.setPrimaryKey(basic_information.getPrimaryKey());

		basic_informationImpl.setUuid(basic_information.getUuid());
		basic_informationImpl.setStaffId(basic_information.getStaffId());
		basic_informationImpl.setUserId(basic_information.getUserId());
		basic_informationImpl.setName(basic_information.getName());
		basic_informationImpl.setSex(basic_information.getSex());
		basic_informationImpl.setId_number(basic_information.getId_number());
		basic_informationImpl.setNation(basic_information.getNation());
		basic_informationImpl.setPlace_of_origin(basic_information.getPlace_of_origin());
		basic_informationImpl.setAccount_properties(basic_information.getAccount_properties());
		basic_informationImpl.setBirth(basic_information.getBirth());
		basic_informationImpl.setMarital_status(basic_information.getMarital_status());
		basic_informationImpl.setHighest_degree(basic_information.getHighest_degree());
		basic_informationImpl.setPolitical_background(basic_information.getPolitical_background());
		basic_informationImpl.setFile_location(basic_information.getFile_location());
		basic_informationImpl.setBase_pay(basic_information.getBase_pay());
		basic_informationImpl.setPerformance_pay(basic_information.getPerformance_pay());
		basic_informationImpl.setHealth(basic_information.getHealth());
		basic_informationImpl.setContact_phone(basic_information.getContact_phone());
		basic_informationImpl.setMail(basic_information.getMail());
		basic_informationImpl.setDomicile(basic_information.getDomicile());
		basic_informationImpl.setResidence_phone(basic_information.getResidence_phone());
		basic_informationImpl.setCurrent_residential_address(basic_information.getCurrent_residential_address());
		basic_informationImpl.setCurrent_residential_address_phone(basic_information.getCurrent_residential_address_phone());
		basic_informationImpl.setEmergency_contact(basic_information.getEmergency_contact());
		basic_informationImpl.setEmergency_contact_relation(basic_information.getEmergency_contact_relation());
		basic_informationImpl.setEmergency_contact_phone(basic_information.getEmergency_contact_phone());
		basic_informationImpl.setCompanyId(basic_information.getCompanyId());
		basic_informationImpl.setCreateuser(basic_information.getCreateuser());
		basic_informationImpl.setCreateDate(basic_information.getCreateDate());
		basic_informationImpl.setModifieduser(basic_information.getModifieduser());
		basic_informationImpl.setModifiedDate(basic_information.getModifiedDate());

		return basic_informationImpl;
	}

	/**
	 * Returns the basic_information with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the basic_information
	 * @return the basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbasic_informationException, SystemException {
		basic_information basic_information = fetchByPrimaryKey(primaryKey);

		if (basic_information == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbasic_informationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return basic_information;
	}

	/**
	 * Returns the basic_information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchbasic_informationException} if it could not be found.
	 *
	 * @param staffId the primary key of the basic_information
	 * @return the basic_information
	 * @throws com.shuntian.portlet.intranet.NoSuchbasic_informationException if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information findByPrimaryKey(long staffId)
		throws NoSuchbasic_informationException, SystemException {
		return findByPrimaryKey((Serializable)staffId);
	}

	/**
	 * Returns the basic_information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the basic_information
	 * @return the basic_information, or <code>null</code> if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		basic_information basic_information = (basic_information)EntityCacheUtil.getResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
				basic_informationImpl.class, primaryKey);

		if (basic_information == _nullbasic_information) {
			return null;
		}

		if (basic_information == null) {
			Session session = null;

			try {
				session = openSession();

				basic_information = (basic_information)session.get(basic_informationImpl.class,
						primaryKey);

				if (basic_information != null) {
					cacheResult(basic_information);
				}
				else {
					EntityCacheUtil.putResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
						basic_informationImpl.class, primaryKey,
						_nullbasic_information);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(basic_informationModelImpl.ENTITY_CACHE_ENABLED,
					basic_informationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return basic_information;
	}

	/**
	 * Returns the basic_information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param staffId the primary key of the basic_information
	 * @return the basic_information, or <code>null</code> if a basic_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public basic_information fetchByPrimaryKey(long staffId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)staffId);
	}

	/**
	 * Returns all the basic_informations.
	 *
	 * @return the basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basic_informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @return the range of basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the basic_informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.basic_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic_informations
	 * @param end the upper bound of the range of basic_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of basic_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<basic_information> findAll(int start, int end,
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

		List<basic_information> list = (List<basic_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BASIC_INFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BASIC_INFORMATION;

				if (pagination) {
					sql = sql.concat(basic_informationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<basic_information>(list);
				}
				else {
					list = (List<basic_information>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the basic_informations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (basic_information basic_information : findAll()) {
			remove(basic_information);
		}
	}

	/**
	 * Returns the number of basic_informations.
	 *
	 * @return the number of basic_informations
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

				Query q = session.createQuery(_SQL_COUNT_BASIC_INFORMATION);

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
	 * Initializes the basic_information persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.basic_information")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<basic_information>> listenersList = new ArrayList<ModelListener<basic_information>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<basic_information>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(basic_informationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BASIC_INFORMATION = "SELECT basic_information FROM basic_information basic_information";
	private static final String _SQL_SELECT_BASIC_INFORMATION_WHERE = "SELECT basic_information FROM basic_information basic_information WHERE ";
	private static final String _SQL_COUNT_BASIC_INFORMATION = "SELECT COUNT(basic_information) FROM basic_information basic_information";
	private static final String _SQL_COUNT_BASIC_INFORMATION_WHERE = "SELECT COUNT(basic_information) FROM basic_information basic_information WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "basic_information.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No basic_information exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No basic_information exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(basic_informationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static basic_information _nullbasic_information = new basic_informationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<basic_information> toCacheModel() {
				return _nullbasic_informationCacheModel;
			}
		};

	private static CacheModel<basic_information> _nullbasic_informationCacheModel =
		new CacheModel<basic_information>() {
			@Override
			public basic_information toEntityModel() {
				return _nullbasic_information;
			}
		};
}