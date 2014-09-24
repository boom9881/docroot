package com.shuntian.portlet.intranet.action;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.model.Wages;
import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;
import com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.ExtInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;
import com.shuntian.portlet.intranet.service.WagesLocalServiceUtil;
import com.shuntian.portlet.intranet.util.OverTimeSum;

public class WagesPortlet extends MVCPortlet {

	public void editWages(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException,
			PortalException {

		long distributionYear = ParamUtil.getLong(actionRequest,
				"distributionYear");
		long distributionMonth = ParamUtil.getLong(actionRequest,
				"distributionMonth");

		List<Wages> wageList = WagesLocalServiceUtil.findByY_M(
				distributionYear, distributionMonth);

		if (wageList.size() == 0) {
			List<BasicInformation> biList = BasicInformationLocalServiceUtil
					.getBasicInformations(0, BasicInformationLocalServiceUtil
							.getBasicInformationsCount());
			for (BasicInformation basicInformation : biList) {
				long userId = basicInformation.getUserId();

				Wages wages = WagesLocalServiceUtil
						.createWages(CounterLocalServiceUtil.increment());

				ExtInformation extInformation = ExtInformationLocalServiceUtil
						.findByUserId(userId);
				Attendance attendance = AttendanceLocalServiceUtil.findByY_M(
						basicInformation.getId(), distributionYear,
						distributionMonth);
				Overtime overtime = OvertimeLocalServiceUtil.findByY_M(
						basicInformation.getId(), distributionYear,
						distributionMonth);

				if (Validator.isNotNull(attendance)) {
					wages.setAttendance(attendance.getShouldAttendance());
					wages.setRealAttendance(attendance.getActualAttendance());
				} else {
					wages.setAttendance(21.75);
					wages.setRealAttendance(0);
				}

				double basePay = OverTimeSum.getBasePay(extInformation,
						attendance);
				double performanceSalary = OverTimeSum.getPerformanceSalary(
						extInformation, attendance);

				wages.setBasePay(basePay);
				wages.setOvertimeWages(OverTimeSum.getOvertimeWages(
						extInformation, attendance, overtime));
				wages.setPerformanceScores(OverTimeSum.getPerformanceScores());
				wages.setPerformanceSalary(performanceSalary);
				wages.setAllowance(OverTimeSum.getAllowance());
				wages.setTotalWages(OverTimeSum.getTotalWages(basePay,
						performanceSalary, wages.getOvertimeWages()));
				wages.setSocialCompanyBearPart(OverTimeSum
						.getSocialCompanyBearPart(extInformation));
				wages.setSocialIndividualsBearPart(OverTimeSum
						.getSocialIndividualsBearPart(extInformation));
				wages.setTaxableIncome(OverTimeSum.getTaxableIncome(
						extInformation, basePay, performanceSalary,
						wages.getOvertimeWages()));
				wages.setTaxRate(OverTimeSum.getTaxRate(extInformation,
						basePay, performanceSalary, wages.getOvertimeWages()));
				wages.setTaxes(OverTimeSum.getTaxes(extInformation, basePay,
						performanceSalary, wages.getOvertimeWages()));
				wages.setRealWages(OverTimeSum.getRealWages(extInformation,
						basePay, performanceSalary, wages.getOvertimeWages()));

				wages.setUserId(basicInformation.getId());
				wages.setWageName(basicInformation.getName());
				wages.setDistributionMonth(distributionMonth);
				wages.setDistributionYear(distributionYear);
				// wages.setEntryDate(new Date());
				// wages.getDepartureDate()
				wages.setUserWage(extInformation.getBasicWage());
				wages.setUserPerformance(extInformation.getOtherWage());
				wages.setUserTotalWage(extInformation.getBasicWage()
						+ extInformation.getOtherWage());

				WagesLocalServiceUtil.updateWages(wages);
			}
		}
	}
}
