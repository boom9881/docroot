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
public class WorkExperienceSoap implements Serializable {
	public static WorkExperienceSoap toSoapModel(WorkExperience model) {
		WorkExperienceSoap soapModel = new WorkExperienceSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWeWitness(model.getWeWitness());
		soapModel.setWeOnceJob(model.getWeOnceJob());
		soapModel.setWeWorkUnit(model.getWeWorkUnit());
		soapModel.setWeContactPhone(model.getWeContactPhone());
		soapModel.setWeStartTimeYear(model.getWeStartTimeYear());
		soapModel.setWeStartTimeMonth(model.getWeStartTimeMonth());
		soapModel.setWeStopTimeYear(model.getWeStopTimeYear());
		soapModel.setWeStopTimeMonth(model.getWeStopTimeMonth());

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

	public String getWeWitness() {
		return _weWitness;
	}

	public void setWeWitness(String weWitness) {
		_weWitness = weWitness;
	}

	public String getWeOnceJob() {
		return _weOnceJob;
	}

	public void setWeOnceJob(String weOnceJob) {
		_weOnceJob = weOnceJob;
	}

	public String getWeWorkUnit() {
		return _weWorkUnit;
	}

	public void setWeWorkUnit(String weWorkUnit) {
		_weWorkUnit = weWorkUnit;
	}

	public String getWeContactPhone() {
		return _weContactPhone;
	}

	public void setWeContactPhone(String weContactPhone) {
		_weContactPhone = weContactPhone;
	}

	public String getWeStartTimeYear() {
		return _weStartTimeYear;
	}

	public void setWeStartTimeYear(String weStartTimeYear) {
		_weStartTimeYear = weStartTimeYear;
	}

	public String getWeStartTimeMonth() {
		return _weStartTimeMonth;
	}

	public void setWeStartTimeMonth(String weStartTimeMonth) {
		_weStartTimeMonth = weStartTimeMonth;
	}

	public String getWeStopTimeYear() {
		return _weStopTimeYear;
	}

	public void setWeStopTimeYear(String weStopTimeYear) {
		_weStopTimeYear = weStopTimeYear;
	}

	public String getWeStopTimeMonth() {
		return _weStopTimeMonth;
	}

	public void setWeStopTimeMonth(String weStopTimeMonth) {
		_weStopTimeMonth = weStopTimeMonth;
	}

	private long _id;
	private long _userId;
	private String _weWitness;
	private String _weOnceJob;
	private String _weWorkUnit;
	private String _weContactPhone;
	private String _weStartTimeYear;
	private String _weStartTimeMonth;
	private String _weStopTimeYear;
	private String _weStopTimeMonth;
}