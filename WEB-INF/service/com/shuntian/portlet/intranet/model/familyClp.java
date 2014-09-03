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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.familyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class familyClp extends BaseModelImpl<family> implements family {
	public familyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return family.class;
	}

	@Override
	public String getModelClassName() {
		return family.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _familyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFamilyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _familyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("familyId", getFamilyId());
		attributes.put("satffId", getSatffId());
		attributes.put("name", getName());
		attributes.put("relationship", getRelationship());
		attributes.put("work_unit", getWork_unit());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("once_job", getOnce_job());
		attributes.put("companyId", getCompanyId());
		attributes.put("createuser", getCreateuser());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifieduser", getModifieduser());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long familyId = (Long)attributes.get("familyId");

		if (familyId != null) {
			setFamilyId(familyId);
		}

		Long satffId = (Long)attributes.get("satffId");

		if (satffId != null) {
			setSatffId(satffId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		String work_unit = (String)attributes.get("work_unit");

		if (work_unit != null) {
			setWork_unit(work_unit);
		}

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		String once_job = (String)attributes.get("once_job");

		if (once_job != null) {
			setOnce_job(once_job);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createuser = (Long)attributes.get("createuser");

		if (createuser != null) {
			setCreateuser(createuser);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifieduser = (Long)attributes.get("modifieduser");

		if (modifieduser != null) {
			setModifieduser(modifieduser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_familyRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFamilyId() {
		return _familyId;
	}

	@Override
	public void setFamilyId(long familyId) {
		_familyId = familyId;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyId", long.class);

				method.invoke(_familyRemoteModel, familyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSatffId() {
		return _satffId;
	}

	@Override
	public void setSatffId(long satffId) {
		_satffId = satffId;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setSatffId", long.class);

				method.invoke(_familyRemoteModel, satffId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_familyRemoteModel, name);
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

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setRelationship", String.class);

				method.invoke(_familyRemoteModel, relationship);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWork_unit() {
		return _work_unit;
	}

	@Override
	public void setWork_unit(String work_unit) {
		_work_unit = work_unit;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setWork_unit", String.class);

				method.invoke(_familyRemoteModel, work_unit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContact_phone() {
		return _contact_phone;
	}

	@Override
	public void setContact_phone(String contact_phone) {
		_contact_phone = contact_phone;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setContact_phone", String.class);

				method.invoke(_familyRemoteModel, contact_phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOnce_job() {
		return _once_job;
	}

	@Override
	public void setOnce_job(String once_job) {
		_once_job = once_job;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setOnce_job", String.class);

				method.invoke(_familyRemoteModel, once_job);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_familyRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateuser() {
		return _createuser;
	}

	@Override
	public void setCreateuser(long createuser) {
		_createuser = createuser;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateuser", long.class);

				method.invoke(_familyRemoteModel, createuser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_familyRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifieduser() {
		return _modifieduser;
	}

	@Override
	public void setModifieduser(long modifieduser) {
		_modifieduser = modifieduser;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieduser", long.class);

				method.invoke(_familyRemoteModel, modifieduser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_familyRemoteModel != null) {
			try {
				Class<?> clazz = _familyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_familyRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				family.class.getName()));
	}

	@Override
	public int getStatus() {
		return 0;
	}

	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException {
		if (!isInTrash()) {
			return null;
		}

		TrashEntry trashEntry = TrashEntryLocalServiceUtil.fetchEntry(getModelClassName(),
				getTrashEntryClassPK());

		if (trashEntry != null) {
			return trashEntry;
		}

		TrashHandler trashHandler = getTrashHandler();

		if (!Validator.isNull(trashHandler.getContainerModelClassName())) {
			ContainerModel containerModel = trashHandler.getParentContainerModel(this);

			while (containerModel != null) {
				if (containerModel instanceof TrashedModel) {
					TrashedModel trashedModel = (TrashedModel)containerModel;

					return trashedModel.getTrashEntry();
				}

				trashHandler = TrashHandlerRegistryUtil.getTrashHandler(trashHandler.getContainerModelClassName());

				if (trashHandler == null) {
					return null;
				}

				containerModel = trashHandler.getContainerModel(containerModel.getParentContainerModelId());
			}
		}

		return null;
	}

	@Override
	public long getTrashEntryClassPK() {
		return getPrimaryKey();
	}

	@Override
	public TrashHandler getTrashHandler() {
		return TrashHandlerRegistryUtil.getTrashHandler(getModelClassName());
	}

	@Override
	public boolean isInTrash() {
		if (getStatus() == WorkflowConstants.STATUS_IN_TRASH) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInTrashContainer() {
		TrashHandler trashHandler = getTrashHandler();

		if ((trashHandler == null) ||
				Validator.isNull(trashHandler.getContainerModelClassName())) {
			return false;
		}

		try {
			ContainerModel containerModel = trashHandler.getParentContainerModel(this);

			if (containerModel == null) {
				return false;
			}

			if (containerModel instanceof TrashedModel) {
				return ((TrashedModel)containerModel).isInTrash();
			}
		}
		catch (Exception e) {
		}

		return false;
	}

	public BaseModel<?> getfamilyRemoteModel() {
		return _familyRemoteModel;
	}

	public void setfamilyRemoteModel(BaseModel<?> familyRemoteModel) {
		_familyRemoteModel = familyRemoteModel;
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

		Class<?> remoteModelClass = _familyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_familyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			familyLocalServiceUtil.addfamily(this);
		}
		else {
			familyLocalServiceUtil.updatefamily(this);
		}
	}

	@Override
	public family toEscapedModel() {
		return (family)ProxyUtil.newProxyInstance(family.class.getClassLoader(),
			new Class[] { family.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		familyClp clone = new familyClp();

		clone.setUuid(getUuid());
		clone.setFamilyId(getFamilyId());
		clone.setSatffId(getSatffId());
		clone.setName(getName());
		clone.setRelationship(getRelationship());
		clone.setWork_unit(getWork_unit());
		clone.setContact_phone(getContact_phone());
		clone.setOnce_job(getOnce_job());
		clone.setCompanyId(getCompanyId());
		clone.setCreateuser(getCreateuser());
		clone.setCreateDate(getCreateDate());
		clone.setModifieduser(getModifieduser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(family family) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), family.getCreateDate());

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

		if (!(obj instanceof familyClp)) {
			return false;
		}

		familyClp family = (familyClp)obj;

		long primaryKey = family.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", familyId=");
		sb.append(getFamilyId());
		sb.append(", satffId=");
		sb.append(getSatffId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", relationship=");
		sb.append(getRelationship());
		sb.append(", work_unit=");
		sb.append(getWork_unit());
		sb.append(", contact_phone=");
		sb.append(getContact_phone());
		sb.append(", once_job=");
		sb.append(getOnce_job());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createuser=");
		sb.append(getCreateuser());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifieduser=");
		sb.append(getModifieduser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.family");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyId</column-name><column-value><![CDATA[");
		sb.append(getFamilyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>satffId</column-name><column-value><![CDATA[");
		sb.append(getSatffId());
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
			"<column><column-name>work_unit</column-name><column-value><![CDATA[");
		sb.append(getWork_unit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact_phone</column-name><column-value><![CDATA[");
		sb.append(getContact_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>once_job</column-name><column-value><![CDATA[");
		sb.append(getOnce_job());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createuser</column-name><column-value><![CDATA[");
		sb.append(getCreateuser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifieduser</column-name><column-value><![CDATA[");
		sb.append(getModifieduser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _familyId;
	private long _satffId;
	private String _name;
	private String _relationship;
	private String _work_unit;
	private String _contact_phone;
	private String _once_job;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
	private BaseModel<?> _familyRemoteModel;
}