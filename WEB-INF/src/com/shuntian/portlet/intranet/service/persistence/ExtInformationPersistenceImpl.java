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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.shuntian.portlet.intranet.NoSuchExtInformationException;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.impl.ExtInformationImpl;
import com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ext information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtInformationPersistence
 * @see ExtInformationUtil
 * @generated
 */
public class ExtInformationPersistenceImpl extends BasePersistenceImpl<ExtInformation>
	implements ExtInformationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExtInformationUtil} to access the ext information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExtInformationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationModelImpl.FINDER_CACHE_ENABLED,
			ExtInformationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationModelImpl.FINDER_CACHE_ENABLED,
			ExtInformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ExtInformationPersistenceImpl() {
		setModelClass(ExtInformation.class);
	}

	/**
	 * Caches the ext information in the entity cache if it is enabled.
	 *
	 * @param extInformation the ext information
	 */
	@Override
	public void cacheResult(ExtInformation extInformation) {
		EntityCacheUtil.putResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationImpl.class, extInformation.getPrimaryKey(),
			extInformation);

		extInformation.resetOriginalValues();
	}

	/**
	 * Caches the ext informations in the entity cache if it is enabled.
	 *
	 * @param extInformations the ext informations
	 */
	@Override
	public void cacheResult(List<ExtInformation> extInformations) {
		for (ExtInformation extInformation : extInformations) {
			if (EntityCacheUtil.getResult(
						ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
						ExtInformationImpl.class, extInformation.getPrimaryKey()) == null) {
				cacheResult(extInformation);
			}
			else {
				extInformation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ext informations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ExtInformationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ExtInformationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ext information.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExtInformation extInformation) {
		EntityCacheUtil.removeResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationImpl.class, extInformation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExtInformation> extInformations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExtInformation extInformation : extInformations) {
			EntityCacheUtil.removeResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
				ExtInformationImpl.class, extInformation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ext information with the primary key. Does not add the ext information to the database.
	 *
	 * @param id the primary key for the new ext information
	 * @return the new ext information
	 */
	@Override
	public ExtInformation create(long id) {
		ExtInformation extInformation = new ExtInformationImpl();

		extInformation.setNew(true);
		extInformation.setPrimaryKey(id);

		return extInformation;
	}

	/**
	 * Removes the ext information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ext information
	 * @return the ext information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchExtInformationException if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation remove(long id)
		throws NoSuchExtInformationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ext information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ext information
	 * @return the ext information that was removed
	 * @throws com.shuntian.portlet.intranet.NoSuchExtInformationException if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation remove(Serializable primaryKey)
		throws NoSuchExtInformationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ExtInformation extInformation = (ExtInformation)session.get(ExtInformationImpl.class,
					primaryKey);

			if (extInformation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExtInformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(extInformation);
		}
		catch (NoSuchExtInformationException nsee) {
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
	protected ExtInformation removeImpl(ExtInformation extInformation)
		throws SystemException {
		extInformation = toUnwrappedModel(extInformation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(extInformation)) {
				extInformation = (ExtInformation)session.get(ExtInformationImpl.class,
						extInformation.getPrimaryKeyObj());
			}

			if (extInformation != null) {
				session.delete(extInformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (extInformation != null) {
			clearCache(extInformation);
		}

		return extInformation;
	}

	@Override
	public ExtInformation updateImpl(
		com.shuntian.portlet.intranet.model.ExtInformation extInformation)
		throws SystemException {
		extInformation = toUnwrappedModel(extInformation);

		boolean isNew = extInformation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (extInformation.isNew()) {
				session.save(extInformation);

				extInformation.setNew(false);
			}
			else {
				session.merge(extInformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
			ExtInformationImpl.class, extInformation.getPrimaryKey(),
			extInformation);

		return extInformation;
	}

	protected ExtInformation toUnwrappedModel(ExtInformation extInformation) {
		if (extInformation instanceof ExtInformationImpl) {
			return extInformation;
		}

		ExtInformationImpl extInformationImpl = new ExtInformationImpl();

		extInformationImpl.setNew(extInformation.isNew());
		extInformationImpl.setPrimaryKey(extInformation.getPrimaryKey());

		extInformationImpl.setId(extInformation.getId());
		extInformationImpl.setUserId(extInformation.getUserId());
		extInformationImpl.setOpenCity(extInformation.getOpenCity());
		extInformationImpl.setBankName(extInformation.getBankName());
		extInformationImpl.setBankId(extInformation.getBankId());
		extInformationImpl.setLaborContractStart(extInformation.getLaborContractStart());
		extInformationImpl.setLaborContractEnd(extInformation.getLaborContractEnd());
		extInformationImpl.setProbationPeriodStart(extInformation.getProbationPeriodStart());
		extInformationImpl.setProbationPeriodEnd(extInformation.getProbationPeriodEnd());
		extInformationImpl.setInduredLocation(extInformation.getInduredLocation());
		extInformationImpl.setFristInsured(extInformation.getFristInsured());
		extInformationImpl.setIsInsured(extInformation.getIsInsured());
		extInformationImpl.setCreateUserId(extInformation.getCreateUserId());
		extInformationImpl.setCreateDate(extInformation.getCreateDate());
		extInformationImpl.setModifiedUserId(extInformation.getModifiedUserId());
		extInformationImpl.setModifiedDate(extInformation.getModifiedDate());

		return extInformationImpl;
	}

	/**
	 * Returns the ext information with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext information
	 * @return the ext information
	 * @throws com.shuntian.portlet.intranet.NoSuchExtInformationException if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExtInformationException, SystemException {
		ExtInformation extInformation = fetchByPrimaryKey(primaryKey);

		if (extInformation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExtInformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return extInformation;
	}

	/**
	 * Returns the ext information with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchExtInformationException} if it could not be found.
	 *
	 * @param id the primary key of the ext information
	 * @return the ext information
	 * @throws com.shuntian.portlet.intranet.NoSuchExtInformationException if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation findByPrimaryKey(long id)
		throws NoSuchExtInformationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ext information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ext information
	 * @return the ext information, or <code>null</code> if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ExtInformation extInformation = (ExtInformation)EntityCacheUtil.getResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
				ExtInformationImpl.class, primaryKey);

		if (extInformation == _nullExtInformation) {
			return null;
		}

		if (extInformation == null) {
			Session session = null;

			try {
				session = openSession();

				extInformation = (ExtInformation)session.get(ExtInformationImpl.class,
						primaryKey);

				if (extInformation != null) {
					cacheResult(extInformation);
				}
				else {
					EntityCacheUtil.putResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
						ExtInformationImpl.class, primaryKey,
						_nullExtInformation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ExtInformationModelImpl.ENTITY_CACHE_ENABLED,
					ExtInformationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return extInformation;
	}

	/**
	 * Returns the ext information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ext information
	 * @return the ext information, or <code>null</code> if a ext information with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExtInformation fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ext informations.
	 *
	 * @return the ext informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ExtInformation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ext informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext informations
	 * @param end the upper bound of the range of ext informations (not inclusive)
	 * @return the range of ext informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ExtInformation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ext informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.ExtInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ext informations
	 * @param end the upper bound of the range of ext informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ext informations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ExtInformation> findAll(int start, int end,
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

		List<ExtInformation> list = (List<ExtInformation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXTINFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTINFORMATION;

				if (pagination) {
					sql = sql.concat(ExtInformationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExtInformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ExtInformation>(list);
				}
				else {
					list = (List<ExtInformation>)QueryUtil.list(q,
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
	 * Removes all the ext informations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ExtInformation extInformation : findAll()) {
			remove(extInformation);
		}
	}

	/**
	 * Returns the number of ext informations.
	 *
	 * @return the number of ext informations
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

				Query q = session.createQuery(_SQL_COUNT_EXTINFORMATION);

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
	 * Initializes the ext information persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.shuntian.portlet.intranet.model.ExtInformation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ExtInformation>> listenersList = new ArrayList<ModelListener<ExtInformation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ExtInformation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ExtInformationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXTINFORMATION = "SELECT extInformation FROM ExtInformation extInformation";
	private static final String _SQL_COUNT_EXTINFORMATION = "SELECT COUNT(extInformation) FROM ExtInformation extInformation";
	private static final String _ORDER_BY_ENTITY_ALIAS = "extInformation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExtInformation exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ExtInformationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static ExtInformation _nullExtInformation = new ExtInformationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ExtInformation> toCacheModel() {
				return _nullExtInformationCacheModel;
			}
		};

	private static CacheModel<ExtInformation> _nullExtInformationCacheModel = new CacheModel<ExtInformation>() {
			@Override
			public ExtInformation toEntityModel() {
				return _nullExtInformation;
			}
		};
}