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

import com.shuntian.portlet.intranet.model.work;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing work in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see work
 * @generated
 */
public class workCacheModel implements CacheModel<work>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", workId=");
		sb.append(workId);
		sb.append(", satffId=");
		sb.append(satffId);
		sb.append(", witness=");
		sb.append(witness);
		sb.append(", once_job=");
		sb.append(once_job);
		sb.append(", work_unit=");
		sb.append(work_unit);
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
	public work toEntityModel() {
		workImpl workImpl = new workImpl();

		if (uuid == null) {
			workImpl.setUuid(StringPool.BLANK);
		}
		else {
			workImpl.setUuid(uuid);
		}

		workImpl.setWorkId(workId);
		workImpl.setSatffId(satffId);

		if (witness == null) {
			workImpl.setWitness(StringPool.BLANK);
		}
		else {
			workImpl.setWitness(witness);
		}

		if (once_job == null) {
			workImpl.setOnce_job(StringPool.BLANK);
		}
		else {
			workImpl.setOnce_job(once_job);
		}

		if (work_unit == null) {
			workImpl.setWork_unit(StringPool.BLANK);
		}
		else {
			workImpl.setWork_unit(work_unit);
		}

		if (contact_phone == null) {
			workImpl.setContact_phone(StringPool.BLANK);
		}
		else {
			workImpl.setContact_phone(contact_phone);
		}

		if (start_stop_time == Long.MIN_VALUE) {
			workImpl.setStart_stop_time(null);
		}
		else {
			workImpl.setStart_stop_time(new Date(start_stop_time));
		}

		workImpl.setCompanyId(companyId);
		workImpl.setCreateuser(createuser);

		if (createDate == Long.MIN_VALUE) {
			workImpl.setCreateDate(null);
		}
		else {
			workImpl.setCreateDate(new Date(createDate));
		}

		workImpl.setModifieduser(modifieduser);

		if (modifiedDate == Long.MIN_VALUE) {
			workImpl.setModifiedDate(null);
		}
		else {
			workImpl.setModifiedDate(new Date(modifiedDate));
		}

		workImpl.resetOriginalValues();

		return workImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		workId = objectInput.readLong();
		satffId = objectInput.readLong();
		witness = objectInput.readUTF();
		once_job = objectInput.readUTF();
		work_unit = objectInput.readUTF();
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

		objectOutput.writeLong(workId);
		objectOutput.writeLong(satffId);

		if (witness == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(witness);
		}

		if (once_job == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(once_job);
		}

		if (work_unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(work_unit);
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
	public long workId;
	public long satffId;
	public String witness;
	public String once_job;
	public String work_unit;
	public String contact_phone;
	public long start_stop_time;
	public long companyId;
	public long createuser;
	public long createDate;
	public long modifieduser;
	public long modifiedDate;
}