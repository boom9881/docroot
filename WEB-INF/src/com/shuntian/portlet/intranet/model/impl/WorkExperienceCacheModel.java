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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", weWitness=");
		sb.append(weWitness);
		sb.append(", weOnceJob=");
		sb.append(weOnceJob);
		sb.append(", weWorkUnit=");
		sb.append(weWorkUnit);
		sb.append(", weContactPhone=");
		sb.append(weContactPhone);
		sb.append(", weStartTimeYear=");
		sb.append(weStartTimeYear);
		sb.append(", weStartTimeMonth=");
		sb.append(weStartTimeMonth);
		sb.append(", weStopTimeYear=");
		sb.append(weStopTimeYear);
		sb.append(", weStopTimeMonth=");
		sb.append(weStopTimeMonth);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WorkExperience toEntityModel() {
		WorkExperienceImpl workExperienceImpl = new WorkExperienceImpl();

		workExperienceImpl.setId(id);
		workExperienceImpl.setUserId(userId);

		if (weWitness == null) {
			workExperienceImpl.setWeWitness(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeWitness(weWitness);
		}

		if (weOnceJob == null) {
			workExperienceImpl.setWeOnceJob(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeOnceJob(weOnceJob);
		}

		if (weWorkUnit == null) {
			workExperienceImpl.setWeWorkUnit(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeWorkUnit(weWorkUnit);
		}

		if (weContactPhone == null) {
			workExperienceImpl.setWeContactPhone(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeContactPhone(weContactPhone);
		}

		if (weStartTimeYear == null) {
			workExperienceImpl.setWeStartTimeYear(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeStartTimeYear(weStartTimeYear);
		}

		if (weStartTimeMonth == null) {
			workExperienceImpl.setWeStartTimeMonth(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeStartTimeMonth(weStartTimeMonth);
		}

		if (weStopTimeYear == null) {
			workExperienceImpl.setWeStopTimeYear(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeStopTimeYear(weStopTimeYear);
		}

		if (weStopTimeMonth == null) {
			workExperienceImpl.setWeStopTimeMonth(StringPool.BLANK);
		}
		else {
			workExperienceImpl.setWeStopTimeMonth(weStopTimeMonth);
		}

		workExperienceImpl.resetOriginalValues();

		return workExperienceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		weWitness = objectInput.readUTF();
		weOnceJob = objectInput.readUTF();
		weWorkUnit = objectInput.readUTF();
		weContactPhone = objectInput.readUTF();
		weStartTimeYear = objectInput.readUTF();
		weStartTimeMonth = objectInput.readUTF();
		weStopTimeYear = objectInput.readUTF();
		weStopTimeMonth = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);

		if (weWitness == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weWitness);
		}

		if (weOnceJob == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weOnceJob);
		}

		if (weWorkUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weWorkUnit);
		}

		if (weContactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weContactPhone);
		}

		if (weStartTimeYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weStartTimeYear);
		}

		if (weStartTimeMonth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weStartTimeMonth);
		}

		if (weStopTimeYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weStopTimeYear);
		}

		if (weStopTimeMonth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(weStopTimeMonth);
		}
	}

	public long id;
	public long userId;
	public String weWitness;
	public String weOnceJob;
	public String weWorkUnit;
	public String weContactPhone;
	public String weStartTimeYear;
	public String weStartTimeMonth;
	public String weStopTimeYear;
	public String weStopTimeMonth;
}