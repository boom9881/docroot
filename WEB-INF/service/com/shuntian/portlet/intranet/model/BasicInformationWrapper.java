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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BasicInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformation
 * @generated
 */
public class BasicInformationWrapper implements BasicInformation,
	ModelWrapper<BasicInformation> {
	public BasicInformationWrapper(BasicInformation basicInformation) {
		_basicInformation = basicInformation;
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

	/**
	* Returns the primary key of this basic information.
	*
	* @return the primary key of this basic information
	*/
	@Override
	public long getPrimaryKey() {
		return _basicInformation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this basic information.
	*
	* @param primaryKey the primary key of this basic information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_basicInformation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this basic information.
	*
	* @return the ID of this basic information
	*/
	@Override
	public long getId() {
		return _basicInformation.getId();
	}

	/**
	* Sets the ID of this basic information.
	*
	* @param id the ID of this basic information
	*/
	@Override
	public void setId(long id) {
		_basicInformation.setId(id);
	}

	/**
	* Returns the user ID of this basic information.
	*
	* @return the user ID of this basic information
	*/
	@Override
	public long getUserId() {
		return _basicInformation.getUserId();
	}

	/**
	* Sets the user ID of this basic information.
	*
	* @param userId the user ID of this basic information
	*/
	@Override
	public void setUserId(long userId) {
		_basicInformation.setUserId(userId);
	}

	/**
	* Returns the user uuid of this basic information.
	*
	* @return the user uuid of this basic information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformation.getUserUuid();
	}

	/**
	* Sets the user uuid of this basic information.
	*
	* @param userUuid the user uuid of this basic information
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_basicInformation.setUserUuid(userUuid);
	}

	/**
	* Returns the name of this basic information.
	*
	* @return the name of this basic information
	*/
	@Override
	public java.lang.String getName() {
		return _basicInformation.getName();
	}

	/**
	* Sets the name of this basic information.
	*
	* @param name the name of this basic information
	*/
	@Override
	public void setName(java.lang.String name) {
		_basicInformation.setName(name);
	}

	/**
	* Returns the sex of this basic information.
	*
	* @return the sex of this basic information
	*/
	@Override
	public int getSex() {
		return _basicInformation.getSex();
	}

	/**
	* Sets the sex of this basic information.
	*
	* @param sex the sex of this basic information
	*/
	@Override
	public void setSex(int sex) {
		_basicInformation.setSex(sex);
	}

	/**
	* Returns the id number of this basic information.
	*
	* @return the id number of this basic information
	*/
	@Override
	public java.lang.String getIdNumber() {
		return _basicInformation.getIdNumber();
	}

	/**
	* Sets the id number of this basic information.
	*
	* @param idNumber the id number of this basic information
	*/
	@Override
	public void setIdNumber(java.lang.String idNumber) {
		_basicInformation.setIdNumber(idNumber);
	}

	/**
	* Returns the nation of this basic information.
	*
	* @return the nation of this basic information
	*/
	@Override
	public java.lang.String getNation() {
		return _basicInformation.getNation();
	}

	/**
	* Sets the nation of this basic information.
	*
	* @param nation the nation of this basic information
	*/
	@Override
	public void setNation(java.lang.String nation) {
		_basicInformation.setNation(nation);
	}

	/**
	* Returns the place of origin of this basic information.
	*
	* @return the place of origin of this basic information
	*/
	@Override
	public java.lang.String getPlaceOfOrigin() {
		return _basicInformation.getPlaceOfOrigin();
	}

	/**
	* Sets the place of origin of this basic information.
	*
	* @param placeOfOrigin the place of origin of this basic information
	*/
	@Override
	public void setPlaceOfOrigin(java.lang.String placeOfOrigin) {
		_basicInformation.setPlaceOfOrigin(placeOfOrigin);
	}

	/**
	* Returns the account properties of this basic information.
	*
	* @return the account properties of this basic information
	*/
	@Override
	public java.lang.String getAccountProperties() {
		return _basicInformation.getAccountProperties();
	}

	/**
	* Sets the account properties of this basic information.
	*
	* @param accountProperties the account properties of this basic information
	*/
	@Override
	public void setAccountProperties(java.lang.String accountProperties) {
		_basicInformation.setAccountProperties(accountProperties);
	}

	/**
	* Returns the birth date of this basic information.
	*
	* @return the birth date of this basic information
	*/
	@Override
	public java.util.Date getBirthDate() {
		return _basicInformation.getBirthDate();
	}

	/**
	* Sets the birth date of this basic information.
	*
	* @param birthDate the birth date of this basic information
	*/
	@Override
	public void setBirthDate(java.util.Date birthDate) {
		_basicInformation.setBirthDate(birthDate);
	}

	/**
	* Returns the marital status of this basic information.
	*
	* @return the marital status of this basic information
	*/
	@Override
	public java.lang.String getMaritalStatus() {
		return _basicInformation.getMaritalStatus();
	}

	/**
	* Sets the marital status of this basic information.
	*
	* @param maritalStatus the marital status of this basic information
	*/
	@Override
	public void setMaritalStatus(java.lang.String maritalStatus) {
		_basicInformation.setMaritalStatus(maritalStatus);
	}

	/**
	* Returns the highest degree of this basic information.
	*
	* @return the highest degree of this basic information
	*/
	@Override
	public java.lang.String getHighestDegree() {
		return _basicInformation.getHighestDegree();
	}

	/**
	* Sets the highest degree of this basic information.
	*
	* @param highestDegree the highest degree of this basic information
	*/
	@Override
	public void setHighestDegree(java.lang.String highestDegree) {
		_basicInformation.setHighestDegree(highestDegree);
	}

	/**
	* Returns the political background of this basic information.
	*
	* @return the political background of this basic information
	*/
	@Override
	public java.lang.String getPoliticalBackground() {
		return _basicInformation.getPoliticalBackground();
	}

	/**
	* Sets the political background of this basic information.
	*
	* @param politicalBackground the political background of this basic information
	*/
	@Override
	public void setPoliticalBackground(java.lang.String politicalBackground) {
		_basicInformation.setPoliticalBackground(politicalBackground);
	}

	/**
	* Returns the file location of this basic information.
	*
	* @return the file location of this basic information
	*/
	@Override
	public java.lang.String getFileLocation() {
		return _basicInformation.getFileLocation();
	}

	/**
	* Sets the file location of this basic information.
	*
	* @param fileLocation the file location of this basic information
	*/
	@Override
	public void setFileLocation(java.lang.String fileLocation) {
		_basicInformation.setFileLocation(fileLocation);
	}

	/**
	* Returns the base pay of this basic information.
	*
	* @return the base pay of this basic information
	*/
	@Override
	public double getBasePay() {
		return _basicInformation.getBasePay();
	}

	/**
	* Sets the base pay of this basic information.
	*
	* @param basePay the base pay of this basic information
	*/
	@Override
	public void setBasePay(double basePay) {
		_basicInformation.setBasePay(basePay);
	}

	/**
	* Returns the performance pay of this basic information.
	*
	* @return the performance pay of this basic information
	*/
	@Override
	public double getPerformancePay() {
		return _basicInformation.getPerformancePay();
	}

	/**
	* Sets the performance pay of this basic information.
	*
	* @param performancePay the performance pay of this basic information
	*/
	@Override
	public void setPerformancePay(double performancePay) {
		_basicInformation.setPerformancePay(performancePay);
	}

	/**
	* Returns the health of this basic information.
	*
	* @return the health of this basic information
	*/
	@Override
	public java.lang.String getHealth() {
		return _basicInformation.getHealth();
	}

	/**
	* Sets the health of this basic information.
	*
	* @param health the health of this basic information
	*/
	@Override
	public void setHealth(java.lang.String health) {
		_basicInformation.setHealth(health);
	}

	/**
	* Returns the contact phone of this basic information.
	*
	* @return the contact phone of this basic information
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _basicInformation.getContactPhone();
	}

	/**
	* Sets the contact phone of this basic information.
	*
	* @param contactPhone the contact phone of this basic information
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_basicInformation.setContactPhone(contactPhone);
	}

	/**
	* Returns the mail of this basic information.
	*
	* @return the mail of this basic information
	*/
	@Override
	public java.lang.String getMail() {
		return _basicInformation.getMail();
	}

	/**
	* Sets the mail of this basic information.
	*
	* @param mail the mail of this basic information
	*/
	@Override
	public void setMail(java.lang.String mail) {
		_basicInformation.setMail(mail);
	}

	/**
	* Returns the domicile of this basic information.
	*
	* @return the domicile of this basic information
	*/
	@Override
	public java.lang.String getDomicile() {
		return _basicInformation.getDomicile();
	}

	/**
	* Sets the domicile of this basic information.
	*
	* @param domicile the domicile of this basic information
	*/
	@Override
	public void setDomicile(java.lang.String domicile) {
		_basicInformation.setDomicile(domicile);
	}

	/**
	* Returns the residence phone of this basic information.
	*
	* @return the residence phone of this basic information
	*/
	@Override
	public java.lang.String getResidencePhone() {
		return _basicInformation.getResidencePhone();
	}

	/**
	* Sets the residence phone of this basic information.
	*
	* @param residencePhone the residence phone of this basic information
	*/
	@Override
	public void setResidencePhone(java.lang.String residencePhone) {
		_basicInformation.setResidencePhone(residencePhone);
	}

	/**
	* Returns the current residential address of this basic information.
	*
	* @return the current residential address of this basic information
	*/
	@Override
	public java.lang.String getCurrentResidentialAddress() {
		return _basicInformation.getCurrentResidentialAddress();
	}

	/**
	* Sets the current residential address of this basic information.
	*
	* @param currentResidentialAddress the current residential address of this basic information
	*/
	@Override
	public void setCurrentResidentialAddress(
		java.lang.String currentResidentialAddress) {
		_basicInformation.setCurrentResidentialAddress(currentResidentialAddress);
	}

	/**
	* Returns the current residential address phone of this basic information.
	*
	* @return the current residential address phone of this basic information
	*/
	@Override
	public java.lang.String getCurrentResidentialAddressPhone() {
		return _basicInformation.getCurrentResidentialAddressPhone();
	}

	/**
	* Sets the current residential address phone of this basic information.
	*
	* @param currentResidentialAddressPhone the current residential address phone of this basic information
	*/
	@Override
	public void setCurrentResidentialAddressPhone(
		java.lang.String currentResidentialAddressPhone) {
		_basicInformation.setCurrentResidentialAddressPhone(currentResidentialAddressPhone);
	}

	/**
	* Returns the emergency contact of this basic information.
	*
	* @return the emergency contact of this basic information
	*/
	@Override
	public java.lang.String getEmergencyContact() {
		return _basicInformation.getEmergencyContact();
	}

	/**
	* Sets the emergency contact of this basic information.
	*
	* @param emergencyContact the emergency contact of this basic information
	*/
	@Override
	public void setEmergencyContact(java.lang.String emergencyContact) {
		_basicInformation.setEmergencyContact(emergencyContact);
	}

	/**
	* Returns the emergency contact relation of this basic information.
	*
	* @return the emergency contact relation of this basic information
	*/
	@Override
	public java.lang.String getEmergencyContactRelation() {
		return _basicInformation.getEmergencyContactRelation();
	}

	/**
	* Sets the emergency contact relation of this basic information.
	*
	* @param emergencyContactRelation the emergency contact relation of this basic information
	*/
	@Override
	public void setEmergencyContactRelation(
		java.lang.String emergencyContactRelation) {
		_basicInformation.setEmergencyContactRelation(emergencyContactRelation);
	}

	/**
	* Returns the emergency contact phone of this basic information.
	*
	* @return the emergency contact phone of this basic information
	*/
	@Override
	public java.lang.String getEmergencyContactPhone() {
		return _basicInformation.getEmergencyContactPhone();
	}

	/**
	* Sets the emergency contact phone of this basic information.
	*
	* @param emergencyContactPhone the emergency contact phone of this basic information
	*/
	@Override
	public void setEmergencyContactPhone(java.lang.String emergencyContactPhone) {
		_basicInformation.setEmergencyContactPhone(emergencyContactPhone);
	}

	/**
	* Returns the is leave of this basic information.
	*
	* @return the is leave of this basic information
	*/
	@Override
	public int getIsLeave() {
		return _basicInformation.getIsLeave();
	}

	/**
	* Sets the is leave of this basic information.
	*
	* @param isLeave the is leave of this basic information
	*/
	@Override
	public void setIsLeave(int isLeave) {
		_basicInformation.setIsLeave(isLeave);
	}

	/**
	* Returns the department ID of this basic information.
	*
	* @return the department ID of this basic information
	*/
	@Override
	public long getDepartmentId() {
		return _basicInformation.getDepartmentId();
	}

	/**
	* Sets the department ID of this basic information.
	*
	* @param departmentId the department ID of this basic information
	*/
	@Override
	public void setDepartmentId(long departmentId) {
		_basicInformation.setDepartmentId(departmentId);
	}

	/**
	* Returns the create user ID of this basic information.
	*
	* @return the create user ID of this basic information
	*/
	@Override
	public long getCreateUserId() {
		return _basicInformation.getCreateUserId();
	}

	/**
	* Sets the create user ID of this basic information.
	*
	* @param createUserId the create user ID of this basic information
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_basicInformation.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this basic information.
	*
	* @return the create user uuid of this basic information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformation.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this basic information.
	*
	* @param createUserUuid the create user uuid of this basic information
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_basicInformation.setCreateUserUuid(createUserUuid);
	}

	/**
	* Returns the create date of this basic information.
	*
	* @return the create date of this basic information
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _basicInformation.getCreateDate();
	}

	/**
	* Sets the create date of this basic information.
	*
	* @param createDate the create date of this basic information
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_basicInformation.setCreateDate(createDate);
	}

	/**
	* Returns the modified user ID of this basic information.
	*
	* @return the modified user ID of this basic information
	*/
	@Override
	public long getModifiedUserId() {
		return _basicInformation.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this basic information.
	*
	* @param modifiedUserId the modified user ID of this basic information
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_basicInformation.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this basic information.
	*
	* @return the modified user uuid of this basic information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basicInformation.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this basic information.
	*
	* @param modifiedUserUuid the modified user uuid of this basic information
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_basicInformation.setModifiedUserUuid(modifiedUserUuid);
	}

	/**
	* Returns the modified date of this basic information.
	*
	* @return the modified date of this basic information
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _basicInformation.getModifiedDate();
	}

	/**
	* Sets the modified date of this basic information.
	*
	* @param modifiedDate the modified date of this basic information
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_basicInformation.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _basicInformation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_basicInformation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _basicInformation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_basicInformation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _basicInformation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _basicInformation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_basicInformation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _basicInformation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_basicInformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_basicInformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_basicInformation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BasicInformationWrapper((BasicInformation)_basicInformation.clone());
	}

	@Override
	public int compareTo(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation) {
		return _basicInformation.compareTo(basicInformation);
	}

	@Override
	public int hashCode() {
		return _basicInformation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.BasicInformation> toCacheModel() {
		return _basicInformation.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation toEscapedModel() {
		return new BasicInformationWrapper(_basicInformation.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.BasicInformation toUnescapedModel() {
		return new BasicInformationWrapper(_basicInformation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _basicInformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _basicInformation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_basicInformation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BasicInformationWrapper)) {
			return false;
		}

		BasicInformationWrapper basicInformationWrapper = (BasicInformationWrapper)obj;

		if (Validator.equals(_basicInformation,
					basicInformationWrapper._basicInformation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BasicInformation getWrappedBasicInformation() {
		return _basicInformation;
	}

	@Override
	public BasicInformation getWrappedModel() {
		return _basicInformation;
	}

	@Override
	public void resetOriginalValues() {
		_basicInformation.resetOriginalValues();
	}

	private BasicInformation _basicInformation;
}