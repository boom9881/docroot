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

import com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class BasicInformationClp extends BaseModelImpl<BasicInformation>
	implements BasicInformation {
	public BasicInformationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BasicInformation.class;
	}

	@Override
	public String getModelClassName() {
		return BasicInformation.class.getName();
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
		attributes.put("sex", getSex());
		attributes.put("idNumber", getIdNumber());
		attributes.put("nation", getNation());
		attributes.put("placeOfOrigin", getPlaceOfOrigin());
		attributes.put("accountProperties", getAccountProperties());
		attributes.put("birthDate", getBirthDate());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("highestDegree", getHighestDegree());
		attributes.put("politicalBackground", getPoliticalBackground());
		attributes.put("fileLocation", getFileLocation());
		attributes.put("basePay", getBasePay());
		attributes.put("performancePay", getPerformancePay());
		attributes.put("health", getHealth());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("mail", getMail());
		attributes.put("domicile", getDomicile());
		attributes.put("residencePhone", getResidencePhone());
		attributes.put("currentResidentialAddress",
			getCurrentResidentialAddress());
		attributes.put("currentResidentialAddressPhone",
			getCurrentResidentialAddressPhone());
		attributes.put("emergencyContact", getEmergencyContact());
		attributes.put("emergencyContactRelation", getEmergencyContactRelation());
		attributes.put("emergencyContactPhone", getEmergencyContactPhone());
		attributes.put("isLeave", getIsLeave());
		attributes.put("departmentId", getDepartmentId());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer sex = (Integer)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String idNumber = (String)attributes.get("idNumber");

		if (idNumber != null) {
			setIdNumber(idNumber);
		}

		String nation = (String)attributes.get("nation");

		if (nation != null) {
			setNation(nation);
		}

		String placeOfOrigin = (String)attributes.get("placeOfOrigin");

		if (placeOfOrigin != null) {
			setPlaceOfOrigin(placeOfOrigin);
		}

		String accountProperties = (String)attributes.get("accountProperties");

		if (accountProperties != null) {
			setAccountProperties(accountProperties);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}

		String maritalStatus = (String)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		String highestDegree = (String)attributes.get("highestDegree");

		if (highestDegree != null) {
			setHighestDegree(highestDegree);
		}

		String politicalBackground = (String)attributes.get(
				"politicalBackground");

		if (politicalBackground != null) {
			setPoliticalBackground(politicalBackground);
		}

		String fileLocation = (String)attributes.get("fileLocation");

		if (fileLocation != null) {
			setFileLocation(fileLocation);
		}

		Double basePay = (Double)attributes.get("basePay");

		if (basePay != null) {
			setBasePay(basePay);
		}

		Double performancePay = (Double)attributes.get("performancePay");

		if (performancePay != null) {
			setPerformancePay(performancePay);
		}

		String health = (String)attributes.get("health");

		if (health != null) {
			setHealth(health);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String domicile = (String)attributes.get("domicile");

		if (domicile != null) {
			setDomicile(domicile);
		}

		String residencePhone = (String)attributes.get("residencePhone");

		if (residencePhone != null) {
			setResidencePhone(residencePhone);
		}

		String currentResidentialAddress = (String)attributes.get(
				"currentResidentialAddress");

		if (currentResidentialAddress != null) {
			setCurrentResidentialAddress(currentResidentialAddress);
		}

		String currentResidentialAddressPhone = (String)attributes.get(
				"currentResidentialAddressPhone");

		if (currentResidentialAddressPhone != null) {
			setCurrentResidentialAddressPhone(currentResidentialAddressPhone);
		}

		String emergencyContact = (String)attributes.get("emergencyContact");

		if (emergencyContact != null) {
			setEmergencyContact(emergencyContact);
		}

		String emergencyContactRelation = (String)attributes.get(
				"emergencyContactRelation");

		if (emergencyContactRelation != null) {
			setEmergencyContactRelation(emergencyContactRelation);
		}

		String emergencyContactPhone = (String)attributes.get(
				"emergencyContactPhone");

		if (emergencyContactPhone != null) {
			setEmergencyContactPhone(emergencyContactPhone);
		}

		Integer isLeave = (Integer)attributes.get("isLeave");

		if (isLeave != null) {
			setIsLeave(isLeave);
		}

		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_basicInformationRemoteModel, id);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_basicInformationRemoteModel, userId);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_basicInformationRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSex() {
		return _sex;
	}

	@Override
	public void setSex(int sex) {
		_sex = sex;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setSex", int.class);

				method.invoke(_basicInformationRemoteModel, sex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdNumber() {
		return _idNumber;
	}

	@Override
	public void setIdNumber(String idNumber) {
		_idNumber = idNumber;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNumber", String.class);

				method.invoke(_basicInformationRemoteModel, idNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNation() {
		return _nation;
	}

	@Override
	public void setNation(String nation) {
		_nation = nation;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setNation", String.class);

				method.invoke(_basicInformationRemoteModel, nation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlaceOfOrigin() {
		return _placeOfOrigin;
	}

	@Override
	public void setPlaceOfOrigin(String placeOfOrigin) {
		_placeOfOrigin = placeOfOrigin;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setPlaceOfOrigin", String.class);

				method.invoke(_basicInformationRemoteModel, placeOfOrigin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccountProperties() {
		return _accountProperties;
	}

	@Override
	public void setAccountProperties(String accountProperties) {
		_accountProperties = accountProperties;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountProperties",
						String.class);

				method.invoke(_basicInformationRemoteModel, accountProperties);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthDate() {
		return _birthDate;
	}

	@Override
	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthDate", Date.class);

				method.invoke(_basicInformationRemoteModel, birthDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritalStatus() {
		return _maritalStatus;
	}

	@Override
	public void setMaritalStatus(String maritalStatus) {
		_maritalStatus = maritalStatus;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritalStatus", String.class);

				method.invoke(_basicInformationRemoteModel, maritalStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHighestDegree() {
		return _highestDegree;
	}

	@Override
	public void setHighestDegree(String highestDegree) {
		_highestDegree = highestDegree;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setHighestDegree", String.class);

				method.invoke(_basicInformationRemoteModel, highestDegree);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPoliticalBackground() {
		return _politicalBackground;
	}

	@Override
	public void setPoliticalBackground(String politicalBackground) {
		_politicalBackground = politicalBackground;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setPoliticalBackground",
						String.class);

				method.invoke(_basicInformationRemoteModel, politicalBackground);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFileLocation() {
		return _fileLocation;
	}

	@Override
	public void setFileLocation(String fileLocation) {
		_fileLocation = fileLocation;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setFileLocation", String.class);

				method.invoke(_basicInformationRemoteModel, fileLocation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBasePay() {
		return _basePay;
	}

	@Override
	public void setBasePay(double basePay) {
		_basePay = basePay;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setBasePay", double.class);

				method.invoke(_basicInformationRemoteModel, basePay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPerformancePay() {
		return _performancePay;
	}

	@Override
	public void setPerformancePay(double performancePay) {
		_performancePay = performancePay;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformancePay",
						double.class);

				method.invoke(_basicInformationRemoteModel, performancePay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHealth() {
		return _health;
	}

	@Override
	public void setHealth(String health) {
		_health = health;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setHealth", String.class);

				method.invoke(_basicInformationRemoteModel, health);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_basicInformationRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMail() {
		return _mail;
	}

	@Override
	public void setMail(String mail) {
		_mail = mail;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setMail", String.class);

				method.invoke(_basicInformationRemoteModel, mail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDomicile() {
		return _domicile;
	}

	@Override
	public void setDomicile(String domicile) {
		_domicile = domicile;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setDomicile", String.class);

				method.invoke(_basicInformationRemoteModel, domicile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResidencePhone() {
		return _residencePhone;
	}

	@Override
	public void setResidencePhone(String residencePhone) {
		_residencePhone = residencePhone;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setResidencePhone",
						String.class);

				method.invoke(_basicInformationRemoteModel, residencePhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrentResidentialAddress() {
		return _currentResidentialAddress;
	}

	@Override
	public void setCurrentResidentialAddress(String currentResidentialAddress) {
		_currentResidentialAddress = currentResidentialAddress;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentResidentialAddress",
						String.class);

				method.invoke(_basicInformationRemoteModel,
					currentResidentialAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrentResidentialAddressPhone() {
		return _currentResidentialAddressPhone;
	}

	@Override
	public void setCurrentResidentialAddressPhone(
		String currentResidentialAddressPhone) {
		_currentResidentialAddressPhone = currentResidentialAddressPhone;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentResidentialAddressPhone",
						String.class);

				method.invoke(_basicInformationRemoteModel,
					currentResidentialAddressPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergencyContact() {
		return _emergencyContact;
	}

	@Override
	public void setEmergencyContact(String emergencyContact) {
		_emergencyContact = emergencyContact;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergencyContact",
						String.class);

				method.invoke(_basicInformationRemoteModel, emergencyContact);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergencyContactRelation() {
		return _emergencyContactRelation;
	}

	@Override
	public void setEmergencyContactRelation(String emergencyContactRelation) {
		_emergencyContactRelation = emergencyContactRelation;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergencyContactRelation",
						String.class);

				method.invoke(_basicInformationRemoteModel,
					emergencyContactRelation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergencyContactPhone() {
		return _emergencyContactPhone;
	}

	@Override
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		_emergencyContactPhone = emergencyContactPhone;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergencyContactPhone",
						String.class);

				method.invoke(_basicInformationRemoteModel,
					emergencyContactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsLeave() {
		return _isLeave;
	}

	@Override
	public void setIsLeave(int isLeave) {
		_isLeave = isLeave;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLeave", int.class);

				method.invoke(_basicInformationRemoteModel, isLeave);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDepartmentId() {
		return _departmentId;
	}

	@Override
	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartmentId", long.class);

				method.invoke(_basicInformationRemoteModel, departmentId);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateUserId", long.class);

				method.invoke(_basicInformationRemoteModel, createUserId);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_basicInformationRemoteModel, createDate);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUserId", long.class);

				method.invoke(_basicInformationRemoteModel, modifiedUserId);
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

		if (_basicInformationRemoteModel != null) {
			try {
				Class<?> clazz = _basicInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_basicInformationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBasicInformationRemoteModel() {
		return _basicInformationRemoteModel;
	}

	public void setBasicInformationRemoteModel(
		BaseModel<?> basicInformationRemoteModel) {
		_basicInformationRemoteModel = basicInformationRemoteModel;
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

		Class<?> remoteModelClass = _basicInformationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_basicInformationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BasicInformationLocalServiceUtil.addBasicInformation(this);
		}
		else {
			BasicInformationLocalServiceUtil.updateBasicInformation(this);
		}
	}

	@Override
	public BasicInformation toEscapedModel() {
		return (BasicInformation)ProxyUtil.newProxyInstance(BasicInformation.class.getClassLoader(),
			new Class[] { BasicInformation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BasicInformationClp clone = new BasicInformationClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setName(getName());
		clone.setSex(getSex());
		clone.setIdNumber(getIdNumber());
		clone.setNation(getNation());
		clone.setPlaceOfOrigin(getPlaceOfOrigin());
		clone.setAccountProperties(getAccountProperties());
		clone.setBirthDate(getBirthDate());
		clone.setMaritalStatus(getMaritalStatus());
		clone.setHighestDegree(getHighestDegree());
		clone.setPoliticalBackground(getPoliticalBackground());
		clone.setFileLocation(getFileLocation());
		clone.setBasePay(getBasePay());
		clone.setPerformancePay(getPerformancePay());
		clone.setHealth(getHealth());
		clone.setContactPhone(getContactPhone());
		clone.setMail(getMail());
		clone.setDomicile(getDomicile());
		clone.setResidencePhone(getResidencePhone());
		clone.setCurrentResidentialAddress(getCurrentResidentialAddress());
		clone.setCurrentResidentialAddressPhone(getCurrentResidentialAddressPhone());
		clone.setEmergencyContact(getEmergencyContact());
		clone.setEmergencyContactRelation(getEmergencyContactRelation());
		clone.setEmergencyContactPhone(getEmergencyContactPhone());
		clone.setIsLeave(getIsLeave());
		clone.setDepartmentId(getDepartmentId());
		clone.setCreateUserId(getCreateUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedUserId(getModifiedUserId());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(BasicInformation basicInformation) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				basicInformation.getCreateDate());

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

		if (!(obj instanceof BasicInformationClp)) {
			return false;
		}

		BasicInformationClp basicInformation = (BasicInformationClp)obj;

		long primaryKey = basicInformation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(63);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", idNumber=");
		sb.append(getIdNumber());
		sb.append(", nation=");
		sb.append(getNation());
		sb.append(", placeOfOrigin=");
		sb.append(getPlaceOfOrigin());
		sb.append(", accountProperties=");
		sb.append(getAccountProperties());
		sb.append(", birthDate=");
		sb.append(getBirthDate());
		sb.append(", maritalStatus=");
		sb.append(getMaritalStatus());
		sb.append(", highestDegree=");
		sb.append(getHighestDegree());
		sb.append(", politicalBackground=");
		sb.append(getPoliticalBackground());
		sb.append(", fileLocation=");
		sb.append(getFileLocation());
		sb.append(", basePay=");
		sb.append(getBasePay());
		sb.append(", performancePay=");
		sb.append(getPerformancePay());
		sb.append(", health=");
		sb.append(getHealth());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", mail=");
		sb.append(getMail());
		sb.append(", domicile=");
		sb.append(getDomicile());
		sb.append(", residencePhone=");
		sb.append(getResidencePhone());
		sb.append(", currentResidentialAddress=");
		sb.append(getCurrentResidentialAddress());
		sb.append(", currentResidentialAddressPhone=");
		sb.append(getCurrentResidentialAddressPhone());
		sb.append(", emergencyContact=");
		sb.append(getEmergencyContact());
		sb.append(", emergencyContactRelation=");
		sb.append(getEmergencyContactRelation());
		sb.append(", emergencyContactPhone=");
		sb.append(getEmergencyContactPhone());
		sb.append(", isLeave=");
		sb.append(getIsLeave());
		sb.append(", departmentId=");
		sb.append(getDepartmentId());
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
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.BasicInformation");
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
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNumber</column-name><column-value><![CDATA[");
		sb.append(getIdNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nation</column-name><column-value><![CDATA[");
		sb.append(getNation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfOrigin</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfOrigin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountProperties</column-name><column-value><![CDATA[");
		sb.append(getAccountProperties());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDate</column-name><column-value><![CDATA[");
		sb.append(getBirthDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritalStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritalStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>highestDegree</column-name><column-value><![CDATA[");
		sb.append(getHighestDegree());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>politicalBackground</column-name><column-value><![CDATA[");
		sb.append(getPoliticalBackground());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileLocation</column-name><column-value><![CDATA[");
		sb.append(getFileLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basePay</column-name><column-value><![CDATA[");
		sb.append(getBasePay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performancePay</column-name><column-value><![CDATA[");
		sb.append(getPerformancePay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>health</column-name><column-value><![CDATA[");
		sb.append(getHealth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mail</column-name><column-value><![CDATA[");
		sb.append(getMail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domicile</column-name><column-value><![CDATA[");
		sb.append(getDomicile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>residencePhone</column-name><column-value><![CDATA[");
		sb.append(getResidencePhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentResidentialAddress</column-name><column-value><![CDATA[");
		sb.append(getCurrentResidentialAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentResidentialAddressPhone</column-name><column-value><![CDATA[");
		sb.append(getCurrentResidentialAddressPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergencyContact</column-name><column-value><![CDATA[");
		sb.append(getEmergencyContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergencyContactRelation</column-name><column-value><![CDATA[");
		sb.append(getEmergencyContactRelation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergencyContactPhone</column-name><column-value><![CDATA[");
		sb.append(getEmergencyContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isLeave</column-name><column-value><![CDATA[");
		sb.append(getIsLeave());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
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
	private String _name;
	private int _sex;
	private String _idNumber;
	private String _nation;
	private String _placeOfOrigin;
	private String _accountProperties;
	private Date _birthDate;
	private String _maritalStatus;
	private String _highestDegree;
	private String _politicalBackground;
	private String _fileLocation;
	private double _basePay;
	private double _performancePay;
	private String _health;
	private String _contactPhone;
	private String _mail;
	private String _domicile;
	private String _residencePhone;
	private String _currentResidentialAddress;
	private String _currentResidentialAddressPhone;
	private String _emergencyContact;
	private String _emergencyContactRelation;
	private String _emergencyContactPhone;
	private int _isLeave;
	private long _departmentId;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private BaseModel<?> _basicInformationRemoteModel;
}