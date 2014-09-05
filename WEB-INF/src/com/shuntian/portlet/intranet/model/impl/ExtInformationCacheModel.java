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

import com.shuntian.portlet.intranet.model.ExtInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExtInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ExtInformation
 * @generated
 */
public class ExtInformationCacheModel implements CacheModel<ExtInformation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", openCity=");
		sb.append(openCity);
		sb.append(", bankName=");
		sb.append(bankName);
		sb.append(", bankId=");
		sb.append(bankId);
		sb.append(", laborContractStart=");
		sb.append(laborContractStart);
		sb.append(", laborContractEnd=");
		sb.append(laborContractEnd);
		sb.append(", probationPeriodStart=");
		sb.append(probationPeriodStart);
		sb.append(", probationPeriodEnd=");
		sb.append(probationPeriodEnd);
		sb.append(", induredLocation=");
		sb.append(induredLocation);
		sb.append(", fristInsured=");
		sb.append(fristInsured);
		sb.append(", isInsured=");
		sb.append(isInsured);
		sb.append(", basicWage=");
		sb.append(basicWage);
		sb.append(", otherWage=");
		sb.append(otherWage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExtInformation toEntityModel() {
		ExtInformationImpl extInformationImpl = new ExtInformationImpl();

		extInformationImpl.setId(id);
		extInformationImpl.setUserId(userId);

		if (openCity == null) {
			extInformationImpl.setOpenCity(StringPool.BLANK);
		}
		else {
			extInformationImpl.setOpenCity(openCity);
		}

		if (bankName == null) {
			extInformationImpl.setBankName(StringPool.BLANK);
		}
		else {
			extInformationImpl.setBankName(bankName);
		}

		if (bankId == null) {
			extInformationImpl.setBankId(StringPool.BLANK);
		}
		else {
			extInformationImpl.setBankId(bankId);
		}

		if (laborContractStart == Long.MIN_VALUE) {
			extInformationImpl.setLaborContractStart(null);
		}
		else {
			extInformationImpl.setLaborContractStart(new Date(
					laborContractStart));
		}

		if (laborContractEnd == Long.MIN_VALUE) {
			extInformationImpl.setLaborContractEnd(null);
		}
		else {
			extInformationImpl.setLaborContractEnd(new Date(laborContractEnd));
		}

		if (probationPeriodStart == Long.MIN_VALUE) {
			extInformationImpl.setProbationPeriodStart(null);
		}
		else {
			extInformationImpl.setProbationPeriodStart(new Date(
					probationPeriodStart));
		}

		if (probationPeriodEnd == Long.MIN_VALUE) {
			extInformationImpl.setProbationPeriodEnd(null);
		}
		else {
			extInformationImpl.setProbationPeriodEnd(new Date(
					probationPeriodEnd));
		}

		if (induredLocation == null) {
			extInformationImpl.setInduredLocation(StringPool.BLANK);
		}
		else {
			extInformationImpl.setInduredLocation(induredLocation);
		}

		if (fristInsured == Long.MIN_VALUE) {
			extInformationImpl.setFristInsured(null);
		}
		else {
			extInformationImpl.setFristInsured(new Date(fristInsured));
		}

		if (isInsured == null) {
			extInformationImpl.setIsInsured(StringPool.BLANK);
		}
		else {
			extInformationImpl.setIsInsured(isInsured);
		}

		extInformationImpl.setBasicWage(basicWage);
		extInformationImpl.setOtherWage(otherWage);

		extInformationImpl.resetOriginalValues();

		return extInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		openCity = objectInput.readUTF();
		bankName = objectInput.readUTF();
		bankId = objectInput.readUTF();
		laborContractStart = objectInput.readLong();
		laborContractEnd = objectInput.readLong();
		probationPeriodStart = objectInput.readLong();
		probationPeriodEnd = objectInput.readLong();
		induredLocation = objectInput.readUTF();
		fristInsured = objectInput.readLong();
		isInsured = objectInput.readUTF();
		basicWage = objectInput.readLong();
		otherWage = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);

		if (openCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(openCity);
		}

		if (bankName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankName);
		}

		if (bankId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankId);
		}

		objectOutput.writeLong(laborContractStart);
		objectOutput.writeLong(laborContractEnd);
		objectOutput.writeLong(probationPeriodStart);
		objectOutput.writeLong(probationPeriodEnd);

		if (induredLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(induredLocation);
		}

		objectOutput.writeLong(fristInsured);

		if (isInsured == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(isInsured);
		}

		objectOutput.writeLong(basicWage);
		objectOutput.writeLong(otherWage);
	}

	public long id;
	public long userId;
	public String openCity;
	public String bankName;
	public String bankId;
	public long laborContractStart;
	public long laborContractEnd;
	public long probationPeriodStart;
	public long probationPeriodEnd;
	public String induredLocation;
	public long fristInsured;
	public String isInsured;
	public long basicWage;
	public long otherWage;
}