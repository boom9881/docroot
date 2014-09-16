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
public class ExtInformationSoap implements Serializable {
	public static ExtInformationSoap toSoapModel(ExtInformation model) {
		ExtInformationSoap soapModel = new ExtInformationSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setOpenCity(model.getOpenCity());
		soapModel.setBankName(model.getBankName());
		soapModel.setBankId(model.getBankId());
		soapModel.setLaborContractStart(model.getLaborContractStart());
		soapModel.setLaborContractEnd(model.getLaborContractEnd());
		soapModel.setProbationPeriodStart(model.getProbationPeriodStart());
		soapModel.setProbationPeriodEnd(model.getProbationPeriodEnd());
		soapModel.setInduredLocation(model.getInduredLocation());
		soapModel.setFristInsuredYear(model.getFristInsuredYear());
		soapModel.setFristInsuredMonth(model.getFristInsuredMonth());
		soapModel.setIsInsured(model.getIsInsured());
		soapModel.setBasicWage(model.getBasicWage());
		soapModel.setOtherWage(model.getOtherWage());

		return soapModel;
	}

	public static ExtInformationSoap[] toSoapModels(ExtInformation[] models) {
		ExtInformationSoap[] soapModels = new ExtInformationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExtInformationSoap[][] toSoapModels(ExtInformation[][] models) {
		ExtInformationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExtInformationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExtInformationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExtInformationSoap[] toSoapModels(List<ExtInformation> models) {
		List<ExtInformationSoap> soapModels = new ArrayList<ExtInformationSoap>(models.size());

		for (ExtInformation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExtInformationSoap[soapModels.size()]);
	}

	public ExtInformationSoap() {
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

	public String getOpenCity() {
		return _openCity;
	}

	public void setOpenCity(String openCity) {
		_openCity = openCity;
	}

	public String getBankName() {
		return _bankName;
	}

	public void setBankName(String bankName) {
		_bankName = bankName;
	}

	public String getBankId() {
		return _bankId;
	}

	public void setBankId(String bankId) {
		_bankId = bankId;
	}

	public Date getLaborContractStart() {
		return _laborContractStart;
	}

	public void setLaborContractStart(Date laborContractStart) {
		_laborContractStart = laborContractStart;
	}

	public Date getLaborContractEnd() {
		return _laborContractEnd;
	}

	public void setLaborContractEnd(Date laborContractEnd) {
		_laborContractEnd = laborContractEnd;
	}

	public Date getProbationPeriodStart() {
		return _probationPeriodStart;
	}

	public void setProbationPeriodStart(Date probationPeriodStart) {
		_probationPeriodStart = probationPeriodStart;
	}

	public Date getProbationPeriodEnd() {
		return _probationPeriodEnd;
	}

	public void setProbationPeriodEnd(Date probationPeriodEnd) {
		_probationPeriodEnd = probationPeriodEnd;
	}

	public String getInduredLocation() {
		return _induredLocation;
	}

	public void setInduredLocation(String induredLocation) {
		_induredLocation = induredLocation;
	}

	public String getFristInsuredYear() {
		return _fristInsuredYear;
	}

	public void setFristInsuredYear(String fristInsuredYear) {
		_fristInsuredYear = fristInsuredYear;
	}

	public String getFristInsuredMonth() {
		return _fristInsuredMonth;
	}

	public void setFristInsuredMonth(String fristInsuredMonth) {
		_fristInsuredMonth = fristInsuredMonth;
	}

	public String getIsInsured() {
		return _isInsured;
	}

	public void setIsInsured(String isInsured) {
		_isInsured = isInsured;
	}

	public long getBasicWage() {
		return _basicWage;
	}

	public void setBasicWage(long basicWage) {
		_basicWage = basicWage;
	}

	public long getOtherWage() {
		return _otherWage;
	}

	public void setOtherWage(long otherWage) {
		_otherWage = otherWage;
	}

	private long _id;
	private long _userId;
	private String _openCity;
	private String _bankName;
	private String _bankId;
	private Date _laborContractStart;
	private Date _laborContractEnd;
	private Date _probationPeriodStart;
	private Date _probationPeriodEnd;
	private String _induredLocation;
	private String _fristInsuredYear;
	private String _fristInsuredMonth;
	private String _isInsured;
	private long _basicWage;
	private long _otherWage;
}