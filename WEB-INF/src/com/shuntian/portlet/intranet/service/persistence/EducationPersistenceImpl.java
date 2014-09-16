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

import com.shuntian.portlet.intranet.NoSuchEducationException;
import com.shuntian.portlet.intranet.model.Education;
import com.shuntian.portlet.intranet.model.impl.EducationImpl;
import com.shuntian.portlet.intranet.model.impl.EducationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the education service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EducationPersistence
 * @see EducationUtil
 * @generated
 */
public class EducationPersistenceImpl extends BasePersistenceImpl<Education>
	implements EducationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EducationUtil} to access the education persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EducationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, EducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, EducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, EducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, EducationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			EducationModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching educations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Education> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Education> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
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
	@Override
	public List<Education> findByUserId(long userId, int start, int end,
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

		List<Education> list = (List<Education>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Education education : list) {
				if ((userId != education.getUserId())) {
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

			query.append(_SQL_SELECT_EDUCATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EducationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Education>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Education>(list);
				}
				else {
					list = (List<Education>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching education
	 * @throws com.shuntian.portlet.intranet.NoSuchEducationException if a matching education could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchEducationException, SystemException {
		Education education = fetchByUserId_First(userId, orderByComparator);

		if (education != null) {
			return education;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEducationException(msg.toString());
	}

	/**
	 * Returns the first education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching education, or <code>null</code> if a matching education could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Education> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Education findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchEducationException, SystemException {
		Education education = fetchByUserId_Last(userId, orderByComparator);

		if (education != null) {
			return education;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEducationException(msg.toString());
	}

	/**
	 * Returns the last education in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching education, or <code>null</code> if a matching education could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Education> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Education[] findByUserId_PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchEducationException, SystemException {
		Education education = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Education[] array = new EducationImpl[3];

			array[0] = getByUserId_PrevAndNext(session, education, userId,
					orderByComparator, true);

			array[1] = education;

			array[2] = getByUserId_PrevAndNext(session, education, userId,
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

	protected Education getByUserId_PrevAndNext(Session session,
		Education education, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDUCATION_WHERE);

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
			query.append(EducationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(education);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Education> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the educations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (Education education : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(education);
		}
	}

	/**
	 * Returns the number of educations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching educations
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

			query.append(_SQL_COUNT_EDUCATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "education.userId = ?";

	public EducationPersistenceImpl() {
		setModelClass(Education.class);
	}

	/**
	 * Caches the education in the entity cache if it is enabled.
	 *
	 * @param education the education
	 */
	@Override
	public void cacheResult(Education education) {
		EntityCacheUtil.putResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationImpl.class, education.getPrimaryKey(), education);

		education.resetOriginalValues();
	}

	/**
	 * Caches the educations in the entity cache if it is enabled.
	 *
	 * @param educations the educations
	 */
	@Override
	public void cacheResult(List<Education> educations) {
		for (Education education : educations) {
			if (EntityCacheUtil.getResult(
						EducationModelImpl.ENTITY_CACHE_ENABLED,
						EducationImpl.class, education.getPrimaryKey()) == null) {
				cacheResult(education);
			}
			else {
				education.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all educations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EducationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EducationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the education.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Education education) {
		EntityCacheUtil.removeResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationImpl.class, education.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Education> educations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Education education : educations) {
			EntityCacheUtil.removeResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
				EducationImpl.class, education.getPrimaryKey());
		}
	}

	/**
	 * Creates a new education with the primary key. Does not add the education to the database.
	 *
	 * @param id the primary key for the new education
	 * @return the new education
	 */
	@Override
	public Education create(long id) {
		Education education = new EducationImpl();

		education.setNew(true);
		education.setPrimaryKey(id);

		return education;
	}

	/**
	 * Removes the education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the education
	 * @return the education that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education remove(long id)
		throws NoSuchEducationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the education with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the education
	 * @return the education that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education remove(Serializable primaryKey)
		throws NoSuchEducationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Education education = (Education)session.get(EducationImpl.class,
					primaryKey);

			if (education == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(education);
		}
		catch (NoSuchEducationException nsee) {
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
	protected Education removeImpl(Education education)
		throws SystemException {
		education = toUnwrappedModel(education);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(education)) {
				education = (Education)session.get(EducationImpl.class,
						education.getPrimaryKeyObj());
			}

			if (education != null) {
				session.delete(education);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (education != null) {
			clearCache(education);
		}

		return education;
	}

	@Override
	public Education updateImpl(
		com.shuntian.portlet.intranet.model.Education education)
		throws SystemException {
		education = toUnwrappedModel(education);

		boolean isNew = education.isNew();

		EducationModelImpl educationModelImpl = (EducationModelImpl)education;

		Session session = null;

		try {
			session = openSession();

			if (education.isNew()) {
				session.save(education);

				education.setNew(false);
			}
			else {
				session.merge(education);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EducationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((educationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						educationModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { educationModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
			EducationImpl.class, education.getPrimaryKey(), education);

		return education;
	}

	protected Education toUnwrappedModel(Education education) {
		if (education instanceof EducationImpl) {
			return education;
		}

		EducationImpl educationImpl = new EducationImpl();

		educationImpl.setNew(education.isNew());
		educationImpl.setPrimaryKey(education.getPrimaryKey());

		educationImpl.setId(education.getId());
		educationImpl.setUserId(education.getUserId());
		educationImpl.setEWitness(education.getEWitness());
		educationImpl.setEProfessional(education.getEProfessional());
		educationImpl.setEUniversity(education.getEUniversity());
		educationImpl.setEContactPhone(education.getEContactPhone());
		educationImpl.setEStartTimeYear(education.getEStartTimeYear());
		educationImpl.setEStartTimeMonth(education.getEStartTimeMonth());
		educationImpl.setEStopTimeYear(education.getEStopTimeYear());
		educationImpl.setEStopTimeMonth(education.getEStopTimeMonth());

		return educationImpl;
	}

	/**
	 * Returns the education with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the education
	 * @return the education
	 * @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEducationException, SystemException {
		Education education = fetchByPrimaryKey(primaryKey);

		if (education == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEducationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return education;
	}

	/**
	 * Returns the education with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchEducationException} if it could not be found.
	 *
	 * @param id the primary key of the education
	 * @return the education
	 * @throws com.shuntian.portlet.intranet.NoSuchEducationException if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education findByPrimaryKey(long id)
		throws NoSuchEducationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the education
	 * @return the education, or <code>null</code> if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Education education = (Education)EntityCacheUtil.getResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
				EducationImpl.class, primaryKey);

		if (education == _nullEducation) {
			return null;
		}

		if (education == null) {
			Session session = null;

			try {
				session = openSession();

				education = (Education)session.get(EducationImpl.class,
						primaryKey);

				if (education != null) {
					cacheResult(education);
				}
				else {
					EntityCacheUtil.putResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
						EducationImpl.class, primaryKey, _nullEducation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EducationModelImpl.ENTITY_CACHE_ENABLED,
					EducationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return education;
	}

	/**
	 * Returns the education with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the education
	 * @return the education, or <code>null</code> if a education with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Education fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the educations.
	 *
	 * @return the educations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Education> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Education> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Education> findAll(int start, int end,
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

		List<Education> list = (List<Education>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EDUCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDUCATION;

				if (pagination) {
					sql = sql.concat(EducationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Education>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Education>(list);
				}
				else {
					list = (List<Education>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the educations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Education education : findAll()) {
			remove(education);
		}
	}

	/**
	 * Returns the number of educations.
	 *
	 * @return the number of educations
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

				Query q = session.createQuery(_SQL_COUNT_EDUCATION);

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
	 * Initializes the education persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.Education")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Education>> listenersList = new ArrayList<ModelListener<Education>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Education>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EducationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EDUCATION = "SELECT education FROM Education education";
	private static final String _SQL_SELECT_EDUCATION_WHERE = "SELECT education FROM Education education WHERE ";
	private static final String _SQL_COUNT_EDUCATION = "SELECT COUNT(education) FROM Education education";
	private static final String _SQL_COUNT_EDUCATION_WHERE = "SELECT COUNT(education) FROM Education education WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "education.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Education exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Education exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EducationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Education _nullEducation = new EducationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Education> toCacheModel() {
				return _nullEducationCacheModel;
			}
		};

	private static CacheModel<Education> _nullEducationCacheModel = new CacheModel<Education>() {
			@Override
			public Education toEntityModel() {
				return _nullEducation;
			}
		};
}