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

package com.shuntian.portlet.intranet.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.shuntian.portlet.intranet.model.basic_information;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing basic_information in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see basic_information
 * @generated
 */
public class basic_informationCacheModel implements CacheModel<basic_information>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", staffId=");
		sb.append(staffId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", id_number=");
		sb.append(id_number);
		sb.append(", nation=");
		sb.append(nation);
		sb.append(", place_of_origin=");
		sb.append(place_of_origin);
		sb.append(", account_properties=");
		sb.append(account_properties);
		sb.append(", birth=");
		sb.append(birth);
		sb.append(", marital_status=");
		sb.append(marital_status);
		sb.append(", highest_degree=");
		sb.append(highest_degree);
		sb.append(", political_background=");
		sb.append(political_background);
		sb.append(", file_location=");
		sb.append(file_location);
		sb.append(", base_pay=");
		sb.append(base_pay);
		sb.append(", performance_pay=");
		sb.append(performance_pay);
		sb.append(", health=");
		sb.append(health);
		sb.append(", contact_phone=");
		sb.append(contact_phone);
		sb.append(", mail=");
		sb.append(mail);
		sb.append(", domicile=");
		sb.append(domicile);
		sb.append(", residence_phone=");
		sb.append(residence_phone);
		sb.append(", current_residential_address=");
		sb.append(current_residential_address);
		sb.append(", current_residential_address_phone=");
		sb.append(current_residential_address_phone);
		sb.append(", emergency_contact=");
		sb.append(emergency_contact);
		sb.append(", emergency_contact_relation=");
		sb.append(emergency_contact_relation);
		sb.append(", emergency_contact_phone=");
		sb.append(emergency_contact_phone);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createuser=");
		sb.append(createuser);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifieduser=");
		sb.append(modifieduser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public basic_information toEntityModel() {
		basic_informationImpl basic_informationImpl = new basic_informationImpl();

		if (uuid == null) {
			basic_informationImpl.setUuid(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setUuid(uuid);
		}

		basic_informationImpl.setStaffId(staffId);
		basic_informationImpl.setUserId(userId);

		if (name == null) {
			basic_informationImpl.setName(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setName(name);
		}

		if (sex == null) {
			basic_informationImpl.setSex(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setSex(sex);
		}

		if (id_number == null) {
			basic_informationImpl.setId_number(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setId_number(id_number);
		}

		if (nation == null) {
			basic_informationImpl.setNation(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setNation(nation);
		}

		if (place_of_origin == null) {
			basic_informationImpl.setPlace_of_origin(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setPlace_of_origin(place_of_origin);
		}

		if (account_properties == null) {
			basic_informationImpl.setAccount_properties(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setAccount_properties(account_properties);
		}

		if (birth == Long.MIN_VALUE) {
			basic_informationImpl.setBirth(null);
		}
		else {
			basic_informationImpl.setBirth(new Date(birth));
		}

		if (marital_status == null) {
			basic_informationImpl.setMarital_status(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setMarital_status(marital_status);
		}

		if (highest_degree == null) {
			basic_informationImpl.setHighest_degree(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setHighest_degree(highest_degree);
		}

		if (political_background == null) {
			basic_informationImpl.setPolitical_background(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setPolitical_background(political_background);
		}

		if (file_location == null) {
			basic_informationImpl.setFile_location(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setFile_location(file_location);
		}

		basic_informationImpl.setBase_pay(base_pay);
		basic_informationImpl.setPerformance_pay(performance_pay);

		if (health == null) {
			basic_informationImpl.setHealth(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setHealth(health);
		}

		if (contact_phone == null) {
			basic_informationImpl.setContact_phone(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setContact_phone(contact_phone);
		}

		if (mail == null) {
			basic_informationImpl.setMail(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setMail(mail);
		}

		if (domicile == null) {
			basic_informationImpl.setDomicile(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setDomicile(domicile);
		}

		if (residence_phone == null) {
			basic_informationImpl.setResidence_phone(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setResidence_phone(residence_phone);
		}

		if (current_residential_address == null) {
			basic_informationImpl.setCurrent_residential_address(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setCurrent_residential_address(current_residential_address);
		}

		if (current_residential_address_phone == null) {
			basic_informationImpl.setCurrent_residential_address_phone(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setCurrent_residential_address_phone(current_residential_address_phone);
		}

		if (emergency_contact == null) {
			basic_informationImpl.setEmergency_contact(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setEmergency_contact(emergency_contact);
		}

		if (emergency_contact_relation == null) {
			basic_informationImpl.setEmergency_contact_relation(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setEmergency_contact_relation(emergency_contact_relation);
		}

		if (emergency_contact_phone == null) {
			basic_informationImpl.setEmergency_contact_phone(StringPool.BLANK);
		}
		else {
			basic_informationImpl.setEmergency_contact_phone(emergency_contact_phone);
		}

		basic_informationImpl.setCompanyId(companyId);
		basic_informationImpl.setCreateuser(createuser);

		if (createDate == Long.MIN_VALUE) {
			basic_informationImpl.setCreateDate(null);
		}
		else {
			basic_informationImpl.setCreateDate(new Date(createDate));
		}

		basic_informationImpl.setModifieduser(modifieduser);

		if (modifiedDate == Long.MIN_VALUE) {
			basic_informationImpl.setModifiedDate(null);
		}
		else {
			basic_informationImpl.setModifiedDate(new Date(modifiedDate));
		}

		basic_informationImpl.resetOriginalValues();

		return basic_informationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		staffId = objectInput.readLong();
		userId = objectInput.readLong();
		name = objectInput.readUTF();
		sex = objectInput.readUTF();
		id_number = objectInput.readUTF();
		nation = objectInput.readUTF();
		place_of_origin = objectInput.readUTF();
		account_properties = objectInput.readUTF();
		birth = objectInput.readLong();
		marital_status = objectInput.readUTF();
		highest_degree = objectInput.readUTF();
		political_background = objectInput.readUTF();
		file_location = objectInput.readUTF();
		base_pay = objectInput.readDouble();
		performance_pay = objectInput.readDouble();
		health = objectInput.readUTF();
		contact_phone = objectInput.readUTF();
		mail = objectInput.readUTF();
		domicile = objectInput.readUTF();
		residence_phone = objectInput.readUTF();
		current_residential_address = objectInput.readUTF();
		current_residential_address_phone = objectInput.readUTF();
		emergency_contact = objectInput.readUTF();
		emergency_contact_relation = objectInput.readUTF();
		emergency_contact_phone = objectInput.readUTF();
		companyId = objectInput.readLong();
		createuser = objectInput.readLong();
		createDate = objectInput.readLong();
		modifieduser = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(staffId);
		objectOutput.writeLong(userId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (sex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sex);
		}

		if (id_number == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id_number);
		}

		if (nation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nation);
		}

		if (place_of_origin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(place_of_origin);
		}

		if (account_properties == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(account_properties);
		}

		objectOutput.writeLong(birth);

		if (marital_status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marital_status);
		}

		if (highest_degree == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(highest_degree);
		}

		if (political_background == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(political_background);
		}

		if (file_location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(file_location);
		}

		objectOutput.writeDouble(base_pay);
		objectOutput.writeDouble(performance_pay);

		if (health == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(health);
		}

		if (contact_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contact_phone);
		}

		if (mail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mail);
		}

		if (domicile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domicile);
		}

		if (residence_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(residence_phone);
		}

		if (current_residential_address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(current_residential_address);
		}

		if (current_residential_address_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(current_residential_address_phone);
		}

		if (emergency_contact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergency_contact);
		}

		if (emergency_contact_relation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergency_contact_relation);
		}

		if (emergency_contact_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergency_contact_phone);
		}

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createuser);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifieduser);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long staffId;
	public long userId;
	public String name;
	public String sex;
	public String id_number;
	public String nation;
	public String place_of_origin;
	public String account_properties;
	public long birth;
	public String marital_status;
	public String highest_degree;
	public String political_background;
	public String file_location;
	public double base_pay;
	public double performance_pay;
	public String health;
	public String contact_phone;
	public String mail;
	public String domicile;
	public String residence_phone;
	public String current_residential_address;
	public String current_residential_address_phone;
	public String emergency_contact;
	public String emergency_contact_relation;
	public String emergency_contact_phone;
	public long companyId;
	public long createuser;
	public long createDate;
	public long modifieduser;
	public long modifiedDate;
}