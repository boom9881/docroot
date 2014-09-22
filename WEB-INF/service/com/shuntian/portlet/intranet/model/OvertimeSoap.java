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
public class OvertimeSoap implements Serializable {
	public static OvertimeSoap toSoapModel(Overtime model) {
		OvertimeSoap soapModel = new OvertimeSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUsuallyOvertime(model.getUsuallyOvertime());
		soapModel.setRestOvertime(model.getRestOvertime());
		soapModel.setLegalOvertime(model.getLegalOvertime());
		soapModel.setOvertimeYear(model.getOvertimeYear());
		soapModel.setOvertimeMonthly(model.getOvertimeMonthly());
		soapModel.setStatus(model.getStatus());
		soapModel.setApprover(model.getApprover());
		soapModel.setCreateUserId(model.getCreateUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedUserId(model.getModifiedUserId());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static OvertimeSoap[] toSoapModels(Overtime[] models) {
		OvertimeSoap[] soapModels = new OvertimeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OvertimeSoap[][] toSoapModels(Overtime[][] models) {
		OvertimeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OvertimeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OvertimeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OvertimeSoap[] toSoapModels(List<Overtime> models) {
		List<OvertimeSoap> soapModels = new ArrayList<OvertimeSoap>(models.size());

		for (Overtime model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OvertimeSoap[soapModels.size()]);
	}

	public OvertimeSoap() {
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

	public double getUsuallyOvertime() {
		return _usuallyOvertime;
	}

	public void setUsuallyOvertime(double usuallyOvertime) {
		_usuallyOvertime = usuallyOvertime;
	}

	public double getRestOvertime() {
		return _restOvertime;
	}

	public void setRestOvertime(double restOvertime) {
		_restOvertime = restOvertime;
	}

	public double getLegalOvertime() {
		return _legalOvertime;
	}

	public void setLegalOvertime(double legalOvertime) {
		_legalOvertime = legalOvertime;
	}

	public long getOvertimeYear() {
		return _overtimeYear;
	}

	public void setOvertimeYear(long overtimeYear) {
		_overtimeYear = overtimeYear;
	}

	public long getOvertimeMonthly() {
		return _overtimeMonthly;
	}

	public void setOvertimeMonthly(long overtimeMonthly) {
		_overtimeMonthly = overtimeMonthly;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getApprover() {
		return _approver;
	}

	public void setApprover(long approver) {
		_approver = approver;
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
	private double _usuallyOvertime;
	private double _restOvertime;
	private double _legalOvertime;
	private long _overtimeYear;
	private long _overtimeMonthly;
	private int _status;
	private long _approver;
	private long _createUserId;
	private Date _createDate;
	private long _modifiedUserId;
	private Date _modifiedDate;
}