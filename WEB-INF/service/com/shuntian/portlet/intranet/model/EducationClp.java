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
import com.shuntian.portlet.intranet.service.EducationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class EducationClp extends BaseModelImpl<Education> implements Education {
	public EducationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Education.class;
	}

	@Override
	public String getModelClassName() {
		return Education.class.getName();
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
		attributes.put("witness", getWitness());
		attributes.put("professional", getProfessional());
		attributes.put("university", getUniversity());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("startTime", getStartTime());
		attributes.put("stopTime", getStopTime());

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

		String witness = (String)attributes.get("witness");

		if (witness != null) {
			setWitness(witness);
		}

		String professional = (String)attributes.get("professional");

		if (professional != null) {
			setProfessional(professional);
		}

		String university = (String)attributes.get("university");

		if (university != null) {
			setUniversity(university);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		Date startTime = (Date)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Date stopTime = (Date)attributes.get("stopTime");

		if (stopTime != null) {
			setStopTime(stopTime);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_educationRemoteModel, id);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_educationRemoteModel, userId);
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
	public String getWitness() {
		return _witness;
	}

	@Override
	public void setWitness(String witness) {
		_witness = witness;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setWitness", String.class);

				method.invoke(_educationRemoteModel, witness);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfessional() {
		return _professional;
	}

	@Override
	public void setProfessional(String professional) {
		_professional = professional;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setProfessional", String.class);

				method.invoke(_educationRemoteModel, professional);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUniversity() {
		return _university;
	}

	@Override
	public void setUniversity(String university) {
		_university = university;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setUniversity", String.class);

				method.invoke(_educationRemoteModel, university);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPhone() {
		return _contactPhone;
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_educationRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartTime() {
		return _startTime;
	}

	@Override
	public void setStartTime(Date startTime) {
		_startTime = startTime;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setStartTime", Date.class);

				method.invoke(_educationRemoteModel, startTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStopTime() {
		return _stopTime;
	}

	@Override
	public void setStopTime(Date stopTime) {
		_stopTime = stopTime;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setStopTime", Date.class);

				method.invoke(_educationRemoteModel, stopTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEducationRemoteModel() {
		return _educationRemoteModel;
	}

	public void setEducationRemoteModel(BaseModel<?> educationRemoteModel) {
		_educationRemoteModel = educationRemoteModel;
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

		Class<?> remoteModelClass = _educationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_educationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EducationLocalServiceUtil.addEducation(this);
		}
		else {
			EducationLocalServiceUtil.updateEducation(this);
		}
	}

	@Override
	public Education toEscapedModel() {
		return (Education)ProxyUtil.newProxyInstance(Education.class.getClassLoader(),
			new Class[] { Education.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EducationClp clone = new EducationClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setWitness(getWitness());
		clone.setProfessional(getProfessional());
		clone.setUniversity(getUniversity());
		clone.setContactPhone(getContactPhone());
		clone.setStartTime(getStartTime());
		clone.setStopTime(getStopTime());

		return clone;
	}

	@Override
	public int compareTo(Education education) {
		int value = 0;

		if (getId() < education.getId()) {
			value = -1;
		}
		else if (getId() > education.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof EducationClp)) {
			return false;
		}

		EducationClp education = (EducationClp)obj;

		long primaryKey = education.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", witness=");
		sb.append(getWitness());
		sb.append(", professional=");
		sb.append(getProfessional());
		sb.append(", university=");
		sb.append(getUniversity());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", startTime=");
		sb.append(getStartTime());
		sb.append(", stopTime=");
		sb.append(getStopTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Education");
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
			"<column><column-name>witness</column-name><column-value><![CDATA[");
		sb.append(getWitness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>professional</column-name><column-value><![CDATA[");
		sb.append(getProfessional());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>university</column-name><column-value><![CDATA[");
		sb.append(getUniversity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startTime</column-name><column-value><![CDATA[");
		sb.append(getStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stopTime</column-name><column-value><![CDATA[");
		sb.append(getStopTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _witness;
	private String _professional;
	private String _university;
	private String _contactPhone;
	private Date _startTime;
	private Date _stopTime;
	private BaseModel<?> _educationRemoteModel;
}