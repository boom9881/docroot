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

import com.shuntian.portlet.intranet.model.Wages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Wages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Wages
 * @generated
 */
public class WagesCacheModel implements CacheModel<Wages>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", wageName=");
		sb.append(wageName);
		sb.append(", distributionMonth=");
		sb.append(distributionMonth);
		sb.append(", distributionYear=");
		sb.append(distributionYear);
		sb.append(", entryDate=");
		sb.append(entryDate);
		sb.append(", departureDate=");
		sb.append(departureDate);
		sb.append(", userWage=");
		sb.append(userWage);
		sb.append(", userPerformance=");
		sb.append(userPerformance);
		sb.append(", userTotalWage=");
		sb.append(userTotalWage);
		sb.append(", attendance=");
		sb.append(attendance);
		sb.append(", realAttendance=");
		sb.append(realAttendance);
		sb.append(", basePay=");
		sb.append(basePay);
		sb.append(", overtimeWages=");
		sb.append(overtimeWages);
		sb.append(", performanceScores=");
		sb.append(performanceScores);
		sb.append(", performanceSalary=");
		sb.append(performanceSalary);
		sb.append(", allowance=");
		sb.append(allowance);
		sb.append(", totalWages=");
		sb.append(totalWages);
		sb.append(", socialCompanyBearPart=");
		sb.append(socialCompanyBearPart);
		sb.append(", socialIndividualsBearPart=");
		sb.append(socialIndividualsBearPart);
		sb.append(", taxableIncome=");
		sb.append(taxableIncome);
		sb.append(", taxRate=");
		sb.append(taxRate);
		sb.append(", taxes=");
		sb.append(taxes);
		sb.append(", realWages=");
		sb.append(realWages);
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
	public Wages toEntityModel() {
		WagesImpl wagesImpl = new WagesImpl();

		wagesImpl.setId(id);
		wagesImpl.setUserId(userId);

		if (wageName == null) {
			wagesImpl.setWageName(StringPool.BLANK);
		}
		else {
			wagesImpl.setWageName(wageName);
		}

		wagesImpl.setDistributionMonth(distributionMonth);
		wagesImpl.setDistributionYear(distributionYear);

		if (entryDate == Long.MIN_VALUE) {
			wagesImpl.setEntryDate(null);
		}
		else {
			wagesImpl.setEntryDate(new Date(entryDate));
		}

		if (departureDate == Long.MIN_VALUE) {
			wagesImpl.setDepartureDate(null);
		}
		else {
			wagesImpl.setDepartureDate(new Date(departureDate));
		}

		wagesImpl.setUserWage(userWage);
		wagesImpl.setUserPerformance(userPerformance);
		wagesImpl.setUserTotalWage(userTotalWage);
		wagesImpl.setAttendance(attendance);
		wagesImpl.setRealAttendance(realAttendance);
		wagesImpl.setBasePay(basePay);
		wagesImpl.setOvertimeWages(overtimeWages);
		wagesImpl.setPerformanceScores(performanceScores);
		wagesImpl.setPerformanceSalary(performanceSalary);
		wagesImpl.setAllowance(allowance);
		wagesImpl.setTotalWages(totalWages);
		wagesImpl.setSocialCompanyBearPart(socialCompanyBearPart);
		wagesImpl.setSocialIndividualsBearPart(socialIndividualsBearPart);
		wagesImpl.setTaxableIncome(taxableIncome);
		wagesImpl.setTaxRate(taxRate);
		wagesImpl.setTaxes(taxes);
		wagesImpl.setRealWages(realWages);
		wagesImpl.setCreateUserId(createUserId);

		if (createDate == Long.MIN_VALUE) {
			wagesImpl.setCreateDate(null);
		}
		else {
			wagesImpl.setCreateDate(new Date(createDate));
		}

		wagesImpl.setModifiedUserId(modifiedUserId);

		if (modifiedDate == Long.MIN_VALUE) {
			wagesImpl.setModifiedDate(null);
		}
		else {
			wagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		wagesImpl.resetOriginalValues();

		return wagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		wageName = objectInput.readUTF();
		distributionMonth = objectInput.readLong();
		distributionYear = objectInput.readLong();
		entryDate = objectInput.readLong();
		departureDate = objectInput.readLong();
		userWage = objectInput.readDouble();
		userPerformance = objectInput.readDouble();
		userTotalWage = objectInput.readDouble();
		attendance = objectInput.readDouble();
		realAttendance = objectInput.readDouble();
		basePay = objectInput.readDouble();
		overtimeWages = objectInput.readDouble();
		performanceScores = objectInput.readDouble();
		performanceSalary = objectInput.readDouble();
		allowance = objectInput.readDouble();
		totalWages = objectInput.readDouble();
		socialCompanyBearPart = objectInput.readDouble();
		socialIndividualsBearPart = objectInput.readDouble();
		taxableIncome = objectInput.readDouble();
		taxRate = objectInput.readDouble();
		taxes = objectInput.readDouble();
		realWages = objectInput.readDouble();
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

		if (wageName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wageName);
		}

		objectOutput.writeLong(distributionMonth);
		objectOutput.writeLong(distributionYear);
		objectOutput.writeLong(entryDate);
		objectOutput.writeLong(departureDate);
		objectOutput.writeDouble(userWage);
		objectOutput.writeDouble(userPerformance);
		objectOutput.writeDouble(userTotalWage);
		objectOutput.writeDouble(attendance);
		objectOutput.writeDouble(realAttendance);
		objectOutput.writeDouble(basePay);
		objectOutput.writeDouble(overtimeWages);
		objectOutput.writeDouble(performanceScores);
		objectOutput.writeDouble(performanceSalary);
		objectOutput.writeDouble(allowance);
		objectOutput.writeDouble(totalWages);
		objectOutput.writeDouble(socialCompanyBearPart);
		objectOutput.writeDouble(socialIndividualsBearPart);
		objectOutput.writeDouble(taxableIncome);
		objectOutput.writeDouble(taxRate);
		objectOutput.writeDouble(taxes);
		objectOutput.writeDouble(realWages);
		objectOutput.writeLong(createUserId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedUserId);
		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long userId;
	public String wageName;
	public long distributionMonth;
	public long distributionYear;
	public long entryDate;
	public long departureDate;
	public double userWage;
	public double userPerformance;
	public double userTotalWage;
	public double attendance;
	public double realAttendance;
	public double basePay;
	public double overtimeWages;
	public double performanceScores;
	public double performanceSalary;
	public double allowance;
	public double totalWages;
	public double socialCompanyBearPart;
	public double socialIndividualsBearPart;
	public double taxableIncome;
	public double taxRate;
	public double taxes;
	public double realWages;
	public long createUserId;
	public long createDate;
	public long modifiedUserId;
	public long modifiedDate;
}