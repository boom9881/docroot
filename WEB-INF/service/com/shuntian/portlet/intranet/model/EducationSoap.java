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
public class EducationSoap implements Serializable {
	public static EducationSoap toSoapModel(Education model) {
		EducationSoap soapModel = new EducationSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setEWitness(model.getEWitness());
		soapModel.setEProfessional(model.getEProfessional());
		soapModel.setEUniversity(model.getEUniversity());
		soapModel.setEContactPhone(model.getEContactPhone());
		soapModel.setEStartTimeYear(model.getEStartTimeYear());
		soapModel.setEStartTimeMonth(model.getEStartTimeMonth());
		soapModel.setEStopTimeYear(model.getEStopTimeYear());
		soapModel.setEStopTimeMonth(model.getEStopTimeMonth());

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

	public String getEWitness() {
		return _eWitness;
	}

	public void setEWitness(String eWitness) {
		_eWitness = eWitness;
	}

	public String getEProfessional() {
		return _eProfessional;
	}

	public void setEProfessional(String eProfessional) {
		_eProfessional = eProfessional;
	}

	public String getEUniversity() {
		return _eUniversity;
	}

	public void setEUniversity(String eUniversity) {
		_eUniversity = eUniversity;
	}

	public String getEContactPhone() {
		return _eContactPhone;
	}

	public void setEContactPhone(String eContactPhone) {
		_eContactPhone = eContactPhone;
	}

	public String getEStartTimeYear() {
		return _eStartTimeYear;
	}

	public void setEStartTimeYear(String eStartTimeYear) {
		_eStartTimeYear = eStartTimeYear;
	}

	public String getEStartTimeMonth() {
		return _eStartTimeMonth;
	}

	public void setEStartTimeMonth(String eStartTimeMonth) {
		_eStartTimeMonth = eStartTimeMonth;
	}

	public String getEStopTimeYear() {
		return _eStopTimeYear;
	}

	public void setEStopTimeYear(String eStopTimeYear) {
		_eStopTimeYear = eStopTimeYear;
	}

	public String getEStopTimeMonth() {
		return _eStopTimeMonth;
	}

	public void setEStopTimeMonth(String eStopTimeMonth) {
		_eStopTimeMonth = eStopTimeMonth;
	}

	private long _id;
	private long _userId;
	private String _eWitness;
	private String _eProfessional;
	private String _eUniversity;
	private String _eContactPhone;
	private String _eStartTimeYear;
	private String _eStartTimeMonth;
	private String _eStopTimeYear;
	private String _eStopTimeMonth;
}