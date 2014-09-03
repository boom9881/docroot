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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link family}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see family
 * @generated
 */
public class familyWrapper implements family, ModelWrapper<family> {
	public familyWrapper(family family) {
		_family = family;
	}

	@Override
	public Class<?> getModelClass() {
		return family.class;
	}

	@Override
	public String getModelClassName() {
		return family.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("familyId", getFamilyId());
		attributes.put("satffId", getSatffId());
		attributes.put("name", getName());
		attributes.put("relationship", getRelationship());
		attributes.put("work_unit", getWork_unit());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("once_job", getOnce_job());
		attributes.put("companyId", getCompanyId());
		attributes.put("createuser", getCreateuser());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifieduser", getModifieduser());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long familyId = (Long)attributes.get("familyId");

		if (familyId != null) {
			setFamilyId(familyId);
		}

		Long satffId = (Long)attributes.get("satffId");

		if (satffId != null) {
			setSatffId(satffId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		String work_unit = (String)attributes.get("work_unit");

		if (work_unit != null) {
			setWork_unit(work_unit);
		}

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		String once_job = (String)attributes.get("once_job");

		if (once_job != null) {
			setOnce_job(once_job);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createuser = (Long)attributes.get("createuser");

		if (createuser != null) {
			setCreateuser(createuser);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifieduser = (Long)attributes.get("modifieduser");

		if (modifieduser != null) {
			setModifieduser(modifieduser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this family.
	*
	* @return the primary key of this family
	*/
	@Override
	public long getPrimaryKey() {
		return _family.getPrimaryKey();
	}

	/**
	* Sets the primary key of this family.
	*
	* @param primaryKey the primary key of this family
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_family.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this family.
	*
	* @return the uuid of this family
	*/
	@Override
	public java.lang.String getUuid() {
		return _family.getUuid();
	}

	/**
	* Sets the uuid of this family.
	*
	* @param uuid the uuid of this family
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_family.setUuid(uuid);
	}

	/**
	* Returns the family ID of this family.
	*
	* @return the family ID of this family
	*/
	@Override
	public long getFamilyId() {
		return _family.getFamilyId();
	}

	/**
	* Sets the family ID of this family.
	*
	* @param familyId the family ID of this family
	*/
	@Override
	public void setFamilyId(long familyId) {
		_family.setFamilyId(familyId);
	}

	/**
	* Returns the satff ID of this family.
	*
	* @return the satff ID of this family
	*/
	@Override
	public long getSatffId() {
		return _family.getSatffId();
	}

	/**
	* Sets the satff ID of this family.
	*
	* @param satffId the satff ID of this family
	*/
	@Override
	public void setSatffId(long satffId) {
		_family.setSatffId(satffId);
	}

	/**
	* Returns the name of this family.
	*
	* @return the name of this family
	*/
	@Override
	public java.lang.String getName() {
		return _family.getName();
	}

	/**
	* Sets the name of this family.
	*
	* @param name the name of this family
	*/
	@Override
	public void setName(java.lang.String name) {
		_family.setName(name);
	}

	/**
	* Returns the relationship of this family.
	*
	* @return the relationship of this family
	*/
	@Override
	public java.lang.String getRelationship() {
		return _family.getRelationship();
	}

	/**
	* Sets the relationship of this family.
	*
	* @param relationship the relationship of this family
	*/
	@Override
	public void setRelationship(java.lang.String relationship) {
		_family.setRelationship(relationship);
	}

	/**
	* Returns the work_unit of this family.
	*
	* @return the work_unit of this family
	*/
	@Override
	public java.lang.String getWork_unit() {
		return _family.getWork_unit();
	}

	/**
	* Sets the work_unit of this family.
	*
	* @param work_unit the work_unit of this family
	*/
	@Override
	public void setWork_unit(java.lang.String work_unit) {
		_family.setWork_unit(work_unit);
	}

	/**
	* Returns the contact_phone of this family.
	*
	* @return the contact_phone of this family
	*/
	@Override
	public java.lang.String getContact_phone() {
		return _family.getContact_phone();
	}

	/**
	* Sets the contact_phone of this family.
	*
	* @param contact_phone the contact_phone of this family
	*/
	@Override
	public void setContact_phone(java.lang.String contact_phone) {
		_family.setContact_phone(contact_phone);
	}

	/**
	* Returns the once_job of this family.
	*
	* @return the once_job of this family
	*/
	@Override
	public java.lang.String getOnce_job() {
		return _family.getOnce_job();
	}

	/**
	* Sets the once_job of this family.
	*
	* @param once_job the once_job of this family
	*/
	@Override
	public void setOnce_job(java.lang.String once_job) {
		_family.setOnce_job(once_job);
	}

	/**
	* Returns the company ID of this family.
	*
	* @return the company ID of this family
	*/
	@Override
	public long getCompanyId() {
		return _family.getCompanyId();
	}

	/**
	* Sets the company ID of this family.
	*
	* @param companyId the company ID of this family
	*/
	@Override
	public void setCompanyId(long companyId) {
		_family.setCompanyId(companyId);
	}

	/**
	* Returns the createuser of this family.
	*
	* @return the createuser of this family
	*/
	@Override
	public long getCreateuser() {
		return _family.getCreateuser();
	}

	/**
	* Sets the createuser of this family.
	*
	* @param createuser the createuser of this family
	*/
	@Override
	public void setCreateuser(long createuser) {
		_family.setCreateuser(createuser);
	}

	/**
	* Returns the create date of this family.
	*
	* @return the create date of this family
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _family.getCreateDate();
	}

	/**
	* Sets the create date of this family.
	*
	* @param createDate the create date of this family
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_family.setCreateDate(createDate);
	}

	/**
	* Returns the modifieduser of this family.
	*
	* @return the modifieduser of this family
	*/
	@Override
	public long getModifieduser() {
		return _family.getModifieduser();
	}

	/**
	* Sets the modifieduser of this family.
	*
	* @param modifieduser the modifieduser of this family
	*/
	@Override
	public void setModifieduser(long modifieduser) {
		_family.setModifieduser(modifieduser);
	}

	/**
	* Returns the modified date of this family.
	*
	* @return the modified date of this family
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _family.getModifiedDate();
	}

	/**
	* Sets the modified date of this family.
	*
	* @param modifiedDate the modified date of this family
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_family.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this family.
	*
	* @return the status of this family
	*/
	@Override
	public int getStatus() {
		return _family.getStatus();
	}

	/**
	* Returns the trash entry created when this family was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this family.
	*
	* @return the trash entry created when this family was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _family.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this family.
	*
	* @return the class primary key of the trash entry for this family
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _family.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this family.
	*
	* @return the trash handler for this family
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _family.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this family is in the Recycle Bin.
	*
	* @return <code>true</code> if this family is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _family.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this family is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this family is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _family.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _family.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_family.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _family.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_family.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _family.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _family.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_family.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _family.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_family.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_family.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_family.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new familyWrapper((family)_family.clone());
	}

	@Override
	public int compareTo(family family) {
		return _family.compareTo(family);
	}

	@Override
	public int hashCode() {
		return _family.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<family> toCacheModel() {
		return _family.toCacheModel();
	}

	@Override
	public family toEscapedModel() {
		return new familyWrapper(_family.toEscapedModel());
	}

	@Override
	public family toUnescapedModel() {
		return new familyWrapper(_family.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _family.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _family.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_family.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof familyWrapper)) {
			return false;
		}

		familyWrapper familyWrapper = (familyWrapper)obj;

		if (Validator.equals(_family, familyWrapper._family)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _family.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public family getWrappedfamily() {
		return _family;
	}

	@Override
	public family getWrappedModel() {
		return _family;
	}

	@Override
	public void resetOriginalValues() {
		_family.resetOriginalValues();
	}

	private family _family;
}