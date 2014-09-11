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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.WagesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class WagesClp extends BaseModelImpl<Wages> implements Wages {
	public WagesClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("wageName", getWageName());
		attributes.put("entryDate", getEntryDate());
		attributes.put("departureDate", getDepartureDate());
		attributes.put("userWage", getUserWage());
		attributes.put("userPerformance", getUserPerformance());
		attributes.put("userTotalWage", getUserTotalWage());
		attributes.put("attendance", getAttendance());
		attributes.put("realAttendance", getRealAttendance());
		attributes.put("distributionMonth", getDistributionMonth());
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

		Long distributionMonth = (Long)attributes.get("distributionMonth");

		if (distributionMonth != null) {
			setDistributionMonth(distributionMonth);
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_wagesRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_wagesRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getWageName() {
		return _wageName;
	}

	@Override
	public void setWageName(String wageName) {
		_wageName = wageName;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setWageName", String.class);

				method.invoke(_wagesRemoteModel, wageName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEntryDate() {
		return _entryDate;
	}

	@Override
	public void setEntryDate(Date entryDate) {
		_entryDate = entryDate;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setEntryDate", Date.class);

				method.invoke(_wagesRemoteModel, entryDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDepartureDate() {
		return _departureDate;
	}

	@Override
	public void setDepartureDate(Date departureDate) {
		_departureDate = departureDate;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartureDate", Date.class);

				method.invoke(_wagesRemoteModel, departureDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUserWage() {
		return _userWage;
	}

	@Override
	public void setUserWage(double userWage) {
		_userWage = userWage;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserWage", double.class);

				method.invoke(_wagesRemoteModel, userWage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUserPerformance() {
		return _userPerformance;
	}

	@Override
	public void setUserPerformance(double userPerformance) {
		_userPerformance = userPerformance;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserPerformance",
						double.class);

				method.invoke(_wagesRemoteModel, userPerformance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUserTotalWage() {
		return _userTotalWage;
	}

	@Override
	public void setUserTotalWage(double userTotalWage) {
		_userTotalWage = userTotalWage;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserTotalWage", double.class);

				method.invoke(_wagesRemoteModel, userTotalWage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAttendance() {
		return _attendance;
	}

	@Override
	public void setAttendance(double attendance) {
		_attendance = attendance;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setAttendance", double.class);

				method.invoke(_wagesRemoteModel, attendance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRealAttendance() {
		return _realAttendance;
	}

	@Override
	public void setRealAttendance(double realAttendance) {
		_realAttendance = realAttendance;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setRealAttendance",
						double.class);

				method.invoke(_wagesRemoteModel, realAttendance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDistributionMonth() {
		return _distributionMonth;
	}

	@Override
	public void setDistributionMonth(long distributionMonth) {
		_distributionMonth = distributionMonth;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setDistributionMonth",
						long.class);

				method.invoke(_wagesRemoteModel, distributionMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBasePay() {
		return _basePay;
	}

	@Override
	public void setBasePay(double basePay) {
		_basePay = basePay;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setBasePay", double.class);

				method.invoke(_wagesRemoteModel, basePay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOvertimeWages() {
		return _overtimeWages;
	}

	@Override
	public void setOvertimeWages(double overtimeWages) {
		_overtimeWages = overtimeWages;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setOvertimeWages", double.class);

				method.invoke(_wagesRemoteModel, overtimeWages);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPerformanceScores() {
		return _performanceScores;
	}

	@Override
	public void setPerformanceScores(double performanceScores) {
		_performanceScores = performanceScores;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformanceScores",
						double.class);

				method.invoke(_wagesRemoteModel, performanceScores);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPerformanceSalary() {
		return _performanceSalary;
	}

	@Override
	public void setPerformanceSalary(double performanceSalary) {
		_performanceSalary = performanceSalary;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformanceSalary",
						double.class);

				method.invoke(_wagesRemoteModel, performanceSalary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAllowance() {
		return _allowance;
	}

	@Override
	public void setAllowance(double allowance) {
		_allowance = allowance;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setAllowance", double.class);

				method.invoke(_wagesRemoteModel, allowance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalWages() {
		return _totalWages;
	}

	@Override
	public void setTotalWages(double totalWages) {
		_totalWages = totalWages;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalWages", double.class);

				method.invoke(_wagesRemoteModel, totalWages);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSocialCompanyBearPart() {
		return _socialCompanyBearPart;
	}

	@Override
	public void setSocialCompanyBearPart(double socialCompanyBearPart) {
		_socialCompanyBearPart = socialCompanyBearPart;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setSocialCompanyBearPart",
						double.class);

				method.invoke(_wagesRemoteModel, socialCompanyBearPart);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSocialIndividualsBearPart() {
		return _socialIndividualsBearPart;
	}

	@Override
	public void setSocialIndividualsBearPart(double socialIndividualsBearPart) {
		_socialIndividualsBearPart = socialIndividualsBearPart;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setSocialIndividualsBearPart",
						double.class);

				method.invoke(_wagesRemoteModel, socialIndividualsBearPart);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTaxableIncome() {
		return _taxableIncome;
	}

	@Override
	public void setTaxableIncome(double taxableIncome) {
		_taxableIncome = taxableIncome;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxableIncome", double.class);

				method.invoke(_wagesRemoteModel, taxableIncome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTaxRate() {
		return _taxRate;
	}

	@Override
	public void setTaxRate(double taxRate) {
		_taxRate = taxRate;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxRate", double.class);

				method.invoke(_wagesRemoteModel, taxRate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTaxes() {
		return _taxes;
	}

	@Override
	public void setTaxes(double taxes) {
		_taxes = taxes;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxes", double.class);

				method.invoke(_wagesRemoteModel, taxes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRealWages() {
		return _realWages;
	}

	@Override
	public void setRealWages(double realWages) {
		_realWages = realWages;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setRealWages", double.class);

				method.invoke(_wagesRemoteModel, realWages);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateUserId() {
		return _createUserId;
	}

	@Override
	public void setCreateUserId(long createUserId) {
		_createUserId = createUserId;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateUserId", long.class);

				method.invoke(_wagesRemoteModel, createUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCreateUserId(), "uuid",
			_createUserUuid);
	}

	@Override
	public void setCreateUserUuid(String createUserUuid) {
		_createUserUuid = createUserUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_wagesRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUserId", long.class);

				method.invoke(_wagesRemoteModel, modifiedUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getModifiedUserId(), "uuid",
			_modifiedUserUuid);
	}

	@Override
	public void setModifiedUserUuid(String modifiedUserUuid) {
		_modifiedUserUuid = modifiedUserUuid;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_wagesRemoteModel != null) {
			try {
				Class<?> clazz = _wagesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_wagesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWagesRemoteModel() {
		return _wagesRemoteModel;
	}

	public void setWagesRemoteModel(BaseModel<?> wagesRemoteModel) {
		_wagesRemoteModel = wagesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _wagesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_wagesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WagesLocalServiceUtil.addWages(this);
		}
		else {
			WagesLocalServiceUtil.updateWages(this);
		}
	}

	@Override
	public Wages toEscapedModel() {
		return (Wages)ProxyUtil.newProxyInstance(Wages.class.getClassLoader(),
			new Class[] { Wages.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WagesClp clone = new WagesClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setWageName(getWageName());
		clone.setEntryDate(getEntryDate());
		clone.setDepartureDate(getDepartureDate());
		clone.setUserWage(getUserWage());
		clone.setUserPerformance(getUserPerformance());
		clone.setUserTotalWage(getUserTotalWage());
		clone.setAttendance(getAttendance());
		clone.setRealAttendance(getRealAttendance());
		clone.setDistributionMonth(getDistributionMonth());
		clone.setBasePay(getBasePay());
		clone.setOvertimeWages(getOvertimeWages());
		clone.setPerformanceScores(getPerformanceScores());
		clone.setPerformanceSalary(getPerformanceSalary());
		clone.setAllowance(getAllowance());
		clone.setTotalWages(getTotalWages());
		clone.setSocialCompanyBearPart(getSocialCompanyBearPart());
		clone.setSocialIndividualsBearPart(getSocialIndividualsBearPart());
		clone.setTaxableIncome(getTaxableIncome());
		clone.setTaxRate(getTaxRate());
		clone.setTaxes(getTaxes());
		clone.setRealWages(getRealWages());
		clone.setCreateUserId(getCreateUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedUserId(getModifiedUserId());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(Wages wages) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), wages.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WagesClp)) {
			return false;
		}

		WagesClp wages = (WagesClp)obj;

		long primaryKey = wages.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", wageName=");
		sb.append(getWageName());
		sb.append(", entryDate=");
		sb.append(getEntryDate());
		sb.append(", departureDate=");
		sb.append(getDepartureDate());
		sb.append(", userWage=");
		sb.append(getUserWage());
		sb.append(", userPerformance=");
		sb.append(getUserPerformance());
		sb.append(", userTotalWage=");
		sb.append(getUserTotalWage());
		sb.append(", attendance=");
		sb.append(getAttendance());
		sb.append(", realAttendance=");
		sb.append(getRealAttendance());
		sb.append(", distributionMonth=");
		sb.append(getDistributionMonth());
		sb.append(", basePay=");
		sb.append(getBasePay());
		sb.append(", overtimeWages=");
		sb.append(getOvertimeWages());
		sb.append(", performanceScores=");
		sb.append(getPerformanceScores());
		sb.append(", performanceSalary=");
		sb.append(getPerformanceSalary());
		sb.append(", allowance=");
		sb.append(getAllowance());
		sb.append(", totalWages=");
		sb.append(getTotalWages());
		sb.append(", socialCompanyBearPart=");
		sb.append(getSocialCompanyBearPart());
		sb.append(", socialIndividualsBearPart=");
		sb.append(getSocialIndividualsBearPart());
		sb.append(", taxableIncome=");
		sb.append(getTaxableIncome());
		sb.append(", taxRate=");
		sb.append(getTaxRate());
		sb.append(", taxes=");
		sb.append(getTaxes());
		sb.append(", realWages=");
		sb.append(getRealWages());
		sb.append(", createUserId=");
		sb.append(getCreateUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedUserId=");
		sb.append(getModifiedUserId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Wages");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wageName</column-name><column-value><![CDATA[");
		sb.append(getWageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entryDate</column-name><column-value><![CDATA[");
		sb.append(getEntryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departureDate</column-name><column-value><![CDATA[");
		sb.append(getDepartureDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userWage</column-name><column-value><![CDATA[");
		sb.append(getUserWage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userPerformance</column-name><column-value><![CDATA[");
		sb.append(getUserPerformance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userTotalWage</column-name><column-value><![CDATA[");
		sb.append(getUserTotalWage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attendance</column-name><column-value><![CDATA[");
		sb.append(getAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>realAttendance</column-name><column-value><![CDATA[");
		sb.append(getRealAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>distributionMonth</column-name><column-value><![CDATA[");
		sb.append(getDistributionMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basePay</column-name><column-value><![CDATA[");
		sb.append(getBasePay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeWages</column-name><column-value><![CDATA[");
		sb.append(getOvertimeWages());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performanceScores</column-name><column-value><![CDATA[");
		sb.append(getPerformanceScores());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performanceSalary</column-name><column-value><![CDATA[");
		sb.append(getPerformanceSalary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>allowance</column-name><column-value><![CDATA[");
		sb.append(getAllowance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalWages</column-name><column-value><![CDATA[");
		sb.append(getTotalWages());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialCompanyBearPart</column-name><column-value><![CDATA[");
		sb.append(getSocialCompanyBearPart());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialIndividualsBearPart</column-name><column-value><![CDATA[");
		sb.append(getSocialIndividualsBearPart());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxableIncome</column-name><column-value><![CDATA[");
		sb.append(getTaxableIncome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxRate</column-name><column-value><![CDATA[");
		sb.append(getTaxRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxes</column-name><column-value><![CDATA[");
		sb.append(getTaxes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>realWages</column-name><column-value><![CDATA[");
		sb.append(getRealWages());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createUserId</column-name><column-value><![CDATA[");
		sb.append(getCreateUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUserId</column-name><column-value><![CDATA[");
		sb.append(getModifiedUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _wageName;
	private Date _entryDate;
	private Date _departureDate;
	private double _userWage;
	private double _userPerformance;
	private double _userTotalWage;
	private double _attendance;
	private double _realAttendance;
	private long _distributionMonth;
	private double _basePay;
	private double _overtimeWages;
	private double _performanceScores;
	private double _performanceSalary;
	private double _allowance;
	private double _totalWages;
	private double _socialCompanyBearPart;
	private double _socialIndividualsBearPart;
	private double _taxableIncome;
	private double _taxRate;
	private double _taxes;
	private double _realWages;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private BaseModel<?> _wagesRemoteModel;
}