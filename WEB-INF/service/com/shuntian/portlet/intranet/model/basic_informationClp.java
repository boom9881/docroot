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
import com.shuntian.portlet.intranet.service.basic_informationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class basic_informationClp extends BaseModelImpl<basic_information>
	implements basic_information {
	public basic_informationClp() {
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
	public long getPrimaryKey() {
		return _staffId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStaffId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _staffId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_basic_informationRemoteModel, uuid);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setStaffId", long.class);

				method.invoke(_basic_informationRemoteModel, staffId);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_basic_informationRemoteModel, userId);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_basic_informationRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSex() {
		return _sex;
	}

	@Override
	public void setSex(String sex) {
		_sex = sex;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setSex", String.class);

				method.invoke(_basic_informationRemoteModel, sex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getId_number() {
		return _id_number;
	}

	@Override
	public void setId_number(String id_number) {
		_id_number = id_number;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setId_number", String.class);

				method.invoke(_basic_informationRemoteModel, id_number);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setNation", String.class);

				method.invoke(_basic_informationRemoteModel, nation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlace_of_origin() {
		return _place_of_origin;
	}

	@Override
	public void setPlace_of_origin(String place_of_origin) {
		_place_of_origin = place_of_origin;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setPlace_of_origin",
						String.class);

				method.invoke(_basic_informationRemoteModel, place_of_origin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccount_properties() {
		return _account_properties;
	}

	@Override
	public void setAccount_properties(String account_properties) {
		_account_properties = account_properties;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setAccount_properties",
						String.class);

				method.invoke(_basic_informationRemoteModel, account_properties);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirth() {
		return _birth;
	}

	@Override
	public void setBirth(Date birth) {
		_birth = birth;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setBirth", Date.class);

				method.invoke(_basic_informationRemoteModel, birth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarital_status() {
		return _marital_status;
	}

	@Override
	public void setMarital_status(String marital_status) {
		_marital_status = marital_status;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setMarital_status",
						String.class);

				method.invoke(_basic_informationRemoteModel, marital_status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHighest_degree() {
		return _highest_degree;
	}

	@Override
	public void setHighest_degree(String highest_degree) {
		_highest_degree = highest_degree;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setHighest_degree",
						String.class);

				method.invoke(_basic_informationRemoteModel, highest_degree);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPolitical_background() {
		return _political_background;
	}

	@Override
	public void setPolitical_background(String political_background) {
		_political_background = political_background;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setPolitical_background",
						String.class);

				method.invoke(_basic_informationRemoteModel,
					political_background);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFile_location() {
		return _file_location;
	}

	@Override
	public void setFile_location(String file_location) {
		_file_location = file_location;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setFile_location", String.class);

				method.invoke(_basic_informationRemoteModel, file_location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBase_pay() {
		return _base_pay;
	}

	@Override
	public void setBase_pay(double base_pay) {
		_base_pay = base_pay;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setBase_pay", double.class);

				method.invoke(_basic_informationRemoteModel, base_pay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPerformance_pay() {
		return _performance_pay;
	}

	@Override
	public void setPerformance_pay(double performance_pay) {
		_performance_pay = performance_pay;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformance_pay",
						double.class);

				method.invoke(_basic_informationRemoteModel, performance_pay);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setHealth", String.class);

				method.invoke(_basic_informationRemoteModel, health);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setContact_phone", String.class);

				method.invoke(_basic_informationRemoteModel, contact_phone);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setMail", String.class);

				method.invoke(_basic_informationRemoteModel, mail);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setDomicile", String.class);

				method.invoke(_basic_informationRemoteModel, domicile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResidence_phone() {
		return _residence_phone;
	}

	@Override
	public void setResidence_phone(String residence_phone) {
		_residence_phone = residence_phone;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setResidence_phone",
						String.class);

				method.invoke(_basic_informationRemoteModel, residence_phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrent_residential_address() {
		return _current_residential_address;
	}

	@Override
	public void setCurrent_residential_address(
		String current_residential_address) {
		_current_residential_address = current_residential_address;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_residential_address",
						String.class);

				method.invoke(_basic_informationRemoteModel,
					current_residential_address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrent_residential_address_phone() {
		return _current_residential_address_phone;
	}

	@Override
	public void setCurrent_residential_address_phone(
		String current_residential_address_phone) {
		_current_residential_address_phone = current_residential_address_phone;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_residential_address_phone",
						String.class);

				method.invoke(_basic_informationRemoteModel,
					current_residential_address_phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergency_contact() {
		return _emergency_contact;
	}

	@Override
	public void setEmergency_contact(String emergency_contact) {
		_emergency_contact = emergency_contact;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergency_contact",
						String.class);

				method.invoke(_basic_informationRemoteModel, emergency_contact);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergency_contact_relation() {
		return _emergency_contact_relation;
	}

	@Override
	public void setEmergency_contact_relation(String emergency_contact_relation) {
		_emergency_contact_relation = emergency_contact_relation;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergency_contact_relation",
						String.class);

				method.invoke(_basic_informationRemoteModel,
					emergency_contact_relation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmergency_contact_phone() {
		return _emergency_contact_phone;
	}

	@Override
	public void setEmergency_contact_phone(String emergency_contact_phone) {
		_emergency_contact_phone = emergency_contact_phone;

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setEmergency_contact_phone",
						String.class);

				method.invoke(_basic_informationRemoteModel,
					emergency_contact_phone);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_basic_informationRemoteModel, companyId);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateuser", long.class);

				method.invoke(_basic_informationRemoteModel, createuser);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_basic_informationRemoteModel, createDate);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieduser", long.class);

				method.invoke(_basic_informationRemoteModel, modifieduser);
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

		if (_basic_informationRemoteModel != null) {
			try {
				Class<?> clazz = _basic_informationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_basic_informationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				basic_information.class.getName()));
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

	public BaseModel<?> getbasic_informationRemoteModel() {
		return _basic_informationRemoteModel;
	}

	public void setbasic_informationRemoteModel(
		BaseModel<?> basic_informationRemoteModel) {
		_basic_informationRemoteModel = basic_informationRemoteModel;
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

		Class<?> remoteModelClass = _basic_informationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_basic_informationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			basic_informationLocalServiceUtil.addbasic_information(this);
		}
		else {
			basic_informationLocalServiceUtil.updatebasic_information(this);
		}
	}

	@Override
	public basic_information toEscapedModel() {
		return (basic_information)ProxyUtil.newProxyInstance(basic_information.class.getClassLoader(),
			new Class[] { basic_information.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		basic_informationClp clone = new basic_informationClp();

		clone.setUuid(getUuid());
		clone.setStaffId(getStaffId());
		clone.setUserId(getUserId());
		clone.setName(getName());
		clone.setSex(getSex());
		clone.setId_number(getId_number());
		clone.setNation(getNation());
		clone.setPlace_of_origin(getPlace_of_origin());
		clone.setAccount_properties(getAccount_properties());
		clone.setBirth(getBirth());
		clone.setMarital_status(getMarital_status());
		clone.setHighest_degree(getHighest_degree());
		clone.setPolitical_background(getPolitical_background());
		clone.setFile_location(getFile_location());
		clone.setBase_pay(getBase_pay());
		clone.setPerformance_pay(getPerformance_pay());
		clone.setHealth(getHealth());
		clone.setContact_phone(getContact_phone());
		clone.setMail(getMail());
		clone.setDomicile(getDomicile());
		clone.setResidence_phone(getResidence_phone());
		clone.setCurrent_residential_address(getCurrent_residential_address());
		clone.setCurrent_residential_address_phone(getCurrent_residential_address_phone());
		clone.setEmergency_contact(getEmergency_contact());
		clone.setEmergency_contact_relation(getEmergency_contact_relation());
		clone.setEmergency_contact_phone(getEmergency_contact_phone());
		clone.setCompanyId(getCompanyId());
		clone.setCreateuser(getCreateuser());
		clone.setCreateDate(getCreateDate());
		clone.setModifieduser(getModifieduser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(basic_information basic_information) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				basic_information.getCreateDate());

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

		if (!(obj instanceof basic_informationClp)) {
			return false;
		}

		basic_informationClp basic_information = (basic_informationClp)obj;

		long primaryKey = basic_information.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", staffId=");
		sb.append(getStaffId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", id_number=");
		sb.append(getId_number());
		sb.append(", nation=");
		sb.append(getNation());
		sb.append(", place_of_origin=");
		sb.append(getPlace_of_origin());
		sb.append(", account_properties=");
		sb.append(getAccount_properties());
		sb.append(", birth=");
		sb.append(getBirth());
		sb.append(", marital_status=");
		sb.append(getMarital_status());
		sb.append(", highest_degree=");
		sb.append(getHighest_degree());
		sb.append(", political_background=");
		sb.append(getPolitical_background());
		sb.append(", file_location=");
		sb.append(getFile_location());
		sb.append(", base_pay=");
		sb.append(getBase_pay());
		sb.append(", performance_pay=");
		sb.append(getPerformance_pay());
		sb.append(", health=");
		sb.append(getHealth());
		sb.append(", contact_phone=");
		sb.append(getContact_phone());
		sb.append(", mail=");
		sb.append(getMail());
		sb.append(", domicile=");
		sb.append(getDomicile());
		sb.append(", residence_phone=");
		sb.append(getResidence_phone());
		sb.append(", current_residential_address=");
		sb.append(getCurrent_residential_address());
		sb.append(", current_residential_address_phone=");
		sb.append(getCurrent_residential_address_phone());
		sb.append(", emergency_contact=");
		sb.append(getEmergency_contact());
		sb.append(", emergency_contact_relation=");
		sb.append(getEmergency_contact_relation());
		sb.append(", emergency_contact_phone=");
		sb.append(getEmergency_contact_phone());
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
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.basic_information");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staffId</column-name><column-value><![CDATA[");
		sb.append(getStaffId());
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
			"<column><column-name>id_number</column-name><column-value><![CDATA[");
		sb.append(getId_number());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nation</column-name><column-value><![CDATA[");
		sb.append(getNation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>place_of_origin</column-name><column-value><![CDATA[");
		sb.append(getPlace_of_origin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>account_properties</column-name><column-value><![CDATA[");
		sb.append(getAccount_properties());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birth</column-name><column-value><![CDATA[");
		sb.append(getBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marital_status</column-name><column-value><![CDATA[");
		sb.append(getMarital_status());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>highest_degree</column-name><column-value><![CDATA[");
		sb.append(getHighest_degree());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>political_background</column-name><column-value><![CDATA[");
		sb.append(getPolitical_background());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>file_location</column-name><column-value><![CDATA[");
		sb.append(getFile_location());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_pay</column-name><column-value><![CDATA[");
		sb.append(getBase_pay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performance_pay</column-name><column-value><![CDATA[");
		sb.append(getPerformance_pay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>health</column-name><column-value><![CDATA[");
		sb.append(getHealth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact_phone</column-name><column-value><![CDATA[");
		sb.append(getContact_phone());
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
			"<column><column-name>residence_phone</column-name><column-value><![CDATA[");
		sb.append(getResidence_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_residential_address</column-name><column-value><![CDATA[");
		sb.append(getCurrent_residential_address());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_residential_address_phone</column-name><column-value><![CDATA[");
		sb.append(getCurrent_residential_address_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergency_contact</column-name><column-value><![CDATA[");
		sb.append(getEmergency_contact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergency_contact_relation</column-name><column-value><![CDATA[");
		sb.append(getEmergency_contact_relation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emergency_contact_phone</column-name><column-value><![CDATA[");
		sb.append(getEmergency_contact_phone());
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
	private long _staffId;
	private long _userId;
	private String _userUuid;
	private String _name;
	private String _sex;
	private String _id_number;
	private String _nation;
	private String _place_of_origin;
	private String _account_properties;
	private Date _birth;
	private String _marital_status;
	private String _highest_degree;
	private String _political_background;
	private String _file_location;
	private double _base_pay;
	private double _performance_pay;
	private String _health;
	private String _contact_phone;
	private String _mail;
	private String _domicile;
	private String _residence_phone;
	private String _current_residential_address;
	private String _current_residential_address_phone;
	private String _emergency_contact;
	private String _emergency_contact_relation;
	private String _emergency_contact_phone;
	private long _companyId;
	private long _createuser;
	private Date _createDate;
	private long _modifieduser;
	private Date _modifiedDate;
	private BaseModel<?> _basic_informationRemoteModel;
}