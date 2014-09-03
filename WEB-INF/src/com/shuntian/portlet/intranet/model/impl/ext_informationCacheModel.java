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

import com.shuntian.portlet.intranet.model.ext_information;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ext_information in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ext_information
 * @generated
 */
public class ext_informationCacheModel implements CacheModel<ext_information>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", extId=");
		sb.append(extId);
		sb.append(", staffId=");
		sb.append(staffId);
		sb.append(", open_city=");
		sb.append(open_city);
		sb.append(", bank_name=");
		sb.append(bank_name);
		sb.append(", bankid=");
		sb.append(bankid);
		sb.append(", labor_contract_start=");
		sb.append(labor_contract_start);
		sb.append(", labor_contract_end=");
		sb.append(labor_contract_end);
		sb.append(", probation_period_start=");
		sb.append(probation_period_start);
		sb.append(", probation_period_end=");
		sb.append(probation_period_end);
		sb.append(", indured_location=");
		sb.append(indured_location);
		sb.append(", frist_insured=");
		sb.append(frist_insured);
		sb.append(", is_insured=");
		sb.append(is_insured);
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
	public ext_information toEntityModel() {
		ext_informationImpl ext_informationImpl = new ext_informationImpl();

		if (uuid == null) {
			ext_informationImpl.setUuid(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setUuid(uuid);
		}

		ext_informationImpl.setExtId(extId);
		ext_informationImpl.setStaffId(staffId);

		if (open_city == null) {
			ext_informationImpl.setOpen_city(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setOpen_city(open_city);
		}

		if (bank_name == null) {
			ext_informationImpl.setBank_name(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setBank_name(bank_name);
		}

		if (bankid == null) {
			ext_informationImpl.setBankid(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setBankid(bankid);
		}

		if (labor_contract_start == Long.MIN_VALUE) {
			ext_informationImpl.setLabor_contract_start(null);
		}
		else {
			ext_informationImpl.setLabor_contract_start(new Date(
					labor_contract_start));
		}

		if (labor_contract_end == Long.MIN_VALUE) {
			ext_informationImpl.setLabor_contract_end(null);
		}
		else {
			ext_informationImpl.setLabor_contract_end(new Date(
					labor_contract_end));
		}

		if (probation_period_start == Long.MIN_VALUE) {
			ext_informationImpl.setProbation_period_start(null);
		}
		else {
			ext_informationImpl.setProbation_period_start(new Date(
					probation_period_start));
		}

		if (probation_period_end == Long.MIN_VALUE) {
			ext_informationImpl.setProbation_period_end(null);
		}
		else {
			ext_informationImpl.setProbation_period_end(new Date(
					probation_period_end));
		}

		if (indured_location == null) {
			ext_informationImpl.setIndured_location(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setIndured_location(indured_location);
		}

		if (frist_insured == Long.MIN_VALUE) {
			ext_informationImpl.setFrist_insured(null);
		}
		else {
			ext_informationImpl.setFrist_insured(new Date(frist_insured));
		}

		if (is_insured == null) {
			ext_informationImpl.setIs_insured(StringPool.BLANK);
		}
		else {
			ext_informationImpl.setIs_insured(is_insured);
		}

		ext_informationImpl.setCompanyId(companyId);
		ext_informationImpl.setCreateuser(createuser);

		if (createDate == Long.MIN_VALUE) {
			ext_informationImpl.setCreateDate(null);
		}
		else {
			ext_informationImpl.setCreateDate(new Date(createDate));
		}

		ext_informationImpl.setModifieduser(modifieduser);

		if (modifiedDate == Long.MIN_VALUE) {
			ext_informationImpl.setModifiedDate(null);
		}
		else {
			ext_informationImpl.setModifiedDate(new Date(modifiedDate));
		}

		ext_informationImpl.resetOriginalValues();

		return ext_informationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		extId = objectInput.readLong();
		staffId = objectInput.readLong();
		open_city = objectInput.readUTF();
		bank_name = objectInput.readUTF();
		bankid = objectInput.readUTF();
		labor_contract_start = objectInput.readLong();
		labor_contract_end = objectInput.readLong();
		probation_period_start = objectInput.readLong();
		probation_period_end = objectInput.readLong();
		indured_location = objectInput.readUTF();
		frist_insured = objectInput.readLong();
		is_insured = objectInput.readUTF();
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

		objectOutput.writeLong(extId);
		objectOutput.writeLong(staffId);

		if (open_city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(open_city);
		}

		if (bank_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bank_name);
		}

		if (bankid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankid);
		}

		objectOutput.writeLong(labor_contract_start);
		objectOutput.writeLong(labor_contract_end);
		objectOutput.writeLong(probation_period_start);
		objectOutput.writeLong(probation_period_end);

		if (indured_location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(indured_location);
		}

		objectOutput.writeLong(frist_insured);

		if (is_insured == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(is_insured);
		}

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createuser);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifieduser);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long extId;
	public long staffId;
	public String open_city;
	public String bank_name;
	public String bankid;
	public long labor_contract_start;
	public long labor_contract_end;
	public long probation_period_start;
	public long probation_period_end;
	public String indured_location;
	public long frist_insured;
	public String is_insured;
	public long companyId;
	public long createuser;
	public long createDate;
	public long modifieduser;
	public long modifiedDate;
}