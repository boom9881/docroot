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
public class WorkExperienceSoap implements Serializable {
	public static WorkExperienceSoap toSoapModel(WorkExperience model) {
		WorkExperienceSoap soapModel = new WorkExperienceSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWitness(model.getWitness());
		soapModel.setOnceJob(model.getOnceJob());
		soapModel.setWorkUnit(model.getWorkUnit());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setStartTime(model.getStartTime());
		soapModel.setStopTime(model.getStopTime());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static WorkExperienceSoap[] toSoapModels(WorkExperience[] models) {
		WorkExperienceSoap[] soapModels = new WorkExperienceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WorkExperienceSoap[][] toSoapModels(WorkExperience[][] models) {
		WorkExperienceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WorkExperienceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WorkExperienceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WorkExperienceSoap[] toSoapModels(List<WorkExperience> models) {
		List<WorkExperienceSoap> soapModels = new ArrayList<WorkExperienceSoap>(models.size());

		for (WorkExperience model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WorkExperienceSoap[soapModels.size()]);
	}

	public WorkExperienceSoap() {
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

	public String getWitness() {
		return _witness;
	}

	public void setWitness(String witness) {
		_witness = witness;
	}

	public String getOnceJob() {
		return _onceJob;
	}

	public void setOnceJob(String onceJob) {
		_onceJob = onceJob;
	}

	public String getWorkUnit() {
		return _workUnit;
	}

	public void setWorkUnit(String workUnit) {
		_workUnit = workUnit;
	}

	public String getContactPhone() {
		return _contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;
	}

	public Date getStartTime() {
		return _startTime;
	}

	public void setStartTime(Date startTime) {
		_startTime = startTime;
	}

	public Date getStopTime() {
		return _stopTime;
	}

	public void setStopTime(Date stopTime) {
		_stopTime = stopTime;
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
	private String _witness;
	private String _onceJob;
	private String _workUnit;
	private String _contactPhone;
	private Date _startTime;
	private Date _stopTime;
	private long _createUserId;
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}