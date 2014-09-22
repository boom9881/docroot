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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.AttendanceModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Attendance service. Represents a row in the &quot;Intranet_Attendance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.shuntian.portlet.intranet.model.AttendanceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttendanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendanceImpl
 * @see com.shuntian.portlet.intranet.model.Attendance
 * @see com.shuntian.portlet.intranet.model.AttendanceModel
 * @generated
 */
public class AttendanceModelImpl extends BaseModelImpl<Attendance>
	implements AttendanceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attendance model instance should use the {@link com.shuntian.portlet.intranet.model.Attendance} interface instead.
	 */
	public static final String TABLE_NAME = "Intranet_Attendance";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "shouldAttendance", Types.DOUBLE },
			{ "actualAttendance", Types.DOUBLE },
			{ "attendanceYear", Types.BIGINT },
			{ "attendanceMonthly", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "approver", Types.BIGINT },
			{ "createUserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedUserId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Intranet_Attendance (id_ LONG not null primary key,userId LONG,shouldAttendance DOUBLE,actualAttendance DOUBLE,attendanceYear LONG,attendanceMonthly LONG,status INTEGER,approver LONG,createUserId LONG,createDate DATE null,modifiedUserId LONG,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Intranet_Attendance";
	public static final String ORDER_BY_JPQL = " ORDER BY attendance.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Intranet_Attendance.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.shuntian.portlet.intranet.model.Attendance"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.shuntian.portlet.intranet.model.Attendance"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.shuntian.portlet.intranet.model.Attendance"),
			true);
	public static long ATTENDANCEMONTHLY_COLUMN_BITMASK = 1L;
	public static long ATTENDANCEYEAR_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static long CREATEDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.shuntian.portlet.intranet.model.Attendance"));

	public AttendanceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Attendance.class;
	}

	@Override
	public String getModelClassName() {
		return Attendance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("shouldAttendance", getShouldAttendance());
		attributes.put("actualAttendance", getActualAttendance());
		attributes.put("attendanceYear", getAttendanceYear());
		attributes.put("attendanceMonthly", getAttendanceMonthly());
		attributes.put("status", getStatus());
		attributes.put("approver", getApprover());
		attributes.put("createUserId", getCreateUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedUserId", getModifiedUserId());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Double shouldAttendance = (Double)attributes.get("shouldAttendance");

		if (shouldAttendance != null) {
			setShouldAttendance(shouldAttendance);
		}

		Double actualAttendance = (Double)attributes.get("actualAttendance");

		if (actualAttendance != null) {
			setActualAttendance(actualAttendance);
		}

		Long attendanceYear = (Long)attributes.get("attendanceYear");

		if (attendanceYear != null) {
			setAttendanceYear(attendanceYear);
		}

		Long attendanceMonthly = (Long)attributes.get("attendanceMonthly");

		if (attendanceMonthly != null) {
			setAttendanceMonthly(attendanceMonthly);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long approver = (Long)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		Long createUserId = (Long)attributes.get("createUserId");

		if (createUserId != null) {
			setCreateUserId(createUserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifiedUserId = (Long)attributes.get("modifiedUserId");

		if (modifiedUserId != null) {
			setModifiedUserId(modifiedUserId);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public double getShouldAttendance() {
		return _shouldAttendance;
	}

	@Override
	public void setShouldAttendance(double shouldAttendance) {
		_shouldAttendance = shouldAttendance;
	}

	@Override
	public double getActualAttendance() {
		return _actualAttendance;
	}

	@Override
	public void setActualAttendance(double actualAttendance) {
		_actualAttendance = actualAttendance;
	}

	@Override
	public long getAttendanceYear() {
		return _attendanceYear;
	}

	@Override
	public void setAttendanceYear(long attendanceYear) {
		_columnBitmask |= ATTENDANCEYEAR_COLUMN_BITMASK;

		if (!_setOriginalAttendanceYear) {
			_setOriginalAttendanceYear = true;

			_originalAttendanceYear = _attendanceYear;
		}

		_attendanceYear = attendanceYear;
	}

	public long getOriginalAttendanceYear() {
		return _originalAttendanceYear;
	}

	@Override
	public long getAttendanceMonthly() {
		return _attendanceMonthly;
	}

	@Override
	public void setAttendanceMonthly(long attendanceMonthly) {
		_columnBitmask |= ATTENDANCEMONTHLY_COLUMN_BITMASK;

		if (!_setOriginalAttendanceMonthly) {
			_setOriginalAttendanceMonthly = true;

			_originalAttendanceMonthly = _attendanceMonthly;
		}

		_attendanceMonthly = attendanceMonthly;
	}

	public long getOriginalAttendanceMonthly() {
		return _originalAttendanceMonthly;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public long getApprover() {
		return _approver;
	}

	@Override
	public void setApprover(long approver) {
		_approver = approver;
	}

	@Override
	public long getCreateUserId() {
		return _createUserId;
	}

	@Override
	public void setCreateUserId(long createUserId) {
		_createUserId = createUserId;
	}

	@Override
	public String getCreateUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCreateUserId(), "uuid",
			_createUserUuid);
	}

	@Override
	public void setCreateUserUuid(String createUserUuid) {
		_createUserUuid = createUserUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;
	}

	@Override
	public String getModifiedUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getModifiedUserId(), "uuid",
			_modifiedUserUuid);
	}

	@Override
	public void setModifiedUserUuid(String modifiedUserUuid) {
		_modifiedUserUuid = modifiedUserUuid;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Attendance.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Attendance toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Attendance)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AttendanceImpl attendanceImpl = new AttendanceImpl();

		attendanceImpl.setId(getId());
		attendanceImpl.setUserId(getUserId());
		attendanceImpl.setShouldAttendance(getShouldAttendance());
		attendanceImpl.setActualAttendance(getActualAttendance());
		attendanceImpl.setAttendanceYear(getAttendanceYear());
		attendanceImpl.setAttendanceMonthly(getAttendanceMonthly());
		attendanceImpl.setStatus(getStatus());
		attendanceImpl.setApprover(getApprover());
		attendanceImpl.setCreateUserId(getCreateUserId());
		attendanceImpl.setCreateDate(getCreateDate());
		attendanceImpl.setModifiedUserId(getModifiedUserId());
		attendanceImpl.setModifiedDate(getModifiedDate());

		attendanceImpl.resetOriginalValues();

		return attendanceImpl;
	}

	@Override
	public int compareTo(Attendance attendance) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), attendance.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Attendance)) {
			return false;
		}

		Attendance attendance = (Attendance)obj;

		long primaryKey = attendance.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		AttendanceModelImpl attendanceModelImpl = this;

		attendanceModelImpl._originalUserId = attendanceModelImpl._userId;

		attendanceModelImpl._setOriginalUserId = false;

		attendanceModelImpl._originalAttendanceYear = attendanceModelImpl._attendanceYear;

		attendanceModelImpl._setOriginalAttendanceYear = false;

		attendanceModelImpl._originalAttendanceMonthly = attendanceModelImpl._attendanceMonthly;

		attendanceModelImpl._setOriginalAttendanceMonthly = false;

		attendanceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Attendance> toCacheModel() {
		AttendanceCacheModel attendanceCacheModel = new AttendanceCacheModel();

		attendanceCacheModel.id = getId();

		attendanceCacheModel.userId = getUserId();

		attendanceCacheModel.shouldAttendance = getShouldAttendance();

		attendanceCacheModel.actualAttendance = getActualAttendance();

		attendanceCacheModel.attendanceYear = getAttendanceYear();

		attendanceCacheModel.attendanceMonthly = getAttendanceMonthly();

		attendanceCacheModel.status = getStatus();

		attendanceCacheModel.approver = getApprover();

		attendanceCacheModel.createUserId = getCreateUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			attendanceCacheModel.createDate = createDate.getTime();
		}
		else {
			attendanceCacheModel.createDate = Long.MIN_VALUE;
		}

		attendanceCacheModel.modifiedUserId = getModifiedUserId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			attendanceCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			attendanceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return attendanceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", shouldAttendance=");
		sb.append(getShouldAttendance());
		sb.append(", actualAttendance=");
		sb.append(getActualAttendance());
		sb.append(", attendanceYear=");
		sb.append(getAttendanceYear());
		sb.append(", attendanceMonthly=");
		sb.append(getAttendanceMonthly());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", approver=");
		sb.append(getApprover());
		sb.append(", createUserId=");
		sb.append(getCreateUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedUserId=");
		sb.append(getModifiedUserId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Attendance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shouldAttendance</column-name><column-value><![CDATA[");
		sb.append(getShouldAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actualAttendance</column-name><column-value><![CDATA[");
		sb.append(getActualAttendance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attendanceYear</column-name><column-value><![CDATA[");
		sb.append(getAttendanceYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attendanceMonthly</column-name><column-value><![CDATA[");
		sb.append(getAttendanceMonthly());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approver</column-name><column-value><![CDATA[");
		sb.append(getApprover());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createUserId</column-name><column-value><![CDATA[");
		sb.append(getCreateUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUserId</column-name><column-value><![CDATA[");
		sb.append(getModifiedUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Attendance.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Attendance.class
		};
	private long _id;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private double _shouldAttendance;
	private double _actualAttendance;
	private long _attendanceYear;
	private long _originalAttendanceYear;
	private boolean _setOriginalAttendanceYear;
	private long _attendanceMonthly;
	private long _originalAttendanceMonthly;
	private boolean _setOriginalAttendanceMonthly;
	private int _status;
	private long _approver;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private long _columnBitmask;
	private Attendance _escapedModel;
}