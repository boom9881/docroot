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
 * This class is a wrapper for {@link ext_information}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ext_information
 * @generated
 */
public class ext_informationWrapper implements ext_information,
	ModelWrapper<ext_information> {
	public ext_informationWrapper(ext_information ext_information) {
		_ext_information = ext_information;
	}

	@Override
	public Class<?> getModelClass() {
		return ext_information.class;
	}

	@Override
	public String getModelClassName() {
		return ext_information.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("extId", getExtId());
		attributes.put("staffId", getStaffId());
		attributes.put("open_city", getOpen_city());
		attributes.put("bank_name", getBank_name());
		attributes.put("bankid", getBankid());
		attributes.put("labor_contract_start", getLabor_contract_start());
		attributes.put("labor_contract_end", getLabor_contract_end());
		attributes.put("probation_period_start", getProbation_period_start());
		attributes.put("probation_period_end", getProbation_period_end());
		attributes.put("indured_location", getIndured_location());
		attributes.put("frist_insured", getFrist_insured());
		attributes.put("is_insured", getIs_insured());
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

		Long extId = (Long)attributes.get("extId");

		if (extId != null) {
			setExtId(extId);
		}

		Long staffId = (Long)attributes.get("staffId");

		if (staffId != null) {
			setStaffId(staffId);
		}

		String open_city = (String)attributes.get("open_city");

		if (open_city != null) {
			setOpen_city(open_city);
		}

		String bank_name = (String)attributes.get("bank_name");

		if (bank_name != null) {
			setBank_name(bank_name);
		}

		String bankid = (String)attributes.get("bankid");

		if (bankid != null) {
			setBankid(bankid);
		}

		Date labor_contract_start = (Date)attributes.get("labor_contract_start");

		if (labor_contract_start != null) {
			setLabor_contract_start(labor_contract_start);
		}

		Date labor_contract_end = (Date)attributes.get("labor_contract_end");

		if (labor_contract_end != null) {
			setLabor_contract_end(labor_contract_end);
		}

		Date probation_period_start = (Date)attributes.get(
				"probation_period_start");

		if (probation_period_start != null) {
			setProbation_period_start(probation_period_start);
		}

		Date probation_period_end = (Date)attributes.get("probation_period_end");

		if (probation_period_end != null) {
			setProbation_period_end(probation_period_end);
		}

		String indured_location = (String)attributes.get("indured_location");

		if (indured_location != null) {
			setIndured_location(indured_location);
		}

		Date frist_insured = (Date)attributes.get("frist_insured");

		if (frist_insured != null) {
			setFrist_insured(frist_insured);
		}

		String is_insured = (String)attributes.get("is_insured");

		if (is_insured != null) {
			setIs_insured(is_insured);
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
	* Returns the primary key of this ext_information.
	*
	* @return the primary key of this ext_information
	*/
	@Override
	public long getPrimaryKey() {
		return _ext_information.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ext_information.
	*
	* @param primaryKey the primary key of this ext_information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ext_information.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this ext_information.
	*
	* @return the uuid of this ext_information
	*/
	@Override
	public java.lang.String getUuid() {
		return _ext_information.getUuid();
	}

	/**
	* Sets the uuid of this ext_information.
	*
	* @param uuid the uuid of this ext_information
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_ext_information.setUuid(uuid);
	}

	/**
	* Returns the ext ID of this ext_information.
	*
	* @return the ext ID of this ext_information
	*/
	@Override
	public long getExtId() {
		return _ext_information.getExtId();
	}

	/**
	* Sets the ext ID of this ext_information.
	*
	* @param extId the ext ID of this ext_information
	*/
	@Override
	public void setExtId(long extId) {
		_ext_information.setExtId(extId);
	}

	/**
	* Returns the staff ID of this ext_information.
	*
	* @return the staff ID of this ext_information
	*/
	@Override
	public long getStaffId() {
		return _ext_information.getStaffId();
	}

	/**
	* Sets the staff ID of this ext_information.
	*
	* @param staffId the staff ID of this ext_information
	*/
	@Override
	public void setStaffId(long staffId) {
		_ext_information.setStaffId(staffId);
	}

	/**
	* Returns the open_city of this ext_information.
	*
	* @return the open_city of this ext_information
	*/
	@Override
	public java.lang.String getOpen_city() {
		return _ext_information.getOpen_city();
	}

	/**
	* Sets the open_city of this ext_information.
	*
	* @param open_city the open_city of this ext_information
	*/
	@Override
	public void setOpen_city(java.lang.String open_city) {
		_ext_information.setOpen_city(open_city);
	}

	/**
	* Returns the bank_name of this ext_information.
	*
	* @return the bank_name of this ext_information
	*/
	@Override
	public java.lang.String getBank_name() {
		return _ext_information.getBank_name();
	}

	/**
	* Sets the bank_name of this ext_information.
	*
	* @param bank_name the bank_name of this ext_information
	*/
	@Override
	public void setBank_name(java.lang.String bank_name) {
		_ext_information.setBank_name(bank_name);
	}

	/**
	* Returns the bankid of this ext_information.
	*
	* @return the bankid of this ext_information
	*/
	@Override
	public java.lang.String getBankid() {
		return _ext_information.getBankid();
	}

	/**
	* Sets the bankid of this ext_information.
	*
	* @param bankid the bankid of this ext_information
	*/
	@Override
	public void setBankid(java.lang.String bankid) {
		_ext_information.setBankid(bankid);
	}

	/**
	* Returns the labor_contract_start of this ext_information.
	*
	* @return the labor_contract_start of this ext_information
	*/
	@Override
	public java.util.Date getLabor_contract_start() {
		return _ext_information.getLabor_contract_start();
	}

	/**
	* Sets the labor_contract_start of this ext_information.
	*
	* @param labor_contract_start the labor_contract_start of this ext_information
	*/
	@Override
	public void setLabor_contract_start(java.util.Date labor_contract_start) {
		_ext_information.setLabor_contract_start(labor_contract_start);
	}

	/**
	* Returns the labor_contract_end of this ext_information.
	*
	* @return the labor_contract_end of this ext_information
	*/
	@Override
	public java.util.Date getLabor_contract_end() {
		return _ext_information.getLabor_contract_end();
	}

	/**
	* Sets the labor_contract_end of this ext_information.
	*
	* @param labor_contract_end the labor_contract_end of this ext_information
	*/
	@Override
	public void setLabor_contract_end(java.util.Date labor_contract_end) {
		_ext_information.setLabor_contract_end(labor_contract_end);
	}

	/**
	* Returns the probation_period_start of this ext_information.
	*
	* @return the probation_period_start of this ext_information
	*/
	@Override
	public java.util.Date getProbation_period_start() {
		return _ext_information.getProbation_period_start();
	}

	/**
	* Sets the probation_period_start of this ext_information.
	*
	* @param probation_period_start the probation_period_start of this ext_information
	*/
	@Override
	public void setProbation_period_start(java.util.Date probation_period_start) {
		_ext_information.setProbation_period_start(probation_period_start);
	}

	/**
	* Returns the probation_period_end of this ext_information.
	*
	* @return the probation_period_end of this ext_information
	*/
	@Override
	public java.util.Date getProbation_period_end() {
		return _ext_information.getProbation_period_end();
	}

	/**
	* Sets the probation_period_end of this ext_information.
	*
	* @param probation_period_end the probation_period_end of this ext_information
	*/
	@Override
	public void setProbation_period_end(java.util.Date probation_period_end) {
		_ext_information.setProbation_period_end(probation_period_end);
	}

	/**
	* Returns the indured_location of this ext_information.
	*
	* @return the indured_location of this ext_information
	*/
	@Override
	public java.lang.String getIndured_location() {
		return _ext_information.getIndured_location();
	}

	/**
	* Sets the indured_location of this ext_information.
	*
	* @param indured_location the indured_location of this ext_information
	*/
	@Override
	public void setIndured_location(java.lang.String indured_location) {
		_ext_information.setIndured_location(indured_location);
	}

	/**
	* Returns the frist_insured of this ext_information.
	*
	* @return the frist_insured of this ext_information
	*/
	@Override
	public java.util.Date getFrist_insured() {
		return _ext_information.getFrist_insured();
	}

	/**
	* Sets the frist_insured of this ext_information.
	*
	* @param frist_insured the frist_insured of this ext_information
	*/
	@Override
	public void setFrist_insured(java.util.Date frist_insured) {
		_ext_information.setFrist_insured(frist_insured);
	}

	/**
	* Returns the is_insured of this ext_information.
	*
	* @return the is_insured of this ext_information
	*/
	@Override
	public java.lang.String getIs_insured() {
		return _ext_information.getIs_insured();
	}

	/**
	* Sets the is_insured of this ext_information.
	*
	* @param is_insured the is_insured of this ext_information
	*/
	@Override
	public void setIs_insured(java.lang.String is_insured) {
		_ext_information.setIs_insured(is_insured);
	}

	/**
	* Returns the company ID of this ext_information.
	*
	* @return the company ID of this ext_information
	*/
	@Override
	public long getCompanyId() {
		return _ext_information.getCompanyId();
	}

	/**
	* Sets the company ID of this ext_information.
	*
	* @param companyId the company ID of this ext_information
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ext_information.setCompanyId(companyId);
	}

	/**
	* Returns the createuser of this ext_information.
	*
	* @return the createuser of this ext_information
	*/
	@Override
	public long getCreateuser() {
		return _ext_information.getCreateuser();
	}

	/**
	* Sets the createuser of this ext_information.
	*
	* @param createuser the createuser of this ext_information
	*/
	@Override
	public void setCreateuser(long createuser) {
		_ext_information.setCreateuser(createuser);
	}

	/**
	* Returns the create date of this ext_information.
	*
	* @return the create date of this ext_information
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _ext_information.getCreateDate();
	}

	/**
	* Sets the create date of this ext_information.
	*
	* @param createDate the create date of this ext_information
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_ext_information.setCreateDate(createDate);
	}

	/**
	* Returns the modifieduser of this ext_information.
	*
	* @return the modifieduser of this ext_information
	*/
	@Override
	public long getModifieduser() {
		return _ext_information.getModifieduser();
	}

	/**
	* Sets the modifieduser of this ext_information.
	*
	* @param modifieduser the modifieduser of this ext_information
	*/
	@Override
	public void setModifieduser(long modifieduser) {
		_ext_information.setModifieduser(modifieduser);
	}

	/**
	* Returns the modified date of this ext_information.
	*
	* @return the modified date of this ext_information
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _ext_information.getModifiedDate();
	}

	/**
	* Sets the modified date of this ext_information.
	*
	* @param modifiedDate the modified date of this ext_information
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_ext_information.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this ext_information.
	*
	* @return the status of this ext_information
	*/
	@Override
	public int getStatus() {
		return _ext_information.getStatus();
	}

	/**
	* Returns the trash entry created when this ext_information was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this ext_information.
	*
	* @return the trash entry created when this ext_information was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ext_information.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this ext_information.
	*
	* @return the class primary key of the trash entry for this ext_information
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _ext_information.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this ext_information.
	*
	* @return the trash handler for this ext_information
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _ext_information.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this ext_information is in the Recycle Bin.
	*
	* @return <code>true</code> if this ext_information is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _ext_information.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this ext_information is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this ext_information is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _ext_information.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _ext_information.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_ext_information.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _ext_information.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ext_information.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _ext_information.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _ext_information.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ext_information.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ext_information.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_ext_information.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_ext_information.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ext_information.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ext_informationWrapper((ext_information)_ext_information.clone());
	}

	@Override
	public int compareTo(ext_information ext_information) {
		return _ext_information.compareTo(ext_information);
	}

	@Override
	public int hashCode() {
		return _ext_information.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ext_information> toCacheModel() {
		return _ext_information.toCacheModel();
	}

	@Override
	public ext_information toEscapedModel() {
		return new ext_informationWrapper(_ext_information.toEscapedModel());
	}

	@Override
	public ext_information toUnescapedModel() {
		return new ext_informationWrapper(_ext_information.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _ext_information.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ext_information.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_ext_information.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ext_informationWrapper)) {
			return false;
		}

		ext_informationWrapper ext_informationWrapper = (ext_informationWrapper)obj;

		if (Validator.equals(_ext_information,
					ext_informationWrapper._ext_information)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _ext_information.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ext_information getWrappedext_information() {
		return _ext_information;
	}

	@Override
	public ext_information getWrappedModel() {
		return _ext_information;
	}

	@Override
	public void resetOriginalValues() {
		_ext_information.resetOriginalValues();
	}

	private ext_information _ext_information;
}