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

import com.shuntian.portlet.intranet.model.Education;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Education in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Education
 * @generated
 */
public class EducationCacheModel implements CacheModel<Education>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", witness=");
		sb.append(witness);
		sb.append(", professional=");
		sb.append(professional);
		sb.append(", university=");
		sb.append(university);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", startTime=");
		sb.append(startTime);
		sb.append(", stopTime=");
		sb.append(stopTime);
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
	public Education toEntityModel() {
		EducationImpl educationImpl = new EducationImpl();

		educationImpl.setId(id);
		educationImpl.setUserId(userId);

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

		if (contactPhone == null) {
			educationImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			educationImpl.setContactPhone(contactPhone);
		}

		if (startTime == Long.MIN_VALUE) {
			educationImpl.setStartTime(null);
		}
		else {
			educationImpl.setStartTime(new Date(startTime));
		}

		if (stopTime == Long.MIN_VALUE) {
			educationImpl.setStopTime(null);
		}
		else {
			educationImpl.setStopTime(new Date(stopTime));
		}

		educationImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			educationImpl.setCreateDate(null);
		}
		else {
			educationImpl.setCreateDate(new Date(createDate));
		}

		educationImpl.setModifiedUserId(modifiedUserId);

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
		id = objectInput.readLong();
		userId = objectInput.readLong();
		witness = objectInput.readUTF();
		professional = objectInput.readUTF();
		university = objectInput.readUTF();
		contactPhone = objectInput.readUTF();
		startTime = objectInput.readLong();
		stopTime = objectInput.readLong();
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

		if (contactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPhone);
		}

		objectOutput.writeLong(startTime);
		objectOutput.writeLong(stopTime);
		objectOutput.writeLong(createUserId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedUserId);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public String witness;
	public String professional;
	public String university;
	public String contactPhone;
	public long startTime;
	public long stopTime;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}