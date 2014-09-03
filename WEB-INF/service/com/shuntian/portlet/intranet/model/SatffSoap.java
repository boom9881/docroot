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
 * This class is used by SOAP remote services, specifically {@link com.shuntian.portlet.intranet.service.http.SatffServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.http.SatffServiceSoap
 * @generated
 */
public class SatffSoap implements Serializable {
	public static SatffSoap toSoapModel(Satff model) {
		SatffSoap soapModel = new SatffSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setCity(model.getCity());
		soapModel.setName(model.getName());
		soapModel.setTurnover_time(model.getTurnover_time());
		soapModel.setEntry_time(model.getEntry_time());
		soapModel.setBase_pay(model.getBase_pay());
		soapModel.setPerformance_pay(model.getPerformance_pay());
		soapModel.setWage_subtotal(model.getWage_subtotal());
		soapModel.setInsurance_base(model.getInsurance_base());
		soapModel.setEndowment_insurance(model.getEndowment_insurance());
		soapModel.setUnemployment_insurance(model.getUnemployment_insurance());
		soapModel.setWork_injury_insurance(model.getWork_injury_insurance());
		soapModel.setBirth_insurance(model.getBirth_insurance());
		soapModel.setMedical_insurance(model.getMedical_insurance());
		soapModel.setIndividual_insurance(model.getIndividual_insurance());
		soapModel.setHousing_accumulation_fund_base(model.getHousing_accumulation_fund_base());
		soapModel.setIndividual_pay(model.getIndividual_pay());
		soapModel.setAmount_payable(model.getAmount_payable());
		soapModel.setPeople_together(model.getPeople_together());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static SatffSoap[] toSoapModels(Satff[] models) {
		SatffSoap[] soapModels = new SatffSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SatffSoap[][] toSoapModels(Satff[][] models) {
		SatffSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SatffSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SatffSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SatffSoap[] toSoapModels(List<Satff> models) {
		List<SatffSoap> soapModels = new ArrayList<SatffSoap>(models.size());

		for (Satff model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SatffSoap[soapModels.size()]);
	}

	public SatffSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getTurnover_time() {
		return _turnover_time;
	}

	public void setTurnover_time(Date turnover_time) {
		_turnover_time = turnover_time;
	}

	public Date getEntry_time() {
		return _entry_time;
	}

	public void setEntry_time(Date entry_time) {
		_entry_time = entry_time;
	}

	public double getBase_pay() {
		return _base_pay;
	}

	public void setBase_pay(double base_pay) {
		_base_pay = base_pay;
	}

	public double getPerformance_pay() {
		return _performance_pay;
	}

	public void setPerformance_pay(double performance_pay) {
		_performance_pay = performance_pay;
	}

	public double getWage_subtotal() {
		return _wage_subtotal;
	}

	public void setWage_subtotal(double wage_subtotal) {
		_wage_subtotal = wage_subtotal;
	}

	public double getInsurance_base() {
		return _insurance_base;
	}

	public void setInsurance_base(double insurance_base) {
		_insurance_base = insurance_base;
	}

	public double getEndowment_insurance() {
		return _endowment_insurance;
	}

	public void setEndowment_insurance(double endowment_insurance) {
		_endowment_insurance = endowment_insurance;
	}

	public double getUnemployment_insurance() {
		return _unemployment_insurance;
	}

	public void setUnemployment_insurance(double unemployment_insurance) {
		_unemployment_insurance = unemployment_insurance;
	}

	public double getWork_injury_insurance() {
		return _work_injury_insurance;
	}

	public void setWork_injury_insurance(double work_injury_insurance) {
		_work_injury_insurance = work_injury_insurance;
	}

	public double getBirth_insurance() {
		return _birth_insurance;
	}

	public void setBirth_insurance(double birth_insurance) {
		_birth_insurance = birth_insurance;
	}

	public double getMedical_insurance() {
		return _medical_insurance;
	}

	public void setMedical_insurance(double medical_insurance) {
		_medical_insurance = medical_insurance;
	}

	public double getIndividual_insurance() {
		return _individual_insurance;
	}

	public void setIndividual_insurance(double individual_insurance) {
		_individual_insurance = individual_insurance;
	}

	public double getHousing_accumulation_fund_base() {
		return _housing_accumulation_fund_base;
	}

	public void setHousing_accumulation_fund_base(
		double housing_accumulation_fund_base) {
		_housing_accumulation_fund_base = housing_accumulation_fund_base;
	}

	public double getIndividual_pay() {
		return _individual_pay;
	}

	public void setIndividual_pay(double individual_pay) {
		_individual_pay = individual_pay;
	}

	public double getAmount_payable() {
		return _amount_payable;
	}

	public void setAmount_payable(double amount_payable) {
		_amount_payable = amount_payable;
	}

	public double getPeople_together() {
		return _people_together;
	}

	public void setPeople_together(double people_together) {
		_people_together = people_together;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _id;
	private long _user_id;
	private String _city;
	private String _name;
	private Date _turnover_time;
	private Date _entry_time;
	private double _base_pay;
	private double _performance_pay;
	private double _wage_subtotal;
	private double _insurance_base;
	private double _endowment_insurance;
	private double _unemployment_insurance;
	private double _work_injury_insurance;
	private double _birth_insurance;
	private double _medical_insurance;
	private double _individual_insurance;
	private double _housing_accumulation_fund_base;
	private double _individual_pay;
	private double _amount_payable;
	private double _people_together;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}