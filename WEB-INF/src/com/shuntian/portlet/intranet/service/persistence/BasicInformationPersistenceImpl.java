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

import com.shuntian.portlet.intranet.NoSuchBasicInformationException;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.impl.BasicInformationImpl;
import com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the basic information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformationPersistence
 * @see BasicInformationUtil
 * @generated
 */
public class BasicInformationPersistenceImpl extends BasePersistenceImpl<BasicInformation>
	implements BasicInformationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BasicInformationUtil} to access the basic information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BasicInformationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationModelImpl.FINDER_CACHE_ENABLED,
			BasicInformationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationModelImpl.FINDER_CACHE_ENABLED,
			BasicInformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationModelImpl.FINDER_CACHE_ENABLED,
			BasicInformationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUserId", new String[] { Long.class.getName() },
			BasicInformationModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the basic information where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchBasicInformationException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching basic information
	 * @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a matching basic information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation findByUserId(long userId)
		throws NoSuchBasicInformationException, SystemException {
		BasicInformation basicInformation = fetchByUserId(userId);

		if (basicInformation == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBasicInformationException(msg.toString());
		}

		return basicInformation;
	}

	/**
	 * Returns the basic information where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching basic information, or <code>null</code> if a matching basic information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation fetchByUserId(long userId)
		throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the basic information where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching basic information, or <code>null</code> if a matching basic information could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof BasicInformation) {
			BasicInformation basicInformation = (BasicInformation)result;

			if ((userId != basicInformation.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BASICINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<BasicInformation> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BasicInformationPersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BasicInformation basicInformation = list.get(0);

					result = basicInformation;

					cacheResult(basicInformation);

					if ((basicInformation.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, basicInformation);
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
			return (BasicInformation)result;
		}
	}

	/**
	 * Removes the basic information where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the basic information that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation removeByUserId(long userId)
		throws NoSuchBasicInformationException, SystemException {
		BasicInformation basicInformation = findByUserId(userId);

		return remove(basicInformation);
	}

	/**
	 * Returns the number of basic informations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching basic informations
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

			query.append(_SQL_COUNT_BASICINFORMATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "basicInformation.userId = ?";

	public BasicInformationPersistenceImpl() {
		setModelClass(BasicInformation.class);
	}

	/**
	 * Caches the basic information in the entity cache if it is enabled.
	 *
	 * @param basicInformation the basic information
	 */
	@Override
	public void cacheResult(BasicInformation basicInformation) {
		EntityCacheUtil.putResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationImpl.class, basicInformation.getPrimaryKey(),
			basicInformation);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { basicInformation.getUserId() }, basicInformation);

		basicInformation.resetOriginalValues();
	}

	/**
	 * Caches the basic informations in the entity cache if it is enabled.
	 *
	 * @param basicInformations the basic informations
	 */
	@Override
	public void cacheResult(List<BasicInformation> basicInformations) {
		for (BasicInformation basicInformation : basicInformations) {
			if (EntityCacheUtil.getResult(
						BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
						BasicInformationImpl.class,
						basicInformation.getPrimaryKey()) == null) {
				cacheResult(basicInformation);
			}
			else {
				basicInformation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all basic informations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BasicInformationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BasicInformationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the basic information.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BasicInformation basicInformation) {
		EntityCacheUtil.removeResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationImpl.class, basicInformation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(basicInformation);
	}

	@Override
	public void clearCache(List<BasicInformation> basicInformations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BasicInformation basicInformation : basicInformations) {
			EntityCacheUtil.removeResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
				BasicInformationImpl.class, basicInformation.getPrimaryKey());

			clearUniqueFindersCache(basicInformation);
		}
	}

	protected void cacheUniqueFindersCache(BasicInformation basicInformation) {
		if (basicInformation.isNew()) {
			Object[] args = new Object[] { basicInformation.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				basicInformation);
		}
		else {
			BasicInformationModelImpl basicInformationModelImpl = (BasicInformationModelImpl)basicInformation;

			if ((basicInformationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { basicInformation.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					basicInformation);
			}
		}
	}

	protected void clearUniqueFindersCache(BasicInformation basicInformation) {
		BasicInformationModelImpl basicInformationModelImpl = (BasicInformationModelImpl)basicInformation;

		Object[] args = new Object[] { basicInformation.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((basicInformationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { basicInformationModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new basic information with the primary key. Does not add the basic information to the database.
	 *
	 * @param id the primary key for the new basic information
	 * @return the new basic information
	 */
	@Override
	public BasicInformation create(long id) {
		BasicInformation basicInformation = new BasicInformationImpl();

		basicInformation.setNew(true);
		basicInformation.setPrimaryKey(id);

		return basicInformation;
	}

	/**
	 * Removes the basic information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the basic information
	 * @return the basic information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation remove(long id)
		throws NoSuchBasicInformationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the basic information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the basic information
	 * @return the basic information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation remove(Serializable primaryKey)
		throws NoSuchBasicInformationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BasicInformation basicInformation = (BasicInformation)session.get(BasicInformationImpl.class,
					primaryKey);

			if (basicInformation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBasicInformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(basicInformation);
		}
		catch (NoSuchBasicInformationException nsee) {
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
	protected BasicInformation removeImpl(BasicInformation basicInformation)
		throws SystemException {
		basicInformation = toUnwrappedModel(basicInformation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(basicInformation)) {
				basicInformation = (BasicInformation)session.get(BasicInformationImpl.class,
						basicInformation.getPrimaryKeyObj());
			}

			if (basicInformation != null) {
				session.delete(basicInformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (basicInformation != null) {
			clearCache(basicInformation);
		}

		return basicInformation;
	}

	@Override
	public BasicInformation updateImpl(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws SystemException {
		basicInformation = toUnwrappedModel(basicInformation);

		boolean isNew = basicInformation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (basicInformation.isNew()) {
				session.save(basicInformation);

				basicInformation.setNew(false);
			}
			else {
				session.merge(basicInformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BasicInformationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
			BasicInformationImpl.class, basicInformation.getPrimaryKey(),
			basicInformation);

		clearUniqueFindersCache(basicInformation);
		cacheUniqueFindersCache(basicInformation);

		return basicInformation;
	}

	protected BasicInformation toUnwrappedModel(
		BasicInformation basicInformation) {
		if (basicInformation instanceof BasicInformationImpl) {
			return basicInformation;
		}

		BasicInformationImpl basicInformationImpl = new BasicInformationImpl();

		basicInformationImpl.setNew(basicInformation.isNew());
		basicInformationImpl.setPrimaryKey(basicInformation.getPrimaryKey());

		basicInformationImpl.setId(basicInformation.getId());
		basicInformationImpl.setUserId(basicInformation.getUserId());
		basicInformationImpl.setName(basicInformation.getName());
		basicInformationImpl.setSex(basicInformation.getSex());
		basicInformationImpl.setIdNumber(basicInformation.getIdNumber());
		basicInformationImpl.setNation(basicInformation.getNation());
		basicInformationImpl.setPlaceOfOrigin(basicInformation.getPlaceOfOrigin());
		basicInformationImpl.setAccountProperties(basicInformation.getAccountProperties());
		basicInformationImpl.setBirthDate(basicInformation.getBirthDate());
		basicInformationImpl.setMaritalStatus(basicInformation.getMaritalStatus());
		basicInformationImpl.setHighestDegree(basicInformation.getHighestDegree());
		basicInformationImpl.setPoliticalBackground(basicInformation.getPoliticalBackground());
		basicInformationImpl.setFileLocation(basicInformation.getFileLocation());
		basicInformationImpl.setBasePay(basicInformation.getBasePay());
		basicInformationImpl.setPerformancePay(basicInformation.getPerformancePay());
		basicInformationImpl.setHealth(basicInformation.getHealth());
		basicInformationImpl.setContactPhone(basicInformation.getContactPhone());
		basicInformationImpl.setMail(basicInformation.getMail());
		basicInformationImpl.setDomicile(basicInformation.getDomicile());
		basicInformationImpl.setResidencePhone(basicInformation.getResidencePhone());
		basicInformationImpl.setCurrentResidentialAddress(basicInformation.getCurrentResidentialAddress());
		basicInformationImpl.setCurrentResidentialAddressPhone(basicInformation.getCurrentResidentialAddressPhone());
		basicInformationImpl.setEmergencyContact(basicInformation.getEmergencyContact());
		basicInformationImpl.setEmergencyContactRelation(basicInformation.getEmergencyContactRelation());
		basicInformationImpl.setEmergencyContactPhone(basicInformation.getEmergencyContactPhone());
		basicInformationImpl.setCreateUserId(basicInformation.getCreateUserId());
		basicInformationImpl.setCreateDate(basicInformation.getCreateDate());
		basicInformationImpl.setModifiedUserId(basicInformation.getModifiedUserId());
		basicInformationImpl.setModifiedDate(basicInformation.getModifiedDate());

		return basicInformationImpl;
	}

	/**
	 * Returns the basic information with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the basic information
	 * @return the basic information
	 * @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBasicInformationException, SystemException {
		BasicInformation basicInformation = fetchByPrimaryKey(primaryKey);

		if (basicInformation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBasicInformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return basicInformation;
	}

	/**
	 * Returns the basic information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchBasicInformationException} if it could not be found.
	 *
	 * @param id the primary key of the basic information
	 * @return the basic information
	 * @throws com.shuntian.portlet.intranet.NoSuchBasicInformationException if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation findByPrimaryKey(long id)
		throws NoSuchBasicInformationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the basic information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the basic information
	 * @return the basic information, or <code>null</code> if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BasicInformation basicInformation = (BasicInformation)EntityCacheUtil.getResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
				BasicInformationImpl.class, primaryKey);

		if (basicInformation == _nullBasicInformation) {
			return null;
		}

		if (basicInformation == null) {
			Session session = null;

			try {
				session = openSession();

				basicInformation = (BasicInformation)session.get(BasicInformationImpl.class,
						primaryKey);

				if (basicInformation != null) {
					cacheResult(basicInformation);
				}
				else {
					EntityCacheUtil.putResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
						BasicInformationImpl.class, primaryKey,
						_nullBasicInformation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BasicInformationModelImpl.ENTITY_CACHE_ENABLED,
					BasicInformationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return basicInformation;
	}

	/**
	 * Returns the basic information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the basic information
	 * @return the basic information, or <code>null</code> if a basic information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BasicInformation fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the basic informations.
	 *
	 * @return the basic informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BasicInformation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basic informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic informations
	 * @param end the upper bound of the range of basic informations (not inclusive)
	 * @return the range of basic informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BasicInformation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the basic informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic informations
	 * @param end the upper bound of the range of basic informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of basic informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BasicInformation> findAll(int start, int end,
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

		List<BasicInformation> list = (List<BasicInformation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BASICINFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BASICINFORMATION;

				if (pagination) {
					sql = sql.concat(BasicInformationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BasicInformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BasicInformation>(list);
				}
				else {
					list = (List<BasicInformation>)QueryUtil.list(q,
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
	 * Removes all the basic informations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BasicInformation basicInformation : findAll()) {
			remove(basicInformation);
		}
	}

	/**
	 * Returns the number of basic informations.
	 *
	 * @return the number of basic informations
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

				Query q = session.createQuery(_SQL_COUNT_BASICINFORMATION);

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
	 * Initializes the basic information persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.BasicInformation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BasicInformation>> listenersList = new ArrayList<ModelListener<BasicInformation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BasicInformation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BasicInformationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BASICINFORMATION = "SELECT basicInformation FROM BasicInformation basicInformation";
	private static final String _SQL_SELECT_BASICINFORMATION_WHERE = "SELECT basicInformation FROM BasicInformation basicInformation WHERE ";
	private static final String _SQL_COUNT_BASICINFORMATION = "SELECT COUNT(basicInformation) FROM BasicInformation basicInformation";
	private static final String _SQL_COUNT_BASICINFORMATION_WHERE = "SELECT COUNT(basicInformation) FROM BasicInformation basicInformation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "basicInformation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BasicInformation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BasicInformation exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BasicInformationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static BasicInformation _nullBasicInformation = new BasicInformationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BasicInformation> toCacheModel() {
				return _nullBasicInformationCacheModel;
			}
		};

	private static CacheModel<BasicInformation> _nullBasicInformationCacheModel = new CacheModel<BasicInformation>() {
			@Override
			public BasicInformation toEntityModel() {
				return _nullBasicInformation;
			}
		};
}