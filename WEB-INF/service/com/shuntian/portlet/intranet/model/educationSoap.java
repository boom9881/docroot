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
public class EducationSoap implements Serializable {
	public static EducationSoap toSoapModel(Education model) {
		EducationSoap soapModel = new EducationSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWitness(model.getWitness());
		soapModel.setProfessional(model.getProfessional());
		soapModel.setUniversity(model.getUniversity());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setStartTime(model.getStartTime());
		soapModel.setStopTime(model.getStopTime());

		return soapModel;
	}

	public static EducationSoap[] toSoapModels(Education[] models) {
		EducationSoap[] soapModels = new EducationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EducationSoap[][] toSoapModels(Education[][] models) {
		EducationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EducationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EducationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EducationSoap[] toSoapModels(List<Education> models) {
		List<EducationSoap> soapModels = new ArrayList<EducationSoap>(models.size());

		for (Education model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EducationSoap[soapModels.size()]);
	}

	public EducationSoap() {
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

	private long _id;
	private long _userId;
	private String _witness;
	private String _professional;
	private String _university;
	private String _contactPhone;
	private Date _startTime;
	private Date _stopTime;
}