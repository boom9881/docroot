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
import com.liferay.portal.model.CacheModel;

import com.shuntian.portlet.intranet.model.Overtime;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Overtime in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Overtime
 * @generated
 */
public class OvertimeCacheModel implements CacheModel<Overtime>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", usuallyOvertime=");
		sb.append(usuallyOvertime);
		sb.append(", restOvertime=");
		sb.append(restOvertime);
		sb.append(", legalOvertime=");
		sb.append(legalOvertime);
		sb.append(", overtimeYear=");
		sb.append(overtimeYear);
		sb.append(", overtimeMonthly=");
		sb.append(overtimeMonthly);
		sb.append(", status=");
		sb.append(status);
		sb.append(", approver=");
		sb.append(approver);
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
	public Overtime toEntityModel() {
		OvertimeImpl overtimeImpl = new OvertimeImpl();

		overtimeImpl.setId(id);
		overtimeImpl.setUserId(userId);
		overtimeImpl.setUsuallyOvertime(usuallyOvertime);
		overtimeImpl.setRestOvertime(restOvertime);
		overtimeImpl.setLegalOvertime(legalOvertime);
		overtimeImpl.setOvertimeYear(overtimeYear);
		overtimeImpl.setOvertimeMonthly(overtimeMonthly);
		overtimeImpl.setStatus(status);
		overtimeImpl.setApprover(approver);
		overtimeImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			overtimeImpl.setCreateDate(null);
		}
		else {
			overtimeImpl.setCreateDate(new Date(createDate));
		}

		overtimeImpl.setModifiedUserId(modifiedUserId);

		if (modifiedDate == Long.MIN_VALUE) {
			overtimeImpl.setModifiedDate(null);
		}
		else {
			overtimeImpl.setModifiedDate(new Date(modifiedDate));
		}

		overtimeImpl.resetOriginalValues();

		return overtimeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		usuallyOvertime = objectInput.readDouble();
		restOvertime = objectInput.readDouble();
		legalOvertime = objectInput.readDouble();
		overtimeYear = objectInput.readLong();
		overtimeMonthly = objectInput.readLong();
		status = objectInput.readInt();
		approver = objectInput.readLong();
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
		objectOutput.writeDouble(usuallyOvertime);
		objectOutput.writeDouble(restOvertime);
		objectOutput.writeDouble(legalOvertime);
		objectOutput.writeLong(overtimeYear);
		objectOutput.writeLong(overtimeMonthly);
		objectOutput.writeInt(status);
		objectOutput.writeLong(approver);
		objectOutput.writeLong(createUserId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedUserId);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public double usuallyOvertime;
	public double restOvertime;
	public double legalOvertime;
	public long overtimeYear;
	public long overtimeMonthly;
	public int status;
	public long approver;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}