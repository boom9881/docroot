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
 * This class is a wrapper for {@link Overtime}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Overtime
 * @generated
 */
public class OvertimeWrapper implements Overtime, ModelWrapper<Overtime> {
	public OvertimeWrapper(Overtime overtime) {
		_overtime = overtime;
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
		attributes.put("overtimeYear", getOvertimeYear());
		attributes.put("overtimeMonthly", getOvertimeMonthly());
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

		Long overtimeYear = (Long)attributes.get("overtimeYear");

		if (overtimeYear != null) {
			setOvertimeYear(overtimeYear);
		}

		Long overtimeMonthly = (Long)attributes.get("overtimeMonthly");

		if (overtimeMonthly != null) {
			setOvertimeMonthly(overtimeMonthly);
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

	/**
	* Returns the primary key of this overtime.
	*
	* @return the primary key of this overtime
	*/
	@Override
	public long getPrimaryKey() {
		return _overtime.getPrimaryKey();
	}

	/**
	* Sets the primary key of this overtime.
	*
	* @param primaryKey the primary key of this overtime
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_overtime.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this overtime.
	*
	* @return the ID of this overtime
	*/
	@Override
	public long getId() {
		return _overtime.getId();
	}

	/**
	* Sets the ID of this overtime.
	*
	* @param id the ID of this overtime
	*/
	@Override
	public void setId(long id) {
		_overtime.setId(id);
	}

	/**
	* Returns the user ID of this overtime.
	*
	* @return the user ID of this overtime
	*/
	@Override
	public long getUserId() {
		return _overtime.getUserId();
	}

	/**
	* Sets the user ID of this overtime.
	*
	* @param userId the user ID of this overtime
	*/
	@Override
	public void setUserId(long userId) {
		_overtime.setUserId(userId);
	}

	/**
	* Returns the user uuid of this overtime.
	*
	* @return the user uuid of this overtime
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _overtime.getUserUuid();
	}

	/**
	* Sets the user uuid of this overtime.
	*
	* @param userUuid the user uuid of this overtime
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_overtime.setUserUuid(userUuid);
	}

	/**
	* Returns the usually overtime of this overtime.
	*
	* @return the usually overtime of this overtime
	*/
	@Override
	public double getUsuallyOvertime() {
		return _overtime.getUsuallyOvertime();
	}

	/**
	* Sets the usually overtime of this overtime.
	*
	* @param usuallyOvertime the usually overtime of this overtime
	*/
	@Override
	public void setUsuallyOvertime(double usuallyOvertime) {
		_overtime.setUsuallyOvertime(usuallyOvertime);
	}

	/**
	* Returns the rest overtime of this overtime.
	*
	* @return the rest overtime of this overtime
	*/
	@Override
	public double getRestOvertime() {
		return _overtime.getRestOvertime();
	}

	/**
	* Sets the rest overtime of this overtime.
	*
	* @param restOvertime the rest overtime of this overtime
	*/
	@Override
	public void setRestOvertime(double restOvertime) {
		_overtime.setRestOvertime(restOvertime);
	}

	/**
	* Returns the legal overtime of this overtime.
	*
	* @return the legal overtime of this overtime
	*/
	@Override
	public double getLegalOvertime() {
		return _overtime.getLegalOvertime();
	}

	/**
	* Sets the legal overtime of this overtime.
	*
	* @param legalOvertime the legal overtime of this overtime
	*/
	@Override
	public void setLegalOvertime(double legalOvertime) {
		_overtime.setLegalOvertime(legalOvertime);
	}

	/**
	* Returns the overtime year of this overtime.
	*
	* @return the overtime year of this overtime
	*/
	@Override
	public long getOvertimeYear() {
		return _overtime.getOvertimeYear();
	}

	/**
	* Sets the overtime year of this overtime.
	*
	* @param overtimeYear the overtime year of this overtime
	*/
	@Override
	public void setOvertimeYear(long overtimeYear) {
		_overtime.setOvertimeYear(overtimeYear);
	}

	/**
	* Returns the overtime monthly of this overtime.
	*
	* @return the overtime monthly of this overtime
	*/
	@Override
	public long getOvertimeMonthly() {
		return _overtime.getOvertimeMonthly();
	}

	/**
	* Sets the overtime monthly of this overtime.
	*
	* @param overtimeMonthly the overtime monthly of this overtime
	*/
	@Override
	public void setOvertimeMonthly(long overtimeMonthly) {
		_overtime.setOvertimeMonthly(overtimeMonthly);
	}

	/**
	* Returns the status of this overtime.
	*
	* @return the status of this overtime
	*/
	@Override
	public int getStatus() {
		return _overtime.getStatus();
	}

	/**
	* Sets the status of this overtime.
	*
	* @param status the status of this overtime
	*/
	@Override
	public void setStatus(int status) {
		_overtime.setStatus(status);
	}

	/**
	* Returns the approver of this overtime.
	*
	* @return the approver of this overtime
	*/
	@Override
	public long getApprover() {
		return _overtime.getApprover();
	}

	/**
	* Sets the approver of this overtime.
	*
	* @param approver the approver of this overtime
	*/
	@Override
	public void setApprover(long approver) {
		_overtime.setApprover(approver);
	}

	/**
	* Returns the create user ID of this overtime.
	*
	* @return the create user ID of this overtime
	*/
	@Override
	public long getCreateUserId() {
		return _overtime.getCreateUserId();
	}

	/**
	* Sets the create user ID of this overtime.
	*
	* @param createUserId the create user ID of this overtime
	*/
	@Override
	public void setCreateUserId(long createUserId) {
		_overtime.setCreateUserId(createUserId);
	}

	/**
	* Returns the create user uuid of this overtime.
	*
	* @return the create user uuid of this overtime
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getCreateUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _overtime.getCreateUserUuid();
	}

	/**
	* Sets the create user uuid of this overtime.
	*
	* @param createUserUuid the create user uuid of this overtime
	*/
	@Override
	public void setCreateUserUuid(java.lang.String createUserUuid) {
		_overtime.setCreateUserUuid(createUserUuid);
	}

	/**
	* Returns the create date of this overtime.
	*
	* @return the create date of this overtime
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _overtime.getCreateDate();
	}

	/**
	* Sets the create date of this overtime.
	*
	* @param createDate the create date of this overtime
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_overtime.setCreateDate(createDate);
	}

	/**
	* Returns the modified user ID of this overtime.
	*
	* @return the modified user ID of this overtime
	*/
	@Override
	public long getModifiedUserId() {
		return _overtime.getModifiedUserId();
	}

	/**
	* Sets the modified user ID of this overtime.
	*
	* @param modifiedUserId the modified user ID of this overtime
	*/
	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_overtime.setModifiedUserId(modifiedUserId);
	}

	/**
	* Returns the modified user uuid of this overtime.
	*
	* @return the modified user uuid of this overtime
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getModifiedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _overtime.getModifiedUserUuid();
	}

	/**
	* Sets the modified user uuid of this overtime.
	*
	* @param modifiedUserUuid the modified user uuid of this overtime
	*/
	@Override
	public void setModifiedUserUuid(java.lang.String modifiedUserUuid) {
		_overtime.setModifiedUserUuid(modifiedUserUuid);
	}

	/**
	* Returns the modified date of this overtime.
	*
	* @return the modified date of this overtime
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _overtime.getModifiedDate();
	}

	/**
	* Sets the modified date of this overtime.
	*
	* @param modifiedDate the modified date of this overtime
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_overtime.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _overtime.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_overtime.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _overtime.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_overtime.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _overtime.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _overtime.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_overtime.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _overtime.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_overtime.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_overtime.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_overtime.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OvertimeWrapper((Overtime)_overtime.clone());
	}

	@Override
	public int compareTo(com.shuntian.portlet.intranet.model.Overtime overtime) {
		return _overtime.compareTo(overtime);
	}

	@Override
	public int hashCode() {
		return _overtime.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.shuntian.portlet.intranet.model.Overtime> toCacheModel() {
		return _overtime.toCacheModel();
	}

	@Override
	public com.shuntian.portlet.intranet.model.Overtime toEscapedModel() {
		return new OvertimeWrapper(_overtime.toEscapedModel());
	}

	@Override
	public com.shuntian.portlet.intranet.model.Overtime toUnescapedModel() {
		return new OvertimeWrapper(_overtime.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _overtime.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _overtime.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_overtime.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OvertimeWrapper)) {
			return false;
		}

		OvertimeWrapper overtimeWrapper = (OvertimeWrapper)obj;

		if (Validator.equals(_overtime, overtimeWrapper._overtime)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Overtime getWrappedOvertime() {
		return _overtime;
	}

	@Override
	public Overtime getWrappedModel() {
		return _overtime;
	}

	@Override
	public void resetOriginalValues() {
		_overtime.resetOriginalValues();
	}

	private Overtime _overtime;
}