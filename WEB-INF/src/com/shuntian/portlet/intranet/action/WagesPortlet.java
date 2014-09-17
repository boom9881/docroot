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
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.model.Wages;
import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;
import com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;
import com.shuntian.portlet.intranet.service.WagesLocalServiceUtil;
import com.shuntian.portlet.intranet.util.OverTimeSum;

public class WagesPortlet extends MVCPortlet {
	public void editWages(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException, PortalException {
		
		long distributionYear = ParamUtil.getLong(actionRequest, "distributionYear");
		long distributionMonth = ParamUtil.getLong(actionRequest, "distributionMonth");
		
		List<Wages> wageList = WagesLocalServiceUtil.findByY_M(distributionYear, distributionMonth);
		
		if(wageList.size() == 0){
			List<BasicInformation> biList = BasicInformationLocalServiceUtil.getBasicInformations(0, BasicInformationLocalServiceUtil.getBasicInformationsCount());
			for (BasicInformation basicInformation : biList) {
				long userId = basicInformation.getUserId();
				Wages wages = WagesLocalServiceUtil.createWages(CounterLocalServiceUtil.increment());
				Attendance attendance = AttendanceLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
				Overtime overtime = OvertimeLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
				
				long attendanceId = attendance.getId();
				long overtimeId = overtime.getId();
				
				wages.setUserId(basicInformation.getId());
				wages.setWageName(basicInformation.getName());
				wages.setDistributionMonth(distributionMonth);
				//wages.setEntryDate(new Date());
				//wages.getDepartureDate()
				wages.setUserWage(basicInformation.getBasePay());
				wages.setUserPerformance(basicInformation.getPerformancePay());
				wages.setUserTotalWage(basicInformation.getBasePay()+basicInformation.getPerformancePay());
				wages.setAttendance(attendance.getShouldAttendance());
				wages.setRealAttendance(attendance.getActualAttendance());
				wages.setBasePay(OverTimeSum.getBasePay(userId, attendanceId));
				wages.setOvertimeWages(OverTimeSum.getOvertimeWages(userId, attendanceId, overtimeId));
				wages.setPerformanceScores(OverTimeSum.getPerformanceScores());
				wages.setPerformanceSalary(OverTimeSum.getPerformanceSalary(userId, attendanceId));
				wages.setAllowance(OverTimeSum.getAllowance());
				wages.setTotalWages(OverTimeSum.getTotalWages(OverTimeSum.getBasePay(userId, attendanceId), OverTimeSum.getPerformanceSalary(userId, attendanceId)));
				wages.setSocialCompanyBearPart(OverTimeSum.getSocialCompanyBearPart(userId, attendanceId, overtimeId));
				wages.setSocialIndividualsBearPart(OverTimeSum.getSocialIndividualsBearPart(userId, attendanceId, overtimeId));
				wages.setTaxableIncome(OverTimeSum.getTaxableIncome(userId, attendanceId));
				wages.setTaxRate(OverTimeSum.getTaxRate(userId, attendanceId));
				wages.setTaxes(OverTimeSum.getTaxes(userId, attendanceId));
				wages.setRealWages(OverTimeSum.getRealWages(userId, attendanceId));
				
				WagesLocalServiceUtil.updateWages(wages);
			}
		}
	}
}
