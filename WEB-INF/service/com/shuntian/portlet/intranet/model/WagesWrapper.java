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
 * This class is a wrapper for {@link Wages}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Wages
 * @generated
 */
public class WagesWrapper implements Wages, ModelWrapper<Wages> {
	public WagesWrapper(Wages wages) {
		_wages = wages;
	}

	@Override
	public Class<?> getModelClass() {
		return Wages.class;
	}

	@Override
	public String getModelClassName() {
		return Wages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("wageName", getWageName());
		attributes.put("distributionMonth", getDistributionMonth());
		attributes.put("distributionYear", getDistributionYear());
		attributes.put("entryDate", getEntryDate());
		attributes.put("departureDate", getDepartureDate());
		attributes.put("userWage", getUserWage());
		attributes.put("userPerformance", getUserPerformance());
		attributes.put("userTotalWage", getUserTotalWage());
		attributes.put("attendance", getAttendance());
		attributes.put("realAttendance", getRealAttendance());
		attributes.put("basePay", getBasePay());
		attributes.put("overtimeWages", getOvertimeWages());
		attributes.put("performanceScores", getPerformanceScores());
		attributes.put("performanceSalary", getPerformanceSalary());
		attributes.put("allowance", getAllowance());
		attributes.put("totalWages", getTotalWages());
		attributes.put("socialCompanyBearPart", getSocialCompanyBearPart());
		attributes.put("socialIndividualsBearPart",
			getSocialIndividualsBearPart());
		attributes.put("taxableIncome", getTaxableIncome());
		attributes.put("taxRate", getTaxRate());
		attributes.put("taxes", getTaxes());
		attributes.put("realWages", getRealWages());
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

		String wageName = (String)attributes.get("wageName");

		if (wageName != null) {
			setWageName(wageName);
		}

		Long distributionMonth = (Long)attributes.get("distributionMonth");

		if (distributionMonth != null) {
			setDistributionMonth(distributionMonth);
		}

		Long distributionYear = (Long)attributes.get("distributionYear");

		if (distributionYear != null) {
			setDistributionYear(distributionYear);
		}

		Date entryDate = (Date)attributes.get("entryDate");

		if (entryDate != null) {
			setEntryDate(entryDate);
		}

		Date departureDate = (Date)attributes.get("departureDate");

		if (departureDate != null) {
			setDepartureDate(departureDate);
		}

		Double userWage = (Double)attributes.get("userWage");

		if (userWage != null) {
			setUserWage(userWage);
		}

		Double userPerformance = (Double)attributes.get("userPerformance");

		if (userPerformance != null) {
			setUserPerformance(userPerformance);
		}

		Double userTotalWage = (Double)attributes.get("userTotalWage");

		if (userTotalWage != null) {
			setUserTotalWage(userTotalWage);
		}

		Double attendance = (Double)attributes.get("attendance");

		if (attendance != null) {
			setAttendance(attendance);
		}

		Double realAttendance = (Double)attributes.get("realAttendance");

		if (realAttendance != null) {
			setRealAttendance(realAttendance);
		}

		Double basePay = (Double)attributes.get("basePay");

		if (basePay != null) {
			setBasePay(basePay);
		}

		Double overtimeWages = (Double)attributes.get("overtimeWages");

		if (overtimeWages != null) {
			setOvertimeWages(overtimeWages);
		}

		Double performanceScores = (Double)attributes.get("performanceScores");

		if (performanceScores != null) {
			setPerformanceScores(performanceScores);
		}

		Double performanceSalary = (Double)attributes.get("performanceSalary");

		if (performanceSalary != null) {
			setPerformanceSalary(performanceSalary);
		}

		Double allowance = (Double)attributes.get("allowance");

		if (allowance != null) {
			setAllowance(allowance);
		}

		Double totalWages = (Double)attributes.get("totalWages");

		if (totalWages != null) {
			setTotalWages(totalWages);
		}

		Double socialCompanyBearPart = (Double)attributes.get(
				"socialCompanyBearPart");

		if (socialCompanyBearPart != null) {
			setSocialCompanyBearPart(socialCompanyBearPart);
		}

		Double socialIndividualsBearPart = (Double)attributes.get(
				"socialIndividualsBearPart");

		if (socialIndividualsBearPart != null) {
			setSocialIndividualsBearPart(socialIndividualsBearPart);
		}

		Double taxableIncome = (Double)attributes.get("taxableIncome");

		if (taxableIncome != null) {
			setTaxableIncome(taxableIncome);
		}

		Double taxRate = (Double)attributes.get("taxRate");

		if (taxRate != null) {
			setTaxRate(taxRate);
		}

		Double taxes = (Double)attributes.get("taxes");

		if (taxes != null) {
			setTaxes(taxes);
		}

		Double realWages = (Double)attributes.get("realWages");

		if (realWages != null) {
			setRealWages(realWages);
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
	* Returns the primary key of this wages.
	*
	* @return the primary key of this wages
	*/
	@Override
	public long getPrimaryKey() {
		return _wages.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wages.
	*
	* @param primaryKey the primary key of this wages
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wages.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this wages.
	*
	* @return the ID of this wages
	*/
	@Override
	public long getId() {
		return _wages.getId();
	}

	/**
	* Sets the ID of this wages.
	*
	* @param id the ID of this wages
	*/
	@Override
	public void setId(long id) {
		_wages.setId(id);
	}

	/**
	* Returns the user ID of this wages.
	*
	* @return the user ID of this wages
	*/
	@Override
	public long getUserId() {
		return _wages.getUserId();
	}

	/**
	* Sets the user ID of this wages.
	*
	* @param userId the user ID of this wages
	*/
	@Override
	public void setUserId(long userId) {
		_wages.setUserId(userId);
	}

	/**
	* Returns the user uuid of this wages.
	*
	* @return the user uuid of this wages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wages.getUserUuid();
	}

	/**
	* Sets the user uuid of this wages.
	*
	* @param userUuid the user uuid of this wages
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_wages.setUserUuid(userUuid);
	}

	/**
	* Returns the wage name of this wages.
	*
	* @return the wage name of this wages
	*/
	@Override
	public java.lang.String getWageName() {
		return _wages.getWageName();
	}

	/**
	* Sets the wage name of this wages.
	*
	* @param wageName the wage name of this wages
	*/
	@Override
	public void setWageName(java.lang.String wageName) {
		_wages.setWageName(wageName);
	}

	/**
	* Returns the distribution month of this wages.
	*
	* @return the distribution month of this wages
	*/
	@Override
	public long getDistributionMonth() {
		return _wages.getDistributionMonth();
	}

	/**
	* Sets the distribution month of this wages.
	*
	* @param distributionMonth the distribution month of this wages
	*/
	@Override
	public void setDistributionMonth(long distributionMonth) {
		_wages.setDistributionMonth(distributionMonth);
	}

	/**
	* Returns the distribution year of this wages.
	*
	* @return the distribution year of this wages
	*/
	@Override
	public long getDistributionYear() {
		return _wages.getDistributionYear();
	}

	/**
	* Sets the distribution year of this wages.
	*
	* @param distributionYear the distribution year of this wages
	*/
	@Override
	public void setDistributionYear(long distributionYear) {
		_wages.setDistributionYear(distributionYear);
	}

	/**
	* Returns the entry date of this wages.
	*
	* @return the entry date of this wages
	*/
	@Override
	public java.util.Date getEntryDate() {
		return _wages.getEntryDate();
	}

	/**
	* Sets the entry date of this wages.
	*
	* @param entryDate the entry date of this wages
	*/
	@Override
	public void setEntryDate(java.util.Date entryDate) {
		_wages.setEntryDate(entryDate);
	}

	/**
	* Returns the departure date of this wages.
	*
	* @return the departure date of this wages
	*/
	@Override
	public java.util.Date getDepartureDate() {
		return _wages.getDepartureDate();
	}

	/**
	* Sets the departure date of this wages.
	*
	* @param departureDate the departure date of this wages
	*/
	@Override
	public void setDepartureDate(java.util.Date departureDate) {
		_wages.setDepartureDate(departureDate);
	}

	/**
	* Returns the user wage of this wages.
	*
	* @return the user wage of this wages
	*/
	@Override
	public double getUserWage() {
		return _wages.getUserWage();
	}

	/**
	* Sets the user wage of this wages.
	*
	* @param userWage the user wage of this wages
	*/
	@Override
	public void setUserWage(double userWage) {
		_wages.setUserWage(userWage);
	}

	/**
	* Returns the user performance of this wages.
	*
	* @return the user performance of this wages
	*/
	@Override
	public double getUserPerformance() {
		return _wages.getUserPerformance();
	}

	/**
	* Sets the user performance of this wages.
	*
	* @param userPerformance the user performance of this wages
	*/
	@Override
	public void setUserPerformance(double userPerformance) {
		_wages.setUserPerformance(userPerformance);
	}

	/**
	* Returns the user total wage of this wages.
	*
	* @return the user total wage of this wages
	*/
	@Override
	public double getUserTotalWage() {
		return _wages.getUserTotalWage();
	}

	/**
	* Sets the user total wage of this wages.
	*
	* @param userTotalWage the user total wage of this wages
	*/
	@Override
	public void setUserTotalWage(double userTotalWage) {
		_wages.setUserTotalWage(userTotalWage);
	}

	/**
	* Returns the attendance of this wages.
	*
	* @return the attendance of this wages
	*/
	@Override
	public double getAttendance() {
		return _wages.getAttendance();
	}

	/**
	* Sets the attendance of this wages.
	*
	* @param attendance the attendance of this wages
	*/
	@Override
	public void setAttendance(double attendance) {
		_wages.setAttendance(attendance);
	}

	/**
	* Returns the real attendance of this wages.
	*
	* @return the real attendance of this wages
	*/
	@Override
	public double getRealAttendance() {
		return _wages.getRealAttendance();
	}

	/**
	* Sets the real attendance of this wages.
	*
	* @param realAttendance the real attendance of this wages
	*/
	@Override
	public void setRealAttendance(double realAttendance) {
		_wages.setRealAttendance(realAttendance);
	}

	/**
	* Returns the base pay of this wages.
	*
	* @return the base pay of this wages
	*/
	@Override
	public double getBasePay() {
		return _wages.getBasePay();
	}

	/**
	* Sets the base pay of this wages.
	*
	* @param basePay the base pay of this wages
	*/
	@Override
	public void setBasePay(double basePay) {
		_wages.setBasePay(basePay);
	}

	/**
	* Returns the overtime wages of this wages.
	*
	* @return the overtime wages of this wages
	*/
	@Override
	public double getOvertimeWages() {
		return _wages.getOvertimeWages();
	}

	/**
	* Sets the overtime wages of this wages.
	*
	* @param overtimeWages the overtime wages of this wages
	*/
	@Override
	public void setOvertimeWages(double overtimeWages) {
		_wages.setOvertimeWages(overtimeWages);
	}

	/**
	* Returns the performance scores of this wages.
	*
	* @return the performance scores of this wages
	*/
	@Override
	public double getPerformanceScores() {
		return _wages.getPerformanceScores();
	}

	/**
	* Sets the performance scores of this wages.
	*
	* @param performanceScores the performance scores of this wages
	*/
	@Override
	public void setPerformanceScores(double performanceScores) {
		_wages.setPerformanceScores(performanceScores);
	}

	/**
	* Returns the performance salary of this wages.
	*
	* @return the performance salary of this wages
	*/
	@Override
	public double getPerformanceSalary() {
		return _wages.getPerformanceSalary();
	}

	/**
	* Sets the performance salary of this wages.
	*
	* @param performanceSalary the performance salary of this wages
	*/
	@Override
	public void setPerformanceSalary(double performanceSalary) {
		_wages.setPerformanceSalary(performanceSalary);
	}

	/**
	* Returns the allowance of this wages.
	*
	* @return the allowance of this wages
	*/
	@Override
	public double getAllowance() {
		return _wages.getAllowance();
	}

	/**
	* Sets the allowance of this wages.
	*
	* @param allowance the allowance of this wages
	*/
	@Override
	public void setAllowance(double allowance) {
		_wages.setAllowance(allowance);
	}

	/**
	* Returns the total wages of this wages.
	*
	* @return the total wages of this wages
	*/
	@Override
	public double getTotalWages() {
		return _wages.getTotalWages();
	}

	/**
	* Sets the total wages of this wages.
	*
	* @param totalWages the total wages of this wages
	*/
	@Override
	public void setTotalWages(double totalWages) {
		_wages.setTotalWages(totalWages);
	}

	/**
	* Returns the social company bear part of this wages.
	*
	* @return the social company bear part of this wages
	*/
	@Override
	public double getSocialCompanyBearPart() {
		return _wages.getSocialCompanyBearPart();
	}

	/**
	* Sets the social company bear part of this wages.
	*
	* @param socialCompanyBearPart the social company bear part of this wages
	*/
	@Override
	public void setSocialCompanyBearPart(double socialCompanyBearPart) {
		_wages.setSocialCompanyBearPart(socialCompanyBearPart);
	}

	/**
	* Returns the social individuals bear part of this wages.
	*
	* @return the social individuals bear part of this wages
	*/
	@Override
	public double getSocialIndividualsBearPart() {
		return _wages.getSocialIndividualsBearPart();
	}

	/**
	* Sets the social individuals bear part of this wages.
	*
	* @param socialIndividualsBearPart the social individuals bear part of this wages
	*/
	@Override
	public void setSocialIndividualsBearPart(double socialIndividualsBearPart) {
		_wages.setSocialIndividualsBearPart(socialIndividualsBearPart);
	}

	/**
	* Returns the taxable income of this wages.
	*
	* @return the taxable income of this wages
	*/
	@Override
	public double getTaxableIncome() {
		return _wages.getTaxableIncome();
	}

	/**
	* Sets the taxable income of this wages.
	*
	* @param taxableIncome the taxable income of this wages
	*/
	@Override
	public void setTaxableIncome(double taxableIncome) {
		_wages.setTaxableIncome(taxableIncome);
	}

	/**
	* Returns the tax rate of this wages.
	*
	* @return the tax rate of this wages
	*/
	@Override
	public double getTaxRate() {
		return _wages.getTaxRate();
	}

	/**
	* Sets the tax rate of this wages.
	*
	* @param taxRate the tax rate of this wages
	*/
	@Override
	public void setTaxRate(double taxRate) {
		_wages.setTaxRate(taxRate);
	}

	/**
	* Returns the taxes of this wages.
	*
	* @return the taxes of this wages
	*/
	@Override
	public double getTaxes() {
		return _wages.getTaxes();
	}

	/**
	* Sets the taxes of this wages.
	*
	* @param taxes the taxes of this wages
	*/
	@Override
	public void setTaxes(double taxes) {
		_wages.setTaxes(taxes);
	}

	/**
	* Returns the real wages of this wages.
	*
	* @return the real wages of this wages
	*/
	@Override
	public double getRealWages() {
		return _wages.getRealWages();
	}

	/**
	* Sets the real wages of this wages.
	*
	* @param realWages the real wages of this wages
	*/
	@Override
	public void setRealWages(double realWages) {
		_wages.setRealWages(realWages);
	}

	/**
	* Returns the create user ID of this wages.
	*
	* @return the create user ID of this wages
	*/
	@Override
	public long getCreateUserId() {
		return _wages.getCreateUserId();
	}

	/**
	* Sets the create user ID of this wages.
	*
	* @param createUserId the create user ID of this wages
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_wages.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this wages.
	*
	* @return the create user uuid of this wages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wages.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this wages.
	*
	* @param createUserUuid the create user uuid of this wages
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_wages.setCreateUserUuid(createUserUuid);
	}

	/**
	* Returns the create date of this wages.
	*
	* @return the create date of this wages
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _wages.getCreateDate();
	}

	/**
	* Sets the create date of this wages.
	*
	* @param createDate the create date of this wages
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_wages.setCreateDate(createDate);
	}

	/**
	* Returns the modified user ID of this wages.
	*
	* @return the modified user ID of this wages
	*/
	@Override
	public long getModifiedUserId() {
		return _wages.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this wages.
	*
	* @param modifiedUserId the modified user ID of this wages
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_wages.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this wages.
	*
	* @return the modified user uuid of this wages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wages.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this wages.
	*
	* @param modifiedUserUuid the modified user uuid of this wages
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_wages.setModifiedUserUuid(modifiedUserUuid);
	}

	/**
	* Returns the modified date of this wages.
	*
	* @return the modified date of this wages
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _wages.getModifiedDate();
	}

	/**
	* Sets the modified date of this wages.
	*
	* @param modifiedDate the modified date of this wages
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_wages.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _wages.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_wages.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _wages.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wages.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _wages.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _wages.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wages.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wages.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_wages.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_wages.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wages.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WagesWrapper((Wages)_wages.clone());
	}

	@Override
	public int compareTo(com.shuntian.portlet.intranet.model.Wages wages) {
		return _wages.compareTo(wages);
	}

	@Override
	public int hashCode() {
		return _wages.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.Wages> toCacheModel() {
		return _wages.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.Wages toEscapedModel() {
		return new WagesWrapper(_wages.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.Wages toUnescapedModel() {
		return new WagesWrapper(_wages.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wages.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wages.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wages.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WagesWrapper)) {
			return false;
		}

		WagesWrapper wagesWrapper = (WagesWrapper)obj;

		if (Validator.equals(_wages, wagesWrapper._wages)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Wages getWrappedWages() {
		return _wages;
	}

	@Override
	public Wages getWrappedModel() {
		return _wages;
	}

	@Override
	public void resetOriginalValues() {
		_wages.resetOriginalValues();
	}

	private Wages _wages;
}