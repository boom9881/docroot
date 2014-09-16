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
import com.shuntian.portlet.intranet.service.FamilyRelationshipLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class FamilyRelationshipClp extends BaseModelImpl<FamilyRelationship>
	implements FamilyRelationship {
	public FamilyRelationshipClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FamilyRelationship.class;
	}

	@Override
	public String getModelClassName() {
		return FamilyRelationship.class.getName();
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
		attributes.put("frName", getFrName());
		attributes.put("frRelationship", getFrRelationship());
		attributes.put("frWorkUnit", getFrWorkUnit());
		attributes.put("frContactPhone", getFrContactPhone());
		attributes.put("frOnceJob", getFrOnceJob());

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

		String frName = (String)attributes.get("frName");

		if (frName != null) {
			setFrName(frName);
		}

		String frRelationship = (String)attributes.get("frRelationship");

		if (frRelationship != null) {
			setFrRelationship(frRelationship);
		}

		String frWorkUnit = (String)attributes.get("frWorkUnit");

		if (frWorkUnit != null) {
			setFrWorkUnit(frWorkUnit);
		}

		String frContactPhone = (String)attributes.get("frContactPhone");

		if (frContactPhone != null) {
			setFrContactPhone(frContactPhone);
		}

		String frOnceJob = (String)attributes.get("frOnceJob");

		if (frOnceJob != null) {
			setFrOnceJob(frOnceJob);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_familyRelationshipRemoteModel, id);
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

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_familyRelationshipRemoteModel, userId);
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
	public String getFrName() {
		return _frName;
	}

	@Override
	public void setFrName(String frName) {
		_frName = frName;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setFrName", String.class);

				method.invoke(_familyRelationshipRemoteModel, frName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrRelationship() {
		return _frRelationship;
	}

	@Override
	public void setFrRelationship(String frRelationship) {
		_frRelationship = frRelationship;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setFrRelationship",
						String.class);

				method.invoke(_familyRelationshipRemoteModel, frRelationship);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrWorkUnit() {
		return _frWorkUnit;
	}

	@Override
	public void setFrWorkUnit(String frWorkUnit) {
		_frWorkUnit = frWorkUnit;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setFrWorkUnit", String.class);

				method.invoke(_familyRelationshipRemoteModel, frWorkUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrContactPhone() {
		return _frContactPhone;
	}

	@Override
	public void setFrContactPhone(String frContactPhone) {
		_frContactPhone = frContactPhone;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setFrContactPhone",
						String.class);

				method.invoke(_familyRelationshipRemoteModel, frContactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrOnceJob() {
		return _frOnceJob;
	}

	@Override
	public void setFrOnceJob(String frOnceJob) {
		_frOnceJob = frOnceJob;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setFrOnceJob", String.class);

				method.invoke(_familyRelationshipRemoteModel, frOnceJob);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFamilyRelationshipRemoteModel() {
		return _familyRelationshipRemoteModel;
	}

	public void setFamilyRelationshipRemoteModel(
		BaseModel<?> familyRelationshipRemoteModel) {
		_familyRelationshipRemoteModel = familyRelationshipRemoteModel;
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

		Class<?> remoteModelClass = _familyRelationshipRemoteModel.getClass();

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

		Object returnValue = method.invoke(_familyRelationshipRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FamilyRelationshipLocalServiceUtil.addFamilyRelationship(this);
		}
		else {
			FamilyRelationshipLocalServiceUtil.updateFamilyRelationship(this);
		}
	}

	@Override
	public FamilyRelationship toEscapedModel() {
		return (FamilyRelationship)ProxyUtil.newProxyInstance(FamilyRelationship.class.getClassLoader(),
			new Class[] { FamilyRelationship.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FamilyRelationshipClp clone = new FamilyRelationshipClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setFrName(getFrName());
		clone.setFrRelationship(getFrRelationship());
		clone.setFrWorkUnit(getFrWorkUnit());
		clone.setFrContactPhone(getFrContactPhone());
		clone.setFrOnceJob(getFrOnceJob());

		return clone;
	}

	@Override
	public int compareTo(FamilyRelationship familyRelationship) {
		int value = 0;

		if (getId() < familyRelationship.getId()) {
			value = -1;
		}
		else if (getId() > familyRelationship.getId()) {
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

		if (!(obj instanceof FamilyRelationshipClp)) {
			return false;
		}

		FamilyRelationshipClp familyRelationship = (FamilyRelationshipClp)obj;

		long primaryKey = familyRelationship.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", frName=");
		sb.append(getFrName());
		sb.append(", frRelationship=");
		sb.append(getFrRelationship());
		sb.append(", frWorkUnit=");
		sb.append(getFrWorkUnit());
		sb.append(", frContactPhone=");
		sb.append(getFrContactPhone());
		sb.append(", frOnceJob=");
		sb.append(getFrOnceJob());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.FamilyRelationship");
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
			"<column><column-name>frName</column-name><column-value><![CDATA[");
		sb.append(getFrName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frRelationship</column-name><column-value><![CDATA[");
		sb.append(getFrRelationship());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frWorkUnit</column-name><column-value><![CDATA[");
		sb.append(getFrWorkUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frContactPhone</column-name><column-value><![CDATA[");
		sb.append(getFrContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frOnceJob</column-name><column-value><![CDATA[");
		sb.append(getFrOnceJob());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _frName;
	private String _frRelationship;
	private String _frWorkUnit;
	private String _frContactPhone;
	private String _frOnceJob;
	private BaseModel<?> _familyRelationshipRemoteModel;
}