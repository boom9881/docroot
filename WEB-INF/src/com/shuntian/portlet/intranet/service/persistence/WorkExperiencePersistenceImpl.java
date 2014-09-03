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

import com.shuntian.portlet.intranet.NoSuchWorkExperienceException;
import com.shuntian.portlet.intranet.model.WorkExperience;
import com.shuntian.portlet.intranet.model.impl.WorkExperienceImpl;
import com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the work experience service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperiencePersistence
 * @see WorkExperienceUtil
 * @generated
 */
public class WorkExperiencePersistenceImpl extends BasePersistenceImpl<WorkExperience>
	implements WorkExperiencePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WorkExperienceUtil} to access the work experience persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WorkExperienceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceModelImpl.FINDER_CACHE_ENABLED,
			WorkExperienceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceModelImpl.FINDER_CACHE_ENABLED,
			WorkExperienceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceModelImpl.FINDER_CACHE_ENABLED,
			WorkExperienceImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUserId", new String[] { Long.class.getName() },
			WorkExperienceModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the work experience where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchWorkExperienceException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching work experience
	 * @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a matching work experience could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience findByUserId(long userId)
		throws NoSuchWorkExperienceException, SystemException {
		WorkExperience workExperience = fetchByUserId(userId);

		if (workExperience == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchWorkExperienceException(msg.toString());
		}

		return workExperience;
	}

	/**
	 * Returns the work experience where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching work experience, or <code>null</code> if a matching work experience could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience fetchByUserId(long userId) throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the work experience where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching work experience, or <code>null</code> if a matching work experience could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof WorkExperience) {
			WorkExperience workExperience = (WorkExperience)result;

			if ((userId != workExperience.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_WORKEXPERIENCE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<WorkExperience> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"WorkExperiencePersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					WorkExperience workExperience = list.get(0);

					result = workExperience;

					cacheResult(workExperience);

					if ((workExperience.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, workExperience);
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
			return (WorkExperience)result;
		}
	}

	/**
	 * Removes the work experience where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the work experience that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience removeByUserId(long userId)
		throws NoSuchWorkExperienceException, SystemException {
		WorkExperience workExperience = findByUserId(userId);

		return remove(workExperience);
	}

	/**
	 * Returns the number of work experiences where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching work experiences
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

			query.append(_SQL_COUNT_WORKEXPERIENCE_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "workExperience.userId = ?";

	public WorkExperiencePersistenceImpl() {
		setModelClass(WorkExperience.class);
	}

	/**
	 * Caches the work experience in the entity cache if it is enabled.
	 *
	 * @param workExperience the work experience
	 */
	@Override
	public void cacheResult(WorkExperience workExperience) {
		EntityCacheUtil.putResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceImpl.class, workExperience.getPrimaryKey(),
			workExperience);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { workExperience.getUserId() }, workExperience);

		workExperience.resetOriginalValues();
	}

	/**
	 * Caches the work experiences in the entity cache if it is enabled.
	 *
	 * @param workExperiences the work experiences
	 */
	@Override
	public void cacheResult(List<WorkExperience> workExperiences) {
		for (WorkExperience workExperience : workExperiences) {
			if (EntityCacheUtil.getResult(
						WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
						WorkExperienceImpl.class, workExperience.getPrimaryKey()) == null) {
				cacheResult(workExperience);
			}
			else {
				workExperience.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all work experiences.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WorkExperienceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WorkExperienceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the work experience.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WorkExperience workExperience) {
		EntityCacheUtil.removeResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceImpl.class, workExperience.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(workExperience);
	}

	@Override
	public void clearCache(List<WorkExperience> workExperiences) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WorkExperience workExperience : workExperiences) {
			EntityCacheUtil.removeResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
				WorkExperienceImpl.class, workExperience.getPrimaryKey());

			clearUniqueFindersCache(workExperience);
		}
	}

	protected void cacheUniqueFindersCache(WorkExperience workExperience) {
		if (workExperience.isNew()) {
			Object[] args = new Object[] { workExperience.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				workExperience);
		}
		else {
			WorkExperienceModelImpl workExperienceModelImpl = (WorkExperienceModelImpl)workExperience;

			if ((workExperienceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { workExperience.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					workExperience);
			}
		}
	}

	protected void clearUniqueFindersCache(WorkExperience workExperience) {
		WorkExperienceModelImpl workExperienceModelImpl = (WorkExperienceModelImpl)workExperience;

		Object[] args = new Object[] { workExperience.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((workExperienceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { workExperienceModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new work experience with the primary key. Does not add the work experience to the database.
	 *
	 * @param id the primary key for the new work experience
	 * @return the new work experience
	 */
	@Override
	public WorkExperience create(long id) {
		WorkExperience workExperience = new WorkExperienceImpl();

		workExperience.setNew(true);
		workExperience.setPrimaryKey(id);

		return workExperience;
	}

	/**
	 * Removes the work experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the work experience
	 * @return the work experience that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience remove(long id)
		throws NoSuchWorkExperienceException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the work experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the work experience
	 * @return the work experience that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience remove(Serializable primaryKey)
		throws NoSuchWorkExperienceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WorkExperience workExperience = (WorkExperience)session.get(WorkExperienceImpl.class,
					primaryKey);

			if (workExperience == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWorkExperienceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(workExperience);
		}
		catch (NoSuchWorkExperienceException nsee) {
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
	protected WorkExperience removeImpl(WorkExperience workExperience)
		throws SystemException {
		workExperience = toUnwrappedModel(workExperience);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(workExperience)) {
				workExperience = (WorkExperience)session.get(WorkExperienceImpl.class,
						workExperience.getPrimaryKeyObj());
			}

			if (workExperience != null) {
				session.delete(workExperience);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (workExperience != null) {
			clearCache(workExperience);
		}

		return workExperience;
	}

	@Override
	public WorkExperience updateImpl(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience)
		throws SystemException {
		workExperience = toUnwrappedModel(workExperience);

		boolean isNew = workExperience.isNew();

		Session session = null;

		try {
			session = openSession();

			if (workExperience.isNew()) {
				session.save(workExperience);

				workExperience.setNew(false);
			}
			else {
				session.merge(workExperience);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WorkExperienceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
			WorkExperienceImpl.class, workExperience.getPrimaryKey(),
			workExperience);

		clearUniqueFindersCache(workExperience);
		cacheUniqueFindersCache(workExperience);

		return workExperience;
	}

	protected WorkExperience toUnwrappedModel(WorkExperience workExperience) {
		if (workExperience instanceof WorkExperienceImpl) {
			return workExperience;
		}

		WorkExperienceImpl workExperienceImpl = new WorkExperienceImpl();

		workExperienceImpl.setNew(workExperience.isNew());
		workExperienceImpl.setPrimaryKey(workExperience.getPrimaryKey());

		workExperienceImpl.setId(workExperience.getId());
		workExperienceImpl.setUserId(workExperience.getUserId());
		workExperienceImpl.setWitness(workExperience.getWitness());
		workExperienceImpl.setOnceJob(workExperience.getOnceJob());
		workExperienceImpl.setWorkUnit(workExperience.getWorkUnit());
		workExperienceImpl.setContactPhone(workExperience.getContactPhone());
		workExperienceImpl.setStartTime(workExperience.getStartTime());
		workExperienceImpl.setStopTime(workExperience.getStopTime());
		workExperienceImpl.setCreateUserId(workExperience.getCreateUserId());
		workExperienceImpl.setCreateDate(workExperience.getCreateDate());
		workExperienceImpl.setModifiedUserId(workExperience.getModifiedUserId());
		workExperienceImpl.setModifiedDate(workExperience.getModifiedDate());

		return workExperienceImpl;
	}

	/**
	 * Returns the work experience with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the work experience
	 * @return the work experience
	 * @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWorkExperienceException, SystemException {
		WorkExperience workExperience = fetchByPrimaryKey(primaryKey);

		if (workExperience == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWorkExperienceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return workExperience;
	}

	/**
	 * Returns the work experience with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchWorkExperienceException} if it could not be found.
	 *
	 * @param id the primary key of the work experience
	 * @return the work experience
	 * @throws com.shuntian.portlet.intranet.NoSuchWorkExperienceException if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience findByPrimaryKey(long id)
		throws NoSuchWorkExperienceException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the work experience with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the work experience
	 * @return the work experience, or <code>null</code> if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WorkExperience workExperience = (WorkExperience)EntityCacheUtil.getResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
				WorkExperienceImpl.class, primaryKey);

		if (workExperience == _nullWorkExperience) {
			return null;
		}

		if (workExperience == null) {
			Session session = null;

			try {
				session = openSession();

				workExperience = (WorkExperience)session.get(WorkExperienceImpl.class,
						primaryKey);

				if (workExperience != null) {
					cacheResult(workExperience);
				}
				else {
					EntityCacheUtil.putResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
						WorkExperienceImpl.class, primaryKey,
						_nullWorkExperience);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WorkExperienceModelImpl.ENTITY_CACHE_ENABLED,
					WorkExperienceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return workExperience;
	}

	/**
	 * Returns the work experience with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the work experience
	 * @return the work experience, or <code>null</code> if a work experience with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WorkExperience fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the work experiences.
	 *
	 * @return the work experiences
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkExperience> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the work experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of work experiences
	 * @param end the upper bound of the range of work experiences (not inclusive)
	 * @return the range of work experiences
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkExperience> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the work experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of work experiences
	 * @param end the upper bound of the range of work experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of work experiences
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WorkExperience> findAll(int start, int end,
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

		List<WorkExperience> list = (List<WorkExperience>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WORKEXPERIENCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WORKEXPERIENCE;

				if (pagination) {
					sql = sql.concat(WorkExperienceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WorkExperience>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WorkExperience>(list);
				}
				else {
					list = (List<WorkExperience>)QueryUtil.list(q,
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
	 * Removes all the work experiences from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WorkExperience workExperience : findAll()) {
			remove(workExperience);
		}
	}

	/**
	 * Returns the number of work experiences.
	 *
	 * @return the number of work experiences
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

				Query q = session.createQuery(_SQL_COUNT_WORKEXPERIENCE);

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
	 * Initializes the work experience persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.WorkExperience")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WorkExperience>> listenersList = new ArrayList<ModelListener<WorkExperience>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WorkExperience>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(WorkExperienceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_WORKEXPERIENCE = "SELECT workExperience FROM WorkExperience workExperience";
	private static final String _SQL_SELECT_WORKEXPERIENCE_WHERE = "SELECT workExperience FROM WorkExperience workExperience WHERE ";
	private static final String _SQL_COUNT_WORKEXPERIENCE = "SELECT COUNT(workExperience) FROM WorkExperience workExperience";
	private static final String _SQL_COUNT_WORKEXPERIENCE_WHERE = "SELECT COUNT(workExperience) FROM WorkExperience workExperience WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "workExperience.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WorkExperience exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WorkExperience exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WorkExperiencePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static WorkExperience _nullWorkExperience = new WorkExperienceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WorkExperience> toCacheModel() {
				return _nullWorkExperienceCacheModel;
			}
		};

	private static CacheModel<WorkExperience> _nullWorkExperienceCacheModel = new CacheModel<WorkExperience>() {
			@Override
			public WorkExperience toEntityModel() {
				return _nullWorkExperience;
			}
		};
}