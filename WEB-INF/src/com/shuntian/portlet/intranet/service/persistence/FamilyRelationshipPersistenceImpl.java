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

import com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;
import com.shuntian.portlet.intranet.model.FamilyRelationship;
import com.shuntian.portlet.intranet.model.impl.FamilyRelationshipImpl;
import com.shuntian.portlet.intranet.model.impl.FamilyRelationshipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the family relationship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FamilyRelationshipPersistence
 * @see FamilyRelationshipUtil
 * @generated
 */
public class FamilyRelationshipPersistenceImpl extends BasePersistenceImpl<FamilyRelationship>
	implements FamilyRelationshipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FamilyRelationshipUtil} to access the family relationship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FamilyRelationshipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipModelImpl.FINDER_CACHE_ENABLED,
			FamilyRelationshipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipModelImpl.FINDER_CACHE_ENABLED,
			FamilyRelationshipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipModelImpl.FINDER_CACHE_ENABLED,
			FamilyRelationshipImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUserId", new String[] { Long.class.getName() },
			FamilyRelationshipModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the family relationship where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching family relationship
	 * @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a matching family relationship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship findByUserId(long userId)
		throws NoSuchFamilyRelationshipException, SystemException {
		FamilyRelationship familyRelationship = fetchByUserId(userId);

		if (familyRelationship == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFamilyRelationshipException(msg.toString());
		}

		return familyRelationship;
	}

	/**
	 * Returns the family relationship where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching family relationship, or <code>null</code> if a matching family relationship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship fetchByUserId(long userId)
		throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the family relationship where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching family relationship, or <code>null</code> if a matching family relationship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship fetchByUserId(long userId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof FamilyRelationship) {
			FamilyRelationship familyRelationship = (FamilyRelationship)result;

			if ((userId != familyRelationship.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_FAMILYRELATIONSHIP_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<FamilyRelationship> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"FamilyRelationshipPersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					FamilyRelationship familyRelationship = list.get(0);

					result = familyRelationship;

					cacheResult(familyRelationship);

					if ((familyRelationship.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, familyRelationship);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
			return (FamilyRelationship)result;
		}
	}

	/**
	 * Removes the family relationship where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the family relationship that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship removeByUserId(long userId)
		throws NoSuchFamilyRelationshipException, SystemException {
		FamilyRelationship familyRelationship = findByUserId(userId);

		return remove(familyRelationship);
	}

	/**
	 * Returns the number of family relationships where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching family relationships
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

			query.append(_SQL_COUNT_FAMILYRELATIONSHIP_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "familyRelationship.userId = ?";

	public FamilyRelationshipPersistenceImpl() {
		setModelClass(FamilyRelationship.class);
	}

	/**
	 * Caches the family relationship in the entity cache if it is enabled.
	 *
	 * @param familyRelationship the family relationship
	 */
	@Override
	public void cacheResult(FamilyRelationship familyRelationship) {
		EntityCacheUtil.putResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipImpl.class, familyRelationship.getPrimaryKey(),
			familyRelationship);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { familyRelationship.getUserId() }, familyRelationship);

		familyRelationship.resetOriginalValues();
	}

	/**
	 * Caches the family relationships in the entity cache if it is enabled.
	 *
	 * @param familyRelationships the family relationships
	 */
	@Override
	public void cacheResult(List<FamilyRelationship> familyRelationships) {
		for (FamilyRelationship familyRelationship : familyRelationships) {
			if (EntityCacheUtil.getResult(
						FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
						FamilyRelationshipImpl.class,
						familyRelationship.getPrimaryKey()) == null) {
				cacheResult(familyRelationship);
			}
			else {
				familyRelationship.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all family relationships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FamilyRelationshipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FamilyRelationshipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the family relationship.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FamilyRelationship familyRelationship) {
		EntityCacheUtil.removeResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipImpl.class, familyRelationship.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(familyRelationship);
	}

	@Override
	public void clearCache(List<FamilyRelationship> familyRelationships) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FamilyRelationship familyRelationship : familyRelationships) {
			EntityCacheUtil.removeResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
				FamilyRelationshipImpl.class, familyRelationship.getPrimaryKey());

			clearUniqueFindersCache(familyRelationship);
		}
	}

	protected void cacheUniqueFindersCache(
		FamilyRelationship familyRelationship) {
		if (familyRelationship.isNew()) {
			Object[] args = new Object[] { familyRelationship.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				familyRelationship);
		}
		else {
			FamilyRelationshipModelImpl familyRelationshipModelImpl = (FamilyRelationshipModelImpl)familyRelationship;

			if ((familyRelationshipModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { familyRelationship.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					familyRelationship);
			}
		}
	}

	protected void clearUniqueFindersCache(
		FamilyRelationship familyRelationship) {
		FamilyRelationshipModelImpl familyRelationshipModelImpl = (FamilyRelationshipModelImpl)familyRelationship;

		Object[] args = new Object[] { familyRelationship.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((familyRelationshipModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { familyRelationshipModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new family relationship with the primary key. Does not add the family relationship to the database.
	 *
	 * @param id the primary key for the new family relationship
	 * @return the new family relationship
	 */
	@Override
	public FamilyRelationship create(long id) {
		FamilyRelationship familyRelationship = new FamilyRelationshipImpl();

		familyRelationship.setNew(true);
		familyRelationship.setPrimaryKey(id);

		return familyRelationship;
	}

	/**
	 * Removes the family relationship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the family relationship
	 * @return the family relationship that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship remove(long id)
		throws NoSuchFamilyRelationshipException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the family relationship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the family relationship
	 * @return the family relationship that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship remove(Serializable primaryKey)
		throws NoSuchFamilyRelationshipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FamilyRelationship familyRelationship = (FamilyRelationship)session.get(FamilyRelationshipImpl.class,
					primaryKey);

			if (familyRelationship == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFamilyRelationshipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(familyRelationship);
		}
		catch (NoSuchFamilyRelationshipException nsee) {
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
	protected FamilyRelationship removeImpl(
		FamilyRelationship familyRelationship) throws SystemException {
		familyRelationship = toUnwrappedModel(familyRelationship);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(familyRelationship)) {
				familyRelationship = (FamilyRelationship)session.get(FamilyRelationshipImpl.class,
						familyRelationship.getPrimaryKeyObj());
			}

			if (familyRelationship != null) {
				session.delete(familyRelationship);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (familyRelationship != null) {
			clearCache(familyRelationship);
		}

		return familyRelationship;
	}

	@Override
	public FamilyRelationship updateImpl(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship)
		throws SystemException {
		familyRelationship = toUnwrappedModel(familyRelationship);

		boolean isNew = familyRelationship.isNew();

		Session session = null;

		try {
			session = openSession();

			if (familyRelationship.isNew()) {
				session.save(familyRelationship);

				familyRelationship.setNew(false);
			}
			else {
				session.merge(familyRelationship);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FamilyRelationshipModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationshipImpl.class, familyRelationship.getPrimaryKey(),
			familyRelationship);

		clearUniqueFindersCache(familyRelationship);
		cacheUniqueFindersCache(familyRelationship);

		return familyRelationship;
	}

	protected FamilyRelationship toUnwrappedModel(
		FamilyRelationship familyRelationship) {
		if (familyRelationship instanceof FamilyRelationshipImpl) {
			return familyRelationship;
		}

		FamilyRelationshipImpl familyRelationshipImpl = new FamilyRelationshipImpl();

		familyRelationshipImpl.setNew(familyRelationship.isNew());
		familyRelationshipImpl.setPrimaryKey(familyRelationship.getPrimaryKey());

		familyRelationshipImpl.setId(familyRelationship.getId());
		familyRelationshipImpl.setUserId(familyRelationship.getUserId());
		familyRelationshipImpl.setName(familyRelationship.getName());
		familyRelationshipImpl.setRelationship(familyRelationship.getRelationship());
		familyRelationshipImpl.setWorkUnit(familyRelationship.getWorkUnit());
		familyRelationshipImpl.setContactPhone(familyRelationship.getContactPhone());
		familyRelationshipImpl.setOnceJob(familyRelationship.getOnceJob());
		familyRelationshipImpl.setCreateUserId(familyRelationship.getCreateUserId());
		familyRelationshipImpl.setCreateDate(familyRelationship.getCreateDate());
		familyRelationshipImpl.setModifiedUserId(familyRelationship.getModifiedUserId());
		familyRelationshipImpl.setModifiedDate(familyRelationship.getModifiedDate());

		return familyRelationshipImpl;
	}

	/**
	 * Returns the family relationship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the family relationship
	 * @return the family relationship
	 * @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFamilyRelationshipException, SystemException {
		FamilyRelationship familyRelationship = fetchByPrimaryKey(primaryKey);

		if (familyRelationship == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFamilyRelationshipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return familyRelationship;
	}

	/**
	 * Returns the family relationship with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException} if it could not be found.
	 *
	 * @param id the primary key of the family relationship
	 * @return the family relationship
	 * @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship findByPrimaryKey(long id)
		throws NoSuchFamilyRelationshipException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the family relationship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the family relationship
	 * @return the family relationship, or <code>null</code> if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FamilyRelationship familyRelationship = (FamilyRelationship)EntityCacheUtil.getResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
				FamilyRelationshipImpl.class, primaryKey);

		if (familyRelationship == _nullFamilyRelationship) {
			return null;
		}

		if (familyRelationship == null) {
			Session session = null;

			try {
				session = openSession();

				familyRelationship = (FamilyRelationship)session.get(FamilyRelationshipImpl.class,
						primaryKey);

				if (familyRelationship != null) {
					cacheResult(familyRelationship);
				}
				else {
					EntityCacheUtil.putResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
						FamilyRelationshipImpl.class, primaryKey,
						_nullFamilyRelationship);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FamilyRelationshipModelImpl.ENTITY_CACHE_ENABLED,
					FamilyRelationshipImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return familyRelationship;
	}

	/**
	 * Returns the family relationship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the family relationship
	 * @return the family relationship, or <code>null</code> if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the family relationships.
	 *
	 * @return the family relationships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelationship> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the family relationships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.FamilyRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of family relationships
	 * @param end the upper bound of the range of family relationships (not inclusive)
	 * @return the range of family relationships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelationship> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the family relationships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.FamilyRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of family relationships
	 * @param end the upper bound of the range of family relationships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of family relationships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelationship> findAll(int start, int end,
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

		List<FamilyRelationship> list = (List<FamilyRelationship>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAMILYRELATIONSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAMILYRELATIONSHIP;

				if (pagination) {
					sql = sql.concat(FamilyRelationshipModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FamilyRelationship>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FamilyRelationship>(list);
				}
				else {
					list = (List<FamilyRelationship>)QueryUtil.list(q,
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
	 * Removes all the family relationships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FamilyRelationship familyRelationship : findAll()) {
			remove(familyRelationship);
		}
	}

	/**
	 * Returns the number of family relationships.
	 *
	 * @return the number of family relationships
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

				Query q = session.createQuery(_SQL_COUNT_FAMILYRELATIONSHIP);

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
	 * Initializes the family relationship persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.FamilyRelationship")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FamilyRelationship>> listenersList = new ArrayList<ModelListener<FamilyRelationship>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FamilyRelationship>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FamilyRelationshipImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FAMILYRELATIONSHIP = "SELECT familyRelationship FROM FamilyRelationship familyRelationship";
	private static final String _SQL_SELECT_FAMILYRELATIONSHIP_WHERE = "SELECT familyRelationship FROM FamilyRelationship familyRelationship WHERE ";
	private static final String _SQL_COUNT_FAMILYRELATIONSHIP = "SELECT COUNT(familyRelationship) FROM FamilyRelationship familyRelationship";
	private static final String _SQL_COUNT_FAMILYRELATIONSHIP_WHERE = "SELECT COUNT(familyRelationship) FROM FamilyRelationship familyRelationship WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "familyRelationship.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FamilyRelationship exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FamilyRelationship exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FamilyRelationshipPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static FamilyRelationship _nullFamilyRelationship = new FamilyRelationshipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FamilyRelationship> toCacheModel() {
				return _nullFamilyRelationshipCacheModel;
			}
		};

	private static CacheModel<FamilyRelationship> _nullFamilyRelationshipCacheModel =
		new CacheModel<FamilyRelationship>() {
			@Override
			public FamilyRelationship toEntityModel() {
				return _nullFamilyRelationship;
			}
		};
}