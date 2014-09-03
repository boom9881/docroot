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

import com.shuntian.portlet.intranet.model.family;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing family in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see family
 * @generated
 */
public class familyCacheModel implements CacheModel<family>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", familyId=");
		sb.append(familyId);
		sb.append(", satffId=");
		sb.append(satffId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", relationship=");
		sb.append(relationship);
		sb.append(", work_unit=");
		sb.append(work_unit);
		sb.append(", contact_phone=");
		sb.append(contact_phone);
		sb.append(", once_job=");
		sb.append(once_job);
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
	public family toEntityModel() {
		familyImpl familyImpl = new familyImpl();

		if (uuid == null) {
			familyImpl.setUuid(StringPool.BLANK);
		}
		else {
			familyImpl.setUuid(uuid);
		}

		familyImpl.setFamilyId(familyId);
		familyImpl.setSatffId(satffId);

		if (name == null) {
			familyImpl.setName(StringPool.BLANK);
		}
		else {
			familyImpl.setName(name);
		}

		if (relationship == null) {
			familyImpl.setRelationship(StringPool.BLANK);
		}
		else {
			familyImpl.setRelationship(relationship);
		}

		if (work_unit == null) {
			familyImpl.setWork_unit(StringPool.BLANK);
		}
		else {
			familyImpl.setWork_unit(work_unit);
		}

		if (contact_phone == null) {
			familyImpl.setContact_phone(StringPool.BLANK);
		}
		else {
			familyImpl.setContact_phone(contact_phone);
		}

		if (once_job == null) {
			familyImpl.setOnce_job(StringPool.BLANK);
		}
		else {
			familyImpl.setOnce_job(once_job);
		}

		familyImpl.setCompanyId(companyId);
		familyImpl.setCreateuser(createuser);

		if (createDate == Long.MIN_VALUE) {
			familyImpl.setCreateDate(null);
		}
		else {
			familyImpl.setCreateDate(new Date(createDate));
		}

		familyImpl.setModifieduser(modifieduser);

		if (modifiedDate == Long.MIN_VALUE) {
			familyImpl.setModifiedDate(null);
		}
		else {
			familyImpl.setModifiedDate(new Date(modifiedDate));
		}

		familyImpl.resetOriginalValues();

		return familyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		familyId = objectInput.readLong();
		satffId = objectInput.readLong();
		name = objectInput.readUTF();
		relationship = objectInput.readUTF();
		work_unit = objectInput.readUTF();
		contact_phone = objectInput.readUTF();
		once_job = objectInput.readUTF();
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

		objectOutput.writeLong(familyId);
		objectOutput.writeLong(satffId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (relationship == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relationship);
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

		if (once_job == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(once_job);
		}

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createuser);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifieduser);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long familyId;
	public long satffId;
	public String name;
	public String relationship;
	public String work_unit;
	public String contact_phone;
	public String once_job;
	public long companyId;
	public long createuser;
	public long createDate;
	public long modifieduser;
	public long modifiedDate;
}