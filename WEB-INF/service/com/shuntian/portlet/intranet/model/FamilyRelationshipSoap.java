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
		soapModel.setFrName(model.getFrName());
		soapModel.setFrRelationship(model.getFrRelationship());
		soapModel.setFrWorkUnit(model.getFrWorkUnit());
		soapModel.setFrContactPhone(model.getFrContactPhone());
		soapModel.setFrOnceJob(model.getFrOnceJob());

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

	public String getFrName() {
		return _frName;
	}

	public void setFrName(String frName) {
		_frName = frName;
	}

	public String getFrRelationship() {
		return _frRelationship;
	}

	public void setFrRelationship(String frRelationship) {
		_frRelationship = frRelationship;
	}

	public String getFrWorkUnit() {
		return _frWorkUnit;
	}

	public void setFrWorkUnit(String frWorkUnit) {
		_frWorkUnit = frWorkUnit;
	}

	public String getFrContactPhone() {
		return _frContactPhone;
	}

	public void setFrContactPhone(String frContactPhone) {
		_frContactPhone = frContactPhone;
	}

	public String getFrOnceJob() {
		return _frOnceJob;
	}

	public void setFrOnceJob(String frOnceJob) {
		_frOnceJob = frOnceJob;
	}

	private long _id;
	private long _userId;
	private String _frName;
	private String _frRelationship;
	private String _frWorkUnit;
	private String _frContactPhone;
	private String _frOnceJob;
}