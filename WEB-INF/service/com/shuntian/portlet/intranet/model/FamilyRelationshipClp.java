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
		attributes.put("name", getName());
		attributes.put("relationship", getRelationship());
		attributes.put("workUnit", getWorkUnit());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("onceJob", getOnceJob());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		String workUnit = (String)attributes.get("workUnit");

		if (workUnit != null) {
			setWorkUnit(workUnit);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String onceJob = (String)attributes.get("onceJob");

		if (onceJob != null) {
			setOnceJob(onceJob);
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
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_familyRelationshipRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRelationship() {
		return _relationship;
	}

	@Override
	public void setRelationship(String relationship) {
		_relationship = relationship;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setRelationship", String.class);

				method.invoke(_familyRelationshipRemoteModel, relationship);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWorkUnit() {
		return _workUnit;
	}

	@Override
	public void setWorkUnit(String workUnit) {
		_workUnit = workUnit;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkUnit", String.class);

				method.invoke(_familyRelationshipRemoteModel, workUnit);
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

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_familyRelationshipRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOnceJob() {
		return _onceJob;
	}

	@Override
	public void setOnceJob(String onceJob) {
		_onceJob = onceJob;

		if (_familyRelationshipRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationshipRemoteModel.getClass();

				Method method = clazz.getMethod("setOnceJob", String.class);

				method.invoke(_familyRelationshipRemoteModel, onceJob);
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
		clone.setName(getName());
		clone.setRelationship(getRelationship());
		clone.setWorkUnit(getWorkUnit());
		clone.setContactPhone(getContactPhone());
		clone.setOnceJob(getOnceJob());

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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", relationship=");
		sb.append(getRelationship());
		sb.append(", workUnit=");
		sb.append(getWorkUnit());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", onceJob=");
		sb.append(getOnceJob());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relationship</column-name><column-value><![CDATA[");
		sb.append(getRelationship());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workUnit</column-name><column-value><![CDATA[");
		sb.append(getWorkUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onceJob</column-name><column-value><![CDATA[");
		sb.append(getOnceJob());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _name;
	private String _relationship;
	private String _workUnit;
	private String _contactPhone;
	private String _onceJob;
	private BaseModel<?> _familyRelationshipRemoteModel;
}