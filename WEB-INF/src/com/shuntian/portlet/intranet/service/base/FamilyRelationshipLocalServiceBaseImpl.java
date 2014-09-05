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

package com.shuntian.portlet.intranet.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.shuntian.portlet.intranet.model.FamilyRelationship;
import com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService;
import com.shuntian.portlet.intranet.service.persistence.BasicInformationPersistence;
import com.shuntian.portlet.intranet.service.persistence.DepartmentFinder;
import com.shuntian.portlet.intranet.service.persistence.DepartmentPersistence;
import com.shuntian.portlet.intranet.service.persistence.EducationPersistence;
import com.shuntian.portlet.intranet.service.persistence.ExtInformationPersistence;
import com.shuntian.portlet.intranet.service.persistence.FamilyRelationshipPersistence;
import com.shuntian.portlet.intranet.service.persistence.WorkExperiencePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the family relationship local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.shuntian.portlet.intranet.service.impl.FamilyRelationshipLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.impl.FamilyRelationshipLocalServiceImpl
 * @see com.shuntian.portlet.intranet.service.FamilyRelationshipLocalServiceUtil
 * @generated
 */
public abstract class FamilyRelationshipLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements FamilyRelationshipLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.shuntian.portlet.intranet.service.FamilyRelationshipLocalServiceUtil} to access the family relationship local service.
	 */

	/**
	 * Adds the family relationship to the database. Also notifies the appropriate model listeners.
	 *
	 * @param familyRelationship the family relationship
	 * @return the family relationship that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FamilyRelationship addFamilyRelationship(
		FamilyRelationship familyRelationship) throws SystemException {
		familyRelationship.setNew(true);

		return familyRelationshipPersistence.update(familyRelationship);
	}

	/**
	 * Creates a new family relationship with the primary key. Does not add the family relationship to the database.
	 *
	 * @param id the primary key for the new family relationship
	 * @return the new family relationship
	 */
	@Override
	public FamilyRelationship createFamilyRelationship(long id) {
		return familyRelationshipPersistence.create(id);
	}

	/**
	 * Deletes the family relationship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the family relationship
	 * @return the family relationship that was removed
	 * @throws PortalException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FamilyRelationship deleteFamilyRelationship(long id)
		throws PortalException, SystemException {
		return familyRelationshipPersistence.remove(id);
	}

	/**
	 * Deletes the family relationship from the database. Also notifies the appropriate model listeners.
	 *
	 * @param familyRelationship the family relationship
	 * @return the family relationship that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FamilyRelationship deleteFamilyRelationship(
		FamilyRelationship familyRelationship) throws SystemException {
		return familyRelationshipPersistence.remove(familyRelationship);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(FamilyRelationship.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return familyRelationshipPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.FamilyRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return familyRelationshipPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.FamilyRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return familyRelationshipPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return familyRelationshipPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return familyRelationshipPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public FamilyRelationship fetchFamilyRelationship(long id)
		throws SystemException {
		return familyRelationshipPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the family relationship with the primary key.
	 *
	 * @param id the primary key of the family relationship
	 * @return the family relationship
	 * @throws PortalException if a family relationship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelationship getFamilyRelationship(long id)
		throws PortalException, SystemException {
		return familyRelationshipPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return familyRelationshipPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<FamilyRelationship> getFamilyRelationships(int start, int end)
		throws SystemException {
		return familyRelationshipPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of family relationships.
	 *
	 * @return the number of family relationships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getFamilyRelationshipsCount() throws SystemException {
		return familyRelationshipPersistence.countAll();
	}

	/**
	 * Updates the family relationship in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param familyRelationship the family relationship
	 * @return the family relationship that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FamilyRelationship updateFamilyRelationship(
		FamilyRelationship familyRelationship) throws SystemException {
		return familyRelationshipPersistence.update(familyRelationship);
	}

	/**
	 * Returns the basic information local service.
	 *
	 * @return the basic information local service
	 */
	public com.shuntian.portlet.intranet.service.BasicInformationLocalService getBasicInformationLocalService() {
		return basicInformationLocalService;
	}

	/**
	 * Sets the basic information local service.
	 *
	 * @param basicInformationLocalService the basic information local service
	 */
	public void setBasicInformationLocalService(
		com.shuntian.portlet.intranet.service.BasicInformationLocalService basicInformationLocalService) {
		this.basicInformationLocalService = basicInformationLocalService;
	}

	/**
	 * Returns the basic information persistence.
	 *
	 * @return the basic information persistence
	 */
	public BasicInformationPersistence getBasicInformationPersistence() {
		return basicInformationPersistence;
	}

	/**
	 * Sets the basic information persistence.
	 *
	 * @param basicInformationPersistence the basic information persistence
	 */
	public void setBasicInformationPersistence(
		BasicInformationPersistence basicInformationPersistence) {
		this.basicInformationPersistence = basicInformationPersistence;
	}

	/**
	 * Returns the department local service.
	 *
	 * @return the department local service
	 */
	public com.shuntian.portlet.intranet.service.DepartmentLocalService getDepartmentLocalService() {
		return departmentLocalService;
	}

	/**
	 * Sets the department local service.
	 *
	 * @param departmentLocalService the department local service
	 */
	public void setDepartmentLocalService(
		com.shuntian.portlet.intranet.service.DepartmentLocalService departmentLocalService) {
		this.departmentLocalService = departmentLocalService;
	}

	/**
	 * Returns the department persistence.
	 *
	 * @return the department persistence
	 */
	public DepartmentPersistence getDepartmentPersistence() {
		return departmentPersistence;
	}

	/**
	 * Sets the department persistence.
	 *
	 * @param departmentPersistence the department persistence
	 */
	public void setDepartmentPersistence(
		DepartmentPersistence departmentPersistence) {
		this.departmentPersistence = departmentPersistence;
	}

	/**
	 * Returns the department finder.
	 *
	 * @return the department finder
	 */
	public DepartmentFinder getDepartmentFinder() {
		return departmentFinder;
	}

	/**
	 * Sets the department finder.
	 *
	 * @param departmentFinder the department finder
	 */
	public void setDepartmentFinder(DepartmentFinder departmentFinder) {
		this.departmentFinder = departmentFinder;
	}

	/**
	 * Returns the education local service.
	 *
	 * @return the education local service
	 */
	public com.shuntian.portlet.intranet.service.EducationLocalService getEducationLocalService() {
		return educationLocalService;
	}

	/**
	 * Sets the education local service.
	 *
	 * @param educationLocalService the education local service
	 */
	public void setEducationLocalService(
		com.shuntian.portlet.intranet.service.EducationLocalService educationLocalService) {
		this.educationLocalService = educationLocalService;
	}

	/**
	 * Returns the education persistence.
	 *
	 * @return the education persistence
	 */
	public EducationPersistence getEducationPersistence() {
		return educationPersistence;
	}

	/**
	 * Sets the education persistence.
	 *
	 * @param educationPersistence the education persistence
	 */
	public void setEducationPersistence(
		EducationPersistence educationPersistence) {
		this.educationPersistence = educationPersistence;
	}

	/**
	 * Returns the ext information local service.
	 *
	 * @return the ext information local service
	 */
	public com.shuntian.portlet.intranet.service.ExtInformationLocalService getExtInformationLocalService() {
		return extInformationLocalService;
	}

	/**
	 * Sets the ext information local service.
	 *
	 * @param extInformationLocalService the ext information local service
	 */
	public void setExtInformationLocalService(
		com.shuntian.portlet.intranet.service.ExtInformationLocalService extInformationLocalService) {
		this.extInformationLocalService = extInformationLocalService;
	}

	/**
	 * Returns the ext information persistence.
	 *
	 * @return the ext information persistence
	 */
	public ExtInformationPersistence getExtInformationPersistence() {
		return extInformationPersistence;
	}

	/**
	 * Sets the ext information persistence.
	 *
	 * @param extInformationPersistence the ext information persistence
	 */
	public void setExtInformationPersistence(
		ExtInformationPersistence extInformationPersistence) {
		this.extInformationPersistence = extInformationPersistence;
	}

	/**
	 * Returns the family relationship local service.
	 *
	 * @return the family relationship local service
	 */
	public com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService getFamilyRelationshipLocalService() {
		return familyRelationshipLocalService;
	}

	/**
	 * Sets the family relationship local service.
	 *
	 * @param familyRelationshipLocalService the family relationship local service
	 */
	public void setFamilyRelationshipLocalService(
		com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService familyRelationshipLocalService) {
		this.familyRelationshipLocalService = familyRelationshipLocalService;
	}

	/**
	 * Returns the family relationship persistence.
	 *
	 * @return the family relationship persistence
	 */
	public FamilyRelationshipPersistence getFamilyRelationshipPersistence() {
		return familyRelationshipPersistence;
	}

	/**
	 * Sets the family relationship persistence.
	 *
	 * @param familyRelationshipPersistence the family relationship persistence
	 */
	public void setFamilyRelationshipPersistence(
		FamilyRelationshipPersistence familyRelationshipPersistence) {
		this.familyRelationshipPersistence = familyRelationshipPersistence;
	}

	/**
	 * Returns the work experience local service.
	 *
	 * @return the work experience local service
	 */
	public com.shuntian.portlet.intranet.service.WorkExperienceLocalService getWorkExperienceLocalService() {
		return workExperienceLocalService;
	}

	/**
	 * Sets the work experience local service.
	 *
	 * @param workExperienceLocalService the work experience local service
	 */
	public void setWorkExperienceLocalService(
		com.shuntian.portlet.intranet.service.WorkExperienceLocalService workExperienceLocalService) {
		this.workExperienceLocalService = workExperienceLocalService;
	}

	/**
	 * Returns the work experience persistence.
	 *
	 * @return the work experience persistence
	 */
	public WorkExperiencePersistence getWorkExperiencePersistence() {
		return workExperiencePersistence;
	}

	/**
	 * Sets the work experience persistence.
	 *
	 * @param workExperiencePersistence the work experience persistence
	 */
	public void setWorkExperiencePersistence(
		WorkExperiencePersistence workExperiencePersistence) {
		this.workExperiencePersistence = workExperiencePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.shuntian.portlet.intranet.model.FamilyRelationship",
			familyRelationshipLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.shuntian.portlet.intranet.model.FamilyRelationship");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return FamilyRelationship.class;
	}

	protected String getModelClassName() {
		return FamilyRelationship.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = familyRelationshipPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.shuntian.portlet.intranet.service.BasicInformationLocalService.class)
	protected com.shuntian.portlet.intranet.service.BasicInformationLocalService basicInformationLocalService;
	@BeanReference(type = BasicInformationPersistence.class)
	protected BasicInformationPersistence basicInformationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.DepartmentLocalService.class)
	protected com.shuntian.portlet.intranet.service.DepartmentLocalService departmentLocalService;
	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	@BeanReference(type = DepartmentFinder.class)
	protected DepartmentFinder departmentFinder;
	@BeanReference(type = com.shuntian.portlet.intranet.service.EducationLocalService.class)
	protected com.shuntian.portlet.intranet.service.EducationLocalService educationLocalService;
	@BeanReference(type = EducationPersistence.class)
	protected EducationPersistence educationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.ExtInformationLocalService.class)
	protected com.shuntian.portlet.intranet.service.ExtInformationLocalService extInformationLocalService;
	@BeanReference(type = ExtInformationPersistence.class)
	protected ExtInformationPersistence extInformationPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService.class)
	protected com.shuntian.portlet.intranet.service.FamilyRelationshipLocalService familyRelationshipLocalService;
	@BeanReference(type = FamilyRelationshipPersistence.class)
	protected FamilyRelationshipPersistence familyRelationshipPersistence;
	@BeanReference(type = com.shuntian.portlet.intranet.service.WorkExperienceLocalService.class)
	protected com.shuntian.portlet.intranet.service.WorkExperienceLocalService workExperienceLocalService;
	@BeanReference(type = WorkExperiencePersistence.class)
	protected WorkExperiencePersistence workExperiencePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private FamilyRelationshipLocalServiceClpInvoker _clpInvoker = new FamilyRelationshipLocalServiceClpInvoker();
}