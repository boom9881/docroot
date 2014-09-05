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

package com.shuntian.portlet.intranet.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Attendance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Attendance
 * @generated
 */
public class AttendanceWrapper implements Attendance, ModelWrapper<Attendance> {
	public AttendanceWrapper(Attendance attendance) {
		_attendance = attendance;
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
		attributes.put("attendanceMonthly", getAttendanceMonthly());
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

		Long attendanceMonthly = (Long)attributes.get("attendanceMonthly");

		if (attendanceMonthly != null) {
			setAttendanceMonthly(attendanceMonthly);
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

	/**
	* Returns the primary key of this attendance.
	*
	* @return the primary key of this attendance
	*/
	@Override
	public long getPrimaryKey() {
		return _attendance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this attendance.
	*
	* @param primaryKey the primary key of this attendance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_attendance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this attendance.
	*
	* @return the ID of this attendance
	*/
	@Override
	public long getId() {
		return _attendance.getId();
	}

	/**
	* Sets the ID of this attendance.
	*
	* @param id the ID of this attendance
	*/
	@Override
	public void setId(long id) {
		_attendance.setId(id);
	}

	/**
	* Returns the user ID of this attendance.
	*
	* @return the user ID of this attendance
	*/
	@Override
	public long getUserId() {
		return _attendance.getUserId();
	}

	/**
	* Sets the user ID of this attendance.
	*
	* @param userId the user ID of this attendance
	*/
	@Override
	public void setUserId(long userId) {
		_attendance.setUserId(userId);
	}

	/**
	* Returns the user uuid of this attendance.
	*
	* @return the user uuid of this attendance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendance.getUserUuid();
	}

	/**
	* Sets the user uuid of this attendance.
	*
	* @param userUuid the user uuid of this attendance
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_attendance.setUserUuid(userUuid);
	}

	/**
	* Returns the should attendance of this attendance.
	*
	* @return the should attendance of this attendance
	*/
	@Override
	public double getShouldAttendance() {
		return _attendance.getShouldAttendance();
	}

	/**
	* Sets the should attendance of this attendance.
	*
	* @param shouldAttendance the should attendance of this attendance
	*/
	@Override
	public void setShouldAttendance(double shouldAttendance) {
		_attendance.setShouldAttendance(shouldAttendance);
	}

	/**
	* Returns the actual attendance of this attendance.
	*
	* @return the actual attendance of this attendance
	*/
	@Override
	public double getActualAttendance() {
		return _attendance.getActualAttendance();
	}

	/**
	* Sets the actual attendance of this attendance.
	*
	* @param actualAttendance the actual attendance of this attendance
	*/
	@Override
	public void setActualAttendance(double actualAttendance) {
		_attendance.setActualAttendance(actualAttendance);
	}

	/**
	* Returns the attendance monthly of this attendance.
	*
	* @return the attendance monthly of this attendance
	*/
	@Override
	public long getAttendanceMonthly() {
		return _attendance.getAttendanceMonthly();
	}

	/**
	* Sets the attendance monthly of this attendance.
	*
	* @param attendanceMonthly the attendance monthly of this attendance
	*/
	@Override
	public void setAttendanceMonthly(long attendanceMonthly) {
		_attendance.setAttendanceMonthly(attendanceMonthly);
	}

	/**
	* Returns the create user ID of this attendance.
	*
	* @return the create user ID of this attendance
	*/
	@Override
	public long getCreateUserId() {
		return _attendance.getCreateUserId();
	}

	/**
	* Sets the create user ID of this attendance.
	*
	* @param createUserId the create user ID of this attendance
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_attendance.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this attendance.
	*
	* @return the create user uuid of this attendance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendance.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this attendance.
	*
	* @param createUserUuid the create user uuid of this attendance
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_attendance.setCreateUserUuid(createUserUuid);
	}

	/**
	* Returns the create date of this attendance.
	*
	* @return the create date of this attendance
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _attendance.getCreateDate();
	}

	/**
	* Sets the create date of this attendance.
	*
	* @param createDate the create date of this attendance
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_attendance.setCreateDate(createDate);
	}

	/**
	* Returns the modified user ID of this attendance.
	*
	* @return the modified user ID of this attendance
	*/
	@Override
	public long getModifiedUserId() {
		return _attendance.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this attendance.
	*
	* @param modifiedUserId the modified user ID of this attendance
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_attendance.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this attendance.
	*
	* @return the modified user uuid of this attendance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attendance.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this attendance.
	*
	* @param modifiedUserUuid the modified user uuid of this attendance
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_attendance.setModifiedUserUuid(modifiedUserUuid);
	}

	/**
	* Returns the modified date of this attendance.
	*
	* @return the modified date of this attendance
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _attendance.getModifiedDate();
	}

	/**
	* Sets the modified date of this attendance.
	*
	* @param modifiedDate the modified date of this attendance
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_attendance.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _attendance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_attendance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _attendance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attendance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _attendance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _attendance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_attendance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _attendance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_attendance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_attendance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_attendance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AttendanceWrapper((Attendance)_attendance.clone());
	}

	@Override
	public int compareTo(Attendance attendance) {
		return _attendance.compareTo(attendance);
	}

	@Override
	public int hashCode() {
		return _attendance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Attendance> toCacheModel() {
		return _attendance.toCacheModel();
	}

	@Override
	public Attendance toEscapedModel() {
		return new AttendanceWrapper(_attendance.toEscapedModel());
	}

	@Override
	public Attendance toUnescapedModel() {
		return new AttendanceWrapper(_attendance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _attendance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attendance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_attendance.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttendanceWrapper)) {
			return false;
		}

		AttendanceWrapper attendanceWrapper = (AttendanceWrapper)obj;

		if (Validator.equals(_attendance, attendanceWrapper._attendance)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Attendance getWrappedAttendance() {
		return _attendance;
	}

	@Override
	public Attendance getWrappedModel() {
		return _attendance;
	}

	@Override
	public void resetOriginalValues() {
		_attendance.resetOriginalValues();
	}

	private Attendance _attendance;
}