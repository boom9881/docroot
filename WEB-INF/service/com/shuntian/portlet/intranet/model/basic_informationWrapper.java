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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link basic_information}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see basic_information
 * @generated
 */
public class basic_informationWrapper implements basic_information,
	ModelWrapper<basic_information> {
	public basic_informationWrapper(basic_information basic_information) {
		_basic_information = basic_information;
	}

	@Override
	public Class<?> getModelClass() {
		return basic_information.class;
	}

	@Override
	public String getModelClassName() {
		return basic_information.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("staffId", getStaffId());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("sex", getSex());
		attributes.put("id_number", getId_number());
		attributes.put("nation", getNation());
		attributes.put("place_of_origin", getPlace_of_origin());
		attributes.put("account_properties", getAccount_properties());
		attributes.put("birth", getBirth());
		attributes.put("marital_status", getMarital_status());
		attributes.put("highest_degree", getHighest_degree());
		attributes.put("political_background", getPolitical_background());
		attributes.put("file_location", getFile_location());
		attributes.put("base_pay", getBase_pay());
		attributes.put("performance_pay", getPerformance_pay());
		attributes.put("health", getHealth());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("mail", getMail());
		attributes.put("domicile", getDomicile());
		attributes.put("residence_phone", getResidence_phone());
		attributes.put("current_residential_address",
			getCurrent_residential_address());
		attributes.put("current_residential_address_phone",
			getCurrent_residential_address_phone());
		attributes.put("emergency_contact", getEmergency_contact());
		attributes.put("emergency_contact_relation",
			getEmergency_contact_relation());
		attributes.put("emergency_contact_phone", getEmergency_contact_phone());
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

		Long staffId = (Long)attributes.get("staffId");

		if (staffId != null) {
			setStaffId(staffId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String id_number = (String)attributes.get("id_number");

		if (id_number != null) {
			setId_number(id_number);
		}

		String nation = (String)attributes.get("nation");

		if (nation != null) {
			setNation(nation);
		}

		String place_of_origin = (String)attributes.get("place_of_origin");

		if (place_of_origin != null) {
			setPlace_of_origin(place_of_origin);
		}

		String account_properties = (String)attributes.get("account_properties");

		if (account_properties != null) {
			setAccount_properties(account_properties);
		}

		Date birth = (Date)attributes.get("birth");

		if (birth != null) {
			setBirth(birth);
		}

		String marital_status = (String)attributes.get("marital_status");

		if (marital_status != null) {
			setMarital_status(marital_status);
		}

		String highest_degree = (String)attributes.get("highest_degree");

		if (highest_degree != null) {
			setHighest_degree(highest_degree);
		}

		String political_background = (String)attributes.get(
				"political_background");

		if (political_background != null) {
			setPolitical_background(political_background);
		}

		String file_location = (String)attributes.get("file_location");

		if (file_location != null) {
			setFile_location(file_location);
		}

		Double base_pay = (Double)attributes.get("base_pay");

		if (base_pay != null) {
			setBase_pay(base_pay);
		}

		Double performance_pay = (Double)attributes.get("performance_pay");

		if (performance_pay != null) {
			setPerformance_pay(performance_pay);
		}

		String health = (String)attributes.get("health");

		if (health != null) {
			setHealth(health);
		}

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String domicile = (String)attributes.get("domicile");

		if (domicile != null) {
			setDomicile(domicile);
		}

		String residence_phone = (String)attributes.get("residence_phone");

		if (residence_phone != null) {
			setResidence_phone(residence_phone);
		}

		String current_residential_address = (String)attributes.get(
				"current_residential_address");

		if (current_residential_address != null) {
			setCurrent_residential_address(current_residential_address);
		}

		String current_residential_address_phone = (String)attributes.get(
				"current_residential_address_phone");

		if (current_residential_address_phone != null) {
			setCurrent_residential_address_phone(current_residential_address_phone);
		}

		String emergency_contact = (String)attributes.get("emergency_contact");

		if (emergency_contact != null) {
			setEmergency_contact(emergency_contact);
		}

		String emergency_contact_relation = (String)attributes.get(
				"emergency_contact_relation");

		if (emergency_contact_relation != null) {
			setEmergency_contact_relation(emergency_contact_relation);
		}

		String emergency_contact_phone = (String)attributes.get(
				"emergency_contact_phone");

		if (emergency_contact_phone != null) {
			setEmergency_contact_phone(emergency_contact_phone);
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

	/**
	* Returns the primary key of this basic_information.
	*
	* @return the primary key of this basic_information
	*/
	@Override
	public long getPrimaryKey() {
		return _basic_information.getPrimaryKey();
	}

	/**
	* Sets the primary key of this basic_information.
	*
	* @param primaryKey the primary key of this basic_information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_basic_information.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this basic_information.
	*
	* @return the uuid of this basic_information
	*/
	@Override
	public java.lang.String getUuid() {
		return _basic_information.getUuid();
	}

	/**
	* Sets the uuid of this basic_information.
	*
	* @param uuid the uuid of this basic_information
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_basic_information.setUuid(uuid);
	}

	/**
	* Returns the staff ID of this basic_information.
	*
	* @return the staff ID of this basic_information
	*/
	@Override
	public long getStaffId() {
		return _basic_information.getStaffId();
	}

	/**
	* Sets the staff ID of this basic_information.
	*
	* @param staffId the staff ID of this basic_information
	*/
	@Override
	public void setStaffId(long staffId) {
		_basic_information.setStaffId(staffId);
	}

	/**
	* Returns the user ID of this basic_information.
	*
	* @return the user ID of this basic_information
	*/
	@Override
	public long getUserId() {
		return _basic_information.getUserId();
	}

	/**
	* Sets the user ID of this basic_information.
	*
	* @param userId the user ID of this basic_information
	*/
	@Override
	public void setUserId(long userId) {
		_basic_information.setUserId(userId);
	}

	/**
	* Returns the user uuid of this basic_information.
	*
	* @return the user uuid of this basic_information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basic_information.getUserUuid();
	}

	/**
	* Sets the user uuid of this basic_information.
	*
	* @param userUuid the user uuid of this basic_information
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_basic_information.setUserUuid(userUuid);
	}

	/**
	* Returns the name of this basic_information.
	*
	* @return the name of this basic_information
	*/
	@Override
	public java.lang.String getName() {
		return _basic_information.getName();
	}

	/**
	* Sets the name of this basic_information.
	*
	* @param name the name of this basic_information
	*/
	@Override
	public void setName(java.lang.String name) {
		_basic_information.setName(name);
	}

	/**
	* Returns the sex of this basic_information.
	*
	* @return the sex of this basic_information
	*/
	@Override
	public java.lang.String getSex() {
		return _basic_information.getSex();
	}

	/**
	* Sets the sex of this basic_information.
	*
	* @param sex the sex of this basic_information
	*/
	@Override
	public void setSex(java.lang.String sex) {
		_basic_information.setSex(sex);
	}

	/**
	* Returns the id_number of this basic_information.
	*
	* @return the id_number of this basic_information
	*/
	@Override
	public java.lang.String getId_number() {
		return _basic_information.getId_number();
	}

	/**
	* Sets the id_number of this basic_information.
	*
	* @param id_number the id_number of this basic_information
	*/
	@Override
	public void setId_number(java.lang.String id_number) {
		_basic_information.setId_number(id_number);
	}

	/**
	* Returns the nation of this basic_information.
	*
	* @return the nation of this basic_information
	*/
	@Override
	public java.lang.String getNation() {
		return _basic_information.getNation();
	}

	/**
	* Sets the nation of this basic_information.
	*
	* @param nation the nation of this basic_information
	*/
	@Override
	public void setNation(java.lang.String nation) {
		_basic_information.setNation(nation);
	}

	/**
	* Returns the place_of_origin of this basic_information.
	*
	* @return the place_of_origin of this basic_information
	*/
	@Override
	public java.lang.String getPlace_of_origin() {
		return _basic_information.getPlace_of_origin();
	}

	/**
	* Sets the place_of_origin of this basic_information.
	*
	* @param place_of_origin the place_of_origin of this basic_information
	*/
	@Override
	public void setPlace_of_origin(java.lang.String place_of_origin) {
		_basic_information.setPlace_of_origin(place_of_origin);
	}

	/**
	* Returns the account_properties of this basic_information.
	*
	* @return the account_properties of this basic_information
	*/
	@Override
	public java.lang.String getAccount_properties() {
		return _basic_information.getAccount_properties();
	}

	/**
	* Sets the account_properties of this basic_information.
	*
	* @param account_properties the account_properties of this basic_information
	*/
	@Override
	public void setAccount_properties(java.lang.String account_properties) {
		_basic_information.setAccount_properties(account_properties);
	}

	/**
	* Returns the birth of this basic_information.
	*
	* @return the birth of this basic_information
	*/
	@Override
	public java.util.Date getBirth() {
		return _basic_information.getBirth();
	}

	/**
	* Sets the birth of this basic_information.
	*
	* @param birth the birth of this basic_information
	*/
	@Override
	public void setBirth(java.util.Date birth) {
		_basic_information.setBirth(birth);
	}

	/**
	* Returns the marital_status of this basic_information.
	*
	* @return the marital_status of this basic_information
	*/
	@Override
	public java.lang.String getMarital_status() {
		return _basic_information.getMarital_status();
	}

	/**
	* Sets the marital_status of this basic_information.
	*
	* @param marital_status the marital_status of this basic_information
	*/
	@Override
	public void setMarital_status(java.lang.String marital_status) {
		_basic_information.setMarital_status(marital_status);
	}

	/**
	* Returns the highest_degree of this basic_information.
	*
	* @return the highest_degree of this basic_information
	*/
	@Override
	public java.lang.String getHighest_degree() {
		return _basic_information.getHighest_degree();
	}

	/**
	* Sets the highest_degree of this basic_information.
	*
	* @param highest_degree the highest_degree of this basic_information
	*/
	@Override
	public void setHighest_degree(java.lang.String highest_degree) {
		_basic_information.setHighest_degree(highest_degree);
	}

	/**
	* Returns the political_background of this basic_information.
	*
	* @return the political_background of this basic_information
	*/
	@Override
	public java.lang.String getPolitical_background() {
		return _basic_information.getPolitical_background();
	}

	/**
	* Sets the political_background of this basic_information.
	*
	* @param political_background the political_background of this basic_information
	*/
	@Override
	public void setPolitical_background(java.lang.String political_background) {
		_basic_information.setPolitical_background(political_background);
	}

	/**
	* Returns the file_location of this basic_information.
	*
	* @return the file_location of this basic_information
	*/
	@Override
	public java.lang.String getFile_location() {
		return _basic_information.getFile_location();
	}

	/**
	* Sets the file_location of this basic_information.
	*
	* @param file_location the file_location of this basic_information
	*/
	@Override
	public void setFile_location(java.lang.String file_location) {
		_basic_information.setFile_location(file_location);
	}

	/**
	* Returns the base_pay of this basic_information.
	*
	* @return the base_pay of this basic_information
	*/
	@Override
	public double getBase_pay() {
		return _basic_information.getBase_pay();
	}

	/**
	* Sets the base_pay of this basic_information.
	*
	* @param base_pay the base_pay of this basic_information
	*/
	@Override
	public void setBase_pay(double base_pay) {
		_basic_information.setBase_pay(base_pay);
	}

	/**
	* Returns the performance_pay of this basic_information.
	*
	* @return the performance_pay of this basic_information
	*/
	@Override
	public double getPerformance_pay() {
		return _basic_information.getPerformance_pay();
	}

	/**
	* Sets the performance_pay of this basic_information.
	*
	* @param performance_pay the performance_pay of this basic_information
	*/
	@Override
	public void setPerformance_pay(double performance_pay) {
		_basic_information.setPerformance_pay(performance_pay);
	}

	/**
	* Returns the health of this basic_information.
	*
	* @return the health of this basic_information
	*/
	@Override
	public java.lang.String getHealth() {
		return _basic_information.getHealth();
	}

	/**
	* Sets the health of this basic_information.
	*
	* @param health the health of this basic_information
	*/
	@Override
	public void setHealth(java.lang.String health) {
		_basic_information.setHealth(health);
	}

	/**
	* Returns the contact_phone of this basic_information.
	*
	* @return the contact_phone of this basic_information
	*/
	@Override
	public java.lang.String getContact_phone() {
		return _basic_information.getContact_phone();
	}

	/**
	* Sets the contact_phone of this basic_information.
	*
	* @param contact_phone the contact_phone of this basic_information
	*/
	@Override
	public void setContact_phone(java.lang.String contact_phone) {
		_basic_information.setContact_phone(contact_phone);
	}

	/**
	* Returns the mail of this basic_information.
	*
	* @return the mail of this basic_information
	*/
	@Override
	public java.lang.String getMail() {
		return _basic_information.getMail();
	}

	/**
	* Sets the mail of this basic_information.
	*
	* @param mail the mail of this basic_information
	*/
	@Override
	public void setMail(java.lang.String mail) {
		_basic_information.setMail(mail);
	}

	/**
	* Returns the domicile of this basic_information.
	*
	* @return the domicile of this basic_information
	*/
	@Override
	public java.lang.String getDomicile() {
		return _basic_information.getDomicile();
	}

	/**
	* Sets the domicile of this basic_information.
	*
	* @param domicile the domicile of this basic_information
	*/
	@Override
	public void setDomicile(java.lang.String domicile) {
		_basic_information.setDomicile(domicile);
	}

	/**
	* Returns the residence_phone of this basic_information.
	*
	* @return the residence_phone of this basic_information
	*/
	@Override
	public java.lang.String getResidence_phone() {
		return _basic_information.getResidence_phone();
	}

	/**
	* Sets the residence_phone of this basic_information.
	*
	* @param residence_phone the residence_phone of this basic_information
	*/
	@Override
	public void setResidence_phone(java.lang.String residence_phone) {
		_basic_information.setResidence_phone(residence_phone);
	}

	/**
	* Returns the current_residential_address of this basic_information.
	*
	* @return the current_residential_address of this basic_information
	*/
	@Override
	public java.lang.String getCurrent_residential_address() {
		return _basic_information.getCurrent_residential_address();
	}

	/**
	* Sets the current_residential_address of this basic_information.
	*
	* @param current_residential_address the current_residential_address of this basic_information
	*/
	@Override
	public void setCurrent_residential_address(
		java.lang.String current_residential_address) {
		_basic_information.setCurrent_residential_address(current_residential_address);
	}

	/**
	* Returns the current_residential_address_phone of this basic_information.
	*
	* @return the current_residential_address_phone of this basic_information
	*/
	@Override
	public java.lang.String getCurrent_residential_address_phone() {
		return _basic_information.getCurrent_residential_address_phone();
	}

	/**
	* Sets the current_residential_address_phone of this basic_information.
	*
	* @param current_residential_address_phone the current_residential_address_phone of this basic_information
	*/
	@Override
	public void setCurrent_residential_address_phone(
		java.lang.String current_residential_address_phone) {
		_basic_information.setCurrent_residential_address_phone(current_residential_address_phone);
	}

	/**
	* Returns the emergency_contact of this basic_information.
	*
	* @return the emergency_contact of this basic_information
	*/
	@Override
	public java.lang.String getEmergency_contact() {
		return _basic_information.getEmergency_contact();
	}

	/**
	* Sets the emergency_contact of this basic_information.
	*
	* @param emergency_contact the emergency_contact of this basic_information
	*/
	@Override
	public void setEmergency_contact(java.lang.String emergency_contact) {
		_basic_information.setEmergency_contact(emergency_contact);
	}

	/**
	* Returns the emergency_contact_relation of this basic_information.
	*
	* @return the emergency_contact_relation of this basic_information
	*/
	@Override
	public java.lang.String getEmergency_contact_relation() {
		return _basic_information.getEmergency_contact_relation();
	}

	/**
	* Sets the emergency_contact_relation of this basic_information.
	*
	* @param emergency_contact_relation the emergency_contact_relation of this basic_information
	*/
	@Override
	public void setEmergency_contact_relation(
		java.lang.String emergency_contact_relation) {
		_basic_information.setEmergency_contact_relation(emergency_contact_relation);
	}

	/**
	* Returns the emergency_contact_phone of this basic_information.
	*
	* @return the emergency_contact_phone of this basic_information
	*/
	@Override
	public java.lang.String getEmergency_contact_phone() {
		return _basic_information.getEmergency_contact_phone();
	}

	/**
	* Sets the emergency_contact_phone of this basic_information.
	*
	* @param emergency_contact_phone the emergency_contact_phone of this basic_information
	*/
	@Override
	public void setEmergency_contact_phone(
		java.lang.String emergency_contact_phone) {
		_basic_information.setEmergency_contact_phone(emergency_contact_phone);
	}

	/**
	* Returns the company ID of this basic_information.
	*
	* @return the company ID of this basic_information
	*/
	@Override
	public long getCompanyId() {
		return _basic_information.getCompanyId();
	}

	/**
	* Sets the company ID of this basic_information.
	*
	* @param companyId the company ID of this basic_information
	*/
	@Override
	public void setCompanyId(long companyId) {
		_basic_information.setCompanyId(companyId);
	}

	/**
	* Returns the createuser of this basic_information.
	*
	* @return the createuser of this basic_information
	*/
	@Override
	public long getCreateuser() {
		return _basic_information.getCreateuser();
	}

	/**
	* Sets the createuser of this basic_information.
	*
	* @param createuser the createuser of this basic_information
	*/
	@Override
	public void setCreateuser(long createuser) {
		_basic_information.setCreateuser(createuser);
	}

	/**
	* Returns the create date of this basic_information.
	*
	* @return the create date of this basic_information
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _basic_information.getCreateDate();
	}

	/**
	* Sets the create date of this basic_information.
	*
	* @param createDate the create date of this basic_information
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_basic_information.setCreateDate(createDate);
	}

	/**
	* Returns the modifieduser of this basic_information.
	*
	* @return the modifieduser of this basic_information
	*/
	@Override
	public long getModifieduser() {
		return _basic_information.getModifieduser();
	}

	/**
	* Sets the modifieduser of this basic_information.
	*
	* @param modifieduser the modifieduser of this basic_information
	*/
	@Override
	public void setModifieduser(long modifieduser) {
		_basic_information.setModifieduser(modifieduser);
	}

	/**
	* Returns the modified date of this basic_information.
	*
	* @return the modified date of this basic_information
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _basic_information.getModifiedDate();
	}

	/**
	* Sets the modified date of this basic_information.
	*
	* @param modifiedDate the modified date of this basic_information
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_basic_information.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this basic_information.
	*
	* @return the status of this basic_information
	*/
	@Override
	public int getStatus() {
		return _basic_information.getStatus();
	}

	/**
	* Returns the trash entry created when this basic_information was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this basic_information.
	*
	* @return the trash entry created when this basic_information was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basic_information.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this basic_information.
	*
	* @return the class primary key of the trash entry for this basic_information
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _basic_information.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this basic_information.
	*
	* @return the trash handler for this basic_information
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _basic_information.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this basic_information is in the Recycle Bin.
	*
	* @return <code>true</code> if this basic_information is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _basic_information.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this basic_information is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this basic_information is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _basic_information.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _basic_information.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_basic_information.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _basic_information.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_basic_information.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _basic_information.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _basic_information.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_basic_information.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _basic_information.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_basic_information.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_basic_information.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_basic_information.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new basic_informationWrapper((basic_information)_basic_information.clone());
	}

	@Override
	public int compareTo(basic_information basic_information) {
		return _basic_information.compareTo(basic_information);
	}

	@Override
	public int hashCode() {
		return _basic_information.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<basic_information> toCacheModel() {
		return _basic_information.toCacheModel();
	}

	@Override
	public basic_information toEscapedModel() {
		return new basic_informationWrapper(_basic_information.toEscapedModel());
	}

	@Override
	public basic_information toUnescapedModel() {
		return new basic_informationWrapper(_basic_information.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _basic_information.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _basic_information.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_basic_information.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof basic_informationWrapper)) {
			return false;
		}

		basic_informationWrapper basic_informationWrapper = (basic_informationWrapper)obj;

		if (Validator.equals(_basic_information,
					basic_informationWrapper._basic_information)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _basic_information.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public basic_information getWrappedbasic_information() {
		return _basic_information;
	}

	@Override
	public basic_information getWrappedModel() {
		return _basic_information;
	}

	@Override
	public void resetOriginalValues() {
		_basic_information.resetOriginalValues();
	}

	private basic_information _basic_information;
}