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
public class workSoap implements Serializable {
	public static workSoap toSoapModel(work model) {
		workSoap soapModel = new workSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setWorkId(model.getWorkId());
		soapModel.setSatffId(model.getSatffId());
		soapModel.setWitness(model.getWitness());
		soapModel.setOnce_job(model.getOnce_job());
		soapModel.setWork_unit(model.getWork_unit());
		soapModel.setContact_phone(model.getContact_phone());
		soapModel.setStart_stop_time(model.getStart_stop_time());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateuser(model.getCreateuser());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifieduser(model.getModifieduser());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static workSoap[] toSoapModels(work[] models) {
		workSoap[] soapModels = new workSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static workSoap[][] toSoapModels(work[][] models) {
		workSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new workSoap[models.length][models[0].length];
		}
		else {
			soapModels = new workSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static workSoap[] toSoapModels(List<work> models) {
		List<workSoap> soapModels = new ArrayList<workSoap>(models.size());

		for (work model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new workSoap[soapModels.size()]);
	}

	public workSoap() {
	}

	public long getPrimaryKey() {
		return _workId;
	}

	public void setPrimaryKey(long pk) {
		setWorkId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getWorkId() {
		return _workId;
	}

	public void setWorkId(long workId) {
		_workId = workId;
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

	public String getOnce_job() {
		return _once_job;
	}

	public void setOnce_job(String once_job) {
		_once_job = once_job;
	}

	public String getWork_unit() {
		return _work_unit;
	}

	public void setWork_unit(String work_unit) {
		_work_unit = work_unit;
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
	private long _workId;
	private long _satffId;
	private String _witness;
	private String _once_job;
	private String _work_unit;
	private String _contact_phone;
	private Date _start_stop_time;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
}