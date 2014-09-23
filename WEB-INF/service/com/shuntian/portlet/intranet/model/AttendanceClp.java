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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;
import com.shuntian.portlet.intranet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class AttendanceClp extends BaseModelImpl<Attendance>
	implements Attendance {
	public AttendanceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Attendance.class;
	}

	@Override
	public String getModelClassName() {
		return Attendance.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("shouldAttendance", getShouldAttendance());
		attributes.put("actualAttendance", getActualAttendance());
		attributes.put("attendanceYear", getAttendanceYear());
		attributes.put("attendanceMonth", getAttendanceMonth());
		attributes.put("status", getStatus());
		attributes.put("approver", getApprover());
		attributes.put("createUserId", getCreateUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedUserId", getModifiedUserId());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Double shouldAttendance = (Double)attributes.get("shouldAttendance");

		if (shouldAttendance != null) {
			setShouldAttendance(shouldAttendance);
		}

		Double actualAttendance = (Double)attributes.get("actualAttendance");

		if (actualAttendance != null) {
			setActualAttendance(actualAttendance);
		}

		Long attendanceYear = (Long)attributes.get("attendanceYear");

		if (attendanceYear != null) {
			setAttendanceYear(attendanceYear);
		}

		Long attendanceMonth = (Long)attributes.get("attendanceMonth");

		if (attendanceMonth != null) {
			setAttendanceMonth(attendanceMonth);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long approver = (Long)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		Long createUserId = (Long)attributes.get("createUserId");

		if (createUserId != null) {
			setCreateUserId(createUserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifiedUserId = (Long)attributes.get("modifiedUserId");

		if (modifiedUserId != null) {
			setModifiedUserId(modifiedUserId);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_attendanceRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_attendanceRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public double getShouldAttendance() {
		return _shouldAttendance;
	}

	@Override
	public void setShouldAttendance(double shouldAttendance) {
		_shouldAttendance = shouldAttendance;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setShouldAttendance",
						double.class);

				method.invoke(_attendanceRemoteModel, shouldAttendance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getActualAttendance() {
		return _actualAttendance;
	}

	@Override
	public void setActualAttendance(double actualAttendance) {
		_actualAttendance = actualAttendance;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setActualAttendance",
						double.class);

				method.invoke(_attendanceRemoteModel, actualAttendance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttendanceYear() {
		return _attendanceYear;
	}

	@Override
	public void setAttendanceYear(long attendanceYear) {
		_attendanceYear = attendanceYear;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setAttendanceYear", long.class);

				method.invoke(_attendanceRemoteModel, attendanceYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttendanceMonth() {
		return _attendanceMonth;
	}

	@Override
	public void setAttendanceMonth(long attendanceMonth) {
		_attendanceMonth = attendanceMonth;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setAttendanceMonth", long.class);

				method.invoke(_attendanceRemoteModel, attendanceMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_attendanceRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApprover() {
		return _approver;
	}

	@Override
	public void setApprover(long approver) {
		_approver = approver;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setApprover", long.class);

				method.invoke(_attendanceRemoteModel, approver);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateUserId() {
		return _createUserId;
	}

	@Override
	public void setCreateUserId(long createUserId) {
		_createUserId = createUserId;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateUserId", long.class);

				method.invoke(_attendanceRemoteModel, createUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCreateUserId(), "uuid",
			_createUserUuid);
	}

	@Override
	public void setCreateUserUuid(String createUserUuid) {
		_createUserUuid = createUserUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_attendanceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUserId", long.class);

				method.invoke(_attendanceRemoteModel, modifiedUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getModifiedUserId(), "uuid",
			_modifiedUserUuid);
	}

	@Override
	public void setModifiedUserUuid(String modifiedUserUuid) {
		_modifiedUserUuid = modifiedUserUuid;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_attendanceRemoteModel != null) {
			try {
				Class<?> clazz = _attendanceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_attendanceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAttendanceRemoteModel() {
		return _attendanceRemoteModel;
	}

	public void setAttendanceRemoteModel(BaseModel<?> attendanceRemoteModel) {
		_attendanceRemoteModel = attendanceRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _attendanceRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_attendanceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AttendanceLocalServiceUtil.addAttendance(this);
		}
		else {
			AttendanceLocalServiceUtil.updateAttendance(this);
		}
	}

	@Override
	public Attendance toEscapedModel() {
		return (Attendance)ProxyUtil.newProxyInstance(Attendance.class.getClassLoader(),
			new Class[] { Attendance.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AttendanceClp clone = new AttendanceClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setShouldAttendance(getShouldAttendance());
		clone.setActualAttendance(getActualAttendance());
		clone.setAttendanceYear(getAttendanceYear());
		clone.setAttendanceMonth(getAttendanceMonth());
		clone.setStatus(getStatus());
		clone.setApprover(getApprover());
		clone.setCreateUserId(getCreateUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedUserId(getModifiedUserId());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(Attendance attendance) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), attendance.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttendanceClp)) {
			return false;
		}

		AttendanceClp attendance = (AttendanceClp)obj;

		long primaryKey = attendance.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", shouldAttendance=");
		sb.append(getShouldAttendance());
		sb.append(", actualAttendance=");
		sb.append(getActualAttendance());
		sb.append(", attendanceYear=");
		sb.append(getAttendanceYear());
		sb.append(", attendanceMonth=");
		sb.append(getAttendanceMonth());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", approver=");
		sb.append(getApprover());
		sb.append(", createUserId=");
		sb.append(getCreateUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedUserId=");
		sb.append(getModifiedUserId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Attendance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shouldAttendance</column-name><column-value><![CDATA[");
		sb.append(getShouldAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actualAttendance</column-name><column-value><![CDATA[");
		sb.append(getActualAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attendanceYear</column-name><column-value><![CDATA[");
		sb.append(getAttendanceYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attendanceMonth</column-name><column-value><![CDATA[");
		sb.append(getAttendanceMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approver</column-name><column-value><![CDATA[");
		sb.append(getApprover());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createUserId</column-name><column-value><![CDATA[");
		sb.append(getCreateUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUserId</column-name><column-value><![CDATA[");
		sb.append(getModifiedUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private double _shouldAttendance;
	private double _actualAttendance;
	private long _attendanceYear;
	private long _attendanceMonth;
	private int _status;
	private long _approver;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private BaseModel<?> _attendanceRemoteModel;
}