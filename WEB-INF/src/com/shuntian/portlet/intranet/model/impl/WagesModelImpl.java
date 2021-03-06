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

package com.shuntian.portlet.intranet.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.shuntian.portlet.intranet.model.Wages;
import com.shuntian.portlet.intranet.model.WagesModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Wages service. Represents a row in the &quot;Intranet_Wages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.shuntian.portlet.intranet.model.WagesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WagesImpl
 * @see com.shuntian.portlet.intranet.model.Wages
 * @see com.shuntian.portlet.intranet.model.WagesModel
 * @generated
 */
public class WagesModelImpl extends BaseModelImpl<Wages> implements WagesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wages model instance should use the {@link com.shuntian.portlet.intranet.model.Wages} interface instead.
	 */
	public static final String TABLE_NAME = "Intranet_Wages";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "wageName", Types.VARCHAR },
			{ "distributionMonth", Types.BIGINT },
			{ "distributionYear", Types.BIGINT },
			{ "entryDate", Types.TIMESTAMP },
			{ "departureDate", Types.TIMESTAMP },
			{ "userWage", Types.DOUBLE },
			{ "userPerformance", Types.DOUBLE },
			{ "userTotalWage", Types.DOUBLE },
			{ "attendance", Types.DOUBLE },
			{ "realAttendance", Types.DOUBLE },
			{ "basePay", Types.DOUBLE },
			{ "overtimeWages", Types.DOUBLE },
			{ "performanceScores", Types.DOUBLE },
			{ "performanceSalary", Types.DOUBLE },
			{ "allowance", Types.DOUBLE },
			{ "totalWages", Types.DOUBLE },
			{ "socialCompanyBearPart", Types.DOUBLE },
			{ "socialIndividualsBearPart", Types.DOUBLE },
			{ "taxableIncome", Types.DOUBLE },
			{ "taxRate", Types.DOUBLE },
			{ "taxes", Types.DOUBLE },
			{ "realWages", Types.DOUBLE },
			{ "createUserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedUserId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Intranet_Wages (id_ LONG not null primary key,userId LONG,wageName VARCHAR(75) null,distributionMonth LONG,distributionYear LONG,entryDate DATE null,departureDate DATE null,userWage DOUBLE,userPerformance DOUBLE,userTotalWage DOUBLE,attendance DOUBLE,realAttendance DOUBLE,basePay DOUBLE,overtimeWages DOUBLE,performanceScores DOUBLE,performanceSalary DOUBLE,allowance DOUBLE,totalWages DOUBLE,socialCompanyBearPart DOUBLE,socialIndividualsBearPart DOUBLE,taxableIncome DOUBLE,taxRate DOUBLE,taxes DOUBLE,realWages DOUBLE,createUserId LONG,createDate DATE null,modifiedUserId LONG,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Intranet_Wages";
	public static final String ORDER_BY_JPQL = " ORDER BY wages.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Intranet_Wages.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.shuntian.portlet.intranet.model.Wages"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.shuntian.portlet.intranet.model.Wages"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.shuntian.portlet.intranet.model.Wages"),
			true);
	public static long DISTRIBUTIONMONTH_COLUMN_BITMASK = 1L;
	public static long DISTRIBUTIONYEAR_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static long CREATEDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.shuntian.portlet.intranet.model.Wages"));

	public WagesModelImpl() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public String getWageName() {
		if (_wageName == null) {
			return StringPool.BLANK;
		}
		else {
			return _wageName;
		}
	}

	@Override
	public void setWageName(String wageName) {
		_wageName = wageName;
	}

	@Override
	public long getDistributionMonth() {
		return _distributionMonth;
	}

	@Override
	public void setDistributionMonth(long distributionMonth) {
		_columnBitmask |= DISTRIBUTIONMONTH_COLUMN_BITMASK;

		if (!_setOriginalDistributionMonth) {
			_setOriginalDistributionMonth = true;

			_originalDistributionMonth = _distributionMonth;
		}

		_distributionMonth = distributionMonth;
	}

	public long getOriginalDistributionMonth() {
		return _originalDistributionMonth;
	}

	@Override
	public long getDistributionYear() {
		return _distributionYear;
	}

	@Override
	public void setDistributionYear(long distributionYear) {
		_columnBitmask |= DISTRIBUTIONYEAR_COLUMN_BITMASK;

		if (!_setOriginalDistributionYear) {
			_setOriginalDistributionYear = true;

			_originalDistributionYear = _distributionYear;
		}

		_distributionYear = distributionYear;
	}

	public long getOriginalDistributionYear() {
		return _originalDistributionYear;
	}

	@Override
	public Date getEntryDate() {
		return _entryDate;
	}

	@Override
	public void setEntryDate(Date entryDate) {
		_entryDate = entryDate;
	}

	@Override
	public Date getDepartureDate() {
		return _departureDate;
	}

	@Override
	public void setDepartureDate(Date departureDate) {
		_departureDate = departureDate;
	}

	@Override
	public double getUserWage() {
		return _userWage;
	}

	@Override
	public void setUserWage(double userWage) {
		_userWage = userWage;
	}

	@Override
	public double getUserPerformance() {
		return _userPerformance;
	}

	@Override
	public void setUserPerformance(double userPerformance) {
		_userPerformance = userPerformance;
	}

	@Override
	public double getUserTotalWage() {
		return _userTotalWage;
	}

	@Override
	public void setUserTotalWage(double userTotalWage) {
		_userTotalWage = userTotalWage;
	}

	@Override
	public double getAttendance() {
		return _attendance;
	}

	@Override
	public void setAttendance(double attendance) {
		_attendance = attendance;
	}

	@Override
	public double getRealAttendance() {
		return _realAttendance;
	}

	@Override
	public void setRealAttendance(double realAttendance) {
		_realAttendance = realAttendance;
	}

	@Override
	public double getBasePay() {
		return _basePay;
	}

	@Override
	public void setBasePay(double basePay) {
		_basePay = basePay;
	}

	@Override
	public double getOvertimeWages() {
		return _overtimeWages;
	}

	@Override
	public void setOvertimeWages(double overtimeWages) {
		_overtimeWages = overtimeWages;
	}

	@Override
	public double getPerformanceScores() {
		return _performanceScores;
	}

	@Override
	public void setPerformanceScores(double performanceScores) {
		_performanceScores = performanceScores;
	}

	@Override
	public double getPerformanceSalary() {
		return _performanceSalary;
	}

	@Override
	public void setPerformanceSalary(double performanceSalary) {
		_performanceSalary = performanceSalary;
	}

	@Override
	public double getAllowance() {
		return _allowance;
	}

	@Override
	public void setAllowance(double allowance) {
		_allowance = allowance;
	}

	@Override
	public double getTotalWages() {
		return _totalWages;
	}

	@Override
	public void setTotalWages(double totalWages) {
		_totalWages = totalWages;
	}

	@Override
	public double getSocialCompanyBearPart() {
		return _socialCompanyBearPart;
	}

	@Override
	public void setSocialCompanyBearPart(double socialCompanyBearPart) {
		_socialCompanyBearPart = socialCompanyBearPart;
	}

	@Override
	public double getSocialIndividualsBearPart() {
		return _socialIndividualsBearPart;
	}

	@Override
	public void setSocialIndividualsBearPart(double socialIndividualsBearPart) {
		_socialIndividualsBearPart = socialIndividualsBearPart;
	}

	@Override
	public double getTaxableIncome() {
		return _taxableIncome;
	}

	@Override
	public void setTaxableIncome(double taxableIncome) {
		_taxableIncome = taxableIncome;
	}

	@Override
	public double getTaxRate() {
		return _taxRate;
	}

	@Override
	public void setTaxRate(double taxRate) {
		_taxRate = taxRate;
	}

	@Override
	public double getTaxes() {
		return _taxes;
	}

	@Override
	public void setTaxes(double taxes) {
		_taxes = taxes;
	}

	@Override
	public double getRealWages() {
		return _realWages;
	}

	@Override
	public void setRealWages(double realWages) {
		_realWages = realWages;
	}

	@Override
	public long getCreateUserId() {
		return _createUserId;
	}

	@Override
	public void setCreateUserId(long createUserId) {
		_createUserId = createUserId;
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
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;
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
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Wages.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Wages toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Wages)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WagesImpl wagesImpl = new WagesImpl();

		wagesImpl.setId(getId());
		wagesImpl.setUserId(getUserId());
		wagesImpl.setWageName(getWageName());
		wagesImpl.setDistributionMonth(getDistributionMonth());
		wagesImpl.setDistributionYear(getDistributionYear());
		wagesImpl.setEntryDate(getEntryDate());
		wagesImpl.setDepartureDate(getDepartureDate());
		wagesImpl.setUserWage(getUserWage());
		wagesImpl.setUserPerformance(getUserPerformance());
		wagesImpl.setUserTotalWage(getUserTotalWage());
		wagesImpl.setAttendance(getAttendance());
		wagesImpl.setRealAttendance(getRealAttendance());
		wagesImpl.setBasePay(getBasePay());
		wagesImpl.setOvertimeWages(getOvertimeWages());
		wagesImpl.setPerformanceScores(getPerformanceScores());
		wagesImpl.setPerformanceSalary(getPerformanceSalary());
		wagesImpl.setAllowance(getAllowance());
		wagesImpl.setTotalWages(getTotalWages());
		wagesImpl.setSocialCompanyBearPart(getSocialCompanyBearPart());
		wagesImpl.setSocialIndividualsBearPart(getSocialIndividualsBearPart());
		wagesImpl.setTaxableIncome(getTaxableIncome());
		wagesImpl.setTaxRate(getTaxRate());
		wagesImpl.setTaxes(getTaxes());
		wagesImpl.setRealWages(getRealWages());
		wagesImpl.setCreateUserId(getCreateUserId());
		wagesImpl.setCreateDate(getCreateDate());
		wagesImpl.setModifiedUserId(getModifiedUserId());
		wagesImpl.setModifiedDate(getModifiedDate());

		wagesImpl.resetOriginalValues();

		return wagesImpl;
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

		if (!(obj instanceof Wages)) {
			return false;
		}

		Wages wages = (Wages)obj;

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
	public void resetOriginalValues() {
		WagesModelImpl wagesModelImpl = this;

		wagesModelImpl._originalUserId = wagesModelImpl._userId;

		wagesModelImpl._setOriginalUserId = false;

		wagesModelImpl._originalDistributionMonth = wagesModelImpl._distributionMonth;

		wagesModelImpl._setOriginalDistributionMonth = false;

		wagesModelImpl._originalDistributionYear = wagesModelImpl._distributionYear;

		wagesModelImpl._setOriginalDistributionYear = false;

		wagesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Wages> toCacheModel() {
		WagesCacheModel wagesCacheModel = new WagesCacheModel();

		wagesCacheModel.id = getId();

		wagesCacheModel.userId = getUserId();

		wagesCacheModel.wageName = getWageName();

		String wageName = wagesCacheModel.wageName;

		if ((wageName != null) && (wageName.length() == 0)) {
			wagesCacheModel.wageName = null;
		}

		wagesCacheModel.distributionMonth = getDistributionMonth();

		wagesCacheModel.distributionYear = getDistributionYear();

		Date entryDate = getEntryDate();

		if (entryDate != null) {
			wagesCacheModel.entryDate = entryDate.getTime();
		}
		else {
			wagesCacheModel.entryDate = Long.MIN_VALUE;
		}

		Date departureDate = getDepartureDate();

		if (departureDate != null) {
			wagesCacheModel.departureDate = departureDate.getTime();
		}
		else {
			wagesCacheModel.departureDate = Long.MIN_VALUE;
		}

		wagesCacheModel.userWage = getUserWage();

		wagesCacheModel.userPerformance = getUserPerformance();

		wagesCacheModel.userTotalWage = getUserTotalWage();

		wagesCacheModel.attendance = getAttendance();

		wagesCacheModel.realAttendance = getRealAttendance();

		wagesCacheModel.basePay = getBasePay();

		wagesCacheModel.overtimeWages = getOvertimeWages();

		wagesCacheModel.performanceScores = getPerformanceScores();

		wagesCacheModel.performanceSalary = getPerformanceSalary();

		wagesCacheModel.allowance = getAllowance();

		wagesCacheModel.totalWages = getTotalWages();

		wagesCacheModel.socialCompanyBearPart = getSocialCompanyBearPart();

		wagesCacheModel.socialIndividualsBearPart = getSocialIndividualsBearPart();

		wagesCacheModel.taxableIncome = getTaxableIncome();

		wagesCacheModel.taxRate = getTaxRate();

		wagesCacheModel.taxes = getTaxes();

		wagesCacheModel.realWages = getRealWages();

		wagesCacheModel.createUserId = getCreateUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			wagesCacheModel.createDate = createDate.getTime();
		}
		else {
			wagesCacheModel.createDate = Long.MIN_VALUE;
		}

		wagesCacheModel.modifiedUserId = getModifiedUserId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			wagesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			wagesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return wagesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", wageName=");
		sb.append(getWageName());
		sb.append(", distributionMonth=");
		sb.append(getDistributionMonth());
		sb.append(", distributionYear=");
		sb.append(getDistributionYear());
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
		StringBundler sb = new StringBundler(88);

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
			"<column><column-name>distributionMonth</column-name><column-value><![CDATA[");
		sb.append(getDistributionMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>distributionYear</column-name><column-value><![CDATA[");
		sb.append(getDistributionYear());
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

	private static ClassLoader _classLoader = Wages.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Wages.class };
	private long _id;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _wageName;
	private long _distributionMonth;
	private long _originalDistributionMonth;
	private boolean _setOriginalDistributionMonth;
	private long _distributionYear;
	private long _originalDistributionYear;
	private boolean _setOriginalDistributionYear;
	private Date _entryDate;
	private Date _departureDate;
	private double _userWage;
	private double _userPerformance;
	private double _userTotalWage;
	private double _attendance;
	private double _realAttendance;
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
	private long _columnBitmask;
	private Wages _escapedModel;
}