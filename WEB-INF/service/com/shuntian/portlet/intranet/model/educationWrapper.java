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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Education}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Education
 * @generated
 */
public class EducationWrapper implements Education, ModelWrapper<Education> {
	public EducationWrapper(Education education) {
		_education = education;
	}

	@Override
	public Class<?> getModelClass() {
		return Education.class;
	}

	@Override
	public String getModelClassName() {
		return Education.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("witness", getWitness());
		attributes.put("professional", getProfessional());
		attributes.put("university", getUniversity());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("startTime", getStartTime());
		attributes.put("stopTime", getStopTime());
		attributes.put("createUserId", getCreateUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedUserId", getModifiedUserId());
		attributes.put("modifiedDate", getModifiedDate());

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

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		Date startTime = (Date)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Date stopTime = (Date)attributes.get("stopTime");

		if (stopTime != null) {
			setStopTime(stopTime);
		}

		Long createUserId = (Long)attributes.get("createUserId");

		if (createUserId != null) {
			setCreateUserId(createUserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifiedUserId = (Long)attributes.get("modifiedUserId");

		if (modifiedUserId != null) {
			setModifiedUserId(modifiedUserId);
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
	* Returns the ID of this education.
	*
	* @return the ID of this education
	*/
	@Override
	public long getId() {
		return _education.getId();
	}

	/**
	* Sets the ID of this education.
	*
	* @param id the ID of this education
	*/
	@Override
	public void setId(long id) {
		_education.setId(id);
	}

	/**
	* Returns the user ID of this education.
	*
	* @return the user ID of this education
	*/
	@Override
	public long getUserId() {
		return _education.getUserId();
	}

	/**
	* Sets the user ID of this education.
	*
	* @param userId the user ID of this education
	*/
	@Override
	public void setUserId(long userId) {
		_education.setUserId(userId);
	}

	/**
	* Returns the user uuid of this education.
	*
	* @return the user uuid of this education
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _education.getUserUuid();
	}

	/**
	* Sets the user uuid of this education.
	*
	* @param userUuid the user uuid of this education
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_education.setUserUuid(userUuid);
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
	* Returns the contact phone of this education.
	*
	* @return the contact phone of this education
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _education.getContactPhone();
	}

	/**
	* Sets the contact phone of this education.
	*
	* @param contactPhone the contact phone of this education
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_education.setContactPhone(contactPhone);
	}

	/**
	* Returns the start time of this education.
	*
	* @return the start time of this education
	*/
	@Override
	public java.util.Date getStartTime() {
		return _education.getStartTime();
	}

	/**
	* Sets the start time of this education.
	*
	* @param startTime the start time of this education
	*/
	@Override
	public void setStartTime(java.util.Date startTime) {
		_education.setStartTime(startTime);
	}

	/**
	* Returns the stop time of this education.
	*
	* @return the stop time of this education
	*/
	@Override
	public java.util.Date getStopTime() {
		return _education.getStopTime();
	}

	/**
	* Sets the stop time of this education.
	*
	* @param stopTime the stop time of this education
	*/
	@Override
	public void setStopTime(java.util.Date stopTime) {
		_education.setStopTime(stopTime);
	}

	/**
	* Returns the create user ID of this education.
	*
	* @return the create user ID of this education
	*/
	@Override
	public long getCreateUserId() {
		return _education.getCreateUserId();
	}

	/**
	* Sets the create user ID of this education.
	*
	* @param createUserId the create user ID of this education
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_education.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this education.
	*
	* @return the create user uuid of this education
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _education.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this education.
	*
	* @param createUserUuid the create user uuid of this education
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_education.setCreateUserUuid(createUserUuid);
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
	* Returns the modified user ID of this education.
	*
	* @return the modified user ID of this education
	*/
	@Override
	public long getModifiedUserId() {
		return _education.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this education.
	*
	* @param modifiedUserId the modified user ID of this education
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_education.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this education.
	*
	* @return the modified user uuid of this education
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _education.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this education.
	*
	* @param modifiedUserUuid the modified user uuid of this education
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_education.setModifiedUserUuid(modifiedUserUuid);
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
		return new EducationWrapper((Education)_education.clone());
	}

	@Override
	public int compareTo(
		com.shuntian.portlet.intranet.model.Education education) {
		return _education.compareTo(education);
	}

	@Override
	public int hashCode() {
		return _education.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.Education> toCacheModel() {
		return _education.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.Education toEscapedModel() {
		return new EducationWrapper(_education.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.Education toUnescapedModel() {
		return new EducationWrapper(_education.toUnescapedModel());
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

		if (!(obj instanceof EducationWrapper)) {
			return false;
		}

		EducationWrapper educationWrapper = (EducationWrapper)obj;

		if (Validator.equals(_education, educationWrapper._education)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Education getWrappedEducation() {
		return _education;
	}

	@Override
	public Education getWrappedModel() {
		return _education;
	}

	@Override
	public void resetOriginalValues() {
		_education.resetOriginalValues();
	}

	private Education _education;
}