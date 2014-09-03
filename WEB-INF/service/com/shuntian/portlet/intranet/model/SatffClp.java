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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.SatffLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class SatffClp extends BaseModelImpl<Satff> implements Satff {
	public SatffClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Satff.class;
	}

	@Override
	public String getModelClassName() {
		return Satff.class.getName();
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("city", getCity());
		attributes.put("name", getName());
		attributes.put("turnover_time", getTurnover_time());
		attributes.put("entry_time", getEntry_time());
		attributes.put("base_pay", getBase_pay());
		attributes.put("performance_pay", getPerformance_pay());
		attributes.put("wage_subtotal", getWage_subtotal());
		attributes.put("insurance_base", getInsurance_base());
		attributes.put("endowment_insurance", getEndowment_insurance());
		attributes.put("unemployment_insurance", getUnemployment_insurance());
		attributes.put("work_injury_insurance", getWork_injury_insurance());
		attributes.put("birth_insurance", getBirth_insurance());
		attributes.put("medical_insurance", getMedical_insurance());
		attributes.put("individual_insurance", getIndividual_insurance());
		attributes.put("housing_accumulation_fund_base",
			getHousing_accumulation_fund_base());
		attributes.put("individual_pay", getIndividual_pay());
		attributes.put("amount_payable", getAmount_payable());
		attributes.put("people_together", getPeople_together());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date turnover_time = (Date)attributes.get("turnover_time");

		if (turnover_time != null) {
			setTurnover_time(turnover_time);
		}

		Date entry_time = (Date)attributes.get("entry_time");

		if (entry_time != null) {
			setEntry_time(entry_time);
		}

		Double base_pay = (Double)attributes.get("base_pay");

		if (base_pay != null) {
			setBase_pay(base_pay);
		}

		Double performance_pay = (Double)attributes.get("performance_pay");

		if (performance_pay != null) {
			setPerformance_pay(performance_pay);
		}

		Double wage_subtotal = (Double)attributes.get("wage_subtotal");

		if (wage_subtotal != null) {
			setWage_subtotal(wage_subtotal);
		}

		Double insurance_base = (Double)attributes.get("insurance_base");

		if (insurance_base != null) {
			setInsurance_base(insurance_base);
		}

		Double endowment_insurance = (Double)attributes.get(
				"endowment_insurance");

		if (endowment_insurance != null) {
			setEndowment_insurance(endowment_insurance);
		}

		Double unemployment_insurance = (Double)attributes.get(
				"unemployment_insurance");

		if (unemployment_insurance != null) {
			setUnemployment_insurance(unemployment_insurance);
		}

		Double work_injury_insurance = (Double)attributes.get(
				"work_injury_insurance");

		if (work_injury_insurance != null) {
			setWork_injury_insurance(work_injury_insurance);
		}

		Double birth_insurance = (Double)attributes.get("birth_insurance");

		if (birth_insurance != null) {
			setBirth_insurance(birth_insurance);
		}

		Double medical_insurance = (Double)attributes.get("medical_insurance");

		if (medical_insurance != null) {
			setMedical_insurance(medical_insurance);
		}

		Double individual_insurance = (Double)attributes.get(
				"individual_insurance");

		if (individual_insurance != null) {
			setIndividual_insurance(individual_insurance);
		}

		Double housing_accumulation_fund_base = (Double)attributes.get(
				"housing_accumulation_fund_base");

		if (housing_accumulation_fund_base != null) {
			setHousing_accumulation_fund_base(housing_accumulation_fund_base);
		}

		Double individual_pay = (Double)attributes.get("individual_pay");

		if (individual_pay != null) {
			setIndividual_pay(individual_pay);
		}

		Double amount_payable = (Double)attributes.get("amount_payable");

		if (amount_payable != null) {
			setAmount_payable(amount_payable);
		}

		Double people_together = (Double)attributes.get("people_together");

		if (people_together != null) {
			setPeople_together(people_together);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_satffRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_satffRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_user_id = user_id;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_satffRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity() {
		return _city;
	}

	@Override
	public void setCity(String city) {
		_city = city;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_satffRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_satffRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTurnover_time() {
		return _turnover_time;
	}

	@Override
	public void setTurnover_time(Date turnover_time) {
		_turnover_time = turnover_time;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setTurnover_time", Date.class);

				method.invoke(_satffRemoteModel, turnover_time);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEntry_time() {
		return _entry_time;
	}

	@Override
	public void setEntry_time(Date entry_time) {
		_entry_time = entry_time;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setEntry_time", Date.class);

				method.invoke(_satffRemoteModel, entry_time);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBase_pay() {
		return _base_pay;
	}

	@Override
	public void setBase_pay(double base_pay) {
		_base_pay = base_pay;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setBase_pay", double.class);

				method.invoke(_satffRemoteModel, base_pay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPerformance_pay() {
		return _performance_pay;
	}

	@Override
	public void setPerformance_pay(double performance_pay) {
		_performance_pay = performance_pay;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformance_pay",
						double.class);

				method.invoke(_satffRemoteModel, performance_pay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getWage_subtotal() {
		return _wage_subtotal;
	}

	@Override
	public void setWage_subtotal(double wage_subtotal) {
		_wage_subtotal = wage_subtotal;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setWage_subtotal", double.class);

				method.invoke(_satffRemoteModel, wage_subtotal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getInsurance_base() {
		return _insurance_base;
	}

	@Override
	public void setInsurance_base(double insurance_base) {
		_insurance_base = insurance_base;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setInsurance_base",
						double.class);

				method.invoke(_satffRemoteModel, insurance_base);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEndowment_insurance() {
		return _endowment_insurance;
	}

	@Override
	public void setEndowment_insurance(double endowment_insurance) {
		_endowment_insurance = endowment_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setEndowment_insurance",
						double.class);

				method.invoke(_satffRemoteModel, endowment_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnemployment_insurance() {
		return _unemployment_insurance;
	}

	@Override
	public void setUnemployment_insurance(double unemployment_insurance) {
		_unemployment_insurance = unemployment_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setUnemployment_insurance",
						double.class);

				method.invoke(_satffRemoteModel, unemployment_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getWork_injury_insurance() {
		return _work_injury_insurance;
	}

	@Override
	public void setWork_injury_insurance(double work_injury_insurance) {
		_work_injury_insurance = work_injury_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setWork_injury_insurance",
						double.class);

				method.invoke(_satffRemoteModel, work_injury_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBirth_insurance() {
		return _birth_insurance;
	}

	@Override
	public void setBirth_insurance(double birth_insurance) {
		_birth_insurance = birth_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setBirth_insurance",
						double.class);

				method.invoke(_satffRemoteModel, birth_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMedical_insurance() {
		return _medical_insurance;
	}

	@Override
	public void setMedical_insurance(double medical_insurance) {
		_medical_insurance = medical_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setMedical_insurance",
						double.class);

				method.invoke(_satffRemoteModel, medical_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getIndividual_insurance() {
		return _individual_insurance;
	}

	@Override
	public void setIndividual_insurance(double individual_insurance) {
		_individual_insurance = individual_insurance;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setIndividual_insurance",
						double.class);

				method.invoke(_satffRemoteModel, individual_insurance);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getHousing_accumulation_fund_base() {
		return _housing_accumulation_fund_base;
	}

	@Override
	public void setHousing_accumulation_fund_base(
		double housing_accumulation_fund_base) {
		_housing_accumulation_fund_base = housing_accumulation_fund_base;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setHousing_accumulation_fund_base",
						double.class);

				method.invoke(_satffRemoteModel, housing_accumulation_fund_base);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getIndividual_pay() {
		return _individual_pay;
	}

	@Override
	public void setIndividual_pay(double individual_pay) {
		_individual_pay = individual_pay;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setIndividual_pay",
						double.class);

				method.invoke(_satffRemoteModel, individual_pay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount_payable() {
		return _amount_payable;
	}

	@Override
	public void setAmount_payable(double amount_payable) {
		_amount_payable = amount_payable;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount_payable",
						double.class);

				method.invoke(_satffRemoteModel, amount_payable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPeople_together() {
		return _people_together;
	}

	@Override
	public void setPeople_together(double people_together) {
		_people_together = people_together;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setPeople_together",
						double.class);

				method.invoke(_satffRemoteModel, people_together);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_satffRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_satffRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_satffRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_satffRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_satffRemoteModel != null) {
			try {
				Class<?> clazz = _satffRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_satffRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Satff.class.getName()));
	}

	@Override
	public int getStatus() {
		return 0;
	}

	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException {
		if (!isInTrash()) {
			return null;
		}

		TrashEntry trashEntry = TrashEntryLocalServiceUtil.fetchEntry(getModelClassName(),
				getTrashEntryClassPK());

		if (trashEntry != null) {
			return trashEntry;
		}

		TrashHandler trashHandler = getTrashHandler();

		if (!Validator.isNull(trashHandler.getContainerModelClassName())) {
			ContainerModel containerModel = trashHandler.getParentContainerModel(this);

			while (containerModel != null) {
				if (containerModel instanceof TrashedModel) {
					TrashedModel trashedModel = (TrashedModel)containerModel;

					return trashedModel.getTrashEntry();
				}

				trashHandler = TrashHandlerRegistryUtil.getTrashHandler(trashHandler.getContainerModelClassName());

				if (trashHandler == null) {
					return null;
				}

				containerModel = trashHandler.getContainerModel(containerModel.getParentContainerModelId());
			}
		}

		return null;
	}

	@Override
	public long getTrashEntryClassPK() {
		return getPrimaryKey();
	}

	@Override
	public TrashHandler getTrashHandler() {
		return TrashHandlerRegistryUtil.getTrashHandler(getModelClassName());
	}

	@Override
	public boolean isInTrash() {
		if (getStatus() == WorkflowConstants.STATUS_IN_TRASH) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInTrashContainer() {
		TrashHandler trashHandler = getTrashHandler();

		if ((trashHandler == null) ||
				Validator.isNull(trashHandler.getContainerModelClassName())) {
			return false;
		}

		try {
			ContainerModel containerModel = trashHandler.getParentContainerModel(this);

			if (containerModel == null) {
				return false;
			}

			if (containerModel instanceof TrashedModel) {
				return ((TrashedModel)containerModel).isInTrash();
			}
		}
		catch (Exception e) {
		}

		return false;
	}

	public BaseModel<?> getSatffRemoteModel() {
		return _satffRemoteModel;
	}

	public void setSatffRemoteModel(BaseModel<?> satffRemoteModel) {
		_satffRemoteModel = satffRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _satffRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_satffRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SatffLocalServiceUtil.addSatff(this);
		}
		else {
			SatffLocalServiceUtil.updateSatff(this);
		}
	}

	@Override
	public Satff toEscapedModel() {
		return (Satff)ProxyUtil.newProxyInstance(Satff.class.getClassLoader(),
			new Class[] { Satff.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SatffClp clone = new SatffClp();

		clone.setUuid(getUuid());
		clone.setId(getId());
		clone.setUser_id(getUser_id());
		clone.setCity(getCity());
		clone.setName(getName());
		clone.setTurnover_time(getTurnover_time());
		clone.setEntry_time(getEntry_time());
		clone.setBase_pay(getBase_pay());
		clone.setPerformance_pay(getPerformance_pay());
		clone.setWage_subtotal(getWage_subtotal());
		clone.setInsurance_base(getInsurance_base());
		clone.setEndowment_insurance(getEndowment_insurance());
		clone.setUnemployment_insurance(getUnemployment_insurance());
		clone.setWork_injury_insurance(getWork_injury_insurance());
		clone.setBirth_insurance(getBirth_insurance());
		clone.setMedical_insurance(getMedical_insurance());
		clone.setIndividual_insurance(getIndividual_insurance());
		clone.setHousing_accumulation_fund_base(getHousing_accumulation_fund_base());
		clone.setIndividual_pay(getIndividual_pay());
		clone.setAmount_payable(getAmount_payable());
		clone.setPeople_together(getPeople_together());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(Satff satff) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), satff.getCreateDate());

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

		if (!(obj instanceof SatffClp)) {
			return false;
		}

		SatffClp satff = (SatffClp)obj;

		long primaryKey = satff.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", turnover_time=");
		sb.append(getTurnover_time());
		sb.append(", entry_time=");
		sb.append(getEntry_time());
		sb.append(", base_pay=");
		sb.append(getBase_pay());
		sb.append(", performance_pay=");
		sb.append(getPerformance_pay());
		sb.append(", wage_subtotal=");
		sb.append(getWage_subtotal());
		sb.append(", insurance_base=");
		sb.append(getInsurance_base());
		sb.append(", endowment_insurance=");
		sb.append(getEndowment_insurance());
		sb.append(", unemployment_insurance=");
		sb.append(getUnemployment_insurance());
		sb.append(", work_injury_insurance=");
		sb.append(getWork_injury_insurance());
		sb.append(", birth_insurance=");
		sb.append(getBirth_insurance());
		sb.append(", medical_insurance=");
		sb.append(getMedical_insurance());
		sb.append(", individual_insurance=");
		sb.append(getIndividual_insurance());
		sb.append(", housing_accumulation_fund_base=");
		sb.append(getHousing_accumulation_fund_base());
		sb.append(", individual_pay=");
		sb.append(getIndividual_pay());
		sb.append(", amount_payable=");
		sb.append(getAmount_payable());
		sb.append(", people_together=");
		sb.append(getPeople_together());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("com.shuntian.portlet.intranet.model.Satff");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>turnover_time</column-name><column-value><![CDATA[");
		sb.append(getTurnover_time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entry_time</column-name><column-value><![CDATA[");
		sb.append(getEntry_time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_pay</column-name><column-value><![CDATA[");
		sb.append(getBase_pay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performance_pay</column-name><column-value><![CDATA[");
		sb.append(getPerformance_pay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wage_subtotal</column-name><column-value><![CDATA[");
		sb.append(getWage_subtotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insurance_base</column-name><column-value><![CDATA[");
		sb.append(getInsurance_base());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endowment_insurance</column-name><column-value><![CDATA[");
		sb.append(getEndowment_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unemployment_insurance</column-name><column-value><![CDATA[");
		sb.append(getUnemployment_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>work_injury_insurance</column-name><column-value><![CDATA[");
		sb.append(getWork_injury_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birth_insurance</column-name><column-value><![CDATA[");
		sb.append(getBirth_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medical_insurance</column-name><column-value><![CDATA[");
		sb.append(getMedical_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>individual_insurance</column-name><column-value><![CDATA[");
		sb.append(getIndividual_insurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>housing_accumulation_fund_base</column-name><column-value><![CDATA[");
		sb.append(getHousing_accumulation_fund_base());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>individual_pay</column-name><column-value><![CDATA[");
		sb.append(getIndividual_pay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_payable</column-name><column-value><![CDATA[");
		sb.append(getAmount_payable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>people_together</column-name><column-value><![CDATA[");
		sb.append(getPeople_together());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _id;
	private long _user_id;
	private String _city;
	private String _name;
	private Date _turnover_time;
	private Date _entry_time;
	private double _base_pay;
	private double _performance_pay;
	private double _wage_subtotal;
	private double _insurance_base;
	private double _endowment_insurance;
	private double _unemployment_insurance;
	private double _work_injury_insurance;
	private double _birth_insurance;
	private double _medical_insurance;
	private double _individual_insurance;
	private double _housing_accumulation_fund_base;
	private double _individual_pay;
	private double _amount_payable;
	private double _people_together;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _satffRemoteModel;
}