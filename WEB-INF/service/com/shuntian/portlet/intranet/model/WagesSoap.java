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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WagesSoap implements Serializable {
	public static WagesSoap toSoapModel(Wages model) {
		WagesSoap soapModel = new WagesSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWageName(model.getWageName());
		soapModel.setDistributionMonth(model.getDistributionMonth());
		soapModel.setDistributionYear(model.getDistributionYear());
		soapModel.setEntryDate(model.getEntryDate());
		soapModel.setDepartureDate(model.getDepartureDate());
		soapModel.setUserWage(model.getUserWage());
		soapModel.setUserPerformance(model.getUserPerformance());
		soapModel.setUserTotalWage(model.getUserTotalWage());
		soapModel.setAttendance(model.getAttendance());
		soapModel.setRealAttendance(model.getRealAttendance());
		soapModel.setBasePay(model.getBasePay());
		soapModel.setOvertimeWages(model.getOvertimeWages());
		soapModel.setPerformanceScores(model.getPerformanceScores());
		soapModel.setPerformanceSalary(model.getPerformanceSalary());
		soapModel.setAllowance(model.getAllowance());
		soapModel.setTotalWages(model.getTotalWages());
		soapModel.setSocialCompanyBearPart(model.getSocialCompanyBearPart());
		soapModel.setSocialIndividualsBearPart(model.getSocialIndividualsBearPart());
		soapModel.setTaxableIncome(model.getTaxableIncome());
		soapModel.setTaxRate(model.getTaxRate());
		soapModel.setTaxes(model.getTaxes());
		soapModel.setRealWages(model.getRealWages());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static WagesSoap[] toSoapModels(Wages[] models) {
		WagesSoap[] soapModels = new WagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WagesSoap[][] toSoapModels(Wages[][] models) {
		WagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WagesSoap[] toSoapModels(List<Wages> models) {
		List<WagesSoap> soapModels = new ArrayList<WagesSoap>(models.size());

		for (Wages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WagesSoap[soapModels.size()]);
	}

	public WagesSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getWageName() {
		return _wageName;
	}

	public void setWageName(String wageName) {
		_wageName = wageName;
	}

	public long getDistributionMonth() {
		return _distributionMonth;
	}

	public void setDistributionMonth(long distributionMonth) {
		_distributionMonth = distributionMonth;
	}

	public long getDistributionYear() {
		return _distributionYear;
	}

	public void setDistributionYear(long distributionYear) {
		_distributionYear = distributionYear;
	}

	public Date getEntryDate() {
		return _entryDate;
	}

	public void setEntryDate(Date entryDate) {
		_entryDate = entryDate;
	}

	public Date getDepartureDate() {
		return _departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		_departureDate = departureDate;
	}

	public double getUserWage() {
		return _userWage;
	}

	public void setUserWage(double userWage) {
		_userWage = userWage;
	}

	public double getUserPerformance() {
		return _userPerformance;
	}

	public void setUserPerformance(double userPerformance) {
		_userPerformance = userPerformance;
	}

	public double getUserTotalWage() {
		return _userTotalWage;
	}

	public void setUserTotalWage(double userTotalWage) {
		_userTotalWage = userTotalWage;
	}

	public double getAttendance() {
		return _attendance;
	}

	public void setAttendance(double attendance) {
		_attendance = attendance;
	}

	public double getRealAttendance() {
		return _realAttendance;
	}

	public void setRealAttendance(double realAttendance) {
		_realAttendance = realAttendance;
	}

	public double getBasePay() {
		return _basePay;
	}

	public void setBasePay(double basePay) {
		_basePay = basePay;
	}

	public double getOvertimeWages() {
		return _overtimeWages;
	}

	public void setOvertimeWages(double overtimeWages) {
		_overtimeWages = overtimeWages;
	}

	public double getPerformanceScores() {
		return _performanceScores;
	}

	public void setPerformanceScores(double performanceScores) {
		_performanceScores = performanceScores;
	}

	public double getPerformanceSalary() {
		return _performanceSalary;
	}

	public void setPerformanceSalary(double performanceSalary) {
		_performanceSalary = performanceSalary;
	}

	public double getAllowance() {
		return _allowance;
	}

	public void setAllowance(double allowance) {
		_allowance = allowance;
	}

	public double getTotalWages() {
		return _totalWages;
	}

	public void setTotalWages(double totalWages) {
		_totalWages = totalWages;
	}

	public double getSocialCompanyBearPart() {
		return _socialCompanyBearPart;
	}

	public void setSocialCompanyBearPart(double socialCompanyBearPart) {
		_socialCompanyBearPart = socialCompanyBearPart;
	}

	public double getSocialIndividualsBearPart() {
		return _socialIndividualsBearPart;
	}

	public void setSocialIndividualsBearPart(double socialIndividualsBearPart) {
		_socialIndividualsBearPart = socialIndividualsBearPart;
	}

	public double getTaxableIncome() {
		return _taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		_taxableIncome = taxableIncome;
	}

	public double getTaxRate() {
		return _taxRate;
	}

	public void setTaxRate(double taxRate) {
		_taxRate = taxRate;
	}

	public double getTaxes() {
		return _taxes;
	}

	public void setTaxes(double taxes) {
		_taxes = taxes;
	}

	public double getRealWages() {
		return _realWages;
	}

	public void setRealWages(double realWages) {
		_realWages = realWages;
	}

	public long getCreateUserId() {
		return _createUserId;
	}

	public void setCreateUserId(long createUserId) {
		_createUserId = createUserId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _id;
	private long _userId;
	private String _wageName;
	private long _distributionMonth;
	private long _distributionYear;
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
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}