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
		attributes.put("eWitness", getEWitness());
		attributes.put("eProfessional", getEProfessional());
		attributes.put("eUniversity", getEUniversity());
		attributes.put("eContactPhone", getEContactPhone());
		attributes.put("eStartTimeYear", getEStartTimeYear());
		attributes.put("eStartTimeMonth", getEStartTimeMonth());
		attributes.put("eStopTimeYear", getEStopTimeYear());
		attributes.put("eStopTimeMonth", getEStopTimeMonth());

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

		String eWitness = (String)attributes.get("eWitness");

		if (eWitness != null) {
			setEWitness(eWitness);
		}

		String eProfessional = (String)attributes.get("eProfessional");

		if (eProfessional != null) {
			setEProfessional(eProfessional);
		}

		String eUniversity = (String)attributes.get("eUniversity");

		if (eUniversity != null) {
			setEUniversity(eUniversity);
		}

		String eContactPhone = (String)attributes.get("eContactPhone");

		if (eContactPhone != null) {
			setEContactPhone(eContactPhone);
		}

		String eStartTimeYear = (String)attributes.get("eStartTimeYear");

		if (eStartTimeYear != null) {
			setEStartTimeYear(eStartTimeYear);
		}

		String eStartTimeMonth = (String)attributes.get("eStartTimeMonth");

		if (eStartTimeMonth != null) {
			setEStartTimeMonth(eStartTimeMonth);
		}

		String eStopTimeYear = (String)attributes.get("eStopTimeYear");

		if (eStopTimeYear != null) {
			setEStopTimeYear(eStopTimeYear);
		}

		String eStopTimeMonth = (String)attributes.get("eStopTimeMonth");

		if (eStopTimeMonth != null) {
			setEStopTimeMonth(eStopTimeMonth);
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
	* Returns the e witness of this education.
	*
	* @return the e witness of this education
	*/
	@Override
	public java.lang.String getEWitness() {
		return _education.getEWitness();
	}

	/**
	* Sets the e witness of this education.
	*
	* @param eWitness the e witness of this education
	*/
	@Override
	public void setEWitness(java.lang.String eWitness) {
		_education.setEWitness(eWitness);
	}

	/**
	* Returns the e professional of this education.
	*
	* @return the e professional of this education
	*/
	@Override
	public java.lang.String getEProfessional() {
		return _education.getEProfessional();
	}

	/**
	* Sets the e professional of this education.
	*
	* @param eProfessional the e professional of this education
	*/
	@Override
	public void setEProfessional(java.lang.String eProfessional) {
		_education.setEProfessional(eProfessional);
	}

	/**
	* Returns the e university of this education.
	*
	* @return the e university of this education
	*/
	@Override
	public java.lang.String getEUniversity() {
		return _education.getEUniversity();
	}

	/**
	* Sets the e university of this education.
	*
	* @param eUniversity the e university of this education
	*/
	@Override
	public void setEUniversity(java.lang.String eUniversity) {
		_education.setEUniversity(eUniversity);
	}

	/**
	* Returns the e contact phone of this education.
	*
	* @return the e contact phone of this education
	*/
	@Override
	public java.lang.String getEContactPhone() {
		return _education.getEContactPhone();
	}

	/**
	* Sets the e contact phone of this education.
	*
	* @param eContactPhone the e contact phone of this education
	*/
	@Override
	public void setEContactPhone(java.lang.String eContactPhone) {
		_education.setEContactPhone(eContactPhone);
	}

	/**
	* Returns the e start time year of this education.
	*
	* @return the e start time year of this education
	*/
	@Override
	public java.lang.String getEStartTimeYear() {
		return _education.getEStartTimeYear();
	}

	/**
	* Sets the e start time year of this education.
	*
	* @param eStartTimeYear the e start time year of this education
	*/
	@Override
	public void setEStartTimeYear(java.lang.String eStartTimeYear) {
		_education.setEStartTimeYear(eStartTimeYear);
	}

	/**
	* Returns the e start time month of this education.
	*
	* @return the e start time month of this education
	*/
	@Override
	public java.lang.String getEStartTimeMonth() {
		return _education.getEStartTimeMonth();
	}

	/**
	* Sets the e start time month of this education.
	*
	* @param eStartTimeMonth the e start time month of this education
	*/
	@Override
	public void setEStartTimeMonth(java.lang.String eStartTimeMonth) {
		_education.setEStartTimeMonth(eStartTimeMonth);
	}

	/**
	* Returns the e stop time year of this education.
	*
	* @return the e stop time year of this education
	*/
	@Override
	public java.lang.String getEStopTimeYear() {
		return _education.getEStopTimeYear();
	}

	/**
	* Sets the e stop time year of this education.
	*
	* @param eStopTimeYear the e stop time year of this education
	*/
	@Override
	public void setEStopTimeYear(java.lang.String eStopTimeYear) {
		_education.setEStopTimeYear(eStopTimeYear);
	}

	/**
	* Returns the e stop time month of this education.
	*
	* @return the e stop time month of this education
	*/
	@Override
	public java.lang.String getEStopTimeMonth() {
		return _education.getEStopTimeMonth();
	}

	/**
	* Sets the e stop time month of this education.
	*
	* @param eStopTimeMonth the e stop time month of this education
	*/
	@Override
	public void setEStopTimeMonth(java.lang.String eStopTimeMonth) {
		_education.setEStopTimeMonth(eStopTimeMonth);
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