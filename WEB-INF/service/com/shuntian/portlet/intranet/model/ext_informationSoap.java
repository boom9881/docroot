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
public class ext_informationSoap implements Serializable {
	public static ext_informationSoap toSoapModel(ext_information model) {
		ext_informationSoap soapModel = new ext_informationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setExtId(model.getExtId());
		soapModel.setStaffId(model.getStaffId());
		soapModel.setOpen_city(model.getOpen_city());
		soapModel.setBank_name(model.getBank_name());
		soapModel.setBankid(model.getBankid());
		soapModel.setLabor_contract_start(model.getLabor_contract_start());
		soapModel.setLabor_contract_end(model.getLabor_contract_end());
		soapModel.setProbation_period_start(model.getProbation_period_start());
		soapModel.setProbation_period_end(model.getProbation_period_end());
		soapModel.setIndured_location(model.getIndured_location());
		soapModel.setFrist_insured(model.getFrist_insured());
		soapModel.setIs_insured(model.getIs_insured());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateuser(model.getCreateuser());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifieduser(model.getModifieduser());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static ext_informationSoap[] toSoapModels(ext_information[] models) {
		ext_informationSoap[] soapModels = new ext_informationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ext_informationSoap[][] toSoapModels(
		ext_information[][] models) {
		ext_informationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ext_informationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ext_informationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ext_informationSoap[] toSoapModels(
		List<ext_information> models) {
		List<ext_informationSoap> soapModels = new ArrayList<ext_informationSoap>(models.size());

		for (ext_information model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ext_informationSoap[soapModels.size()]);
	}

	public ext_informationSoap() {
	}

	public long getPrimaryKey() {
		return _extId;
	}

	public void setPrimaryKey(long pk) {
		setExtId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getExtId() {
		return _extId;
	}

	public void setExtId(long extId) {
		_extId = extId;
	}

	public long getStaffId() {
		return _staffId;
	}

	public void setStaffId(long staffId) {
		_staffId = staffId;
	}

	public String getOpen_city() {
		return _open_city;
	}

	public void setOpen_city(String open_city) {
		_open_city = open_city;
	}

	public String getBank_name() {
		return _bank_name;
	}

	public void setBank_name(String bank_name) {
		_bank_name = bank_name;
	}

	public String getBankid() {
		return _bankid;
	}

	public void setBankid(String bankid) {
		_bankid = bankid;
	}

	public Date getLabor_contract_start() {
		return _labor_contract_start;
	}

	public void setLabor_contract_start(Date labor_contract_start) {
		_labor_contract_start = labor_contract_start;
	}

	public Date getLabor_contract_end() {
		return _labor_contract_end;
	}

	public void setLabor_contract_end(Date labor_contract_end) {
		_labor_contract_end = labor_contract_end;
	}

	public Date getProbation_period_start() {
		return _probation_period_start;
	}

	public void setProbation_period_start(Date probation_period_start) {
		_probation_period_start = probation_period_start;
	}

	public Date getProbation_period_end() {
		return _probation_period_end;
	}

	public void setProbation_period_end(Date probation_period_end) {
		_probation_period_end = probation_period_end;
	}

	public String getIndured_location() {
		return _indured_location;
	}

	public void setIndured_location(String indured_location) {
		_indured_location = indured_location;
	}

	public Date getFrist_insured() {
		return _frist_insured;
	}

	public void setFrist_insured(Date frist_insured) {
		_frist_insured = frist_insured;
	}

	public String getIs_insured() {
		return _is_insured;
	}

	public void setIs_insured(String is_insured) {
		_is_insured = is_insured;
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
	private long _extId;
	private long _staffId;
	private String _open_city;
	private String _bank_name;
	private String _bankid;
	private Date _labor_contract_start;
	private Date _labor_contract_end;
	private Date _probation_period_start;
	private Date _probation_period_end;
	private String _indured_location;
	private Date _frist_insured;
	private String _is_insured;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
}