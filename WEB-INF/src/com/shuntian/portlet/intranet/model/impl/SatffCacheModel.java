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

import com.shuntian.portlet.intranet.model.Satff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Satff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Satff
 * @generated
 */
public class SatffCacheModel implements CacheModel<Satff>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", city=");
		sb.append(city);
		sb.append(", name=");
		sb.append(name);
		sb.append(", turnover_time=");
		sb.append(turnover_time);
		sb.append(", entry_time=");
		sb.append(entry_time);
		sb.append(", base_pay=");
		sb.append(base_pay);
		sb.append(", performance_pay=");
		sb.append(performance_pay);
		sb.append(", wage_subtotal=");
		sb.append(wage_subtotal);
		sb.append(", insurance_base=");
		sb.append(insurance_base);
		sb.append(", endowment_insurance=");
		sb.append(endowment_insurance);
		sb.append(", unemployment_insurance=");
		sb.append(unemployment_insurance);
		sb.append(", work_injury_insurance=");
		sb.append(work_injury_insurance);
		sb.append(", birth_insurance=");
		sb.append(birth_insurance);
		sb.append(", medical_insurance=");
		sb.append(medical_insurance);
		sb.append(", individual_insurance=");
		sb.append(individual_insurance);
		sb.append(", housing_accumulation_fund_base=");
		sb.append(housing_accumulation_fund_base);
		sb.append(", individual_pay=");
		sb.append(individual_pay);
		sb.append(", amount_payable=");
		sb.append(amount_payable);
		sb.append(", people_together=");
		sb.append(people_together);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Satff toEntityModel() {
		SatffImpl satffImpl = new SatffImpl();

		if (uuid == null) {
			satffImpl.setUuid(StringPool.BLANK);
		}
		else {
			satffImpl.setUuid(uuid);
		}

		satffImpl.setId(id);
		satffImpl.setUser_id(user_id);

		if (city == null) {
			satffImpl.setCity(StringPool.BLANK);
		}
		else {
			satffImpl.setCity(city);
		}

		if (name == null) {
			satffImpl.setName(StringPool.BLANK);
		}
		else {
			satffImpl.setName(name);
		}

		if (turnover_time == Long.MIN_VALUE) {
			satffImpl.setTurnover_time(null);
		}
		else {
			satffImpl.setTurnover_time(new Date(turnover_time));
		}

		if (entry_time == Long.MIN_VALUE) {
			satffImpl.setEntry_time(null);
		}
		else {
			satffImpl.setEntry_time(new Date(entry_time));
		}

		satffImpl.setBase_pay(base_pay);
		satffImpl.setPerformance_pay(performance_pay);
		satffImpl.setWage_subtotal(wage_subtotal);
		satffImpl.setInsurance_base(insurance_base);
		satffImpl.setEndowment_insurance(endowment_insurance);
		satffImpl.setUnemployment_insurance(unemployment_insurance);
		satffImpl.setWork_injury_insurance(work_injury_insurance);
		satffImpl.setBirth_insurance(birth_insurance);
		satffImpl.setMedical_insurance(medical_insurance);
		satffImpl.setIndividual_insurance(individual_insurance);
		satffImpl.setHousing_accumulation_fund_base(housing_accumulation_fund_base);
		satffImpl.setIndividual_pay(individual_pay);
		satffImpl.setAmount_payable(amount_payable);
		satffImpl.setPeople_together(people_together);
		satffImpl.setCompanyId(companyId);
		satffImpl.setUserId(userId);

		if (userName == null) {
			satffImpl.setUserName(StringPool.BLANK);
		}
		else {
			satffImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			satffImpl.setCreateDate(null);
		}
		else {
			satffImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			satffImpl.setModifiedDate(null);
		}
		else {
			satffImpl.setModifiedDate(new Date(modifiedDate));
		}

		satffImpl.resetOriginalValues();

		return satffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id = objectInput.readLong();
		user_id = objectInput.readLong();
		city = objectInput.readUTF();
		name = objectInput.readUTF();
		turnover_time = objectInput.readLong();
		entry_time = objectInput.readLong();
		base_pay = objectInput.readDouble();
		performance_pay = objectInput.readDouble();
		wage_subtotal = objectInput.readDouble();
		insurance_base = objectInput.readDouble();
		endowment_insurance = objectInput.readDouble();
		unemployment_insurance = objectInput.readDouble();
		work_injury_insurance = objectInput.readDouble();
		birth_insurance = objectInput.readDouble();
		medical_insurance = objectInput.readDouble();
		individual_insurance = objectInput.readDouble();
		housing_accumulation_fund_base = objectInput.readDouble();
		individual_pay = objectInput.readDouble();
		amount_payable = objectInput.readDouble();
		people_together = objectInput.readDouble();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);
		objectOutput.writeLong(user_id);

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(turnover_time);
		objectOutput.writeLong(entry_time);
		objectOutput.writeDouble(base_pay);
		objectOutput.writeDouble(performance_pay);
		objectOutput.writeDouble(wage_subtotal);
		objectOutput.writeDouble(insurance_base);
		objectOutput.writeDouble(endowment_insurance);
		objectOutput.writeDouble(unemployment_insurance);
		objectOutput.writeDouble(work_injury_insurance);
		objectOutput.writeDouble(birth_insurance);
		objectOutput.writeDouble(medical_insurance);
		objectOutput.writeDouble(individual_insurance);
		objectOutput.writeDouble(housing_accumulation_fund_base);
		objectOutput.writeDouble(individual_pay);
		objectOutput.writeDouble(amount_payable);
		objectOutput.writeDouble(people_together);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long id;
	public long user_id;
	public String city;
	public String name;
	public long turnover_time;
	public long entry_time;
	public double base_pay;
	public double performance_pay;
	public double wage_subtotal;
	public double insurance_base;
	public double endowment_insurance;
	public double unemployment_insurance;
	public double work_injury_insurance;
	public double birth_insurance;
	public double medical_insurance;
	public double individual_insurance;
	public double housing_accumulation_fund_base;
	public double individual_pay;
	public double amount_payable;
	public double people_together;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}