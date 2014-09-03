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

import com.shuntian.portlet.intranet.NoSuchext_informationException;
import com.shuntian.portlet.intranet.model.ext_information;
import com.shuntian.portlet.intranet.model.impl.ext_informationImpl;
import com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ext_information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ext_informationPersistence
 * @see ext_informationUtil
 * @generated
 */
public class ext_informationPersistenceImpl extends BasePersistenceImpl<ext_information>
	implements ext_informationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ext_informationUtil} to access the ext_information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ext_informationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ext_informationModelImpl.UUID_COLUMN_BITMASK |
			ext_informationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ext_informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext_informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @return the range of matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext_informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid(String uuid, int start, int end,
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

		List<ext_information> list = (List<ext_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ext_information ext_information : list) {
				if (!Validator.equals(uuid, ext_information.getUuid())) {
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

			query.append(_SQL_SELECT_EXT_INFORMATION_WHERE);

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
				query.append(ext_informationModelImpl.ORDER_BY_JPQL);
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
					list = (List<ext_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ext_information>(list);
				}
				else {
					list = (List<ext_information>)QueryUtil.list(q,
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
	 * Returns the first ext_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = fetchByUuid_First(uuid,
				orderByComparator);

		if (ext_information != null) {
			return ext_information;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchext_informationException(msg.toString());
	}

	/**
	 * Returns the first ext_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext_information, or <code>null</code> if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ext_information> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = fetchByUuid_Last(uuid,
				orderByComparator);

		if (ext_information != null) {
			return ext_information;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchext_informationException(msg.toString());
	}

	/**
	 * Returns the last ext_information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext_information, or <code>null</code> if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ext_information> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext_informations before and after the current ext_information in the ordered set where uuid = &#63;.
	 *
	 * @param extId the primary key of the current ext_information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information[] findByUuid_PrevAndNext(long extId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = findByPrimaryKey(extId);

		Session session = null;

		try {
			session = openSession();

			ext_information[] array = new ext_informationImpl[3];

			array[0] = getByUuid_PrevAndNext(session, ext_information, uuid,
					orderByComparator, true);

			array[1] = ext_information;

			array[2] = getByUuid_PrevAndNext(session, ext_information, uuid,
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

	protected ext_information getByUuid_PrevAndNext(Session session,
		ext_information ext_information, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXT_INFORMATION_WHERE);

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
			query.append(ext_informationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(ext_information);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ext_information> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext_informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (ext_information ext_information : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ext_information);
		}
	}

	/**
	 * Returns the number of ext_informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ext_informations
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

			query.append(_SQL_COUNT_EXT_INFORMATION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "ext_information.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "ext_information.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(ext_information.uuid IS NULL OR ext_information.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED,
			ext_informationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ext_informationModelImpl.UUID_COLUMN_BITMASK |
			ext_informationModelImpl.COMPANYID_COLUMN_BITMASK |
			ext_informationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the ext_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @return the range of matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findByUuid_C(String uuid, long companyId,
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

		List<ext_information> list = (List<ext_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ext_information ext_information : list) {
				if (!Validator.equals(uuid, ext_information.getUuid()) ||
						(companyId != ext_information.getCompanyId())) {
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

			query.append(_SQL_SELECT_EXT_INFORMATION_WHERE);

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
				query.append(ext_informationModelImpl.ORDER_BY_JPQL);
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
					list = (List<ext_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ext_information>(list);
				}
				else {
					list = (List<ext_information>)QueryUtil.list(q,
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
	 * Returns the first ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (ext_information != null) {
			return ext_information;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchext_informationException(msg.toString());
	}

	/**
	 * Returns the first ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ext_information, or <code>null</code> if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ext_information> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (ext_information != null) {
			return ext_information;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchext_informationException(msg.toString());
	}

	/**
	 * Returns the last ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ext_information, or <code>null</code> if a matching ext_information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ext_information> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ext_informations before and after the current ext_information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param extId the primary key of the current ext_information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information[] findByUuid_C_PrevAndNext(long extId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = findByPrimaryKey(extId);

		Session session = null;

		try {
			session = openSession();

			ext_information[] array = new ext_informationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, ext_information, uuid,
					companyId, orderByComparator, true);

			array[1] = ext_information;

			array[2] = getByUuid_C_PrevAndNext(session, ext_information, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ext_information getByUuid_C_PrevAndNext(Session session,
		ext_information ext_information, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXT_INFORMATION_WHERE);

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
			query.append(ext_informationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(ext_information);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ext_information> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ext_informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (ext_information ext_information : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ext_information);
		}
	}

	/**
	 * Returns the number of ext_informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ext_informations
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

			query.append(_SQL_COUNT_EXT_INFORMATION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "ext_information.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "ext_information.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(ext_information.uuid IS NULL OR ext_information.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "ext_information.companyId = ?";

	public ext_informationPersistenceImpl() {
		setModelClass(ext_information.class);
	}

	/**
	 * Caches the ext_information in the entity cache if it is enabled.
	 *
	 * @param ext_information the ext_information
	 */
	@Override
	public void cacheResult(ext_information ext_information) {
		EntityCacheUtil.putResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationImpl.class, ext_information.getPrimaryKey(),
			ext_information);

		ext_information.resetOriginalValues();
	}

	/**
	 * Caches the ext_informations in the entity cache if it is enabled.
	 *
	 * @param ext_informations the ext_informations
	 */
	@Override
	public void cacheResult(List<ext_information> ext_informations) {
		for (ext_information ext_information : ext_informations) {
			if (EntityCacheUtil.getResult(
						ext_informationModelImpl.ENTITY_CACHE_ENABLED,
						ext_informationImpl.class,
						ext_information.getPrimaryKey()) == null) {
				cacheResult(ext_information);
			}
			else {
				ext_information.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext_informations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ext_informationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ext_informationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext_information.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ext_information ext_information) {
		EntityCacheUtil.removeResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationImpl.class, ext_information.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ext_information> ext_informations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ext_information ext_information : ext_informations) {
			EntityCacheUtil.removeResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
				ext_informationImpl.class, ext_information.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext_information with the primary key. Does not add the ext_information to the database.
	 *
	 * @param extId the primary key for the new ext_information
	 * @return the new ext_information
	 */
	@Override
	public ext_information create(long extId) {
		ext_information ext_information = new ext_informationImpl();

		ext_information.setNew(true);
		ext_information.setPrimaryKey(extId);

		String uuid = PortalUUIDUtil.generate();

		ext_information.setUuid(uuid);

		return ext_information;
	}

	/**
	 * Removes the ext_information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param extId the primary key of the ext_information
	 * @return the ext_information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information remove(long extId)
		throws NoSuchext_informationException, SystemException {
		return remove((Serializable)extId);
	}

	/**
	 * Removes the ext_information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext_information
	 * @return the ext_information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information remove(Serializable primaryKey)
		throws NoSuchext_informationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ext_information ext_information = (ext_information)session.get(ext_informationImpl.class,
					primaryKey);

			if (ext_information == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchext_informationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ext_information);
		}
		catch (NoSuchext_informationException nsee) {
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
	protected ext_information removeImpl(ext_information ext_information)
		throws SystemException {
		ext_information = toUnwrappedModel(ext_information);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ext_information)) {
				ext_information = (ext_information)session.get(ext_informationImpl.class,
						ext_information.getPrimaryKeyObj());
			}

			if (ext_information != null) {
				session.delete(ext_information);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ext_information != null) {
			clearCache(ext_information);
		}

		return ext_information;
	}

	@Override
	public ext_information updateImpl(
		com.shuntian.portlet.intranet.model.ext_information ext_information)
		throws SystemException {
		ext_information = toUnwrappedModel(ext_information);

		boolean isNew = ext_information.isNew();

		ext_informationModelImpl ext_informationModelImpl = (ext_informationModelImpl)ext_information;

		if (Validator.isNull(ext_information.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ext_information.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (ext_information.isNew()) {
				session.save(ext_information);

				ext_information.setNew(false);
			}
			else {
				session.merge(ext_information);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ext_informationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ext_informationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ext_informationModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { ext_informationModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((ext_informationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ext_informationModelImpl.getOriginalUuid(),
						ext_informationModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						ext_informationModelImpl.getUuid(),
						ext_informationModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
			ext_informationImpl.class, ext_information.getPrimaryKey(),
			ext_information);

		return ext_information;
	}

	protected ext_information toUnwrappedModel(ext_information ext_information) {
		if (ext_information instanceof ext_informationImpl) {
			return ext_information;
		}

		ext_informationImpl ext_informationImpl = new ext_informationImpl();

		ext_informationImpl.setNew(ext_information.isNew());
		ext_informationImpl.setPrimaryKey(ext_information.getPrimaryKey());

		ext_informationImpl.setUuid(ext_information.getUuid());
		ext_informationImpl.setExtId(ext_information.getExtId());
		ext_informationImpl.setStaffId(ext_information.getStaffId());
		ext_informationImpl.setOpen_city(ext_information.getOpen_city());
		ext_informationImpl.setBank_name(ext_information.getBank_name());
		ext_informationImpl.setBankid(ext_information.getBankid());
		ext_informationImpl.setLabor_contract_start(ext_information.getLabor_contract_start());
		ext_informationImpl.setLabor_contract_end(ext_information.getLabor_contract_end());
		ext_informationImpl.setProbation_period_start(ext_information.getProbation_period_start());
		ext_informationImpl.setProbation_period_end(ext_information.getProbation_period_end());
		ext_informationImpl.setIndured_location(ext_information.getIndured_location());
		ext_informationImpl.setFrist_insured(ext_information.getFrist_insured());
		ext_informationImpl.setIs_insured(ext_information.getIs_insured());
		ext_informationImpl.setCompanyId(ext_information.getCompanyId());
		ext_informationImpl.setCreateuser(ext_information.getCreateuser());
		ext_informationImpl.setCreateDate(ext_information.getCreateDate());
		ext_informationImpl.setModifieduser(ext_information.getModifieduser());
		ext_informationImpl.setModifiedDate(ext_information.getModifiedDate());

		return ext_informationImpl;
	}

	/**
	 * Returns the ext_information with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext_information
	 * @return the ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByPrimaryKey(Serializable primaryKey)
		throws NoSuchext_informationException, SystemException {
		ext_information ext_information = fetchByPrimaryKey(primaryKey);

		if (ext_information == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchext_informationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ext_information;
	}

	/**
	 * Returns the ext_information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchext_informationException} if it could not be found.
	 *
	 * @param extId the primary key of the ext_information
	 * @return the ext_information
	 * @throws com.shuntian.portlet.intranet.NoSuchext_informationException if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information findByPrimaryKey(long extId)
		throws NoSuchext_informationException, SystemException {
		return findByPrimaryKey((Serializable)extId);
	}

	/**
	 * Returns the ext_information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext_information
	 * @return the ext_information, or <code>null</code> if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ext_information ext_information = (ext_information)EntityCacheUtil.getResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
				ext_informationImpl.class, primaryKey);

		if (ext_information == _nullext_information) {
			return null;
		}

		if (ext_information == null) {
			Session session = null;

			try {
				session = openSession();

				ext_information = (ext_information)session.get(ext_informationImpl.class,
						primaryKey);

				if (ext_information != null) {
					cacheResult(ext_information);
				}
				else {
					EntityCacheUtil.putResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
						ext_informationImpl.class, primaryKey,
						_nullext_information);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ext_informationModelImpl.ENTITY_CACHE_ENABLED,
					ext_informationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ext_information;
	}

	/**
	 * Returns the ext_information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param extId the primary key of the ext_information
	 * @return the ext_information, or <code>null</code> if a ext_information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ext_information fetchByPrimaryKey(long extId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)extId);
	}

	/**
	 * Returns all the ext_informations.
	 *
	 * @return the ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext_informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @return the range of ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext_informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ext_informationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext_informations
	 * @param end the upper bound of the range of ext_informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext_informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ext_information> findAll(int start, int end,
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

		List<ext_information> list = (List<ext_information>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXT_INFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXT_INFORMATION;

				if (pagination) {
					sql = sql.concat(ext_informationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ext_information>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ext_information>(list);
				}
				else {
					list = (List<ext_information>)QueryUtil.list(q,
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
	 * Removes all the ext_informations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ext_information ext_information : findAll()) {
			remove(ext_information);
		}
	}

	/**
	 * Returns the number of ext_informations.
	 *
	 * @return the number of ext_informations
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

				Query q = session.createQuery(_SQL_COUNT_EXT_INFORMATION);

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
	 * Initializes the ext_information persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.ext_information")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ext_information>> listenersList = new ArrayList<ModelListener<ext_information>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ext_information>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ext_informationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXT_INFORMATION = "SELECT ext_information FROM ext_information ext_information";
	private static final String _SQL_SELECT_EXT_INFORMATION_WHERE = "SELECT ext_information FROM ext_information ext_information WHERE ";
	private static final String _SQL_COUNT_EXT_INFORMATION = "SELECT COUNT(ext_information) FROM ext_information ext_information";
	private static final String _SQL_COUNT_EXT_INFORMATION_WHERE = "SELECT COUNT(ext_information) FROM ext_information ext_information WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ext_information.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ext_information exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ext_information exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ext_informationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static ext_information _nullext_information = new ext_informationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ext_information> toCacheModel() {
				return _nullext_informationCacheModel;
			}
		};

	private static CacheModel<ext_information> _nullext_informationCacheModel = new CacheModel<ext_information>() {
			@Override
			public ext_information toEntityModel() {
				return _nullext_information;
			}
		};
}