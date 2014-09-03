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
 * This class is a wrapper for {@link WorkExperience}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperience
 * @generated
 */
public class WorkExperienceWrapper implements WorkExperience,
	ModelWrapper<WorkExperience> {
	public WorkExperienceWrapper(WorkExperience workExperience) {
		_workExperience = workExperience;
	}

	@Override
	public Class<?> getModelClass() {
		return WorkExperience.class;
	}

	@Override
	public String getModelClassName() {
		return WorkExperience.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("witness", getWitness());
		attributes.put("onceJob", getOnceJob());
		attributes.put("workUnit", getWorkUnit());
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

		String onceJob = (String)attributes.get("onceJob");

		if (onceJob != null) {
			setOnceJob(onceJob);
		}

		String workUnit = (String)attributes.get("workUnit");

		if (workUnit != null) {
			setWorkUnit(workUnit);
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
	* Returns the primary key of this work experience.
	*
	* @return the primary key of this work experience
	*/
	@Override
	public long getPrimaryKey() {
		return _workExperience.getPrimaryKey();
	}

	/**
	* Sets the primary key of this work experience.
	*
	* @param primaryKey the primary key of this work experience
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_workExperience.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this work experience.
	*
	* @return the ID of this work experience
	*/
	@Override
	public long getId() {
		return _workExperience.getId();
	}

	/**
	* Sets the ID of this work experience.
	*
	* @param id the ID of this work experience
	*/
	@Override
	public void setId(long id) {
		_workExperience.setId(id);
	}

	/**
	* Returns the user ID of this work experience.
	*
	* @return the user ID of this work experience
	*/
	@Override
	public long getUserId() {
		return _workExperience.getUserId();
	}

	/**
	* Sets the user ID of this work experience.
	*
	* @param userId the user ID of this work experience
	*/
	@Override
	public void setUserId(long userId) {
		_workExperience.setUserId(userId);
	}

	/**
	* Returns the user uuid of this work experience.
	*
	* @return the user uuid of this work experience
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperience.getUserUuid();
	}

	/**
	* Sets the user uuid of this work experience.
	*
	* @param userUuid the user uuid of this work experience
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_workExperience.setUserUuid(userUuid);
	}

	/**
	* Returns the witness of this work experience.
	*
	* @return the witness of this work experience
	*/
	@Override
	public java.lang.String getWitness() {
		return _workExperience.getWitness();
	}

	/**
	* Sets the witness of this work experience.
	*
	* @param witness the witness of this work experience
	*/
	@Override
	public void setWitness(java.lang.String witness) {
		_workExperience.setWitness(witness);
	}

	/**
	* Returns the once job of this work experience.
	*
	* @return the once job of this work experience
	*/
	@Override
	public java.lang.String getOnceJob() {
		return _workExperience.getOnceJob();
	}

	/**
	* Sets the once job of this work experience.
	*
	* @param onceJob the once job of this work experience
	*/
	@Override
	public void setOnceJob(java.lang.String onceJob) {
		_workExperience.setOnceJob(onceJob);
	}

	/**
	* Returns the work unit of this work experience.
	*
	* @return the work unit of this work experience
	*/
	@Override
	public java.lang.String getWorkUnit() {
		return _workExperience.getWorkUnit();
	}

	/**
	* Sets the work unit of this work experience.
	*
	* @param workUnit the work unit of this work experience
	*/
	@Override
	public void setWorkUnit(java.lang.String workUnit) {
		_workExperience.setWorkUnit(workUnit);
	}

	/**
	* Returns the contact phone of this work experience.
	*
	* @return the contact phone of this work experience
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _workExperience.getContactPhone();
	}

	/**
	* Sets the contact phone of this work experience.
	*
	* @param contactPhone the contact phone of this work experience
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_workExperience.setContactPhone(contactPhone);
	}

	/**
	* Returns the start time of this work experience.
	*
	* @return the start time of this work experience
	*/
	@Override
	public java.util.Date getStartTime() {
		return _workExperience.getStartTime();
	}

	/**
	* Sets the start time of this work experience.
	*
	* @param startTime the start time of this work experience
	*/
	@Override
	public void setStartTime(java.util.Date startTime) {
		_workExperience.setStartTime(startTime);
	}

	/**
	* Returns the stop time of this work experience.
	*
	* @return the stop time of this work experience
	*/
	@Override
	public java.util.Date getStopTime() {
		return _workExperience.getStopTime();
	}

	/**
	* Sets the stop time of this work experience.
	*
	* @param stopTime the stop time of this work experience
	*/
	@Override
	public void setStopTime(java.util.Date stopTime) {
		_workExperience.setStopTime(stopTime);
	}

	/**
	* Returns the create user ID of this work experience.
	*
	* @return the create user ID of this work experience
	*/
	@Override
	public long getCreateUserId() {
		return _workExperience.getCreateUserId();
	}

	/**
	* Sets the create user ID of this work experience.
	*
	* @param createUserId the create user ID of this work experience
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_workExperience.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this work experience.
	*
	* @return the create user uuid of this work experience
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperience.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this work experience.
	*
	* @param createUserUuid the create user uuid of this work experience
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_workExperience.setCreateUserUuid(createUserUuid);
	}

	/**
	* Returns the create date of this work experience.
	*
	* @return the create date of this work experience
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _workExperience.getCreateDate();
	}

	/**
	* Sets the create date of this work experience.
	*
	* @param createDate the create date of this work experience
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_workExperience.setCreateDate(createDate);
	}

	/**
	* Returns the modified user ID of this work experience.
	*
	* @return the modified user ID of this work experience
	*/
	@Override
	public long getModifiedUserId() {
		return _workExperience.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this work experience.
	*
	* @param modifiedUserId the modified user ID of this work experience
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_workExperience.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this work experience.
	*
	* @return the modified user uuid of this work experience
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _workExperience.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this work experience.
	*
	* @param modifiedUserUuid the modified user uuid of this work experience
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_workExperience.setModifiedUserUuid(modifiedUserUuid);
	}

	/**
	* Returns the modified date of this work experience.
	*
	* @return the modified date of this work experience
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _workExperience.getModifiedDate();
	}

	/**
	* Sets the modified date of this work experience.
	*
	* @param modifiedDate the modified date of this work experience
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_workExperience.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _workExperience.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_workExperience.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _workExperience.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_workExperience.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _workExperience.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _workExperience.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_workExperience.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _workExperience.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_workExperience.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_workExperience.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_workExperience.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WorkExperienceWrapper((WorkExperience)_workExperience.clone());
	}

	@Override
	public int compareTo(
		com.shuntian.portlet.intranet.model.WorkExperience workExperience) {
		return _workExperience.compareTo(workExperience);
	}

	@Override
	public int hashCode() {
		return _workExperience.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.WorkExperience> toCacheModel() {
		return _workExperience.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience toEscapedModel() {
		return new WorkExperienceWrapper(_workExperience.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.WorkExperience toUnescapedModel() {
		return new WorkExperienceWrapper(_workExperience.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _workExperience.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _workExperience.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_workExperience.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WorkExperienceWrapper)) {
			return false;
		}

		WorkExperienceWrapper workExperienceWrapper = (WorkExperienceWrapper)obj;

		if (Validator.equals(_workExperience,
					workExperienceWrapper._workExperience)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WorkExperience getWrappedWorkExperience() {
		return _workExperience;
	}

	@Override
	public WorkExperience getWrappedModel() {
		return _workExperience;
	}

	@Override
	public void resetOriginalValues() {
		_workExperience.resetOriginalValues();
	}

	private WorkExperience _workExperience;
}