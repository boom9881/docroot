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
 * This class is a wrapper for {@link education}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see education
 * @generated
 */
public class educationWrapper implements education, ModelWrapper<education> {
	public educationWrapper(education education) {
		_education = education;
	}

	@Override
	public Class<?> getModelClass() {
		return education.class;
	}

	@Override
	public String getModelClassName() {
		return education.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("educationId", getEducationId());
		attributes.put("satffId", getSatffId());
		attributes.put("witness", getWitness());
		attributes.put("professional", getProfessional());
		attributes.put("university", getUniversity());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("start_stop_time", getStart_stop_time());
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

		Long educationId = (Long)attributes.get("educationId");

		if (educationId != null) {
			setEducationId(educationId);
		}

		Long satffId = (Long)attributes.get("satffId");

		if (satffId != null) {
			setSatffId(satffId);
		}

		String witness = (String)attributes.get("witness");

		if (witness != null) {
			setWitness(witness);
		}

		String professional = (String)attributes.get("professional");

		if (professional != null) {
			setProfessional(professional);
		}

		String university = (String)attributes.get("university");

		if (university != null) {
			setUniversity(university);
		}

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		Date start_stop_time = (Date)attributes.get("start_stop_time");

		if (start_stop_time != null) {
			setStart_stop_time(start_stop_time);
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
	* Returns the primary key of this education.
	*
	* @return the primary key of this education
	*/
	@Override
	public long getPrimaryKey() {
		return _education.getPrimaryKey();
	}

	/**
	* Sets the primary key of this education.
	*
	* @param primaryKey the primary key of this education
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_education.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this education.
	*
	* @return the uuid of this education
	*/
	@Override
	public java.lang.String getUuid() {
		return _education.getUuid();
	}

	/**
	* Sets the uuid of this education.
	*
	* @param uuid the uuid of this education
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_education.setUuid(uuid);
	}

	/**
	* Returns the education ID of this education.
	*
	* @return the education ID of this education
	*/
	@Override
	public long getEducationId() {
		return _education.getEducationId();
	}

	/**
	* Sets the education ID of this education.
	*
	* @param educationId the education ID of this education
	*/
	@Override
	public void setEducationId(long educationId) {
		_education.setEducationId(educationId);
	}

	/**
	* Returns the satff ID of this education.
	*
	* @return the satff ID of this education
	*/
	@Override
	public long getSatffId() {
		return _education.getSatffId();
	}

	/**
	* Sets the satff ID of this education.
	*
	* @param satffId the satff ID of this education
	*/
	@Override
	public void setSatffId(long satffId) {
		_education.setSatffId(satffId);
	}

	/**
	* Returns the witness of this education.
	*
	* @return the witness of this education
	*/
	@Override
	public java.lang.String getWitness() {
		return _education.getWitness();
	}

	/**
	* Sets the witness of this education.
	*
	* @param witness the witness of this education
	*/
	@Override
	public void setWitness(java.lang.String witness) {
		_education.setWitness(witness);
	}

	/**
	* Returns the professional of this education.
	*
	* @return the professional of this education
	*/
	@Override
	public java.lang.String getProfessional() {
		return _education.getProfessional();
	}

	/**
	* Sets the professional of this education.
	*
	* @param professional the professional of this education
	*/
	@Override
	public void setProfessional(java.lang.String professional) {
		_education.setProfessional(professional);
	}

	/**
	* Returns the university of this education.
	*
	* @return the university of this education
	*/
	@Override
	public java.lang.String getUniversity() {
		return _education.getUniversity();
	}

	/**
	* Sets the university of this education.
	*
	* @param university the university of this education
	*/
	@Override
	public void setUniversity(java.lang.String university) {
		_education.setUniversity(university);
	}

	/**
	* Returns the contact_phone of this education.
	*
	* @return the contact_phone of this education
	*/
	@Override
	public java.lang.String getContact_phone() {
		return _education.getContact_phone();
	}

	/**
	* Sets the contact_phone of this education.
	*
	* @param contact_phone the contact_phone of this education
	*/
	@Override
	public void setContact_phone(java.lang.String contact_phone) {
		_education.setContact_phone(contact_phone);
	}

	/**
	* Returns the start_stop_time of this education.
	*
	* @return the start_stop_time of this education
	*/
	@Override
	public java.util.Date getStart_stop_time() {
		return _education.getStart_stop_time();
	}

	/**
	* Sets the start_stop_time of this education.
	*
	* @param start_stop_time the start_stop_time of this education
	*/
	@Override
	public void setStart_stop_time(java.util.Date start_stop_time) {
		_education.setStart_stop_time(start_stop_time);
	}

	/**
	* Returns the company ID of this education.
	*
	* @return the company ID of this education
	*/
	@Override
	public long getCompanyId() {
		return _education.getCompanyId();
	}

	/**
	* Sets the company ID of this education.
	*
	* @param companyId the company ID of this education
	*/
	@Override
	public void setCompanyId(long companyId) {
		_education.setCompanyId(companyId);
	}

	/**
	* Returns the createuser of this education.
	*
	* @return the createuser of this education
	*/
	@Override
	public long getCreateuser() {
		return _education.getCreateuser();
	}

	/**
	* Sets the createuser of this education.
	*
	* @param createuser the createuser of this education
	*/
	@Override
	public void setCreateuser(long createuser) {
		_education.setCreateuser(createuser);
	}

	/**
	* Returns the create date of this education.
	*
	* @return the create date of this education
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _education.getCreateDate();
	}

	/**
	* Sets the create date of this education.
	*
	* @param createDate the create date of this education
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_education.setCreateDate(createDate);
	}

	/**
	* Returns the modifieduser of this education.
	*
	* @return the modifieduser of this education
	*/
	@Override
	public long getModifieduser() {
		return _education.getModifieduser();
	}

	/**
	* Sets the modifieduser of this education.
	*
	* @param modifieduser the modifieduser of this education
	*/
	@Override
	public void setModifieduser(long modifieduser) {
		_education.setModifieduser(modifieduser);
	}

	/**
	* Returns the modified date of this education.
	*
	* @return the modified date of this education
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _education.getModifiedDate();
	}

	/**
	* Sets the modified date of this education.
	*
	* @param modifiedDate the modified date of this education
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_education.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this education.
	*
	* @return the status of this education
	*/
	@Override
	public int getStatus() {
		return _education.getStatus();
	}

	/**
	* Returns the trash entry created when this education was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this education.
	*
	* @return the trash entry created when this education was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _education.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this education.
	*
	* @return the class primary key of the trash entry for this education
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _education.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this education.
	*
	* @return the trash handler for this education
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _education.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this education is in the Recycle Bin.
	*
	* @return <code>true</code> if this education is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _education.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this education is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this education is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _education.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _education.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_education.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _education.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_education.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _education.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _education.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_education.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _education.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_education.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_education.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_education.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new educationWrapper((education)_education.clone());
	}

	@Override
	public int compareTo(education education) {
		return _education.compareTo(education);
	}

	@Override
	public int hashCode() {
		return _education.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<education> toCacheModel() {
		return _education.toCacheModel();
	}

	@Override
	public education toEscapedModel() {
		return new educationWrapper(_education.toEscapedModel());
	}

	@Override
	public education toUnescapedModel() {
		return new educationWrapper(_education.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _education.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _education.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_education.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof educationWrapper)) {
			return false;
		}

		educationWrapper educationWrapper = (educationWrapper)obj;

		if (Validator.equals(_education, educationWrapper._education)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _education.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public education getWrappededucation() {
		return _education;
	}

	@Override
	public education getWrappedModel() {
		return _education;
	}

	@Override
	public void resetOriginalValues() {
		_education.resetOriginalValues();
	}

	private education _education;
}