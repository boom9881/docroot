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
			ActionResponse actionResponse) throws SystemException, PortalException {
		
		long distributionYear = ParamUtil.getLong(actionRequest, "distributionYear");
		long distributionMonth = ParamUtil.getLong(actionRequest, "distributionMonth");
		
		List<Wages> wageList = WagesLocalServiceUtil.findByY_M(distributionYear, distributionMonth);
		
		if(wageList.size() == 0){
			List<BasicInformation> biList = BasicInformationLocalServiceUtil.getBasicInformations(0, BasicInformationLocalServiceUtil.getBasicInformationsCount());
			for (BasicInformation basicInformation : biList) {
				long userId = basicInformation.getUserId();
				long attendanceId = 0;
				long overtimeId = 0;
				
				ExtInformation extInformation = ExtInformationLocalServiceUtil.findByUserId(userId);
				Wages wages = WagesLocalServiceUtil.createWages(CounterLocalServiceUtil.increment());
				Attendance attendance = AttendanceLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
				Overtime overtime = OvertimeLocalServiceUtil.findByY_M(basicInformation.getId(), distributionYear, distributionMonth);
				
				if(Validator.isNotNull(attendance)){
					attendanceId = attendance.getId();
				}
				if(Validator.isNotNull(overtime)){
					overtimeId = overtime.getId();
				}
				
				wages.setUserId(basicInformation.getId());
				wages.setWageName(basicInformation.getName());
				wages.setDistributionMonth(distributionMonth);
				wages.setDistributionYear(distributionYear);
				//wages.setEntryDate(new Date());
				//wages.getDepartureDate()
				wages.setUserWage(extInformation.getBasicWage());
				wages.setUserPerformance(extInformation.getOtherWage());
				wages.setUserTotalWage(extInformation.getBasicWage()+extInformation.getOtherWage());
				if(Validator.isNotNull(attendance)){
					wages.setAttendance(attendance.getShouldAttendance());
					wages.setRealAttendance(attendance.getActualAttendance());
					wages.setBasePay(OverTimeSum.getBasePay(userId, attendanceId));
					wages.setOvertimeWages(OverTimeSum.getOvertimeWages(userId, attendanceId, overtimeId));
					wages.setPerformanceScores(OverTimeSum.getPerformanceScores());
					wages.setPerformanceSalary(OverTimeSum.getPerformanceSalary(userId, attendanceId));
					wages.setAllowance(OverTimeSum.getAllowance());
					wages.setTotalWages(OverTimeSum.getTotalWages(OverTimeSum.getBasePay(userId, attendanceId), OverTimeSum.getPerformanceSalary(userId, attendanceId),wages.getOvertimeWages()));
					wages.setSocialCompanyBearPart(OverTimeSum.getSocialCompanyBearPart(userId, attendanceId, overtimeId));
					wages.setSocialIndividualsBearPart(OverTimeSum.getSocialIndividualsBearPart(userId, attendanceId));
					wages.setTaxableIncome(OverTimeSum.getTaxableIncome(userId, attendanceId,wages.getOvertimeWages()));
					wages.setTaxRate(OverTimeSum.getTaxRate(userId, attendanceId,wages.getOvertimeWages()));
					wages.setTaxes(OverTimeSum.getTaxes(userId, attendanceId,wages.getOvertimeWages()));
					wages.setRealWages(OverTimeSum.getRealWages(userId, attendanceId,wages.getOvertimeWages()));
				}else{
					wages.setAttendance(21.75);
					wages.setRealAttendance(0);
					wages.setBasePay(0);
					wages.setOvertimeWages(0);
					wages.setPerformanceScores(0);
					wages.setPerformanceSalary(0);
					wages.setAllowance(0);
					wages.setTotalWages(0);
					wages.setSocialCompanyBearPart(0);
					wages.setSocialIndividualsBearPart(0);
					wages.setTaxableIncome(0);
					wages.setTaxRate(0);
					wages.setTaxes(0);
					wages.setRealWages(0);
				}
				
				WagesLocalServiceUtil.updateWages(wages);
			}
		}
	}
}
