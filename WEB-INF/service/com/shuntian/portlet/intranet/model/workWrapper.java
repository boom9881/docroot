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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link work}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see work
 * @generated
 */
public class workWrapper implements work, ModelWrapper<work> {
	public workWrapper(work work) {
		_work = work;
	}

	@Override
	public Class<?> getModelClass() {
		return work.class;
	}

	@Override
	public String getModelClassName() {
		return work.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("workId", getWorkId());
		attributes.put("satffId", getSatffId());
		attributes.put("witness", getWitness());
		attributes.put("once_job", getOnce_job());
		attributes.put("work_unit", getWork_unit());
		attributes.put("contact_phone", getContact_phone());
		attributes.put("start_stop_time", getStart_stop_time());
		attributes.put("companyId", getCompanyId());
		attributes.put("createuser", getCreateuser());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifieduser", getModifieduser());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long workId = (Long)attributes.get("workId");

		if (workId != null) {
			setWorkId(workId);
		}

		Long satffId = (Long)attributes.get("satffId");

		if (satffId != null) {
			setSatffId(satffId);
		}

		String witness = (String)attributes.get("witness");

		if (witness != null) {
			setWitness(witness);
		}

		String once_job = (String)attributes.get("once_job");

		if (once_job != null) {
			setOnce_job(once_job);
		}

		String work_unit = (String)attributes.get("work_unit");

		if (work_unit != null) {
			setWork_unit(work_unit);
		}

		String contact_phone = (String)attributes.get("contact_phone");

		if (contact_phone != null) {
			setContact_phone(contact_phone);
		}

		Date start_stop_time = (Date)attributes.get("start_stop_time");

		if (start_stop_time != null) {
			setStart_stop_time(start_stop_time);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createuser = (Long)attributes.get("createuser");

		if (createuser != null) {
			setCreateuser(createuser);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifieduser = (Long)attributes.get("modifieduser");

		if (modifieduser != null) {
			setModifieduser(modifieduser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this work.
	*
	* @return the primary key of this work
	*/
	@Override
	public long getPrimaryKey() {
		return _work.getPrimaryKey();
	}

	/**
	* Sets the primary key of this work.
	*
	* @param primaryKey the primary key of this work
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_work.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this work.
	*
	* @return the uuid of this work
	*/
	@Override
	public java.lang.String getUuid() {
		return _work.getUuid();
	}

	/**
	* Sets the uuid of this work.
	*
	* @param uuid the uuid of this work
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_work.setUuid(uuid);
	}

	/**
	* Returns the work ID of this work.
	*
	* @return the work ID of this work
	*/
	@Override
	public long getWorkId() {
		return _work.getWorkId();
	}

	/**
	* Sets the work ID of this work.
	*
	* @param workId the work ID of this work
	*/
	@Override
	public void setWorkId(long workId) {
		_work.setWorkId(workId);
	}

	/**
	* Returns the satff ID of this work.
	*
	* @return the satff ID of this work
	*/
	@Override
	public long getSatffId() {
		return _work.getSatffId();
	}

	/**
	* Sets the satff ID of this work.
	*
	* @param satffId the satff ID of this work
	*/
	@Override
	public void setSatffId(long satffId) {
		_work.setSatffId(satffId);
	}

	/**
	* Returns the witness of this work.
	*
	* @return the witness of this work
	*/
	@Override
	public java.lang.String getWitness() {
		return _work.getWitness();
	}

	/**
	* Sets the witness of this work.
	*
	* @param witness the witness of this work
	*/
	@Override
	public void setWitness(java.lang.String witness) {
		_work.setWitness(witness);
	}

	/**
	* Returns the once_job of this work.
	*
	* @return the once_job of this work
	*/
	@Override
	public java.lang.String getOnce_job() {
		return _work.getOnce_job();
	}

	/**
	* Sets the once_job of this work.
	*
	* @param once_job the once_job of this work
	*/
	@Override
	public void setOnce_job(java.lang.String once_job) {
		_work.setOnce_job(once_job);
	}

	/**
	* Returns the work_unit of this work.
	*
	* @return the work_unit of this work
	*/
	@Override
	public java.lang.String getWork_unit() {
		return _work.getWork_unit();
	}

	/**
	* Sets the work_unit of this work.
	*
	* @param work_unit the work_unit of this work
	*/
	@Override
	public void setWork_unit(java.lang.String work_unit) {
		_work.setWork_unit(work_unit);
	}

	/**
	* Returns the contact_phone of this work.
	*
	* @return the contact_phone of this work
	*/
	@Override
	public java.lang.String getContact_phone() {
		return _work.getContact_phone();
	}

	/**
	* Sets the contact_phone of this work.
	*
	* @param contact_phone the contact_phone of this work
	*/
	@Override
	public void setContact_phone(java.lang.String contact_phone) {
		_work.setContact_phone(contact_phone);
	}

	/**
	* Returns the start_stop_time of this work.
	*
	* @return the start_stop_time of this work
	*/
	@Override
	public java.util.Date getStart_stop_time() {
		return _work.getStart_stop_time();
	}

	/**
	* Sets the start_stop_time of this work.
	*
	* @param start_stop_time the start_stop_time of this work
	*/
	@Override
	public void setStart_stop_time(java.util.Date start_stop_time) {
		_work.setStart_stop_time(start_stop_time);
	}

	/**
	* Returns the company ID of this work.
	*
	* @return the company ID of this work
	*/
	@Override
	public long getCompanyId() {
		return _work.getCompanyId();
	}

	/**
	* Sets the company ID of this work.
	*
	* @param companyId the company ID of this work
	*/
	@Override
	public void setCompanyId(long companyId) {
		_work.setCompanyId(companyId);
	}

	/**
	* Returns the createuser of this work.
	*
	* @return the createuser of this work
	*/
	@Override
	public long getCreateuser() {
		return _work.getCreateuser();
	}

	/**
	* Sets the createuser of this work.
	*
	* @param createuser the createuser of this work
	*/
	@Override
	public void setCreateuser(long createuser) {
		_work.setCreateuser(createuser);
	}

	/**
	* Returns the create date of this work.
	*
	* @return the create date of this work
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _work.getCreateDate();
	}

	/**
	* Sets the create date of this work.
	*
	* @param createDate the create date of this work
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_work.setCreateDate(createDate);
	}

	/**
	* Returns the modifieduser of this work.
	*
	* @return the modifieduser of this work
	*/
	@Override
	public long getModifieduser() {
		return _work.getModifieduser();
	}

	/**
	* Sets the modifieduser of this work.
	*
	* @param modifieduser the modifieduser of this work
	*/
	@Override
	public void setModifieduser(long modifieduser) {
		_work.setModifieduser(modifieduser);
	}

	/**
	* Returns the modified date of this work.
	*
	* @return the modified date of this work
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _work.getModifiedDate();
	}

	/**
	* Sets the modified date of this work.
	*
	* @param modifiedDate the modified date of this work
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_work.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this work.
	*
	* @return the status of this work
	*/
	@Override
	public int getStatus() {
		return _work.getStatus();
	}

	/**
	* Returns the trash entry created when this work was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this work.
	*
	* @return the trash entry created when this work was moved to the Recycle Bin
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _work.getTrashEntry();
	}

	/**
	* Returns the class primary key of the trash entry for this work.
	*
	* @return the class primary key of the trash entry for this work
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _work.getTrashEntryClassPK();
	}

	/**
	* Returns the trash handler for this work.
	*
	* @return the trash handler for this work
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _work.getTrashHandler();
	}

	/**
	* Returns <code>true</code> if this work is in the Recycle Bin.
	*
	* @return <code>true</code> if this work is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _work.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this work is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this work is in the Recycle Bin; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean isInTrashContainer() {
		return _work.isInTrashContainer();
	}

	@Override
	public boolean isNew() {
		return _work.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_work.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _work.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_work.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _work.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _work.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_work.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _work.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_work.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_work.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_work.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new workWrapper((work)_work.clone());
	}

	@Override
	public int compareTo(work work) {
		return _work.compareTo(work);
	}

	@Override
	public int hashCode() {
		return _work.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<work> toCacheModel() {
		return _work.toCacheModel();
	}

	@Override
	public work toEscapedModel() {
		return new workWrapper(_work.toEscapedModel());
	}

	@Override
	public work toUnescapedModel() {
		return new workWrapper(_work.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _work.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _work.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_work.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof workWrapper)) {
			return false;
		}

		workWrapper workWrapper = (workWrapper)obj;

		if (Validator.equals(_work, workWrapper._work)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _work.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public work getWrappedwork() {
		return _work;
	}

	@Override
	public work getWrappedModel() {
		return _work;
	}

	@Override
	public void resetOriginalValues() {
		_work.resetOriginalValues();
	}

	private work _work;
}