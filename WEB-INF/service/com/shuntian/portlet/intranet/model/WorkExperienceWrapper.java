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
		attributes.put("weWitness", getWeWitness());
		attributes.put("weOnceJob", getWeOnceJob());
		attributes.put("weWorkUnit", getWeWorkUnit());
		attributes.put("weContactPhone", getWeContactPhone());
		attributes.put("weStartTimeYear", getWeStartTimeYear());
		attributes.put("weStartTimeMonth", getWeStartTimeMonth());
		attributes.put("weStopTimeYear", getWeStopTimeYear());
		attributes.put("weStopTimeMonth", getWeStopTimeMonth());

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

		String weWitness = (String)attributes.get("weWitness");

		if (weWitness != null) {
			setWeWitness(weWitness);
		}

		String weOnceJob = (String)attributes.get("weOnceJob");

		if (weOnceJob != null) {
			setWeOnceJob(weOnceJob);
		}

		String weWorkUnit = (String)attributes.get("weWorkUnit");

		if (weWorkUnit != null) {
			setWeWorkUnit(weWorkUnit);
		}

		String weContactPhone = (String)attributes.get("weContactPhone");

		if (weContactPhone != null) {
			setWeContactPhone(weContactPhone);
		}

		String weStartTimeYear = (String)attributes.get("weStartTimeYear");

		if (weStartTimeYear != null) {
			setWeStartTimeYear(weStartTimeYear);
		}

		String weStartTimeMonth = (String)attributes.get("weStartTimeMonth");

		if (weStartTimeMonth != null) {
			setWeStartTimeMonth(weStartTimeMonth);
		}

		String weStopTimeYear = (String)attributes.get("weStopTimeYear");

		if (weStopTimeYear != null) {
			setWeStopTimeYear(weStopTimeYear);
		}

		String weStopTimeMonth = (String)attributes.get("weStopTimeMonth");

		if (weStopTimeMonth != null) {
			setWeStopTimeMonth(weStopTimeMonth);
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
	* Returns the we witness of this work experience.
	*
	* @return the we witness of this work experience
	*/
	@Override
	public java.lang.String getWeWitness() {
		return _workExperience.getWeWitness();
	}

	/**
	* Sets the we witness of this work experience.
	*
	* @param weWitness the we witness of this work experience
	*/
	@Override
	public void setWeWitness(java.lang.String weWitness) {
		_workExperience.setWeWitness(weWitness);
	}

	/**
	* Returns the we once job of this work experience.
	*
	* @return the we once job of this work experience
	*/
	@Override
	public java.lang.String getWeOnceJob() {
		return _workExperience.getWeOnceJob();
	}

	/**
	* Sets the we once job of this work experience.
	*
	* @param weOnceJob the we once job of this work experience
	*/
	@Override
	public void setWeOnceJob(java.lang.String weOnceJob) {
		_workExperience.setWeOnceJob(weOnceJob);
	}

	/**
	* Returns the we work unit of this work experience.
	*
	* @return the we work unit of this work experience
	*/
	@Override
	public java.lang.String getWeWorkUnit() {
		return _workExperience.getWeWorkUnit();
	}

	/**
	* Sets the we work unit of this work experience.
	*
	* @param weWorkUnit the we work unit of this work experience
	*/
	@Override
	public void setWeWorkUnit(java.lang.String weWorkUnit) {
		_workExperience.setWeWorkUnit(weWorkUnit);
	}

	/**
	* Returns the we contact phone of this work experience.
	*
	* @return the we contact phone of this work experience
	*/
	@Override
	public java.lang.String getWeContactPhone() {
		return _workExperience.getWeContactPhone();
	}

	/**
	* Sets the we contact phone of this work experience.
	*
	* @param weContactPhone the we contact phone of this work experience
	*/
	@Override
	public void setWeContactPhone(java.lang.String weContactPhone) {
		_workExperience.setWeContactPhone(weContactPhone);
	}

	/**
	* Returns the we start time year of this work experience.
	*
	* @return the we start time year of this work experience
	*/
	@Override
	public java.lang.String getWeStartTimeYear() {
		return _workExperience.getWeStartTimeYear();
	}

	/**
	* Sets the we start time year of this work experience.
	*
	* @param weStartTimeYear the we start time year of this work experience
	*/
	@Override
	public void setWeStartTimeYear(java.lang.String weStartTimeYear) {
		_workExperience.setWeStartTimeYear(weStartTimeYear);
	}

	/**
	* Returns the we start time month of this work experience.
	*
	* @return the we start time month of this work experience
	*/
	@Override
	public java.lang.String getWeStartTimeMonth() {
		return _workExperience.getWeStartTimeMonth();
	}

	/**
	* Sets the we start time month of this work experience.
	*
	* @param weStartTimeMonth the we start time month of this work experience
	*/
	@Override
	public void setWeStartTimeMonth(java.lang.String weStartTimeMonth) {
		_workExperience.setWeStartTimeMonth(weStartTimeMonth);
	}

	/**
	* Returns the we stop time year of this work experience.
	*
	* @return the we stop time year of this work experience
	*/
	@Override
	public java.lang.String getWeStopTimeYear() {
		return _workExperience.getWeStopTimeYear();
	}

	/**
	* Sets the we stop time year of this work experience.
	*
	* @param weStopTimeYear the we stop time year of this work experience
	*/
	@Override
	public void setWeStopTimeYear(java.lang.String weStopTimeYear) {
		_workExperience.setWeStopTimeYear(weStopTimeYear);
	}

	/**
	* Returns the we stop time month of this work experience.
	*
	* @return the we stop time month of this work experience
	*/
	@Override
	public java.lang.String getWeStopTimeMonth() {
		return _workExperience.getWeStopTimeMonth();
	}

	/**
	* Sets the we stop time month of this work experience.
	*
	* @param weStopTimeMonth the we stop time month of this work experience
	*/
	@Override
	public void setWeStopTimeMonth(java.lang.String weStopTimeMonth) {
		_workExperience.setWeStopTimeMonth(weStopTimeMonth);
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