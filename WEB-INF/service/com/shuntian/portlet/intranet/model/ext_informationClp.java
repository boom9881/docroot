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
import com.shuntian.portlet.intranet.service.ext_informationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class ext_informationClp extends BaseModelImpl<ext_information>
	implements ext_information {
	public ext_informationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ext_information.class;
	}

	@Override
	public String getModelClassName() {
		return ext_information.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _extId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setExtId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _extId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("extId", getExtId());
		attributes.put("staffId", getStaffId());
		attributes.put("open_city", getOpen_city());
		attributes.put("bank_name", getBank_name());
		attributes.put("bankid", getBankid());
		attributes.put("labor_contract_start", getLabor_contract_start());
		attributes.put("labor_contract_end", getLabor_contract_end());
		attributes.put("probation_period_start", getProbation_period_start());
		attributes.put("probation_period_end", getProbation_period_end());
		attributes.put("indured_location", getIndured_location());
		attributes.put("frist_insured", getFrist_insured());
		attributes.put("is_insured", getIs_insured());
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

		Long extId = (Long)attributes.get("extId");

		if (extId != null) {
			setExtId(extId);
		}

		Long staffId = (Long)attributes.get("staffId");

		if (staffId != null) {
			setStaffId(staffId);
		}

		String open_city = (String)attributes.get("open_city");

		if (open_city != null) {
			setOpen_city(open_city);
		}

		String bank_name = (String)attributes.get("bank_name");

		if (bank_name != null) {
			setBank_name(bank_name);
		}

		String bankid = (String)attributes.get("bankid");

		if (bankid != null) {
			setBankid(bankid);
		}

		Date labor_contract_start = (Date)attributes.get("labor_contract_start");

		if (labor_contract_start != null) {
			setLabor_contract_start(labor_contract_start);
		}

		Date labor_contract_end = (Date)attributes.get("labor_contract_end");

		if (labor_contract_end != null) {
			setLabor_contract_end(labor_contract_end);
		}

		Date probation_period_start = (Date)attributes.get(
				"probation_period_start");

		if (probation_period_start != null) {
			setProbation_period_start(probation_period_start);
		}

		Date probation_period_end = (Date)attributes.get("probation_period_end");

		if (probation_period_end != null) {
			setProbation_period_end(probation_period_end);
		}

		String indured_location = (String)attributes.get("indured_location");

		if (indured_location != null) {
			setIndured_location(indured_location);
		}

		Date frist_insured = (Date)attributes.get("frist_insured");

		if (frist_insured != null) {
			setFrist_insured(frist_insured);
		}

		String is_insured = (String)attributes.get("is_insured");

		if (is_insured != null) {
			setIs_insured(is_insured);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_ext_informationRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExtId() {
		return _extId;
	}

	@Override
	public void setExtId(long extId) {
		_extId = extId;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setExtId", long.class);

				method.invoke(_ext_informationRemoteModel, extId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStaffId() {
		return _staffId;
	}

	@Override
	public void setStaffId(long staffId) {
		_staffId = staffId;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setStaffId", long.class);

				method.invoke(_ext_informationRemoteModel, staffId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOpen_city() {
		return _open_city;
	}

	@Override
	public void setOpen_city(String open_city) {
		_open_city = open_city;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setOpen_city", String.class);

				method.invoke(_ext_informationRemoteModel, open_city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBank_name() {
		return _bank_name;
	}

	@Override
	public void setBank_name(String bank_name) {
		_bank_name = bank_name;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setBank_name", String.class);

				method.invoke(_ext_informationRemoteModel, bank_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankid() {
		return _bankid;
	}

	@Override
	public void setBankid(String bankid) {
		_bankid = bankid;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setBankid", String.class);

				method.invoke(_ext_informationRemoteModel, bankid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLabor_contract_start() {
		return _labor_contract_start;
	}

	@Override
	public void setLabor_contract_start(Date labor_contract_start) {
		_labor_contract_start = labor_contract_start;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setLabor_contract_start",
						Date.class);

				method.invoke(_ext_informationRemoteModel, labor_contract_start);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLabor_contract_end() {
		return _labor_contract_end;
	}

	@Override
	public void setLabor_contract_end(Date labor_contract_end) {
		_labor_contract_end = labor_contract_end;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setLabor_contract_end",
						Date.class);

				method.invoke(_ext_informationRemoteModel, labor_contract_end);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProbation_period_start() {
		return _probation_period_start;
	}

	@Override
	public void setProbation_period_start(Date probation_period_start) {
		_probation_period_start = probation_period_start;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setProbation_period_start",
						Date.class);

				method.invoke(_ext_informationRemoteModel,
					probation_period_start);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProbation_period_end() {
		return _probation_period_end;
	}

	@Override
	public void setProbation_period_end(Date probation_period_end) {
		_probation_period_end = probation_period_end;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setProbation_period_end",
						Date.class);

				method.invoke(_ext_informationRemoteModel, probation_period_end);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIndured_location() {
		return _indured_location;
	}

	@Override
	public void setIndured_location(String indured_location) {
		_indured_location = indured_location;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setIndured_location",
						String.class);

				method.invoke(_ext_informationRemoteModel, indured_location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFrist_insured() {
		return _frist_insured;
	}

	@Override
	public void setFrist_insured(Date frist_insured) {
		_frist_insured = frist_insured;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setFrist_insured", Date.class);

				method.invoke(_ext_informationRemoteModel, frist_insured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIs_insured() {
		return _is_insured;
	}

	@Override
	public void setIs_insured(String is_insured) {
		_is_insured = is_insured;

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setIs_insured", String.class);

				method.invoke(_ext_informationRemoteModel, is_insured);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_ext_informationRemoteModel, companyId);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateuser", long.class);

				method.invoke(_ext_informationRemoteModel, createuser);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_ext_informationRemoteModel, createDate);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieduser", long.class);

				method.invoke(_ext_informationRemoteModel, modifieduser);
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

		if (_ext_informationRemoteModel != null) {
			try {
				Class<?> clazz = _ext_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_ext_informationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				ext_information.class.getName()));
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

	public BaseModel<?> getext_informationRemoteModel() {
		return _ext_informationRemoteModel;
	}

	public void setext_informationRemoteModel(
		BaseModel<?> ext_informationRemoteModel) {
		_ext_informationRemoteModel = ext_informationRemoteModel;
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

		Class<?> remoteModelClass = _ext_informationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ext_informationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ext_informationLocalServiceUtil.addext_information(this);
		}
		else {
			ext_informationLocalServiceUtil.updateext_information(this);
		}
	}

	@Override
	public ext_information toEscapedModel() {
		return (ext_information)ProxyUtil.newProxyInstance(ext_information.class.getClassLoader(),
			new Class[] { ext_information.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ext_informationClp clone = new ext_informationClp();

		clone.setUuid(getUuid());
		clone.setExtId(getExtId());
		clone.setStaffId(getStaffId());
		clone.setOpen_city(getOpen_city());
		clone.setBank_name(getBank_name());
		clone.setBankid(getBankid());
		clone.setLabor_contract_start(getLabor_contract_start());
		clone.setLabor_contract_end(getLabor_contract_end());
		clone.setProbation_period_start(getProbation_period_start());
		clone.setProbation_period_end(getProbation_period_end());
		clone.setIndured_location(getIndured_location());
		clone.setFrist_insured(getFrist_insured());
		clone.setIs_insured(getIs_insured());
		clone.setCompanyId(getCompanyId());
		clone.setCreateuser(getCreateuser());
		clone.setCreateDate(getCreateDate());
		clone.setModifieduser(getModifieduser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(ext_information ext_information) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				ext_information.getCreateDate());

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

		if (!(obj instanceof ext_informationClp)) {
			return false;
		}

		ext_informationClp ext_information = (ext_informationClp)obj;

		long primaryKey = ext_information.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", extId=");
		sb.append(getExtId());
		sb.append(", staffId=");
		sb.append(getStaffId());
		sb.append(", open_city=");
		sb.append(getOpen_city());
		sb.append(", bank_name=");
		sb.append(getBank_name());
		sb.append(", bankid=");
		sb.append(getBankid());
		sb.append(", labor_contract_start=");
		sb.append(getLabor_contract_start());
		sb.append(", labor_contract_end=");
		sb.append(getLabor_contract_end());
		sb.append(", probation_period_start=");
		sb.append(getProbation_period_start());
		sb.append(", probation_period_end=");
		sb.append(getProbation_period_end());
		sb.append(", indured_location=");
		sb.append(getIndured_location());
		sb.append(", frist_insured=");
		sb.append(getFrist_insured());
		sb.append(", is_insured=");
		sb.append(getIs_insured());
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
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.ext_information");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extId</column-name><column-value><![CDATA[");
		sb.append(getExtId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staffId</column-name><column-value><![CDATA[");
		sb.append(getStaffId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>open_city</column-name><column-value><![CDATA[");
		sb.append(getOpen_city());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bank_name</column-name><column-value><![CDATA[");
		sb.append(getBank_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankid</column-name><column-value><![CDATA[");
		sb.append(getBankid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>labor_contract_start</column-name><column-value><![CDATA[");
		sb.append(getLabor_contract_start());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>labor_contract_end</column-name><column-value><![CDATA[");
		sb.append(getLabor_contract_end());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>probation_period_start</column-name><column-value><![CDATA[");
		sb.append(getProbation_period_start());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>probation_period_end</column-name><column-value><![CDATA[");
		sb.append(getProbation_period_end());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>indured_location</column-name><column-value><![CDATA[");
		sb.append(getIndured_location());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frist_insured</column-name><column-value><![CDATA[");
		sb.append(getFrist_insured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_insured</column-name><column-value><![CDATA[");
		sb.append(getIs_insured());
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
	private long _extId;
	private long _staffId;
	private String _open_city;
	private String _bank_name;
	private String _bankid;
	private Date _labor_contract_start;
	private Date _labor_contract_end;
	private Date _probation_period_start;
	private Date _probation_period_end;
	private String _indured_location;
	private Date _frist_insured;
	private String _is_insured;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
	private BaseModel<?> _ext_informationRemoteModel;
}