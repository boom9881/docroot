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
 * This class is a wrapper for {@link ExtInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtInformation
 * @generated
 */
public class ExtInformationWrapper implements ExtInformation,
	ModelWrapper<ExtInformation> {
	public ExtInformationWrapper(ExtInformation extInformation) {
		_extInformation = extInformation;
	}

	@Override
	public Class<?> getModelClass() {
		return ExtInformation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("openCity", getOpenCity());
		attributes.put("bankName", getBankName());
		attributes.put("bankId", getBankId());
		attributes.put("laborContractStart", getLaborContractStart());
		attributes.put("laborContractEnd", getLaborContractEnd());
		attributes.put("probationPeriodStart", getProbationPeriodStart());
		attributes.put("probationPeriodEnd", getProbationPeriodEnd());
		attributes.put("induredLocation", getInduredLocation());
		attributes.put("fristInsuredYear", getFristInsuredYear());
		attributes.put("fristInsuredMonth", getFristInsuredMonth());
		attributes.put("isInsured", getIsInsured());
		attributes.put("basicWage", getBasicWage());
		attributes.put("otherWage", getOtherWage());

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

		String openCity = (String)attributes.get("openCity");

		if (openCity != null) {
			setOpenCity(openCity);
		}

		String bankName = (String)attributes.get("bankName");

		if (bankName != null) {
			setBankName(bankName);
		}

		String bankId = (String)attributes.get("bankId");

		if (bankId != null) {
			setBankId(bankId);
		}

		Date laborContractStart = (Date)attributes.get("laborContractStart");

		if (laborContractStart != null) {
			setLaborContractStart(laborContractStart);
		}

		Date laborContractEnd = (Date)attributes.get("laborContractEnd");

		if (laborContractEnd != null) {
			setLaborContractEnd(laborContractEnd);
		}

		Date probationPeriodStart = (Date)attributes.get("probationPeriodStart");

		if (probationPeriodStart != null) {
			setProbationPeriodStart(probationPeriodStart);
		}

		Date probationPeriodEnd = (Date)attributes.get("probationPeriodEnd");

		if (probationPeriodEnd != null) {
			setProbationPeriodEnd(probationPeriodEnd);
		}

		String induredLocation = (String)attributes.get("induredLocation");

		if (induredLocation != null) {
			setInduredLocation(induredLocation);
		}

		String fristInsuredYear = (String)attributes.get("fristInsuredYear");

		if (fristInsuredYear != null) {
			setFristInsuredYear(fristInsuredYear);
		}

		String fristInsuredMonth = (String)attributes.get("fristInsuredMonth");

		if (fristInsuredMonth != null) {
			setFristInsuredMonth(fristInsuredMonth);
		}

		String isInsured = (String)attributes.get("isInsured");

		if (isInsured != null) {
			setIsInsured(isInsured);
		}

		Long basicWage = (Long)attributes.get("basicWage");

		if (basicWage != null) {
			setBasicWage(basicWage);
		}

		Long otherWage = (Long)attributes.get("otherWage");

		if (otherWage != null) {
			setOtherWage(otherWage);
		}
	}

	/**
	* Returns the primary key of this ext information.
	*
	* @return the primary key of this ext information
	*/
	@Override
	public long getPrimaryKey() {
		return _extInformation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ext information.
	*
	* @param primaryKey the primary key of this ext information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_extInformation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ext information.
	*
	* @return the ID of this ext information
	*/
	@Override
	public long getId() {
		return _extInformation.getId();
	}

	/**
	* Sets the ID of this ext information.
	*
	* @param id the ID of this ext information
	*/
	@Override
	public void setId(long id) {
		_extInformation.setId(id);
	}

	/**
	* Returns the user ID of this ext information.
	*
	* @return the user ID of this ext information
	*/
	@Override
	public long getUserId() {
		return _extInformation.getUserId();
	}

	/**
	* Sets the user ID of this ext information.
	*
	* @param userId the user ID of this ext information
	*/
	@Override
	public void setUserId(long userId) {
		_extInformation.setUserId(userId);
	}

	/**
	* Returns the user uuid of this ext information.
	*
	* @return the user uuid of this ext information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _extInformation.getUserUuid();
	}

	/**
	* Sets the user uuid of this ext information.
	*
	* @param userUuid the user uuid of this ext information
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_extInformation.setUserUuid(userUuid);
	}

	/**
	* Returns the open city of this ext information.
	*
	* @return the open city of this ext information
	*/
	@Override
	public java.lang.String getOpenCity() {
		return _extInformation.getOpenCity();
	}

	/**
	* Sets the open city of this ext information.
	*
	* @param openCity the open city of this ext information
	*/
	@Override
	public void setOpenCity(java.lang.String openCity) {
		_extInformation.setOpenCity(openCity);
	}

	/**
	* Returns the bank name of this ext information.
	*
	* @return the bank name of this ext information
	*/
	@Override
	public java.lang.String getBankName() {
		return _extInformation.getBankName();
	}

	/**
	* Sets the bank name of this ext information.
	*
	* @param bankName the bank name of this ext information
	*/
	@Override
	public void setBankName(java.lang.String bankName) {
		_extInformation.setBankName(bankName);
	}

	/**
	* Returns the bank ID of this ext information.
	*
	* @return the bank ID of this ext information
	*/
	@Override
	public java.lang.String getBankId() {
		return _extInformation.getBankId();
	}

	/**
	* Sets the bank ID of this ext information.
	*
	* @param bankId the bank ID of this ext information
	*/
	@Override
	public void setBankId(java.lang.String bankId) {
		_extInformation.setBankId(bankId);
	}

	/**
	* Returns the labor contract start of this ext information.
	*
	* @return the labor contract start of this ext information
	*/
	@Override
	public java.util.Date getLaborContractStart() {
		return _extInformation.getLaborContractStart();
	}

	/**
	* Sets the labor contract start of this ext information.
	*
	* @param laborContractStart the labor contract start of this ext information
	*/
	@Override
	public void setLaborContractStart(java.util.Date laborContractStart) {
		_extInformation.setLaborContractStart(laborContractStart);
	}

	/**
	* Returns the labor contract end of this ext information.
	*
	* @return the labor contract end of this ext information
	*/
	@Override
	public java.util.Date getLaborContractEnd() {
		return _extInformation.getLaborContractEnd();
	}

	/**
	* Sets the labor contract end of this ext information.
	*
	* @param laborContractEnd the labor contract end of this ext information
	*/
	@Override
	public void setLaborContractEnd(java.util.Date laborContractEnd) {
		_extInformation.setLaborContractEnd(laborContractEnd);
	}

	/**
	* Returns the probation period start of this ext information.
	*
	* @return the probation period start of this ext information
	*/
	@Override
	public java.util.Date getProbationPeriodStart() {
		return _extInformation.getProbationPeriodStart();
	}

	/**
	* Sets the probation period start of this ext information.
	*
	* @param probationPeriodStart the probation period start of this ext information
	*/
	@Override
	public void setProbationPeriodStart(java.util.Date probationPeriodStart) {
		_extInformation.setProbationPeriodStart(probationPeriodStart);
	}

	/**
	* Returns the probation period end of this ext information.
	*
	* @return the probation period end of this ext information
	*/
	@Override
	public java.util.Date getProbationPeriodEnd() {
		return _extInformation.getProbationPeriodEnd();
	}

	/**
	* Sets the probation period end of this ext information.
	*
	* @param probationPeriodEnd the probation period end of this ext information
	*/
	@Override
	public void setProbationPeriodEnd(java.util.Date probationPeriodEnd) {
		_extInformation.setProbationPeriodEnd(probationPeriodEnd);
	}

	/**
	* Returns the indured location of this ext information.
	*
	* @return the indured location of this ext information
	*/
	@Override
	public java.lang.String getInduredLocation() {
		return _extInformation.getInduredLocation();
	}

	/**
	* Sets the indured location of this ext information.
	*
	* @param induredLocation the indured location of this ext information
	*/
	@Override
	public void setInduredLocation(java.lang.String induredLocation) {
		_extInformation.setInduredLocation(induredLocation);
	}

	/**
	* Returns the frist insured year of this ext information.
	*
	* @return the frist insured year of this ext information
	*/
	@Override
	public java.lang.String getFristInsuredYear() {
		return _extInformation.getFristInsuredYear();
	}

	/**
	* Sets the frist insured year of this ext information.
	*
	* @param fristInsuredYear the frist insured year of this ext information
	*/
	@Override
	public void setFristInsuredYear(java.lang.String fristInsuredYear) {
		_extInformation.setFristInsuredYear(fristInsuredYear);
	}

	/**
	* Returns the frist insured month of this ext information.
	*
	* @return the frist insured month of this ext information
	*/
	@Override
	public java.lang.String getFristInsuredMonth() {
		return _extInformation.getFristInsuredMonth();
	}

	/**
	* Sets the frist insured month of this ext information.
	*
	* @param fristInsuredMonth the frist insured month of this ext information
	*/
	@Override
	public void setFristInsuredMonth(java.lang.String fristInsuredMonth) {
		_extInformation.setFristInsuredMonth(fristInsuredMonth);
	}

	/**
	* Returns the is insured of this ext information.
	*
	* @return the is insured of this ext information
	*/
	@Override
	public java.lang.String getIsInsured() {
		return _extInformation.getIsInsured();
	}

	/**
	* Sets the is insured of this ext information.
	*
	* @param isInsured the is insured of this ext information
	*/
	@Override
	public void setIsInsured(java.lang.String isInsured) {
		_extInformation.setIsInsured(isInsured);
	}

	/**
	* Returns the basic wage of this ext information.
	*
	* @return the basic wage of this ext information
	*/
	@Override
	public long getBasicWage() {
		return _extInformation.getBasicWage();
	}

	/**
	* Sets the basic wage of this ext information.
	*
	* @param basicWage the basic wage of this ext information
	*/
	@Override
	public void setBasicWage(long basicWage) {
		_extInformation.setBasicWage(basicWage);
	}

	/**
	* Returns the other wage of this ext information.
	*
	* @return the other wage of this ext information
	*/
	@Override
	public long getOtherWage() {
		return _extInformation.getOtherWage();
	}

	/**
	* Sets the other wage of this ext information.
	*
	* @param otherWage the other wage of this ext information
	*/
	@Override
	public void setOtherWage(long otherWage) {
		_extInformation.setOtherWage(otherWage);
	}

	@Override
	public boolean isNew() {
		return _extInformation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_extInformation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _extInformation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_extInformation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _extInformation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _extInformation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_extInformation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _extInformation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_extInformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_extInformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_extInformation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ExtInformationWrapper((ExtInformation)_extInformation.clone());
	}

	@Override
	public int compareTo(
		com.shuntian.portlet.intranet.model.ExtInformation extInformation) {
		return _extInformation.compareTo(extInformation);
	}

	@Override
	public int hashCode() {
		return _extInformation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.ExtInformation> toCacheModel() {
		return _extInformation.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation toEscapedModel() {
		return new ExtInformationWrapper(_extInformation.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.ExtInformation toUnescapedModel() {
		return new ExtInformationWrapper(_extInformation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _extInformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _extInformation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_extInformation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExtInformationWrapper)) {
			return false;
		}

		ExtInformationWrapper extInformationWrapper = (ExtInformationWrapper)obj;

		if (Validator.equals(_extInformation,
					extInformationWrapper._extInformation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ExtInformation getWrappedExtInformation() {
		return _extInformation;
	}

	@Override
	public ExtInformation getWrappedModel() {
		return _extInformation;
	}

	@Override
	public void resetOriginalValues() {
		_extInformation.resetOriginalValues();
	}

	private ExtInformation _extInformation;
}