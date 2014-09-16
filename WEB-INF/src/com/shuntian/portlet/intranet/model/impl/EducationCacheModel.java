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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", eWitness=");
		sb.append(eWitness);
		sb.append(", eProfessional=");
		sb.append(eProfessional);
		sb.append(", eUniversity=");
		sb.append(eUniversity);
		sb.append(", eContactPhone=");
		sb.append(eContactPhone);
		sb.append(", eStartTimeYear=");
		sb.append(eStartTimeYear);
		sb.append(", eStartTimeMonth=");
		sb.append(eStartTimeMonth);
		sb.append(", eStopTimeYear=");
		sb.append(eStopTimeYear);
		sb.append(", eStopTimeMonth=");
		sb.append(eStopTimeMonth);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Education toEntityModel() {
		EducationImpl educationImpl = new EducationImpl();

		educationImpl.setId(id);
		educationImpl.setUserId(userId);

		if (eWitness == null) {
			educationImpl.setEWitness(StringPool.BLANK);
		}
		else {
			educationImpl.setEWitness(eWitness);
		}

		if (eProfessional == null) {
			educationImpl.setEProfessional(StringPool.BLANK);
		}
		else {
			educationImpl.setEProfessional(eProfessional);
		}

		if (eUniversity == null) {
			educationImpl.setEUniversity(StringPool.BLANK);
		}
		else {
			educationImpl.setEUniversity(eUniversity);
		}

		if (eContactPhone == null) {
			educationImpl.setEContactPhone(StringPool.BLANK);
		}
		else {
			educationImpl.setEContactPhone(eContactPhone);
		}

		if (eStartTimeYear == null) {
			educationImpl.setEStartTimeYear(StringPool.BLANK);
		}
		else {
			educationImpl.setEStartTimeYear(eStartTimeYear);
		}

		if (eStartTimeMonth == null) {
			educationImpl.setEStartTimeMonth(StringPool.BLANK);
		}
		else {
			educationImpl.setEStartTimeMonth(eStartTimeMonth);
		}

		if (eStopTimeYear == null) {
			educationImpl.setEStopTimeYear(StringPool.BLANK);
		}
		else {
			educationImpl.setEStopTimeYear(eStopTimeYear);
		}

		if (eStopTimeMonth == null) {
			educationImpl.setEStopTimeMonth(StringPool.BLANK);
		}
		else {
			educationImpl.setEStopTimeMonth(eStopTimeMonth);
		}

		educationImpl.resetOriginalValues();

		return educationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		eWitness = objectInput.readUTF();
		eProfessional = objectInput.readUTF();
		eUniversity = objectInput.readUTF();
		eContactPhone = objectInput.readUTF();
		eStartTimeYear = objectInput.readUTF();
		eStartTimeMonth = objectInput.readUTF();
		eStopTimeYear = objectInput.readUTF();
		eStopTimeMonth = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);

		if (eWitness == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eWitness);
		}

		if (eProfessional == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eProfessional);
		}

		if (eUniversity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eUniversity);
		}

		if (eContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eContactPhone);
		}

		if (eStartTimeYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eStartTimeYear);
		}

		if (eStartTimeMonth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eStartTimeMonth);
		}

		if (eStopTimeYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eStopTimeYear);
		}

		if (eStopTimeMonth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eStopTimeMonth);
		}
	}

	public long id;
	public long userId;
	public String eWitness;
	public String eProfessional;
	public String eUniversity;
	public String eContactPhone;
	public String eStartTimeYear;
	public String eStartTimeMonth;
	public String eStopTimeYear;
	public String eStopTimeMonth;
}