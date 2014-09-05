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

import com.shuntian.portlet.intranet.model.FamilyRelationship;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FamilyRelationship in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FamilyRelationship
 * @generated
 */
public class FamilyRelationshipCacheModel implements CacheModel<FamilyRelationship>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", relationship=");
		sb.append(relationship);
		sb.append(", workUnit=");
		sb.append(workUnit);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", onceJob=");
		sb.append(onceJob);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FamilyRelationship toEntityModel() {
		FamilyRelationshipImpl familyRelationshipImpl = new FamilyRelationshipImpl();

		familyRelationshipImpl.setId(id);
		familyRelationshipImpl.setUserId(userId);

		if (name == null) {
			familyRelationshipImpl.setName(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setName(name);
		}

		if (relationship == null) {
			familyRelationshipImpl.setRelationship(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setRelationship(relationship);
		}

		if (workUnit == null) {
			familyRelationshipImpl.setWorkUnit(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setWorkUnit(workUnit);
		}

		if (contactPhone == null) {
			familyRelationshipImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setContactPhone(contactPhone);
		}

		if (onceJob == null) {
			familyRelationshipImpl.setOnceJob(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setOnceJob(onceJob);
		}

		familyRelationshipImpl.resetOriginalValues();

		return familyRelationshipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		name = objectInput.readUTF();
		relationship = objectInput.readUTF();
		workUnit = objectInput.readUTF();
		contactPhone = objectInput.readUTF();
		onceJob = objectInput.readUTF();
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

		if (relationship == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relationship);
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

		if (onceJob == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(onceJob);
		}
	}

	public long id;
	public long userId;
	public String name;
	public String relationship;
	public String workUnit;
	public String contactPhone;
	public String onceJob;
}