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

import com.shuntian.portlet.intranet.model.education;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing education in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see education
 * @generated
 */
public class educationCacheModel implements CacheModel<education>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", educationId=");
		sb.append(educationId);
		sb.append(", satffId=");
		sb.append(satffId);
		sb.append(", witness=");
		sb.append(witness);
		sb.append(", professional=");
		sb.append(professional);
		sb.append(", university=");
		sb.append(university);
		sb.append(", contact_phone=");
		sb.append(contact_phone);
		sb.append(", start_stop_time=");
		sb.append(start_stop_time);
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
	public education toEntityModel() {
		educationImpl educationImpl = new educationImpl();

		if (uuid == null) {
			educationImpl.setUuid(StringPool.BLANK);
		}
		else {
			educationImpl.setUuid(uuid);
		}

		educationImpl.setEducationId(educationId);
		educationImpl.setSatffId(satffId);

		if (witness == null) {
			educationImpl.setWitness(StringPool.BLANK);
		}
		else {
			educationImpl.setWitness(witness);
		}

		if (professional == null) {
			educationImpl.setProfessional(StringPool.BLANK);
		}
		else {
			educationImpl.setProfessional(professional);
		}

		if (university == null) {
			educationImpl.setUniversity(StringPool.BLANK);
		}
		else {
			educationImpl.setUniversity(university);
		}

		if (contact_phone == null) {
			educationImpl.setContact_phone(StringPool.BLANK);
		}
		else {
			educationImpl.setContact_phone(contact_phone);
		}

		if (start_stop_time == Long.MIN_VALUE) {
			educationImpl.setStart_stop_time(null);
		}
		else {
			educationImpl.setStart_stop_time(new Date(start_stop_time));
		}

		educationImpl.setCompanyId(companyId);
		educationImpl.setCreateuser(createuser);

		if (createDate == Long.MIN_VALUE) {
			educationImpl.setCreateDate(null);
		}
		else {
			educationImpl.setCreateDate(new Date(createDate));
		}

		educationImpl.setModifieduser(modifieduser);

		if (modifiedDate == Long.MIN_VALUE) {
			educationImpl.setModifiedDate(null);
		}
		else {
			educationImpl.setModifiedDate(new Date(modifiedDate));
		}

		educationImpl.resetOriginalValues();

		return educationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		educationId = objectInput.readLong();
		satffId = objectInput.readLong();
		witness = objectInput.readUTF();
		professional = objectInput.readUTF();
		university = objectInput.readUTF();
		contact_phone = objectInput.readUTF();
		start_stop_time = objectInput.readLong();
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

		objectOutput.writeLong(educationId);
		objectOutput.writeLong(satffId);

		if (witness == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(witness);
		}

		if (professional == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(professional);
		}

		if (university == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(university);
		}

		if (contact_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contact_phone);
		}

		objectOutput.writeLong(start_stop_time);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createuser);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifieduser);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long educationId;
	public long satffId;
	public String witness;
	public String professional;
	public String university;
	public String contact_phone;
	public long start_stop_time;
	public long companyId;
	public long createuser;
	public long createDate;
	public long modifieduser;
	public long modifiedDate;
}