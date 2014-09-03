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

import com.shuntian.portlet.intranet.model.WorkExperience;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WorkExperience in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperience
 * @generated
 */
public class WorkExperienceCacheModel implements CacheModel<WorkExperience>,
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
		sb.append(", onceJob=");
		sb.append(onceJob);
		sb.append(", workUnit=");
		sb.append(workUnit);
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
	public WorkExperience toEntityModel() {
		WorkExperienceImpl workExperienceImpl = new WorkExperienceImpl();

		workExperienceImpl.setId(id);
		workExperienceImpl.setUserId(userId);

		if (witness == null) {
			workExperienceImpl.setWitness(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWitness(witness);
		}

		if (onceJob == null) {
			workExperienceImpl.setOnceJob(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setOnceJob(onceJob);
		}

		if (workUnit == null) {
			workExperienceImpl.setWorkUnit(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWorkUnit(workUnit);
		}

		if (contactPhone == null) {
			workExperienceImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setContactPhone(contactPhone);
		}

		if (startTime == Long.MIN_VALUE) {
			workExperienceImpl.setStartTime(null);
		}
		else {
			workExperienceImpl.setStartTime(new Date(startTime));
		}

		if (stopTime == Long.MIN_VALUE) {
			workExperienceImpl.setStopTime(null);
		}
		else {
			workExperienceImpl.setStopTime(new Date(stopTime));
		}

		workExperienceImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			workExperienceImpl.setCreateDate(null);
		}
		else {
			workExperienceImpl.setCreateDate(new Date(createDate));
		}

		workExperienceImpl.setModifiedUserId(modifiedUserId);

		if (modifiedDate == Long.MIN_VALUE) {
			workExperienceImpl.setModifiedDate(null);
		}
		else {
			workExperienceImpl.setModifiedDate(new Date(modifiedDate));
		}

		workExperienceImpl.resetOriginalValues();

		return workExperienceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		witness = objectInput.readUTF();
		onceJob = objectInput.readUTF();
		workUnit = objectInput.readUTF();
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

		if (onceJob == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(onceJob);
		}

		if (workUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workUnit);
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
	public String onceJob;
	public String workUnit;
	public String contactPhone;
	public long startTime;
	public long stopTime;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}