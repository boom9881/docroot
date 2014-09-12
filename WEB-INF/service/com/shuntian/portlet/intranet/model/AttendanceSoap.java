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
public class AttendanceSoap implements Serializable {
	public static AttendanceSoap toSoapModel(Attendance model) {
		AttendanceSoap soapModel = new AttendanceSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setShouldAttendance(model.getShouldAttendance());
		soapModel.setActualAttendance(model.getActualAttendance());
		soapModel.setAttendanceMonthly(model.getAttendanceMonthly());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static AttendanceSoap[] toSoapModels(Attendance[] models) {
		AttendanceSoap[] soapModels = new AttendanceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttendanceSoap[][] toSoapModels(Attendance[][] models) {
		AttendanceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttendanceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttendanceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttendanceSoap[] toSoapModels(List<Attendance> models) {
		List<AttendanceSoap> soapModels = new ArrayList<AttendanceSoap>(models.size());

		for (Attendance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttendanceSoap[soapModels.size()]);
	}

	public AttendanceSoap() {
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

	public double getShouldAttendance() {
		return _shouldAttendance;
	}

	public void setShouldAttendance(double shouldAttendance) {
		_shouldAttendance = shouldAttendance;
	}

	public double getActualAttendance() {
		return _actualAttendance;
	}

	public void setActualAttendance(double actualAttendance) {
		_actualAttendance = actualAttendance;
	}

	public long getAttendanceMonthly() {
		return _attendanceMonthly;
	}

	public void setAttendanceMonthly(long attendanceMonthly) {
		_attendanceMonthly = attendanceMonthly;
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
	private double _shouldAttendance;
	private double _actualAttendance;
	private long _attendanceMonthly;
	private long _createUserId;
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}