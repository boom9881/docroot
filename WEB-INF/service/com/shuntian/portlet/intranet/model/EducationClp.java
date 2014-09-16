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
		attributes.put("eWitness", getEWitness());
		attributes.put("eProfessional", getEProfessional());
		attributes.put("eUniversity", getEUniversity());
		attributes.put("eContactPhone", getEContactPhone());
		attributes.put("eStartTimeYear", getEStartTimeYear());
		attributes.put("eStartTimeMonth", getEStartTimeMonth());
		attributes.put("eStopTimeYear", getEStopTimeYear());
		attributes.put("eStopTimeMonth", getEStopTimeMonth());

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

		String eWitness = (String)attributes.get("eWitness");

		if (eWitness != null) {
			setEWitness(eWitness);
		}

		String eProfessional = (String)attributes.get("eProfessional");

		if (eProfessional != null) {
			setEProfessional(eProfessional);
		}

		String eUniversity = (String)attributes.get("eUniversity");

		if (eUniversity != null) {
			setEUniversity(eUniversity);
		}

		String eContactPhone = (String)attributes.get("eContactPhone");

		if (eContactPhone != null) {
			setEContactPhone(eContactPhone);
		}

		String eStartTimeYear = (String)attributes.get("eStartTimeYear");

		if (eStartTimeYear != null) {
			setEStartTimeYear(eStartTimeYear);
		}

		String eStartTimeMonth = (String)attributes.get("eStartTimeMonth");

		if (eStartTimeMonth != null) {
			setEStartTimeMonth(eStartTimeMonth);
		}

		String eStopTimeYear = (String)attributes.get("eStopTimeYear");

		if (eStopTimeYear != null) {
			setEStopTimeYear(eStopTimeYear);
		}

		String eStopTimeMonth = (String)attributes.get("eStopTimeMonth");

		if (eStopTimeMonth != null) {
			setEStopTimeMonth(eStopTimeMonth);
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
	public String getEWitness() {
		return _eWitness;
	}

	@Override
	public void setEWitness(String eWitness) {
		_eWitness = eWitness;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEWitness", String.class);

				method.invoke(_educationRemoteModel, eWitness);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEProfessional() {
		return _eProfessional;
	}

	@Override
	public void setEProfessional(String eProfessional) {
		_eProfessional = eProfessional;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEProfessional", String.class);

				method.invoke(_educationRemoteModel, eProfessional);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEUniversity() {
		return _eUniversity;
	}

	@Override
	public void setEUniversity(String eUniversity) {
		_eUniversity = eUniversity;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEUniversity", String.class);

				method.invoke(_educationRemoteModel, eUniversity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEContactPhone() {
		return _eContactPhone;
	}

	@Override
	public void setEContactPhone(String eContactPhone) {
		_eContactPhone = eContactPhone;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEContactPhone", String.class);

				method.invoke(_educationRemoteModel, eContactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEStartTimeYear() {
		return _eStartTimeYear;
	}

	@Override
	public void setEStartTimeYear(String eStartTimeYear) {
		_eStartTimeYear = eStartTimeYear;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEStartTimeYear",
						String.class);

				method.invoke(_educationRemoteModel, eStartTimeYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEStartTimeMonth() {
		return _eStartTimeMonth;
	}

	@Override
	public void setEStartTimeMonth(String eStartTimeMonth) {
		_eStartTimeMonth = eStartTimeMonth;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEStartTimeMonth",
						String.class);

				method.invoke(_educationRemoteModel, eStartTimeMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEStopTimeYear() {
		return _eStopTimeYear;
	}

	@Override
	public void setEStopTimeYear(String eStopTimeYear) {
		_eStopTimeYear = eStopTimeYear;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEStopTimeYear", String.class);

				method.invoke(_educationRemoteModel, eStopTimeYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEStopTimeMonth() {
		return _eStopTimeMonth;
	}

	@Override
	public void setEStopTimeMonth(String eStopTimeMonth) {
		_eStopTimeMonth = eStopTimeMonth;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEStopTimeMonth",
						String.class);

				method.invoke(_educationRemoteModel, eStopTimeMonth);
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
		clone.setEWitness(getEWitness());
		clone.setEProfessional(getEProfessional());
		clone.setEUniversity(getEUniversity());
		clone.setEContactPhone(getEContactPhone());
		clone.setEStartTimeYear(getEStartTimeYear());
		clone.setEStartTimeMonth(getEStartTimeMonth());
		clone.setEStopTimeYear(getEStopTimeYear());
		clone.setEStopTimeMonth(getEStopTimeMonth());

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", eWitness=");
		sb.append(getEWitness());
		sb.append(", eProfessional=");
		sb.append(getEProfessional());
		sb.append(", eUniversity=");
		sb.append(getEUniversity());
		sb.append(", eContactPhone=");
		sb.append(getEContactPhone());
		sb.append(", eStartTimeYear=");
		sb.append(getEStartTimeYear());
		sb.append(", eStartTimeMonth=");
		sb.append(getEStartTimeMonth());
		sb.append(", eStopTimeYear=");
		sb.append(getEStopTimeYear());
		sb.append(", eStopTimeMonth=");
		sb.append(getEStopTimeMonth());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

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
			"<column><column-name>eWitness</column-name><column-value><![CDATA[");
		sb.append(getEWitness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eProfessional</column-name><column-value><![CDATA[");
		sb.append(getEProfessional());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eUniversity</column-name><column-value><![CDATA[");
		sb.append(getEUniversity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eContactPhone</column-name><column-value><![CDATA[");
		sb.append(getEContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eStartTimeYear</column-name><column-value><![CDATA[");
		sb.append(getEStartTimeYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eStartTimeMonth</column-name><column-value><![CDATA[");
		sb.append(getEStartTimeMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eStopTimeYear</column-name><column-value><![CDATA[");
		sb.append(getEStopTimeYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eStopTimeMonth</column-name><column-value><![CDATA[");
		sb.append(getEStopTimeMonth());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _eWitness;
	private String _eProfessional;
	private String _eUniversity;
	private String _eContactPhone;
	private String _eStartTimeYear;
	private String _eStartTimeMonth;
	private String _eStopTimeYear;
	private String _eStopTimeMonth;
	private BaseModel<?> _educationRemoteModel;
}