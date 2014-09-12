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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.shuntian.portlet.intranet.model.Department;
import com.shuntian.portlet.intranet.model.DepartmentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Department service. Represents a row in the &quot;Intranet_Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.shuntian.portlet.intranet.model.DepartmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentImpl
 * @see com.shuntian.portlet.intranet.model.Department
 * @see com.shuntian.portlet.intranet.model.DepartmentModel
 * @generated
 */
public class DepartmentModelImpl extends BaseModelImpl<Department>
	implements DepartmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a department model instance should use the {@link com.shuntian.portlet.intranet.model.Department} interface instead.
	 */
	public static final String TABLE_NAME = "Intranet_Department";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "leader", Types.BIGINT },
			{ "createUserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedUserId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Intranet_Department (id_ LONG not null primary key,name VARCHAR(75) null,leader LONG,createUserId LONG,createDate DATE null,modifiedUserId LONG,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Intranet_Department";
	public static final String ORDER_BY_JPQL = " ORDER BY department.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Intranet_Department.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.shuntian.portlet.intranet.model.Department"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.shuntian.portlet.intranet.model.Department"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.shuntian.portlet.intranet.model.Department"),
			true);
	public static long NAME_COLUMN_BITMASK = 1L;
	public static long CREATEDATE_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.shuntian.portlet.intranet.model.Department"));

	public DepartmentModelImpl() {
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
		return Department.class;
	}

	@Override
	public String getModelClassName() {
		return Department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("leader", getLeader());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long leader = (Long)attributes.get("leader");

		if (leader != null) {
			setLeader(leader);
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
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public long getLeader() {
		return _leader;
	}

	@Override
	public void setLeader(long leader) {
		_leader = leader;
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
			Department.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Department toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Department)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setId(getId());
		departmentImpl.setName(getName());
		departmentImpl.setLeader(getLeader());
		departmentImpl.setCreateUserId(getCreateUserId());
		departmentImpl.setCreateDate(getCreateDate());
		departmentImpl.setModifiedUserId(getModifiedUserId());
		departmentImpl.setModifiedDate(getModifiedDate());

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public int compareTo(Department department) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), department.getCreateDate());

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

		if (!(obj instanceof Department)) {
			return false;
		}

		Department department = (Department)obj;

		long primaryKey = department.getPrimaryKey();

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
		DepartmentModelImpl departmentModelImpl = this;

		departmentModelImpl._originalName = departmentModelImpl._name;

		departmentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Department> toCacheModel() {
		DepartmentCacheModel departmentCacheModel = new DepartmentCacheModel();

		departmentCacheModel.id = getId();

		departmentCacheModel.name = getName();

		String name = departmentCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			departmentCacheModel.name = null;
		}

		departmentCacheModel.leader = getLeader();

		departmentCacheModel.createUserId = getCreateUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			departmentCacheModel.createDate = createDate.getTime();
		}
		else {
			departmentCacheModel.createDate = Long.MIN_VALUE;
		}

		departmentCacheModel.modifiedUserId = getModifiedUserId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			departmentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			departmentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return departmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", leader=");
		sb.append(getLeader());
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
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Department");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leader</column-name><column-value><![CDATA[");
		sb.append(getLeader());
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

	private static ClassLoader _classLoader = Department.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Department.class
		};
	private long _id;
	private String _name;
	private String _originalName;
	private long _leader;
	private long _createUserId;
	private String _createUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private long _columnBitmask;
	private Department _escapedModel;
}