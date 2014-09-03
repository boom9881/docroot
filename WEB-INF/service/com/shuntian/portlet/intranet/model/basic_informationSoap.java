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
public class basic_informationSoap implements Serializable {
	public static basic_informationSoap toSoapModel(basic_information model) {
		basic_informationSoap soapModel = new basic_informationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStaffId(model.getStaffId());
		soapModel.setUserId(model.getUserId());
		soapModel.setName(model.getName());
		soapModel.setSex(model.getSex());
		soapModel.setId_number(model.getId_number());
		soapModel.setNation(model.getNation());
		soapModel.setPlace_of_origin(model.getPlace_of_origin());
		soapModel.setAccount_properties(model.getAccount_properties());
		soapModel.setBirth(model.getBirth());
		soapModel.setMarital_status(model.getMarital_status());
		soapModel.setHighest_degree(model.getHighest_degree());
		soapModel.setPolitical_background(model.getPolitical_background());
		soapModel.setFile_location(model.getFile_location());
		soapModel.setBase_pay(model.getBase_pay());
		soapModel.setPerformance_pay(model.getPerformance_pay());
		soapModel.setHealth(model.getHealth());
		soapModel.setContact_phone(model.getContact_phone());
		soapModel.setMail(model.getMail());
		soapModel.setDomicile(model.getDomicile());
		soapModel.setResidence_phone(model.getResidence_phone());
		soapModel.setCurrent_residential_address(model.getCurrent_residential_address());
		soapModel.setCurrent_residential_address_phone(model.getCurrent_residential_address_phone());
		soapModel.setEmergency_contact(model.getEmergency_contact());
		soapModel.setEmergency_contact_relation(model.getEmergency_contact_relation());
		soapModel.setEmergency_contact_phone(model.getEmergency_contact_phone());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateuser(model.getCreateuser());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifieduser(model.getModifieduser());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static basic_informationSoap[] toSoapModels(
		basic_information[] models) {
		basic_informationSoap[] soapModels = new basic_informationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static basic_informationSoap[][] toSoapModels(
		basic_information[][] models) {
		basic_informationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new basic_informationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new basic_informationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static basic_informationSoap[] toSoapModels(
		List<basic_information> models) {
		List<basic_informationSoap> soapModels = new ArrayList<basic_informationSoap>(models.size());

		for (basic_information model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new basic_informationSoap[soapModels.size()]);
	}

	public basic_informationSoap() {
	}

	public long getPrimaryKey() {
		return _staffId;
	}

	public void setPrimaryKey(long pk) {
		setStaffId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStaffId() {
		return _staffId;
	}

	public void setStaffId(long staffId) {
		_staffId = staffId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public String getId_number() {
		return _id_number;
	}

	public void setId_number(String id_number) {
		_id_number = id_number;
	}

	public String getNation() {
		return _nation;
	}

	public void setNation(String nation) {
		_nation = nation;
	}

	public String getPlace_of_origin() {
		return _place_of_origin;
	}

	public void setPlace_of_origin(String place_of_origin) {
		_place_of_origin = place_of_origin;
	}

	public String getAccount_properties() {
		return _account_properties;
	}

	public void setAccount_properties(String account_properties) {
		_account_properties = account_properties;
	}

	public Date getBirth() {
		return _birth;
	}

	public void setBirth(Date birth) {
		_birth = birth;
	}

	public String getMarital_status() {
		return _marital_status;
	}

	public void setMarital_status(String marital_status) {
		_marital_status = marital_status;
	}

	public String getHighest_degree() {
		return _highest_degree;
	}

	public void setHighest_degree(String highest_degree) {
		_highest_degree = highest_degree;
	}

	public String getPolitical_background() {
		return _political_background;
	}

	public void setPolitical_background(String political_background) {
		_political_background = political_background;
	}

	public String getFile_location() {
		return _file_location;
	}

	public void setFile_location(String file_location) {
		_file_location = file_location;
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

	public String getHealth() {
		return _health;
	}

	public void setHealth(String health) {
		_health = health;
	}

	public String getContact_phone() {
		return _contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		_contact_phone = contact_phone;
	}

	public String getMail() {
		return _mail;
	}

	public void setMail(String mail) {
		_mail = mail;
	}

	public String getDomicile() {
		return _domicile;
	}

	public void setDomicile(String domicile) {
		_domicile = domicile;
	}

	public String getResidence_phone() {
		return _residence_phone;
	}

	public void setResidence_phone(String residence_phone) {
		_residence_phone = residence_phone;
	}

	public String getCurrent_residential_address() {
		return _current_residential_address;
	}

	public void setCurrent_residential_address(
		String current_residential_address) {
		_current_residential_address = current_residential_address;
	}

	public String getCurrent_residential_address_phone() {
		return _current_residential_address_phone;
	}

	public void setCurrent_residential_address_phone(
		String current_residential_address_phone) {
		_current_residential_address_phone = current_residential_address_phone;
	}

	public String getEmergency_contact() {
		return _emergency_contact;
	}

	public void setEmergency_contact(String emergency_contact) {
		_emergency_contact = emergency_contact;
	}

	public String getEmergency_contact_relation() {
		return _emergency_contact_relation;
	}

	public void setEmergency_contact_relation(String emergency_contact_relation) {
		_emergency_contact_relation = emergency_contact_relation;
	}

	public String getEmergency_contact_phone() {
		return _emergency_contact_phone;
	}

	public void setEmergency_contact_phone(String emergency_contact_phone) {
		_emergency_contact_phone = emergency_contact_phone;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCreateuser() {
		return _createuser;
	}

	public void setCreateuser(long createuser) {
		_createuser = createuser;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getModifieduser() {
		return _modifieduser;
	}

	public void setModifieduser(long modifieduser) {
		_modifieduser = modifieduser;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _staffId;
	private long _userId;
	private String _name;
	private String _sex;
	private String _id_number;
	private String _nation;
	private String _place_of_origin;
	private String _account_properties;
	private Date _birth;
	private String _marital_status;
	private String _highest_degree;
	private String _political_background;
	private String _file_location;
	private double _base_pay;
	private double _performance_pay;
	private String _health;
	private String _contact_phone;
	private String _mail;
	private String _domicile;
	private String _residence_phone;
	private String _current_residential_address;
	private String _current_residential_address_phone;
	private String _emergency_contact;
	private String _emergency_contact_relation;
	private String _emergency_contact_phone;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
}