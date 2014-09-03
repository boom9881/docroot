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
import com.shuntian.portlet.intranet.service.educationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class educationClp extends BaseModelImpl<education> implements education {
	public educationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return education.class;
	}

	@Override
	public String getModelClassName() {
		return education.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _educationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEducationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _educationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("educationId", getEducationId());
		attributes.put("satffId", getSatffId());
		attributes.put("witness", getWitness());
		attributes.put("professional", getProfessional());
		attributes.put("university", getUniversity());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("start_stop_time", getStart_stop_time());
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

		Long educationId = (Long)attributes.get("educationId");

		if (educationId != null) {
			setEducationId(educationId);
		}

		Long satffId = (Long)attributes.get("satffId");

		if (satffId != null) {
			setSatffId(satffId);
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

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		Date start_stop_time = (Date)attributes.get("start_stop_time");

		if (start_stop_time != null) {
			setStart_stop_time(start_stop_time);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_educationRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEducationId() {
		return _educationId;
	}

	@Override
	public void setEducationId(long educationId) {
		_educationId = educationId;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setEducationId", long.class);

				method.invoke(_educationRemoteModel, educationId);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setSatffId", long.class);

				method.invoke(_educationRemoteModel, satffId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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
	public String getContact_phone() {
		return _contact_phone;
	}

	@Override
	public void setContact_phone(String contact_phone) {
		_contact_phone = contact_phone;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setContact_phone", String.class);

				method.invoke(_educationRemoteModel, contact_phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStart_stop_time() {
		return _start_stop_time;
	}

	@Override
	public void setStart_stop_time(Date start_stop_time) {
		_start_stop_time = start_stop_time;

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setStart_stop_time", Date.class);

				method.invoke(_educationRemoteModel, start_stop_time);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_educationRemoteModel, companyId);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateuser", long.class);

				method.invoke(_educationRemoteModel, createuser);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_educationRemoteModel, createDate);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieduser", long.class);

				method.invoke(_educationRemoteModel, modifieduser);
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

		if (_educationRemoteModel != null) {
			try {
				Class<?> clazz = _educationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_educationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				education.class.getName()));
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

	public BaseModel<?> geteducationRemoteModel() {
		return _educationRemoteModel;
	}

	public void seteducationRemoteModel(BaseModel<?> educationRemoteModel) {
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
			educationLocalServiceUtil.addeducation(this);
		}
		else {
			educationLocalServiceUtil.updateeducation(this);
		}
	}

	@Override
	public education toEscapedModel() {
		return (education)ProxyUtil.newProxyInstance(education.class.getClassLoader(),
			new Class[] { education.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		educationClp clone = new educationClp();

		clone.setUuid(getUuid());
		clone.setEducationId(getEducationId());
		clone.setSatffId(getSatffId());
		clone.setWitness(getWitness());
		clone.setProfessional(getProfessional());
		clone.setUniversity(getUniversity());
		clone.setContact_phone(getContact_phone());
		clone.setStart_stop_time(getStart_stop_time());
		clone.setCompanyId(getCompanyId());
		clone.setCreateuser(getCreateuser());
		clone.setCreateDate(getCreateDate());
		clone.setModifieduser(getModifieduser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(education education) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), education.getCreateDate());

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

		if (!(obj instanceof educationClp)) {
			return false;
		}

		educationClp education = (educationClp)obj;

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
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", educationId=");
		sb.append(getEducationId());
		sb.append(", satffId=");
		sb.append(getSatffId());
		sb.append(", witness=");
		sb.append(getWitness());
		sb.append(", professional=");
		sb.append(getProfessional());
		sb.append(", university=");
		sb.append(getUniversity());
		sb.append(", contact_phone=");
		sb.append(getContact_phone());
		sb.append(", start_stop_time=");
		sb.append(getStart_stop_time());
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
		sb.append("com.shuntian.portlet.intranet.model.education");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>educationId</column-name><column-value><![CDATA[");
		sb.append(getEducationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>satffId</column-name><column-value><![CDATA[");
		sb.append(getSatffId());
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
			"<column><column-name>contact_phone</column-name><column-value><![CDATA[");
		sb.append(getContact_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>start_stop_time</column-name><column-value><![CDATA[");
		sb.append(getStart_stop_time());
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
	private long _educationId;
	private long _satffId;
	private String _witness;
	private String _professional;
	private String _university;
	private String _contact_phone;
	private Date _start_stop_time;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
	private BaseModel<?> _educationRemoteModel;
}