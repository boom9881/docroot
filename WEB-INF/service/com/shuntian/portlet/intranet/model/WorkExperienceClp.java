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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.WorkExperienceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class WorkExperienceClp extends BaseModelImpl<WorkExperience>
	implements WorkExperience {
	public WorkExperienceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return WorkExperience.class;
	}

	@Override
	public String getModelClassName() {
		return WorkExperience.class.getName();
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
		attributes.put("weWitness", getWeWitness());
		attributes.put("weOnceJob", getWeOnceJob());
		attributes.put("weWorkUnit", getWeWorkUnit());
		attributes.put("weContactPhone", getWeContactPhone());
		attributes.put("weStartTimeYear", getWeStartTimeYear());
		attributes.put("weStartTimeMonth", getWeStartTimeMonth());
		attributes.put("weStopTimeYear", getWeStopTimeYear());
		attributes.put("weStopTimeMonth", getWeStopTimeMonth());

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

		String weWitness = (String)attributes.get("weWitness");

		if (weWitness != null) {
			setWeWitness(weWitness);
		}

		String weOnceJob = (String)attributes.get("weOnceJob");

		if (weOnceJob != null) {
			setWeOnceJob(weOnceJob);
		}

		String weWorkUnit = (String)attributes.get("weWorkUnit");

		if (weWorkUnit != null) {
			setWeWorkUnit(weWorkUnit);
		}

		String weContactPhone = (String)attributes.get("weContactPhone");

		if (weContactPhone != null) {
			setWeContactPhone(weContactPhone);
		}

		String weStartTimeYear = (String)attributes.get("weStartTimeYear");

		if (weStartTimeYear != null) {
			setWeStartTimeYear(weStartTimeYear);
		}

		String weStartTimeMonth = (String)attributes.get("weStartTimeMonth");

		if (weStartTimeMonth != null) {
			setWeStartTimeMonth(weStartTimeMonth);
		}

		String weStopTimeYear = (String)attributes.get("weStopTimeYear");

		if (weStopTimeYear != null) {
			setWeStopTimeYear(weStopTimeYear);
		}

		String weStopTimeMonth = (String)attributes.get("weStopTimeMonth");

		if (weStopTimeMonth != null) {
			setWeStopTimeMonth(weStopTimeMonth);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_workExperienceRemoteModel, id);
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

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_workExperienceRemoteModel, userId);
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
	public String getWeWitness() {
		return _weWitness;
	}

	@Override
	public void setWeWitness(String weWitness) {
		_weWitness = weWitness;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeWitness", String.class);

				method.invoke(_workExperienceRemoteModel, weWitness);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeOnceJob() {
		return _weOnceJob;
	}

	@Override
	public void setWeOnceJob(String weOnceJob) {
		_weOnceJob = weOnceJob;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeOnceJob", String.class);

				method.invoke(_workExperienceRemoteModel, weOnceJob);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeWorkUnit() {
		return _weWorkUnit;
	}

	@Override
	public void setWeWorkUnit(String weWorkUnit) {
		_weWorkUnit = weWorkUnit;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeWorkUnit", String.class);

				method.invoke(_workExperienceRemoteModel, weWorkUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeContactPhone() {
		return _weContactPhone;
	}

	@Override
	public void setWeContactPhone(String weContactPhone) {
		_weContactPhone = weContactPhone;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeContactPhone",
						String.class);

				method.invoke(_workExperienceRemoteModel, weContactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeStartTimeYear() {
		return _weStartTimeYear;
	}

	@Override
	public void setWeStartTimeYear(String weStartTimeYear) {
		_weStartTimeYear = weStartTimeYear;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeStartTimeYear",
						String.class);

				method.invoke(_workExperienceRemoteModel, weStartTimeYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeStartTimeMonth() {
		return _weStartTimeMonth;
	}

	@Override
	public void setWeStartTimeMonth(String weStartTimeMonth) {
		_weStartTimeMonth = weStartTimeMonth;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeStartTimeMonth",
						String.class);

				method.invoke(_workExperienceRemoteModel, weStartTimeMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeStopTimeYear() {
		return _weStopTimeYear;
	}

	@Override
	public void setWeStopTimeYear(String weStopTimeYear) {
		_weStopTimeYear = weStopTimeYear;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeStopTimeYear",
						String.class);

				method.invoke(_workExperienceRemoteModel, weStopTimeYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWeStopTimeMonth() {
		return _weStopTimeMonth;
	}

	@Override
	public void setWeStopTimeMonth(String weStopTimeMonth) {
		_weStopTimeMonth = weStopTimeMonth;

		if (_workExperienceRemoteModel != null) {
			try {
				Class<?> clazz = _workExperienceRemoteModel.getClass();

				Method method = clazz.getMethod("setWeStopTimeMonth",
						String.class);

				method.invoke(_workExperienceRemoteModel, weStopTimeMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWorkExperienceRemoteModel() {
		return _workExperienceRemoteModel;
	}

	public void setWorkExperienceRemoteModel(
		BaseModel<?> workExperienceRemoteModel) {
		_workExperienceRemoteModel = workExperienceRemoteModel;
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

		Class<?> remoteModelClass = _workExperienceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_workExperienceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WorkExperienceLocalServiceUtil.addWorkExperience(this);
		}
		else {
			WorkExperienceLocalServiceUtil.updateWorkExperience(this);
		}
	}

	@Override
	public WorkExperience toEscapedModel() {
		return (WorkExperience)ProxyUtil.newProxyInstance(WorkExperience.class.getClassLoader(),
			new Class[] { WorkExperience.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WorkExperienceClp clone = new WorkExperienceClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setWeWitness(getWeWitness());
		clone.setWeOnceJob(getWeOnceJob());
		clone.setWeWorkUnit(getWeWorkUnit());
		clone.setWeContactPhone(getWeContactPhone());
		clone.setWeStartTimeYear(getWeStartTimeYear());
		clone.setWeStartTimeMonth(getWeStartTimeMonth());
		clone.setWeStopTimeYear(getWeStopTimeYear());
		clone.setWeStopTimeMonth(getWeStopTimeMonth());

		return clone;
	}

	@Override
	public int compareTo(WorkExperience workExperience) {
		int value = 0;

		if (getId() < workExperience.getId()) {
			value = -1;
		}
		else if (getId() > workExperience.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof WorkExperienceClp)) {
			return false;
		}

		WorkExperienceClp workExperience = (WorkExperienceClp)obj;

		long primaryKey = workExperience.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", weWitness=");
		sb.append(getWeWitness());
		sb.append(", weOnceJob=");
		sb.append(getWeOnceJob());
		sb.append(", weWorkUnit=");
		sb.append(getWeWorkUnit());
		sb.append(", weContactPhone=");
		sb.append(getWeContactPhone());
		sb.append(", weStartTimeYear=");
		sb.append(getWeStartTimeYear());
		sb.append(", weStartTimeMonth=");
		sb.append(getWeStartTimeMonth());
		sb.append(", weStopTimeYear=");
		sb.append(getWeStopTimeYear());
		sb.append(", weStopTimeMonth=");
		sb.append(getWeStopTimeMonth());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.WorkExperience");
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
			"<column><column-name>weWitness</column-name><column-value><![CDATA[");
		sb.append(getWeWitness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weOnceJob</column-name><column-value><![CDATA[");
		sb.append(getWeOnceJob());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weWorkUnit</column-name><column-value><![CDATA[");
		sb.append(getWeWorkUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weContactPhone</column-name><column-value><![CDATA[");
		sb.append(getWeContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weStartTimeYear</column-name><column-value><![CDATA[");
		sb.append(getWeStartTimeYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weStartTimeMonth</column-name><column-value><![CDATA[");
		sb.append(getWeStartTimeMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weStopTimeYear</column-name><column-value><![CDATA[");
		sb.append(getWeStopTimeYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weStopTimeMonth</column-name><column-value><![CDATA[");
		sb.append(getWeStopTimeMonth());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _weWitness;
	private String _weOnceJob;
	private String _weWorkUnit;
	private String _weContactPhone;
	private String _weStartTimeYear;
	private String _weStartTimeMonth;
	private String _weStopTimeYear;
	private String _weStopTimeMonth;
	private BaseModel<?> _workExperienceRemoteModel;
}