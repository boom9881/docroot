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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.shuntian.portlet.intranet.model.FamilyRelationship;

import java.util.List;

/**
 * The persistence utility for the family relationship service. This utility wraps {@link FamilyRelationshipPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FamilyRelationshipPersistence
 * @see FamilyRelationshipPersistenceImpl
 * @generated
 */
public class FamilyRelationshipUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FamilyRelationship familyRelationship) {
		getPersistence().clearCache(familyRelationship);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FamilyRelationship> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FamilyRelationship> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FamilyRelationship> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FamilyRelationship update(
		FamilyRelationship familyRelationship) throws SystemException {
		return getPersistence().update(familyRelationship);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FamilyRelationship update(
		FamilyRelationship familyRelationship, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(familyRelationship, serviceContext);
	}

	/**
	* Caches the family relationship in the entity cache if it is enabled.
	*
	* @param familyRelationship the family relationship
	*/
	public static void cacheResult(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship) {
		getPersistence().cacheResult(familyRelationship);
	}

	/**
	* Caches the family relationships in the entity cache if it is enabled.
	*
	* @param familyRelationships the family relationships
	*/
	public static void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> familyRelationships) {
		getPersistence().cacheResult(familyRelationships);
	}

	/**
	* Creates a new family relationship with the primary key. Does not add the family relationship to the database.
	*
	* @param id the primary key for the new family relationship
	* @return the new family relationship
	*/
	public static com.shuntian.portlet.intranet.model.FamilyRelationship create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the family relationship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.FamilyRelationship remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException {
		return getPersistence().remove(id);
	}

	public static com.shuntian.portlet.intranet.model.FamilyRelationship updateImpl(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(familyRelationship);
	}

	/**
	* Returns the family relationship with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException} if it could not be found.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship
	* @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.FamilyRelationship findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the family relationship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship, or <code>null</code> if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.FamilyRelationship fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the family relationships.
	*
	* @return the family relationships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the family relationships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of family relationships.
	*
	* @return the number of family relationships
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FamilyRelationshipPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FamilyRelationshipPersistence)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					FamilyRelationshipPersistence.class.getName());

			ReferenceRegistry.registerReference(FamilyRelationshipUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FamilyRelationshipPersistence persistence) {
	}

	private static FamilyRelationshipPersistence _persistence;
}