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
public class educationSoap implements Serializable {
	public static educationSoap toSoapModel(education model) {
		educationSoap soapModel = new educationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEducationId(model.getEducationId());
		soapModel.setSatffId(model.getSatffId());
		soapModel.setWitness(model.getWitness());
		soapModel.setProfessional(model.getProfessional());
		soapModel.setUniversity(model.getUniversity());
		soapModel.setContact_phone(model.getContact_phone());
		soapModel.setStart_stop_time(model.getStart_stop_time());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateuser(model.getCreateuser());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifieduser(model.getModifieduser());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static educationSoap[] toSoapModels(education[] models) {
		educationSoap[] soapModels = new educationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static educationSoap[][] toSoapModels(education[][] models) {
		educationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new educationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new educationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static educationSoap[] toSoapModels(List<education> models) {
		List<educationSoap> soapModels = new ArrayList<educationSoap>(models.size());

		for (education model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new educationSoap[soapModels.size()]);
	}

	public educationSoap() {
	}

	public long getPrimaryKey() {
		return _educationId;
	}

	public void setPrimaryKey(long pk) {
		setEducationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEducationId() {
		return _educationId;
	}

	public void setEducationId(long educationId) {
		_educationId = educationId;
	}

	public long getSatffId() {
		return _satffId;
	}

	public void setSatffId(long satffId) {
		_satffId = satffId;
	}

	public String getWitness() {
		return _witness;
	}

	public void setWitness(String witness) {
		_witness = witness;
	}

	public String getProfessional() {
		return _professional;
	}

	public void setProfessional(String professional) {
		_professional = professional;
	}

	public String getUniversity() {
		return _university;
	}

	public void setUniversity(String university) {
		_university = university;
	}

	public String getContact_phone() {
		return _contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		_contact_phone = contact_phone;
	}

	public Date getStart_stop_time() {
		return _start_stop_time;
	}

	public void setStart_stop_time(Date start_stop_time) {
		_start_stop_time = start_stop_time;
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
	private long _educationId;
	private long _satffId;
	private String _witness;
	private String _professional;
	private String _university;
	private String _contact_phone;
	private Date _start_stop_time;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
}