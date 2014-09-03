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

import com.shuntian.portlet.intranet.model.BasicInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BasicInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformation
 * @generated
 */
public class BasicInformationCacheModel implements CacheModel<BasicInformation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", idNumber=");
		sb.append(idNumber);
		sb.append(", nation=");
		sb.append(nation);
		sb.append(", placeOfOrigin=");
		sb.append(placeOfOrigin);
		sb.append(", accountProperties=");
		sb.append(accountProperties);
		sb.append(", birthDate=");
		sb.append(birthDate);
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", highestDegree=");
		sb.append(highestDegree);
		sb.append(", politicalBackground=");
		sb.append(politicalBackground);
		sb.append(", fileLocation=");
		sb.append(fileLocation);
		sb.append(", basePay=");
		sb.append(basePay);
		sb.append(", performancePay=");
		sb.append(performancePay);
		sb.append(", health=");
		sb.append(health);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", mail=");
		sb.append(mail);
		sb.append(", domicile=");
		sb.append(domicile);
		sb.append(", residencePhone=");
		sb.append(residencePhone);
		sb.append(", currentResidentialAddress=");
		sb.append(currentResidentialAddress);
		sb.append(", currentResidentialAddressPhone=");
		sb.append(currentResidentialAddressPhone);
		sb.append(", emergencyContact=");
		sb.append(emergencyContact);
		sb.append(", emergencyContactRelation=");
		sb.append(emergencyContactRelation);
		sb.append(", emergencyContactPhone=");
		sb.append(emergencyContactPhone);
		sb.append(", createUserId=");
		sb.append(createUserId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedUserId=");
		sb.append(modifiedUserId);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BasicInformation toEntityModel() {
		BasicInformationImpl basicInformationImpl = new BasicInformationImpl();

		basicInformationImpl.setId(id);
		basicInformationImpl.setUserId(userId);

		if (name == null) {
			basicInformationImpl.setName(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setName(name);
		}

		basicInformationImpl.setSex(sex);

		if (idNumber == null) {
			basicInformationImpl.setIdNumber(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setIdNumber(idNumber);
		}

		if (nation == null) {
			basicInformationImpl.setNation(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setNation(nation);
		}

		if (placeOfOrigin == null) {
			basicInformationImpl.setPlaceOfOrigin(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setPlaceOfOrigin(placeOfOrigin);
		}

		if (accountProperties == null) {
			basicInformationImpl.setAccountProperties(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setAccountProperties(accountProperties);
		}

		if (birthDate == Long.MIN_VALUE) {
			basicInformationImpl.setBirthDate(null);
		}
		else {
			basicInformationImpl.setBirthDate(new Date(birthDate));
		}

		if (maritalStatus == null) {
			basicInformationImpl.setMaritalStatus(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setMaritalStatus(maritalStatus);
		}

		if (highestDegree == null) {
			basicInformationImpl.setHighestDegree(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setHighestDegree(highestDegree);
		}

		if (politicalBackground == null) {
			basicInformationImpl.setPoliticalBackground(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setPoliticalBackground(politicalBackground);
		}

		if (fileLocation == null) {
			basicInformationImpl.setFileLocation(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setFileLocation(fileLocation);
		}

		basicInformationImpl.setBasePay(basePay);
		basicInformationImpl.setPerformancePay(performancePay);
		basicInformationImpl.setHealth(health);

		if (contactPhone == null) {
			basicInformationImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setContactPhone(contactPhone);
		}

		if (mail == null) {
			basicInformationImpl.setMail(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setMail(mail);
		}

		if (domicile == null) {
			basicInformationImpl.setDomicile(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setDomicile(domicile);
		}

		if (residencePhone == null) {
			basicInformationImpl.setResidencePhone(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setResidencePhone(residencePhone);
		}

		if (currentResidentialAddress == null) {
			basicInformationImpl.setCurrentResidentialAddress(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setCurrentResidentialAddress(currentResidentialAddress);
		}

		if (currentResidentialAddressPhone == null) {
			basicInformationImpl.setCurrentResidentialAddressPhone(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setCurrentResidentialAddressPhone(currentResidentialAddressPhone);
		}

		if (emergencyContact == null) {
			basicInformationImpl.setEmergencyContact(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setEmergencyContact(emergencyContact);
		}

		if (emergencyContactRelation == null) {
			basicInformationImpl.setEmergencyContactRelation(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setEmergencyContactRelation(emergencyContactRelation);
		}

		if (emergencyContactPhone == null) {
			basicInformationImpl.setEmergencyContactPhone(StringPool.BLANK);
		}
		else {
			basicInformationImpl.setEmergencyContactPhone(emergencyContactPhone);
		}

		basicInformationImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			basicInformationImpl.setCreateDate(null);
		}
		else {
			basicInformationImpl.setCreateDate(new Date(createDate));
		}

		basicInformationImpl.setModifiedUserId(modifiedUserId);

		if (modifiedDate == Long.MIN_VALUE) {
			basicInformationImpl.setModifiedDate(null);
		}
		else {
			basicInformationImpl.setModifiedDate(new Date(modifiedDate));
		}

		basicInformationImpl.resetOriginalValues();

		return basicInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		name = objectInput.readUTF();
		sex = objectInput.readInt();
		idNumber = objectInput.readUTF();
		nation = objectInput.readUTF();
		placeOfOrigin = objectInput.readUTF();
		accountProperties = objectInput.readUTF();
		birthDate = objectInput.readLong();
		maritalStatus = objectInput.readUTF();
		highestDegree = objectInput.readUTF();
		politicalBackground = objectInput.readUTF();
		fileLocation = objectInput.readUTF();
		basePay = objectInput.readDouble();
		performancePay = objectInput.readDouble();
		health = objectInput.readInt();
		contactPhone = objectInput.readUTF();
		mail = objectInput.readUTF();
		domicile = objectInput.readUTF();
		residencePhone = objectInput.readUTF();
		currentResidentialAddress = objectInput.readUTF();
		currentResidentialAddressPhone = objectInput.readUTF();
		emergencyContact = objectInput.readUTF();
		emergencyContactRelation = objectInput.readUTF();
		emergencyContactPhone = objectInput.readUTF();
		createUserId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedUserId = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(sex);

		if (idNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(idNumber);
		}

		if (nation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nation);
		}

		if (placeOfOrigin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(placeOfOrigin);
		}

		if (accountProperties == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accountProperties);
		}

		objectOutput.writeLong(birthDate);

		if (maritalStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritalStatus);
		}

		if (highestDegree == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(highestDegree);
		}

		if (politicalBackground == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(politicalBackground);
		}

		if (fileLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileLocation);
		}

		objectOutput.writeDouble(basePay);
		objectOutput.writeDouble(performancePay);
		objectOutput.writeInt(health);

		if (contactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPhone);
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

		if (residencePhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(residencePhone);
		}

		if (currentResidentialAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentResidentialAddress);
		}

		if (currentResidentialAddressPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentResidentialAddressPhone);
		}

		if (emergencyContact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergencyContact);
		}

		if (emergencyContactRelation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergencyContactRelation);
		}

		if (emergencyContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergencyContactPhone);
		}

		objectOutput.writeLong(createUserId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedUserId);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public String name;
	public int sex;
	public String idNumber;
	public String nation;
	public String placeOfOrigin;
	public String accountProperties;
	public long birthDate;
	public String maritalStatus;
	public String highestDegree;
	public String politicalBackground;
	public String fileLocation;
	public double basePay;
	public double performancePay;
	public int health;
	public String contactPhone;
	public String mail;
	public String domicile;
	public String residencePhone;
	public String currentResidentialAddress;
	public String currentResidentialAddressPhone;
	public String emergencyContact;
	public String emergencyContactRelation;
	public String emergencyContactPhone;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}