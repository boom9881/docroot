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
 * This class is a wrapper for {@link Satff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Satff
 * @generated
 */
public class SatffWrapper implements Satff, ModelWrapper<Satff> {
	public SatffWrapper(Satff satff) {
		_satff = satff;
	}

	@Override
	public Class<?> getModelClass() {
		return Satff.class;
	}

	@Override
	public String getModelClassName() {
		return Satff.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("city", getCity());
		attributes.put("name", getName());
		attributes.put("turnover_time", getTurnover_time());
		attributes.put("entry_time", getEntry_time());
		attributes.put("base_pay", getBase_pay());
		attributes.put("performance_pay", getPerformance_pay());
		attributes.put("wage_subtotal", getWage_subtotal());
		attributes.put("insurance_base", getInsurance_base());
		attributes.put("endowment_insurance", getEndowment_insurance());
		attributes.put("unemployment_insurance", getUnemployment_insurance());
		attributes.put("work_injury_insurance", getWork_injury_insurance());
		attributes.put("birth_insurance", getBirth_insurance());
		attributes.put("medical_insurance", getMedical_insurance());
		attributes.put("individual_insurance", getIndividual_insurance());
		attributes.put("housing_accumulation_fund_base",
			getHousing_accumulation_fund_base());
		attributes.put("individual_pay", getIndividual_pay());
		attributes.put("amount_payable", getAmount_payable());
		attributes.put("people_together", getPeople_together());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date turnover_time = (Date)attributes.get("turnover_time");

		if (turnover_time != null) {
			setTurnover_time(turnover_time);
		}

		Date entry_time = (Date)attributes.get("entry_time");

		if (entry_time != null) {
			setEntry_time(entry_time);
		}

		Double base_pay = (Double)attributes.get("base_pay");

		if (base_pay != null) {
			setBase_pay(base_pay);
		}

		Double performance_pay = (Double)attributes.get("performance_pay");

		if (performance_pay != null) {
			setPerformance_pay(performance_pay);
		}

		Double wage_subtotal = (Double)attributes.get("wage_subtotal");

		if (wage_subtotal != null) {
			setWage_subtotal(wage_subtotal);
		}

		Double insurance_base = (Double)attributes.get("insurance_base");

		if (insurance_base != null) {
			setInsurance_base(insurance_base);
		}

		Double endowment_insurance = (Double)attributes.get(
				"endowment_insurance");

		if (endowment_insurance != null) {
			setEndowment_insurance(endowment_insurance);
		}

		Double unemployment_insurance = (Double)attributes.get(
				"unemployment_insurance");

		if (unemployment_insurance != null) {
			setUnemployment_insurance(unemployment_insurance);
		}

		Double work_injury_insurance = (Double)attributes.get(
				"work_injury_insurance");

		if (work_injury_insurance != null) {
			setWork_injury_insurance(work_injury_insurance);
		}

		Double birth_insurance = (Double)attributes.get("birth_insurance");

		if (birth_insurance != null) {
			setBirth_insurance(birth_insurance);
		}

		Double medical_insurance = (Double)attributes.get("medical_insurance");

		if (medical_insurance != null) {
			setMedical_insurance(medical_insurance);
		}

		Double individual_insurance = (Double)attributes.get(
				"individual_insurance");

		if (individual_insurance != null) {
			setIndividual_insurance(individual_insurance);
		}

		Double housing_accumulation_fund_base = (Double)attributes.get(
				"housing_accumulation_fund_base");

		if (housing_accumulation_fund_base != null) {
			setHousing_accumulation_fund_base(housing_accumulation_fund_base);
		}

		Double individual_pay = (Double)attributes.get("individual_pay");

		if (individual_pay != null) {
			setIndividual_pay(individual_pay);
		}

		Double amount_payable = (Double)attributes.get("amount_payable");

		if (amount_payable != null) {
			setAmount_payable(amount_payable);
		}

		Double people_together = (Double)attributes.get("people_together");

		if (people_together != null) {
			setPeople_together(people_together);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this satff.
	*
	* @return the primary key of this satff
	*/
	@Override
	public long getPrimaryKey() {
		return _satff.getPrimaryKey();
	}

	/**
	* Sets the primary key of this satff.
	*
	* @param primaryKey the primary key of this satff
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_satff.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this satff.
	*
	* @return the uuid of this satff
	*/
	@Override
	public java.lang.String getUuid() {
		return _satff.getUuid();
	}

	/**
	* Sets the uuid of this satff.
	*
	* @param uuid the uuid of this satff
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_satff.setUuid(uuid);
	}

	/**
	* Returns the ID of this satff.
	*
	* @return the ID of this satff
	*/
	@Override
	public long getId() {
		return _satff.getId();
	}

	/**
	* Sets the ID of this satff.
	*
	* @param id the ID of this satff
	*/
	@Override
	public void setId(long id) {
		_satff.setId(id);
	}

	/**
	* Returns the user_id of this satff.
	*
	* @return the user_id of this satff
	*/
	@Override
	public long getUser_id() {
		return _satff.getUser_id();
	}

	/**
	* Sets the user_id of this satff.
	*
	* @param user_id the user_id of this satff
	*/
	@Override
	public void setUser_id(long user_id) {
		_satff.setUser_id(user_id);
	}

	/**
	* Returns the city of this satff.
	*
	* @return the city of this satff
	*/
	@Override
	public java.lang.String getCity() {
		return _satff.getCity();
	}

	/**
	* Sets the city of this satff.
	*
	* @param city the city of this satff
	*/
	@Override
	public void setCity(java.lang.String city) {
		_satff.setCity(city);
	}

	/**
	* Returns the name of this satff.
	*
	* @return the name of this satff
	*/
	@Override
	public java.lang.String getName() {
		return _satff.getName();
	}

	/**
	* Sets the name of this satff.
	*
	* @param name the name of this satff
	*/
	@Override
	public void setName(java.lang.String name) {
		_satff.setName(name);
	}

	/**
	* Returns the turnover_time of this satff.
	*
	* @return the turnover_time of this satff
	*/
	@Override
	public java.util.Date getTurnover_time() {
		return _satff.getTurnover_time();
	}

	/**
	* Sets the turnover_time of this satff.
	*
	* @param turnover_time the turnover_time of this satff
	*/
	@Override
	public void setTurnover_time(java.util.Date turnover_time) {
		_satff.setTurnover_time(turnover_time);
	}

	/**
	* Returns the entry_time of this satff.
	*
	* @return the entry_time of this satff
	*/
	@Override
	public java.util.Date getEntry_time() {
		return _satff.getEntry_time();
	}

	/**
	* Sets the entry_time of this satff.
	*
	* @param entry_time the entry_time of this satff
	*/
	@Override
	public void setEntry_time(java.util.Date entry_time) {
		_satff.setEntry_time(entry_time);
	}

	/**
	* Returns the base_pay of this satff.
	*
	* @return the base_pay of this satff
	*/
	@Override
	public double getBase_pay() {
		return _satff.getBase_pay();
	}

	/**
	* Sets the base_pay of this satff.
	*
	* @param base_pay the base_pay of this satff
	*/
	@Override
	public void setBase_pay(double base_pay) {
		_satff.setBase_pay(base_pay);
	}

	/**
	* Returns the performance_pay of this satff.
	*
	* @return the performance_pay of this satff
	*/
	@Override
	public double getPerformance_pay() {
		return _satff.getPerformance_pay();
	}

	/**
	* Sets the performance_pay of this satff.
	*
	* @param performance_pay the performance_pay of this satff
	*/
	@Override
	public void setPerformance_pay(double performance_pay) {
		_satff.setPerformance_pay(performance_pay);
	}

	/**
	* Returns the wage_subtotal of this satff.
	*
	* @return the wage_subtotal of this satff
	*/
	@Override
	public double getWage_subtotal() {
		return _satff.getWage_subtotal();
	}

	/**
	* Sets the wage_subtotal of this satff.
	*
	* @param wage_subtotal the wage_subtotal of this satff
	*/
	@Override
	public void setWage_subtotal(double wage_subtotal) {
		_satff.setWage_subtotal(wage_subtotal);
	}

	/**
	* Returns the insurance_base of this satff.
	*
	* @return the insurance_base of this satff
	*/
	@Override
	public double getInsurance_base() {
		return _satff.getInsurance_base();
	}

	/**
	* Sets the insurance_base of this satff.
	*
	* @param insurance_base the insurance_base of this satff
	*/
	@Override
	public void setInsurance_base(double insurance_base) {
		_satff.setInsurance_base(insurance_base);
	}

	/**
	* Returns the endowment_insurance of this satff.
	*
	* @return the endowment_insurance of this satff
	*/
	@Override
	public double getEndowment_insurance() {
		return _satff.getEndowment_insurance();
	}

	/**
	* Sets the endowment_insurance of this satff.
	*
	* @param endowment_insurance the endowment_insurance of this satff
	*/
	@Override
	public void setEndowment_insurance(double endowment_insurance) {
		_satff.setEndowment_insurance(endowment_insurance);
	}

	/**
	* Returns the unemployment_insurance of this satff.
	*
	* @return the unemployment_insurance of this satff
	*/
	@Override
	public double getUnemployment_insurance() {
		return _satff.getUnemployment_insurance();
	}

	/**
	* Sets the unemployment_insurance of this satff.
	*
	* @param unemployment_insurance the unemployment_insurance of this satff
	*/
	@Override
	public void setUnemployment_insurance(double unemployment_insurance) {
		_satff.setUnemployment_insurance(unemployment_insurance);
	}

	/**
	* Returns the work_injury_insurance of this satff.
	*
	* @return the work_injury_insurance of this satff
	*/
	@Override
	public double getWork_injury_insurance() {
		return _satff.getWork_injury_insurance();
	}

	/**
	* Sets the work_injury_insurance of this satff.
	*
	* @param work_injury_insurance the work_injury_insurance of this satff
	*/
	@Override
	public void setWork_injury_insurance(double work_injury_insurance) {
		_satff.setWork_injury_insurance(work_injury_insurance);
	}

	/**
	* Returns the birth_insurance of this satff.
	*
	* @return the birth_insurance of this satff
	*/
	@Override
	public double getBirth_insurance() {
		return _satff.getBirth_insurance();
	}

	/**
	* Sets the birth_insurance of this satff.
	*
	* @param birth_insurance the birth_insurance of this satff
	*/
	@Override
	public void setBirth_insurance(double birth_insurance) {
		_satff.setBirth_insurance(birth_insurance);
	}

	/**
	* Returns the medical_insurance of this satff.
	*
	* @return the medical_insurance of this satff
	*/
	@Override
	public double getMedical_insurance() {
		return _satff.getMedical_insurance();
	}

	/**
	* Sets the medical_insurance of this satff.
	*
	* @param medical_insurance the medical_insurance of this satff
	*/
	@Override
	public void setMedical_insurance(double medical_insurance) {
		_satff.setMedical_insurance(medical_insurance);
	}

	/**
	* Returns the individual_insurance of this satff.
	*
	* @return the individual_insurance of this satff
	*/
	@Override
	public double getIndividual_insurance() {
		return _satff.getIndividual_insurance();
	}

	/**
	* Sets the individual_insurance of this satff.
	*
	* @param individual_insurance the individual_insurance of this satff
	*/
	@Override
	public void setIndividual_insurance(double individual_insurance) {
		_satff.setIndividual_insurance(individual_insurance);
	}

	/**
	* Returns the housing_accumulation_fund_base of this satff.
	*
	* @return the housing_accumulation_fund_base of this satff
	*/
	@Override
	public double getHousing_accumulation_fund_base() {
		return _satff.getHousing_accumulation_fund_base();
	}

	/**
	* Sets the housing_accumulation_fund_base of this satff.
	*
	* @param housing_accumulation_fund_base the housing_accumulation_fund_base of this satff
	*/
	@Override
	public void setHousing_accumulation_fund_base(
		double housing_accumulation_fund_base) {
		_satff.setHousing_accumulation_fund_base(housing_accumulation_fund_base);
	}

	/**
	* Returns the individual_pay of this satff.
	*
	* @return the individual_pay of this satff
	*/
	@Override
	public double getIndividual_pay() {
		return _satff.getIndividual_pay();
	}

	/**
	* Sets the individual_pay of this satff.
	*
	* @param individual_pay the individual_pay of this satff
	*/
	@Override
	public void setIndividual_pay(double individual_pay) {
		_satff.setIndividual_pay(individual_pay);
	}

	/**
	* Returns the amount_payable of this satff.
	*
	* @return the amount_payable of this satff
	*/
	@Override
	public double getAmount_payable() {
		return _satff.getAmount_payable();
	}

	/**
	* Sets the amount_payable of this satff.
	*
	* @param amount_payable the amount_payable of this satff
	*/
	@Override
	public void setAmount_payable(double amount_payable) {
		_satff.setAmount_payable(amount_payable);
	}

	/**
	* Returns the people_together of this satff.
	*
	* @return the people_together of this satff
	*/
	@Override
	public double getPeople_together() {
		return _satff.getPeople_together();
	}

	/**
	* Sets the people_together of this satff.
	*
	* @param people_together the people_together of this satff
	*/
	@Override
	public void setPeople_together(double people_together) {
		_satff.setPeople_together(people_together);
	}

	/**
	* Returns the company ID of this satff.
	*
	* @return the company ID of this satff
	*/
	@Override
	public long getCompanyId() {
		return _satff.getCompanyId();
	}

	/**
	* Sets the company ID of this satff.
	*
	* @param companyId the company ID of this satff
	*/
	@Override
	public void setCompanyId(long companyId) {
		_satff.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this satff.
	*
	* @return the user ID of this satff
	*/
	@Override
	public long getUserId() {
		return _satff.getUserId();
	}

	/**
	* Sets the user ID of this satff.
	*
	* @param userId the user ID of this satff
	*/
	@Override
	public void setUserId(long userId) {
		_satff.setUserId(userId);
	}

	/**
	* Returns the user uuid of this satff.
	*
	* @return the user uuid of this satff
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _satff.getUserUuid();
	}

	/**
	* Sets the user uuid of this satff.
	*
	* @param userUuid the user uuid of this satff
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_satff.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this satff.
	*
	* @return the user name of this satff
	*/
	@Override
	public java.lang.String getUserName() {
		return _satff.getUserName();
	}

	/**
	* Sets the user name of this satff.
	*
	* @param userName the user name of this satff
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_satff.setUserName(userName);
	}

	/**
	* Returns the create date of this satff.
	*
	* @return the create date of this satff
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _satff.getCreateDate();
	}

	/**
	* Sets the create date of this satff.
	*
	* @param createDate the create date of this satff
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_satff.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this satff.
	*
	* @return the modified date of this satff
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _satff.getModifiedDate();
	}

	/**
	* Sets the modified date of this satff.
	*
	* @param modifiedDate the modified date of this satff
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_satff.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this satff.
	*
	* @return the status of this satff
	*/
	@Override
	public int getStatus() {
		return _satff.getStatus();
	}

	/**
	* Returns the trash entry created when this satff was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this satff.
	*
	* @return the trash entry created when this satff was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _satff.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this satff.
	*
	* @return the class primary key of the trash entry for this satff
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _satff.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this satff.
	*
	* @return the trash handler for this satff
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _satff.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this satff is in the Recycle Bin.
	*
	* @return <code>true</code> if this satff is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _satff.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this satff is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this satff is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _satff.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _satff.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_satff.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _satff.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_satff.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _satff.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _satff.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_satff.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _satff.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_satff.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_satff.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_satff.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SatffWrapper((Satff)_satff.clone());
	}

	@Override
	public int compareTo(com.shuntian.portlet.intranet.model.Satff satff) {
		return _satff.compareTo(satff);
	}

	@Override
	public int hashCode() {
		return _satff.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.Satff> toCacheModel() {
		return _satff.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.Satff toEscapedModel() {
		return new SatffWrapper(_satff.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.Satff toUnescapedModel() {
		return new SatffWrapper(_satff.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _satff.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _satff.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_satff.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SatffWrapper)) {
			return false;
		}

		SatffWrapper satffWrapper = (SatffWrapper)obj;

		if (Validator.equals(_satff, satffWrapper._satff)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _satff.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Satff getWrappedSatff() {
		return _satff;
	}

	@Override
	public Satff getWrappedModel() {
		return _satff;
	}

	@Override
	public void resetOriginalValues() {
		_satff.resetOriginalValues();
	}

	private Satff _satff;
}