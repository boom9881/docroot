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

import com.liferay.portal.service.persistence.BasePersistence;

import com.shuntian.portlet.intranet.model.FamilyRelationship;

/**
 * The persistence interface for the family relationship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FamilyRelationshipPersistenceImpl
 * @see FamilyRelationshipUtil
 * @generated
 */
public interface FamilyRelationshipPersistence extends BasePersistence<FamilyRelationship> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FamilyRelationshipUtil} to access the family relationship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the family relationship where userId = &#63; or throws a {@link com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching family relationship
	* @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a matching family relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;

	/**
	* Returns the family relationship where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching family relationship, or <code>null</code> if a matching family relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship fetchByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the family relationship where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching family relationship, or <code>null</code> if a matching family relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship fetchByUserId(
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the family relationship where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the family relationship that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship removeByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;

	/**
	* Returns the number of family relationships where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching family relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the family relationship in the entity cache if it is enabled.
	*
	* @param familyRelationship the family relationship
	*/
	public void cacheResult(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship);

	/**
	* Caches the family relationships in the entity cache if it is enabled.
	*
	* @param familyRelationships the family relationships
	*/
	public void cacheResult(
		java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> familyRelationships);

	/**
	* Creates a new family relationship with the primary key. Does not add the family relationship to the database.
	*
	* @param id the primary key for the new family relationship
	* @return the new family relationship
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship create(
		long id);

	/**
	* Removes the family relationship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship that was removed
	* @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;

	public com.shuntian.portlet.intranet.model.FamilyRelationship updateImpl(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the family relationship with the primary key or throws a {@link com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException} if it could not be found.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship
	* @throws com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException;

	/**
	* Returns the family relationship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the family relationship
	* @return the family relationship, or <code>null</code> if a family relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.shuntian.portlet.intranet.model.FamilyRelationship fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the family relationships.
	*
	* @return the family relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the family relationships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of family relationships.
	*
	* @return the number of family relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}