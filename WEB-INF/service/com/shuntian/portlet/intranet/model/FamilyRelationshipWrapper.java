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

package com.shuntian.portlet.intranet.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FamilyRelationship}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FamilyRelationship
 * @generated
 */
public class FamilyRelationshipWrapper implements FamilyRelationship,
	ModelWrapper<FamilyRelationship> {
	public FamilyRelationshipWrapper(FamilyRelationship familyRelationship) {
		_familyRelationship = familyRelationship;
	}

	@Override
	public Class<?> getModelClass() {
		return FamilyRelationship.class;
	}

	@Override
	public String getModelClassName() {
		return FamilyRelationship.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("relationship", getRelationship());
		attributes.put("workUnit", getWorkUnit());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("onceJob", getOnceJob());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		String workUnit = (String)attributes.get("workUnit");

		if (workUnit != null) {
			setWorkUnit(workUnit);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String onceJob = (String)attributes.get("onceJob");

		if (onceJob != null) {
			setOnceJob(onceJob);
		}
	}

	/**
	* Returns the primary key of this family relationship.
	*
	* @return the primary key of this family relationship
	*/
	@Override
	public long getPrimaryKey() {
		return _familyRelationship.getPrimaryKey();
	}

	/**
	* Sets the primary key of this family relationship.
	*
	* @param primaryKey the primary key of this family relationship
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_familyRelationship.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this family relationship.
	*
	* @return the ID of this family relationship
	*/
	@Override
	public long getId() {
		return _familyRelationship.getId();
	}

	/**
	* Sets the ID of this family relationship.
	*
	* @param id the ID of this family relationship
	*/
	@Override
	public void setId(long id) {
		_familyRelationship.setId(id);
	}

	/**
	* Returns the user ID of this family relationship.
	*
	* @return the user ID of this family relationship
	*/
	@Override
	public long getUserId() {
		return _familyRelationship.getUserId();
	}

	/**
	* Sets the user ID of this family relationship.
	*
	* @param userId the user ID of this family relationship
	*/
	@Override
	public void setUserId(long userId) {
		_familyRelationship.setUserId(userId);
	}

	/**
	* Returns the user uuid of this family relationship.
	*
	* @return the user uuid of this family relationship
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationship.getUserUuid();
	}

	/**
	* Sets the user uuid of this family relationship.
	*
	* @param userUuid the user uuid of this family relationship
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_familyRelationship.setUserUuid(userUuid);
	}

	/**
	* Returns the name of this family relationship.
	*
	* @return the name of this family relationship
	*/
	@Override
	public java.lang.String getName() {
		return _familyRelationship.getName();
	}

	/**
	* Sets the name of this family relationship.
	*
	* @param name the name of this family relationship
	*/
	@Override
	public void setName(java.lang.String name) {
		_familyRelationship.setName(name);
	}

	/**
	* Returns the relationship of this family relationship.
	*
	* @return the relationship of this family relationship
	*/
	@Override
	public java.lang.String getRelationship() {
		return _familyRelationship.getRelationship();
	}

	/**
	* Sets the relationship of this family relationship.
	*
	* @param relationship the relationship of this family relationship
	*/
	@Override
	public void setRelationship(java.lang.String relationship) {
		_familyRelationship.setRelationship(relationship);
	}

	/**
	* Returns the work unit of this family relationship.
	*
	* @return the work unit of this family relationship
	*/
	@Override
	public java.lang.String getWorkUnit() {
		return _familyRelationship.getWorkUnit();
	}

	/**
	* Sets the work unit of this family relationship.
	*
	* @param workUnit the work unit of this family relationship
	*/
	@Override
	public void setWorkUnit(java.lang.String workUnit) {
		_familyRelationship.setWorkUnit(workUnit);
	}

	/**
	* Returns the contact phone of this family relationship.
	*
	* @return the contact phone of this family relationship
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _familyRelationship.getContactPhone();
	}

	/**
	* Sets the contact phone of this family relationship.
	*
	* @param contactPhone the contact phone of this family relationship
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_familyRelationship.setContactPhone(contactPhone);
	}

	/**
	* Returns the once job of this family relationship.
	*
	* @return the once job of this family relationship
	*/
	@Override
	public java.lang.String getOnceJob() {
		return _familyRelationship.getOnceJob();
	}

	/**
	* Sets the once job of this family relationship.
	*
	* @param onceJob the once job of this family relationship
	*/
	@Override
	public void setOnceJob(java.lang.String onceJob) {
		_familyRelationship.setOnceJob(onceJob);
	}

	@Override
	public boolean isNew() {
		return _familyRelationship.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_familyRelationship.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _familyRelationship.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_familyRelationship.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _familyRelationship.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _familyRelationship.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_familyRelationship.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _familyRelationship.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_familyRelationship.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_familyRelationship.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_familyRelationship.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FamilyRelationshipWrapper((FamilyRelationship)_familyRelationship.clone());
	}

	@Override
	public int compareTo(
		com.shuntian.portlet.intranet.model.FamilyRelationship familyRelationship) {
		return _familyRelationship.compareTo(familyRelationship);
	}

	@Override
	public int hashCode() {
		return _familyRelationship.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.FamilyRelationship> toCacheModel() {
		return _familyRelationship.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.FamilyRelationship toEscapedModel() {
		return new FamilyRelationshipWrapper(_familyRelationship.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.FamilyRelationship toUnescapedModel() {
		return new FamilyRelationshipWrapper(_familyRelationship.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _familyRelationship.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _familyRelationship.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_familyRelationship.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FamilyRelationshipWrapper)) {
			return false;
		}

		FamilyRelationshipWrapper familyRelationshipWrapper = (FamilyRelationshipWrapper)obj;

		if (Validator.equals(_familyRelationship,
					familyRelationshipWrapper._familyRelationship)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FamilyRelationship getWrappedFamilyRelationship() {
		return _familyRelationship;
	}

	@Override
	public FamilyRelationship getWrappedModel() {
		return _familyRelationship;
	}

	@Override
	public void resetOriginalValues() {
		_familyRelationship.resetOriginalValues();
	}

	private FamilyRelationship _familyRelationship;
}