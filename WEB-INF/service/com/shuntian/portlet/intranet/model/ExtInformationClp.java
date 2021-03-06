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
import com.shuntian.portlet.intranet.service.ExtInformationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class ExtInformationClp extends BaseModelImpl<ExtInformation>
	implements ExtInformation {
	public ExtInformationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ExtInformation.class;
	}

	@Override
	public String getModelClassName() {
		return ExtInformation.class.getName();
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
		attributes.put("openCity", getOpenCity());
		attributes.put("bankName", getBankName());
		attributes.put("bankId", getBankId());
		attributes.put("laborContractStart", getLaborContractStart());
		attributes.put("laborContractEnd", getLaborContractEnd());
		attributes.put("probationPeriodStart", getProbationPeriodStart());
		attributes.put("probationPeriodEnd", getProbationPeriodEnd());
		attributes.put("induredLocation", getInduredLocation());
		attributes.put("fristInsuredYear", getFristInsuredYear());
		attributes.put("fristInsuredMonth", getFristInsuredMonth());
		attributes.put("isInsured", getIsInsured());
		attributes.put("basicWage", getBasicWage());
		attributes.put("otherWage", getOtherWage());

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

		String openCity = (String)attributes.get("openCity");

		if (openCity != null) {
			setOpenCity(openCity);
		}

		String bankName = (String)attributes.get("bankName");

		if (bankName != null) {
			setBankName(bankName);
		}

		String bankId = (String)attributes.get("bankId");

		if (bankId != null) {
			setBankId(bankId);
		}

		Date laborContractStart = (Date)attributes.get("laborContractStart");

		if (laborContractStart != null) {
			setLaborContractStart(laborContractStart);
		}

		Date laborContractEnd = (Date)attributes.get("laborContractEnd");

		if (laborContractEnd != null) {
			setLaborContractEnd(laborContractEnd);
		}

		Date probationPeriodStart = (Date)attributes.get("probationPeriodStart");

		if (probationPeriodStart != null) {
			setProbationPeriodStart(probationPeriodStart);
		}

		Date probationPeriodEnd = (Date)attributes.get("probationPeriodEnd");

		if (probationPeriodEnd != null) {
			setProbationPeriodEnd(probationPeriodEnd);
		}

		String induredLocation = (String)attributes.get("induredLocation");

		if (induredLocation != null) {
			setInduredLocation(induredLocation);
		}

		String fristInsuredYear = (String)attributes.get("fristInsuredYear");

		if (fristInsuredYear != null) {
			setFristInsuredYear(fristInsuredYear);
		}

		String fristInsuredMonth = (String)attributes.get("fristInsuredMonth");

		if (fristInsuredMonth != null) {
			setFristInsuredMonth(fristInsuredMonth);
		}

		String isInsured = (String)attributes.get("isInsured");

		if (isInsured != null) {
			setIsInsured(isInsured);
		}

		Long basicWage = (Long)attributes.get("basicWage");

		if (basicWage != null) {
			setBasicWage(basicWage);
		}

		Long otherWage = (Long)attributes.get("otherWage");

		if (otherWage != null) {
			setOtherWage(otherWage);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_extInformationRemoteModel, id);
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

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_extInformationRemoteModel, userId);
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
	public String getOpenCity() {
		return _openCity;
	}

	@Override
	public void setOpenCity(String openCity) {
		_openCity = openCity;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setOpenCity", String.class);

				method.invoke(_extInformationRemoteModel, openCity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankName() {
		return _bankName;
	}

	@Override
	public void setBankName(String bankName) {
		_bankName = bankName;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setBankName", String.class);

				method.invoke(_extInformationRemoteModel, bankName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankId() {
		return _bankId;
	}

	@Override
	public void setBankId(String bankId) {
		_bankId = bankId;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setBankId", String.class);

				method.invoke(_extInformationRemoteModel, bankId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLaborContractStart() {
		return _laborContractStart;
	}

	@Override
	public void setLaborContractStart(Date laborContractStart) {
		_laborContractStart = laborContractStart;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setLaborContractStart",
						Date.class);

				method.invoke(_extInformationRemoteModel, laborContractStart);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLaborContractEnd() {
		return _laborContractEnd;
	}

	@Override
	public void setLaborContractEnd(Date laborContractEnd) {
		_laborContractEnd = laborContractEnd;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setLaborContractEnd",
						Date.class);

				method.invoke(_extInformationRemoteModel, laborContractEnd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProbationPeriodStart() {
		return _probationPeriodStart;
	}

	@Override
	public void setProbationPeriodStart(Date probationPeriodStart) {
		_probationPeriodStart = probationPeriodStart;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setProbationPeriodStart",
						Date.class);

				method.invoke(_extInformationRemoteModel, probationPeriodStart);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProbationPeriodEnd() {
		return _probationPeriodEnd;
	}

	@Override
	public void setProbationPeriodEnd(Date probationPeriodEnd) {
		_probationPeriodEnd = probationPeriodEnd;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setProbationPeriodEnd",
						Date.class);

				method.invoke(_extInformationRemoteModel, probationPeriodEnd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInduredLocation() {
		return _induredLocation;
	}

	@Override
	public void setInduredLocation(String induredLocation) {
		_induredLocation = induredLocation;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setInduredLocation",
						String.class);

				method.invoke(_extInformationRemoteModel, induredLocation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFristInsuredYear() {
		return _fristInsuredYear;
	}

	@Override
	public void setFristInsuredYear(String fristInsuredYear) {
		_fristInsuredYear = fristInsuredYear;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setFristInsuredYear",
						String.class);

				method.invoke(_extInformationRemoteModel, fristInsuredYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFristInsuredMonth() {
		return _fristInsuredMonth;
	}

	@Override
	public void setFristInsuredMonth(String fristInsuredMonth) {
		_fristInsuredMonth = fristInsuredMonth;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setFristInsuredMonth",
						String.class);

				method.invoke(_extInformationRemoteModel, fristInsuredMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsInsured() {
		return _isInsured;
	}

	@Override
	public void setIsInsured(String isInsured) {
		_isInsured = isInsured;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsInsured", String.class);

				method.invoke(_extInformationRemoteModel, isInsured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBasicWage() {
		return _basicWage;
	}

	@Override
	public void setBasicWage(long basicWage) {
		_basicWage = basicWage;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setBasicWage", long.class);

				method.invoke(_extInformationRemoteModel, basicWage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOtherWage() {
		return _otherWage;
	}

	@Override
	public void setOtherWage(long otherWage) {
		_otherWage = otherWage;

		if (_extInformationRemoteModel != null) {
			try {
				Class<?> clazz = _extInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherWage", long.class);

				method.invoke(_extInformationRemoteModel, otherWage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExtInformationRemoteModel() {
		return _extInformationRemoteModel;
	}

	public void setExtInformationRemoteModel(
		BaseModel<?> extInformationRemoteModel) {
		_extInformationRemoteModel = extInformationRemoteModel;
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

		Class<?> remoteModelClass = _extInformationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_extInformationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ExtInformationLocalServiceUtil.addExtInformation(this);
		}
		else {
			ExtInformationLocalServiceUtil.updateExtInformation(this);
		}
	}

	@Override
	public ExtInformation toEscapedModel() {
		return (ExtInformation)ProxyUtil.newProxyInstance(ExtInformation.class.getClassLoader(),
			new Class[] { ExtInformation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ExtInformationClp clone = new ExtInformationClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setOpenCity(getOpenCity());
		clone.setBankName(getBankName());
		clone.setBankId(getBankId());
		clone.setLaborContractStart(getLaborContractStart());
		clone.setLaborContractEnd(getLaborContractEnd());
		clone.setProbationPeriodStart(getProbationPeriodStart());
		clone.setProbationPeriodEnd(getProbationPeriodEnd());
		clone.setInduredLocation(getInduredLocation());
		clone.setFristInsuredYear(getFristInsuredYear());
		clone.setFristInsuredMonth(getFristInsuredMonth());
		clone.setIsInsured(getIsInsured());
		clone.setBasicWage(getBasicWage());
		clone.setOtherWage(getOtherWage());

		return clone;
	}

	@Override
	public int compareTo(ExtInformation extInformation) {
		int value = 0;

		if (getId() < extInformation.getId()) {
			value = -1;
		}
		else if (getId() > extInformation.getId()) {
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

		if (!(obj instanceof ExtInformationClp)) {
			return false;
		}

		ExtInformationClp extInformation = (ExtInformationClp)obj;

		long primaryKey = extInformation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", openCity=");
		sb.append(getOpenCity());
		sb.append(", bankName=");
		sb.append(getBankName());
		sb.append(", bankId=");
		sb.append(getBankId());
		sb.append(", laborContractStart=");
		sb.append(getLaborContractStart());
		sb.append(", laborContractEnd=");
		sb.append(getLaborContractEnd());
		sb.append(", probationPeriodStart=");
		sb.append(getProbationPeriodStart());
		sb.append(", probationPeriodEnd=");
		sb.append(getProbationPeriodEnd());
		sb.append(", induredLocation=");
		sb.append(getInduredLocation());
		sb.append(", fristInsuredYear=");
		sb.append(getFristInsuredYear());
		sb.append(", fristInsuredMonth=");
		sb.append(getFristInsuredMonth());
		sb.append(", isInsured=");
		sb.append(getIsInsured());
		sb.append(", basicWage=");
		sb.append(getBasicWage());
		sb.append(", otherWage=");
		sb.append(getOtherWage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.ExtInformation");
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
			"<column><column-name>openCity</column-name><column-value><![CDATA[");
		sb.append(getOpenCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankName</column-name><column-value><![CDATA[");
		sb.append(getBankName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankId</column-name><column-value><![CDATA[");
		sb.append(getBankId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>laborContractStart</column-name><column-value><![CDATA[");
		sb.append(getLaborContractStart());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>laborContractEnd</column-name><column-value><![CDATA[");
		sb.append(getLaborContractEnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>probationPeriodStart</column-name><column-value><![CDATA[");
		sb.append(getProbationPeriodStart());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>probationPeriodEnd</column-name><column-value><![CDATA[");
		sb.append(getProbationPeriodEnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>induredLocation</column-name><column-value><![CDATA[");
		sb.append(getInduredLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fristInsuredYear</column-name><column-value><![CDATA[");
		sb.append(getFristInsuredYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fristInsuredMonth</column-name><column-value><![CDATA[");
		sb.append(getFristInsuredMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isInsured</column-name><column-value><![CDATA[");
		sb.append(getIsInsured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basicWage</column-name><column-value><![CDATA[");
		sb.append(getBasicWage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherWage</column-name><column-value><![CDATA[");
		sb.append(getOtherWage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _openCity;
	private String _bankName;
	private String _bankId;
	private Date _laborContractStart;
	private Date _laborContractEnd;
	private Date _probationPeriodStart;
	private Date _probationPeriodEnd;
	private String _induredLocation;
	private String _fristInsuredYear;
	private String _fristInsuredMonth;
	private String _isInsured;
	private long _basicWage;
	private long _otherWage;
	private BaseModel<?> _extInformationRemoteModel;
}