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

import com.shuntian.portlet.intranet.model.Attendance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Attendance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Attendance
 * @generated
 */
public class AttendanceCacheModel implements CacheModel<Attendance>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", shouldAttendance=");
		sb.append(shouldAttendance);
		sb.append(", actualAttendance=");
		sb.append(actualAttendance);
		sb.append(", attendanceYear=");
		sb.append(attendanceYear);
		sb.append(", attendanceMonthly=");
		sb.append(attendanceMonthly);
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
	public Attendance toEntityModel() {
		AttendanceImpl attendanceImpl = new AttendanceImpl();

		attendanceImpl.setId(id);
		attendanceImpl.setUserId(userId);
		attendanceImpl.setShouldAttendance(shouldAttendance);
		attendanceImpl.setActualAttendance(actualAttendance);
		attendanceImpl.setAttendanceYear(attendanceYear);
		attendanceImpl.setAttendanceMonthly(attendanceMonthly);
		attendanceImpl.setStatus(status);
		attendanceImpl.setApprover(approver);
		attendanceImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			attendanceImpl.setCreateDate(null);
		}
		else {
			attendanceImpl.setCreateDate(new Date(createDate));
		}

		attendanceImpl.setModifiedUserId(modifiedUserId);

		if (modifiedDate == Long.MIN_VALUE) {
			attendanceImpl.setModifiedDate(null);
		}
		else {
			attendanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		attendanceImpl.resetOriginalValues();

		return attendanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		shouldAttendance = objectInput.readDouble();
		actualAttendance = objectInput.readDouble();
		attendanceYear = objectInput.readLong();
		attendanceMonthly = objectInput.readLong();
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
		objectOutput.writeDouble(shouldAttendance);
		objectOutput.writeDouble(actualAttendance);
		objectOutput.writeLong(attendanceYear);
		objectOutput.writeLong(attendanceMonthly);
		objectOutput.writeInt(status);
		objectOutput.writeLong(approver);
		objectOutput.writeLong(createUserId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedUserId);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public double shouldAttendance;
	public double actualAttendance;
	public long attendanceYear;
	public long attendanceMonthly;
	public int status;
	public long approver;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}