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
public class FamilyRelationshipSoap implements Serializable {
	public static FamilyRelationshipSoap toSoapModel(FamilyRelationship model) {
		FamilyRelationshipSoap soapModel = new FamilyRelationshipSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setName(model.getName());
		soapModel.setRelationship(model.getRelationship());
		soapModel.setWorkUnit(model.getWorkUnit());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setOnceJob(model.getOnceJob());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static FamilyRelationshipSoap[] toSoapModels(
		FamilyRelationship[] models) {
		FamilyRelationshipSoap[] soapModels = new FamilyRelationshipSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FamilyRelationshipSoap[][] toSoapModels(
		FamilyRelationship[][] models) {
		FamilyRelationshipSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FamilyRelationshipSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FamilyRelationshipSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FamilyRelationshipSoap[] toSoapModels(
		List<FamilyRelationship> models) {
		List<FamilyRelationshipSoap> soapModels = new ArrayList<FamilyRelationshipSoap>(models.size());

		for (FamilyRelationship model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FamilyRelationshipSoap[soapModels.size()]);
	}

	public FamilyRelationshipSoap() {
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

	public String getRelationship() {
		return _relationship;
	}

	public void setRelationship(String relationship) {
		_relationship = relationship;
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

	public String getOnceJob() {
		return _onceJob;
	}

	public void setOnceJob(String onceJob) {
		_onceJob = onceJob;
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
	private String _relationship;
	private String _workUnit;
	private String _contactPhone;
	private String _onceJob;
	private long _createUserId;
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}