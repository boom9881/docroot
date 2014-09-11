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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Wages service. Represents a row in the &quot;Intranet_Wages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.shuntian.portlet.intranet.model.impl.WagesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.shuntian.portlet.intranet.model.impl.WagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Wages
 * @see com.shuntian.portlet.intranet.model.impl.WagesImpl
 * @see com.shuntian.portlet.intranet.model.impl.WagesModelImpl
 * @generated
 */
public interface WagesModel extends BaseModel<Wages> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wages model instance should use the {@link Wages} interface instead.
	 */

	/**
	 * Returns the primary key of this wages.
	 *
	 * @return the primary key of this wages
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wages.
	 *
	 * @param primaryKey the primary key of this wages
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this wages.
	 *
	 * @return the ID of this wages
	 */
	public long getId();

	/**
	 * Sets the ID of this wages.
	 *
	 * @param id the ID of this wages
	 */
	public void setId(long id);

	/**
	 * Returns the user ID of this wages.
	 *
	 * @return the user ID of this wages
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this wages.
	 *
	 * @param userId the user ID of this wages
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this wages.
	 *
	 * @return the user uuid of this wages
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this wages.
	 *
	 * @param userUuid the user uuid of this wages
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the wage name of this wages.
	 *
	 * @return the wage name of this wages
	 */
	@AutoEscape
	public String getWageName();

	/**
	 * Sets the wage name of this wages.
	 *
	 * @param wageName the wage name of this wages
	 */
	public void setWageName(String wageName);

	/**
	 * Returns the entry date of this wages.
	 *
	 * @return the entry date of this wages
	 */
	public Date getEntryDate();

	/**
	 * Sets the entry date of this wages.
	 *
	 * @param entryDate the entry date of this wages
	 */
	public void setEntryDate(Date entryDate);

	/**
	 * Returns the departure date of this wages.
	 *
	 * @return the departure date of this wages
	 */
	public Date getDepartureDate();

	/**
	 * Sets the departure date of this wages.
	 *
	 * @param departureDate the departure date of this wages
	 */
	public void setDepartureDate(Date departureDate);

	/**
	 * Returns the user wage of this wages.
	 *
	 * @return the user wage of this wages
	 */
	public double getUserWage();

	/**
	 * Sets the user wage of this wages.
	 *
	 * @param userWage the user wage of this wages
	 */
	public void setUserWage(double userWage);

	/**
	 * Returns the user performance of this wages.
	 *
	 * @return the user performance of this wages
	 */
	public double getUserPerformance();

	/**
	 * Sets the user performance of this wages.
	 *
	 * @param userPerformance the user performance of this wages
	 */
	public void setUserPerformance(double userPerformance);

	/**
	 * Returns the user total wage of this wages.
	 *
	 * @return the user total wage of this wages
	 */
	public double getUserTotalWage();

	/**
	 * Sets the user total wage of this wages.
	 *
	 * @param userTotalWage the user total wage of this wages
	 */
	public void setUserTotalWage(double userTotalWage);

	/**
	 * Returns the attendance of this wages.
	 *
	 * @return the attendance of this wages
	 */
	public double getAttendance();

	/**
	 * Sets the attendance of this wages.
	 *
	 * @param attendance the attendance of this wages
	 */
	public void setAttendance(double attendance);

	/**
	 * Returns the real attendance of this wages.
	 *
	 * @return the real attendance of this wages
	 */
	public double getRealAttendance();

	/**
	 * Sets the real attendance of this wages.
	 *
	 * @param realAttendance the real attendance of this wages
	 */
	public void setRealAttendance(double realAttendance);

	/**
	 * Returns the distribution month of this wages.
	 *
	 * @return the distribution month of this wages
	 */
	public long getDistributionMonth();

	/**
	 * Sets the distribution month of this wages.
	 *
	 * @param distributionMonth the distribution month of this wages
	 */
	public void setDistributionMonth(long distributionMonth);

	/**
	 * Returns the base pay of this wages.
	 *
	 * @return the base pay of this wages
	 */
	public double getBasePay();

	/**
	 * Sets the base pay of this wages.
	 *
	 * @param basePay the base pay of this wages
	 */
	public void setBasePay(double basePay);

	/**
	 * Returns the overtime wages of this wages.
	 *
	 * @return the overtime wages of this wages
	 */
	public double getOvertimeWages();

	/**
	 * Sets the overtime wages of this wages.
	 *
	 * @param overtimeWages the overtime wages of this wages
	 */
	public void setOvertimeWages(double overtimeWages);

	/**
	 * Returns the performance scores of this wages.
	 *
	 * @return the performance scores of this wages
	 */
	public double getPerformanceScores();

	/**
	 * Sets the performance scores of this wages.
	 *
	 * @param performanceScores the performance scores of this wages
	 */
	public void setPerformanceScores(double performanceScores);

	/**
	 * Returns the performance salary of this wages.
	 *
	 * @return the performance salary of this wages
	 */
	public double getPerformanceSalary();

	/**
	 * Sets the performance salary of this wages.
	 *
	 * @param performanceSalary the performance salary of this wages
	 */
	public void setPerformanceSalary(double performanceSalary);

	/**
	 * Returns the allowance of this wages.
	 *
	 * @return the allowance of this wages
	 */
	public double getAllowance();

	/**
	 * Sets the allowance of this wages.
	 *
	 * @param allowance the allowance of this wages
	 */
	public void setAllowance(double allowance);

	/**
	 * Returns the total wages of this wages.
	 *
	 * @return the total wages of this wages
	 */
	public double getTotalWages();

	/**
	 * Sets the total wages of this wages.
	 *
	 * @param totalWages the total wages of this wages
	 */
	public void setTotalWages(double totalWages);

	/**
	 * Returns the social company bear part of this wages.
	 *
	 * @return the social company bear part of this wages
	 */
	public double getSocialCompanyBearPart();

	/**
	 * Sets the social company bear part of this wages.
	 *
	 * @param socialCompanyBearPart the social company bear part of this wages
	 */
	public void setSocialCompanyBearPart(double socialCompanyBearPart);

	/**
	 * Returns the social individuals bear part of this wages.
	 *
	 * @return the social individuals bear part of this wages
	 */
	public double getSocialIndividualsBearPart();

	/**
	 * Sets the social individuals bear part of this wages.
	 *
	 * @param socialIndividualsBearPart the social individuals bear part of this wages
	 */
	public void setSocialIndividualsBearPart(double socialIndividualsBearPart);

	/**
	 * Returns the taxable income of this wages.
	 *
	 * @return the taxable income of this wages
	 */
	public double getTaxableIncome();

	/**
	 * Sets the taxable income of this wages.
	 *
	 * @param taxableIncome the taxable income of this wages
	 */
	public void setTaxableIncome(double taxableIncome);

	/**
	 * Returns the tax rate of this wages.
	 *
	 * @return the tax rate of this wages
	 */
	public double getTaxRate();

	/**
	 * Sets the tax rate of this wages.
	 *
	 * @param taxRate the tax rate of this wages
	 */
	public void setTaxRate(double taxRate);

	/**
	 * Returns the taxes of this wages.
	 *
	 * @return the taxes of this wages
	 */
	public double getTaxes();

	/**
	 * Sets the taxes of this wages.
	 *
	 * @param taxes the taxes of this wages
	 */
	public void setTaxes(double taxes);

	/**
	 * Returns the real wages of this wages.
	 *
	 * @return the real wages of this wages
	 */
	public double getRealWages();

	/**
	 * Sets the real wages of this wages.
	 *
	 * @param realWages the real wages of this wages
	 */
	public void setRealWages(double realWages);

	/**
	 * Returns the create user ID of this wages.
	 *
	 * @return the create user ID of this wages
	 */
	public long getCreateUserId();

	/**
	 * Sets the create user ID of this wages.
	 *
	 * @param createUserId the create user ID of this wages
	 */
	public void setCreateUserId(long createUserId);

	/**
	 * Returns the create user uuid of this wages.
	 *
	 * @return the create user uuid of this wages
	 * @throws SystemException if a system exception occurred
	 */
	public String getCreateUserUuid() throws SystemException;

	/**
	 * Sets the create user uuid of this wages.
	 *
	 * @param createUserUuid the create user uuid of this wages
	 */
	public void setCreateUserUuid(String createUserUuid);

	/**
	 * Returns the create date of this wages.
	 *
	 * @return the create date of this wages
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this wages.
	 *
	 * @param createDate the create date of this wages
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified user ID of this wages.
	 *
	 * @return the modified user ID of this wages
	 */
	public long getModifiedUserId();

	/**
	 * Sets the modified user ID of this wages.
	 *
	 * @param modifiedUserId the modified user ID of this wages
	 */
	public void setModifiedUserId(long modifiedUserId);

	/**
	 * Returns the modified user uuid of this wages.
	 *
	 * @return the modified user uuid of this wages
	 * @throws SystemException if a system exception occurred
	 */
	public String getModifiedUserUuid() throws SystemException;

	/**
	 * Sets the modified user uuid of this wages.
	 *
	 * @param modifiedUserUuid the modified user uuid of this wages
	 */
	public void setModifiedUserUuid(String modifiedUserUuid);

	/**
	 * Returns the modified date of this wages.
	 *
	 * @return the modified date of this wages
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this wages.
	 *
	 * @param modifiedDate the modified date of this wages
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Wages wages);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Wages> toCacheModel();

	@Override
	public Wages toEscapedModel();

	@Override
	public Wages toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}