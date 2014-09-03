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
public class BasicInformationSoap implements Serializable {
	public static BasicInformationSoap toSoapModel(BasicInformation model) {
		BasicInformationSoap soapModel = new BasicInformationSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setName(model.getName());
		soapModel.setSex(model.getSex());
		soapModel.setIdNumber(model.getIdNumber());
		soapModel.setNation(model.getNation());
		soapModel.setPlaceOfOrigin(model.getPlaceOfOrigin());
		soapModel.setAccountProperties(model.getAccountProperties());
		soapModel.setBirthDate(model.getBirthDate());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setHighestDegree(model.getHighestDegree());
		soapModel.setPoliticalBackground(model.getPoliticalBackground());
		soapModel.setFileLocation(model.getFileLocation());
		soapModel.setBasePay(model.getBasePay());
		soapModel.setPerformancePay(model.getPerformancePay());
		soapModel.setHealth(model.getHealth());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setMail(model.getMail());
		soapModel.setDomicile(model.getDomicile());
		soapModel.setResidencePhone(model.getResidencePhone());
		soapModel.setCurrentResidentialAddress(model.getCurrentResidentialAddress());
		soapModel.setCurrentResidentialAddressPhone(model.getCurrentResidentialAddressPhone());
		soapModel.setEmergencyContact(model.getEmergencyContact());
		soapModel.setEmergencyContactRelation(model.getEmergencyContactRelation());
		soapModel.setEmergencyContactPhone(model.getEmergencyContactPhone());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static BasicInformationSoap[] toSoapModels(BasicInformation[] models) {
		BasicInformationSoap[] soapModels = new BasicInformationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BasicInformationSoap[][] toSoapModels(
		BasicInformation[][] models) {
		BasicInformationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BasicInformationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BasicInformationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BasicInformationSoap[] toSoapModels(
		List<BasicInformation> models) {
		List<BasicInformationSoap> soapModels = new ArrayList<BasicInformationSoap>(models.size());

		for (BasicInformation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BasicInformationSoap[soapModels.size()]);
	}

	public BasicInformationSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getSex() {
		return _sex;
	}

	public void setSex(int sex) {
		_sex = sex;
	}

	public String getIdNumber() {
		return _idNumber;
	}

	public void setIdNumber(String idNumber) {
		_idNumber = idNumber;
	}

	public String getNation() {
		return _nation;
	}

	public void setNation(String nation) {
		_nation = nation;
	}

	public String getPlaceOfOrigin() {
		return _placeOfOrigin;
	}

	public void setPlaceOfOrigin(String placeOfOrigin) {
		_placeOfOrigin = placeOfOrigin;
	}

	public String getAccountProperties() {
		return _accountProperties;
	}

	public void setAccountProperties(String accountProperties) {
		_accountProperties = accountProperties;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public String getMaritalStatus() {
		return _maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		_maritalStatus = maritalStatus;
	}

	public String getHighestDegree() {
		return _highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		_highestDegree = highestDegree;
	}

	public String getPoliticalBackground() {
		return _politicalBackground;
	}

	public void setPoliticalBackground(String politicalBackground) {
		_politicalBackground = politicalBackground;
	}

	public String getFileLocation() {
		return _fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		_fileLocation = fileLocation;
	}

	public double getBasePay() {
		return _basePay;
	}

	public void setBasePay(double basePay) {
		_basePay = basePay;
	}

	public double getPerformancePay() {
		return _performancePay;
	}

	public void setPerformancePay(double performancePay) {
		_performancePay = performancePay;
	}

	public int getHealth() {
		return _health;
	}

	public void setHealth(int health) {
		_health = health;
	}

	public String getContactPhone() {
		return _contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;
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

	public String getResidencePhone() {
		return _residencePhone;
	}

	public void setResidencePhone(String residencePhone) {
		_residencePhone = residencePhone;
	}

	public String getCurrentResidentialAddress() {
		return _currentResidentialAddress;
	}

	public void setCurrentResidentialAddress(String currentResidentialAddress) {
		_currentResidentialAddress = currentResidentialAddress;
	}

	public String getCurrentResidentialAddressPhone() {
		return _currentResidentialAddressPhone;
	}

	public void setCurrentResidentialAddressPhone(
		String currentResidentialAddressPhone) {
		_currentResidentialAddressPhone = currentResidentialAddressPhone;
	}

	public String getEmergencyContact() {
		return _emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		_emergencyContact = emergencyContact;
	}

	public String getEmergencyContactRelation() {
		return _emergencyContactRelation;
	}

	public void setEmergencyContactRelation(String emergencyContactRelation) {
		_emergencyContactRelation = emergencyContactRelation;
	}

	public String getEmergencyContactPhone() {
		return _emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		_emergencyContactPhone = emergencyContactPhone;
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
	private String _name;
	private int _sex;
	private String _idNumber;
	private String _nation;
	private String _placeOfOrigin;
	private String _accountProperties;
	private Date _birthDate;
	private String _maritalStatus;
	private String _highestDegree;
	private String _politicalBackground;
	private String _fileLocation;
	private double _basePay;
	private double _performancePay;
	private int _health;
	private String _contactPhone;
	private String _mail;
	private String _domicile;
	private String _residencePhone;
	private String _currentResidentialAddress;
	private String _currentResidentialAddressPhone;
	private String _emergencyContact;
	private String _emergencyContactRelation;
	private String _emergencyContactPhone;
	private long _createUserId;
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}