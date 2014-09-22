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

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class OvertimeClp extends BaseModelImpl<Overtime> implements Overtime {
	public OvertimeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Overtime.class;
	}

	@Override
	public String getModelClassName() {
		return Overtime.class.getName();
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
		attributes.put("usuallyOvertime", getUsuallyOvertime());
		attributes.put("restOvertime", getRestOvertime());
		attributes.put("legalOvertime", getLegalOvertime());
		attributes.put("overtimeYear", getOvertimeYear());
		attributes.put("overtimeMonthly", getOvertimeMonthly());
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

		Double usuallyOvertime = (Double)attributes.get("usuallyOvertime");

		if (usuallyOvertime != null) {
			setUsuallyOvertime(usuallyOvertime);
		}

		Double restOvertime = (Double)attributes.get("restOvertime");

		if (restOvertime != null) {
			setRestOvertime(restOvertime);
		}

		Double legalOvertime = (Double)attributes.get("legalOvertime");

		if (legalOvertime != null) {
			setLegalOvertime(legalOvertime);
		}

		Long overtimeYear = (Long)attributes.get("overtimeYear");

		if (overtimeYear != null) {
			setOvertimeYear(overtimeYear);
		}

		Long overtimeMonthly = (Long)attributes.get("overtimeMonthly");

		if (overtimeMonthly != null) {
			setOvertimeMonthly(overtimeMonthly);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_overtimeRemoteModel, id);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_overtimeRemoteModel, userId);
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
	public double getUsuallyOvertime() {
		return _usuallyOvertime;
	}

	@Override
	public void setUsuallyOvertime(double usuallyOvertime) {
		_usuallyOvertime = usuallyOvertime;

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setUsuallyOvertime",
						double.class);

				method.invoke(_overtimeRemoteModel, usuallyOvertime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRestOvertime() {
		return _restOvertime;
	}

	@Override
	public void setRestOvertime(double restOvertime) {
		_restOvertime = restOvertime;

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setRestOvertime", double.class);

				method.invoke(_overtimeRemoteModel, restOvertime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLegalOvertime() {
		return _legalOvertime;
	}

	@Override
	public void setLegalOvertime(double legalOvertime) {
		_legalOvertime = legalOvertime;

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setLegalOvertime", double.class);

				method.invoke(_overtimeRemoteModel, legalOvertime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOvertimeYear() {
		return _overtimeYear;
	}

	@Override
	public void setOvertimeYear(long overtimeYear) {
		_overtimeYear = overtimeYear;

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setOvertimeYear", long.class);

				method.invoke(_overtimeRemoteModel, overtimeYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOvertimeMonthly() {
		return _overtimeMonthly;
	}

	@Override
	public void setOvertimeMonthly(long overtimeMonthly) {
		_overtimeMonthly = overtimeMonthly;

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setOvertimeMonthly", long.class);

				method.invoke(_overtimeRemoteModel, overtimeMonthly);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_overtimeRemoteModel, status);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setApprover", long.class);

				method.invoke(_overtimeRemoteModel, approver);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateUserId", long.class);

				method.invoke(_overtimeRemoteModel, createUserId);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_overtimeRemoteModel, createDate);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUserId", long.class);

				method.invoke(_overtimeRemoteModel, modifiedUserId);
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

		if (_overtimeRemoteModel != null) {
			try {
				Class<?> clazz = _overtimeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_overtimeRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOvertimeRemoteModel() {
		return _overtimeRemoteModel;
	}

	public void setOvertimeRemoteModel(BaseModel<?> overtimeRemoteModel) {
		_overtimeRemoteModel = overtimeRemoteModel;
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

		Class<?> remoteModelClass = _overtimeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_overtimeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OvertimeLocalServiceUtil.addOvertime(this);
		}
		else {
			OvertimeLocalServiceUtil.updateOvertime(this);
		}
	}

	@Override
	public Overtime toEscapedModel() {
		return (Overtime)ProxyUtil.newProxyInstance(Overtime.class.getClassLoader(),
			new Class[] { Overtime.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OvertimeClp clone = new OvertimeClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setUsuallyOvertime(getUsuallyOvertime());
		clone.setRestOvertime(getRestOvertime());
		clone.setLegalOvertime(getLegalOvertime());
		clone.setOvertimeYear(getOvertimeYear());
		clone.setOvertimeMonthly(getOvertimeMonthly());
		clone.setStatus(getStatus());
		clone.setApprover(getApprover());
		clone.setCreateUserId(getCreateUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedUserId(getModifiedUserId());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(Overtime overtime) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), overtime.getCreateDate());

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

		if (!(obj instanceof OvertimeClp)) {
			return false;
		}

		OvertimeClp overtime = (OvertimeClp)obj;

		long primaryKey = overtime.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", usuallyOvertime=");
		sb.append(getUsuallyOvertime());
		sb.append(", restOvertime=");
		sb.append(getRestOvertime());
		sb.append(", legalOvertime=");
		sb.append(getLegalOvertime());
		sb.append(", overtimeYear=");
		sb.append(getOvertimeYear());
		sb.append(", overtimeMonthly=");
		sb.append(getOvertimeMonthly());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Overtime");
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
			"<column><column-name>usuallyOvertime</column-name><column-value><![CDATA[");
		sb.append(getUsuallyOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>restOvertime</column-name><column-value><![CDATA[");
		sb.append(getRestOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>legalOvertime</column-name><column-value><![CDATA[");
		sb.append(getLegalOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeYear</column-name><column-value><![CDATA[");
		sb.append(getOvertimeYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeMonthly</column-name><column-value><![CDATA[");
		sb.append(getOvertimeMonthly());
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
	private double _usuallyOvertime;
	private double _restOvertime;
	private double _legalOvertime;
	private long _overtimeYear;
	private long _overtimeMonthly;
	private int _status;
	private long _approver;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private BaseModel<?> _overtimeRemoteModel;
}