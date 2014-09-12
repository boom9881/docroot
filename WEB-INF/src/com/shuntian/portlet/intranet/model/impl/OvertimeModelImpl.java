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

import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.model.OvertimeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Overtime service. Represents a row in the &quot;Intranet_Overtime&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.shuntian.portlet.intranet.model.OvertimeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OvertimeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OvertimeImpl
 * @see com.shuntian.portlet.intranet.model.Overtime
 * @see com.shuntian.portlet.intranet.model.OvertimeModel
 * @generated
 */
public class OvertimeModelImpl extends BaseModelImpl<Overtime>
	implements OvertimeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a overtime model instance should use the {@link com.shuntian.portlet.intranet.model.Overtime} interface instead.
	 */
	public static final String TABLE_NAME = "Intranet_Overtime";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "usuallyOvertime", Types.DOUBLE },
			{ "restOvertime", Types.DOUBLE },
			{ "legalOvertime", Types.DOUBLE },
			{ "overtimeMonthly", Types.BIGINT },
			{ "createUserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedUserId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Intranet_Overtime (id_ LONG not null primary key,userId LONG,usuallyOvertime DOUBLE,restOvertime DOUBLE,legalOvertime DOUBLE,overtimeMonthly LONG,createUserId LONG,createDate DATE null,modifiedUserId LONG,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Intranet_Overtime";
	public static final String ORDER_BY_JPQL = " ORDER BY overtime.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Intranet_Overtime.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.shuntian.portlet.intranet.model.Overtime"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.shuntian.portlet.intranet.model.Overtime"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.shuntian.portlet.intranet.model.Overtime"),
			true);
	public static long OVERTIMEMONTHLY_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long CREATEDATE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.shuntian.portlet.intranet.model.Overtime"));

	public OvertimeModelImpl() {
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
		return Overtime.class;
	}

	@Override
	public String getModelClassName() {
		return Overtime.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("usuallyOvertime", getUsuallyOvertime());
		attributes.put("restOvertime", getRestOvertime());
		attributes.put("legalOvertime", getLegalOvertime());
		attributes.put("overtimeMonthly", getOvertimeMonthly());
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

		Double usuallyOvertime = (Double)attributes.get("usuallyOvertime");

		if (usuallyOvertime != null) {
			setUsuallyOvertime(usuallyOvertime);
		}

		Double restOvertime = (Double)attributes.get("restOvertime");

		if (restOvertime != null) {
			setRestOvertime(restOvertime);
		}

		Double legalOvertime = (Double)attributes.get("legalOvertime");

		if (legalOvertime != null) {
			setLegalOvertime(legalOvertime);
		}

		Long overtimeMonthly = (Long)attributes.get("overtimeMonthly");

		if (overtimeMonthly != null) {
			setOvertimeMonthly(overtimeMonthly);
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
	public double getUsuallyOvertime() {
		return _usuallyOvertime;
	}

	@Override
	public void setUsuallyOvertime(double usuallyOvertime) {
		_usuallyOvertime = usuallyOvertime;
	}

	@Override
	public double getRestOvertime() {
		return _restOvertime;
	}

	@Override
	public void setRestOvertime(double restOvertime) {
		_restOvertime = restOvertime;
	}

	@Override
	public double getLegalOvertime() {
		return _legalOvertime;
	}

	@Override
	public void setLegalOvertime(double legalOvertime) {
		_legalOvertime = legalOvertime;
	}

	@Override
	public long getOvertimeMonthly() {
		return _overtimeMonthly;
	}

	@Override
	public void setOvertimeMonthly(long overtimeMonthly) {
		_columnBitmask |= OVERTIMEMONTHLY_COLUMN_BITMASK;

		if (!_setOriginalOvertimeMonthly) {
			_setOriginalOvertimeMonthly = true;

			_originalOvertimeMonthly = _overtimeMonthly;
		}

		_overtimeMonthly = overtimeMonthly;
	}

	public long getOriginalOvertimeMonthly() {
		return _originalOvertimeMonthly;
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
			Overtime.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Overtime toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Overtime)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OvertimeImpl overtimeImpl = new OvertimeImpl();

		overtimeImpl.setId(getId());
		overtimeImpl.setUserId(getUserId());
		overtimeImpl.setUsuallyOvertime(getUsuallyOvertime());
		overtimeImpl.setRestOvertime(getRestOvertime());
		overtimeImpl.setLegalOvertime(getLegalOvertime());
		overtimeImpl.setOvertimeMonthly(getOvertimeMonthly());
		overtimeImpl.setCreateUserId(getCreateUserId());
		overtimeImpl.setCreateDate(getCreateDate());
		overtimeImpl.setModifiedUserId(getModifiedUserId());
		overtimeImpl.setModifiedDate(getModifiedDate());

		overtimeImpl.resetOriginalValues();

		return overtimeImpl;
	}

	@Override
	public int compareTo(Overtime overtime) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), overtime.getCreateDate());

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

		if (!(obj instanceof Overtime)) {
			return false;
		}

		Overtime overtime = (Overtime)obj;

		long primaryKey = overtime.getPrimaryKey();

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
		OvertimeModelImpl overtimeModelImpl = this;

		overtimeModelImpl._originalUserId = overtimeModelImpl._userId;

		overtimeModelImpl._setOriginalUserId = false;

		overtimeModelImpl._originalOvertimeMonthly = overtimeModelImpl._overtimeMonthly;

		overtimeModelImpl._setOriginalOvertimeMonthly = false;

		overtimeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Overtime> toCacheModel() {
		OvertimeCacheModel overtimeCacheModel = new OvertimeCacheModel();

		overtimeCacheModel.id = getId();

		overtimeCacheModel.userId = getUserId();

		overtimeCacheModel.usuallyOvertime = getUsuallyOvertime();

		overtimeCacheModel.restOvertime = getRestOvertime();

		overtimeCacheModel.legalOvertime = getLegalOvertime();

		overtimeCacheModel.overtimeMonthly = getOvertimeMonthly();

		overtimeCacheModel.createUserId = getCreateUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			overtimeCacheModel.createDate = createDate.getTime();
		}
		else {
			overtimeCacheModel.createDate = Long.MIN_VALUE;
		}

		overtimeCacheModel.modifiedUserId = getModifiedUserId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			overtimeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			overtimeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return overtimeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", usuallyOvertime=");
		sb.append(getUsuallyOvertime());
		sb.append(", restOvertime=");
		sb.append(getRestOvertime());
		sb.append(", legalOvertime=");
		sb.append(getLegalOvertime());
		sb.append(", overtimeMonthly=");
		sb.append(getOvertimeMonthly());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Overtime");
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
			"<column><column-name>usuallyOvertime</column-name><column-value><![CDATA[");
		sb.append(getUsuallyOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>restOvertime</column-name><column-value><![CDATA[");
		sb.append(getRestOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>legalOvertime</column-name><column-value><![CDATA[");
		sb.append(getLegalOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeMonthly</column-name><column-value><![CDATA[");
		sb.append(getOvertimeMonthly());
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

	private static ClassLoader _classLoader = Overtime.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Overtime.class
		};
	private long _id;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private double _usuallyOvertime;
	private double _restOvertime;
	private double _legalOvertime;
	private long _overtimeMonthly;
	private long _originalOvertimeMonthly;
	private boolean _setOriginalOvertimeMonthly;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private long _columnBitmask;
	private Overtime _escapedModel;
}