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
		sb.append(", frName=");
		sb.append(frName);
		sb.append(", frRelationship=");
		sb.append(frRelationship);
		sb.append(", frWorkUnit=");
		sb.append(frWorkUnit);
		sb.append(", frContactPhone=");
		sb.append(frContactPhone);
		sb.append(", frOnceJob=");
		sb.append(frOnceJob);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FamilyRelationship toEntityModel() {
		FamilyRelationshipImpl familyRelationshipImpl = new FamilyRelationshipImpl();

		familyRelationshipImpl.setId(id);
		familyRelationshipImpl.setUserId(userId);

		if (frName == null) {
			familyRelationshipImpl.setFrName(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setFrName(frName);
		}

		if (frRelationship == null) {
			familyRelationshipImpl.setFrRelationship(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setFrRelationship(frRelationship);
		}

		if (frWorkUnit == null) {
			familyRelationshipImpl.setFrWorkUnit(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setFrWorkUnit(frWorkUnit);
		}

		if (frContactPhone == null) {
			familyRelationshipImpl.setFrContactPhone(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setFrContactPhone(frContactPhone);
		}

		if (frOnceJob == null) {
			familyRelationshipImpl.setFrOnceJob(StringPool.BLANK);
		}
		else {
			familyRelationshipImpl.setFrOnceJob(frOnceJob);
		}

		familyRelationshipImpl.resetOriginalValues();

		return familyRelationshipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		frName = objectInput.readUTF();
		frRelationship = objectInput.readUTF();
		frWorkUnit = objectInput.readUTF();
		frContactPhone = objectInput.readUTF();
		frOnceJob = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);

		if (frName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frName);
		}

		if (frRelationship == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frRelationship);
		}

		if (frWorkUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frWorkUnit);
		}

		if (frContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frContactPhone);
		}

		if (frOnceJob == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frOnceJob);
		}
	}

	public long id;
	public long userId;
	public String frName;
	public String frRelationship;
	public String frWorkUnit;
	public String frContactPhone;
	public String frOnceJob;
}