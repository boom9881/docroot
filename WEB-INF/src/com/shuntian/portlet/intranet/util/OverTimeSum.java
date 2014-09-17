package com.shuntian.portlet.intranet.util;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.Overtime;
import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;
import com.shuntian.portlet.intranet.service.ExtInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;

public class OverTimeSum {
	public static String sum(String usuallyOvertime, String restOvertime,
			String legalOvertime) {

		return String.valueOf(sum(Double.parseDouble(usuallyOvertime),
				Double.parseDouble(restOvertime),
				Double.parseDouble(legalOvertime)));
	}

	public static double sum(double usuallyOvertime, double restOvertime,
			double legalOvertime) {

		return (usuallyOvertime * 1.5) + (restOvertime * 2)
				+ (legalOvertime * 3);
	}

	public static double getBasePay(long userId, long attendanceId)
			throws PortalException, SystemException {

		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);
		Attendance attendance = AttendanceLocalServiceUtil
				.getAttendance(attendanceId);
		if (attendance.getActualAttendance() < attendance.getShouldAttendance()) {
			return extInformation.getBasicWage()
					- extInformation.getBasicWage()
					/ attendance.getShouldAttendance()
					* (attendance.getShouldAttendance() - attendance
							.getActualAttendance());
		} else {
			return extInformation.getBasicWage();
		}

	}

	public static double getOvertimeWages(long userId, long attendanceId,
			long overtimeId) throws PortalException, SystemException {

		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);
		Attendance attendance = AttendanceLocalServiceUtil
				.getAttendance(attendanceId);
		Overtime overtime = OvertimeLocalServiceUtil.getOvertime(overtimeId);

		return extInformation.getBasicWage()
				+ extInformation.getOtherWage()
				+ attendance.getShouldAttendance()
				* (OverTimeSum
						.sum(overtime.getUsuallyOvertime(),
								overtime.getRestOvertime(),
								overtime.getLegalOvertime()));
	}

	public static double getPerformanceScores() {
		return 100;
	}

	public static double getPerformanceSalary(long userId, long attendanceId)
			throws PortalException, SystemException {

		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);
		Attendance attendance = AttendanceLocalServiceUtil
				.getAttendance(attendanceId);

		if (getPerformanceScores() < 60) {
			return 0.0;
		} else {
			return extInformation.getOtherWage()
					* (getPerformanceScores() / 100)
					/ attendance.getShouldAttendance()
					* attendance.getActualAttendance();
		}
	}

	public static double getAllowance() {
		return 0.0;
	}

	public static double getTotalWages(double basicWage, double preWage) {
		return basicWage + preWage;
	}

	public static double getSocialCompanyBearPart(long userId,
			long attendanceId, long overtimeId) throws PortalException,
			SystemException {

		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);

		return extInformation.getBasicWage() * 0.2
				+ extInformation.getBasicWage() * 0.01
				+ extInformation.getBasicWage() * 0.005
				+ extInformation.getBasicWage() * 0.008
				+ extInformation.getBasicWage() * 0.1
				+ extInformation.getBasicWage() * 0.12;
	}

	public static double getSocialIndividualsBearPart(long userId,
			long attendanceId, long overtimeId) throws PortalException,
			SystemException {

		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);

		return extInformation.getBasicWage() * 0.08
				+ extInformation.getBasicWage() * 0.002
				+ extInformation.getBasicWage() * 0.02
				+ extInformation.getBasicWage() * 0.12;
	}

	public static double getTaxableIncome(long userId, long attendanceId)
			throws PortalException, SystemException {
		ExtInformation extInformation = ExtInformationLocalServiceUtil
				.findByUserId(userId);

		return getTotalWages(extInformation.getBasicWage(),
				extInformation.getOtherWage())
				- getPerformanceSalary(userId, attendanceId) - getAllowance();
	}

	public static int getTaxRate(long userId, long attendanceId)
			throws PortalException, SystemException {
		if (getTaxableIncome(userId, attendanceId) > 83500) {
			return 45;
		} else if (getTaxableIncome(userId, attendanceId) > 58500) {
			return 35;
		} else if (getTaxableIncome(userId, attendanceId) > 38500) {
			return 30;
		} else if (getTaxableIncome(userId, attendanceId) > 12500) {
			return 25;
		} else if (getTaxableIncome(userId, attendanceId) > 8000) {
			return 20;
		} else if (getTaxableIncome(userId, attendanceId) > 5000) {
			return 10;
		} else if (getTaxableIncome(userId, attendanceId) > 3500) {
			return 3;
		}
		return 0;
	}

	public static double getTaxes(long userId, long attendanceId)
			throws PortalException, SystemException {
		if (getTaxableIncome(userId, attendanceId) > 83500) {
			return getTaxableIncome(userId, attendanceId) * 0.45 - 13505;
		} else if (getTaxableIncome(userId, attendanceId) > 58500) {
			return getTaxableIncome(userId, attendanceId) * 0.35 - 5505;
		} else if (getTaxableIncome(userId, attendanceId) > 38500) {
			return getTaxableIncome(userId, attendanceId) * 0.3 - 2755;
		} else if (getTaxableIncome(userId, attendanceId) > 12500) {
			return getTaxableIncome(userId, attendanceId) * 0.25 - 1005;
		} else if (getTaxableIncome(userId, attendanceId) > 8000) {
			return getTaxableIncome(userId, attendanceId) * 0.2 - 555;
		} else if (getTaxableIncome(userId, attendanceId) > 5000) {
			return getTaxableIncome(userId, attendanceId) * 0.1 - 105;
		} else if (getTaxableIncome(userId, attendanceId) > 3500) {
			return getTaxableIncome(userId, attendanceId) * 0.03;
		}
		return 0;
	}

	public static double getRealWages(long userId, long attendanceId)
			throws PortalException, SystemException {
		return getTaxableIncome(userId, attendanceId)
				- getTaxes(userId, attendanceId);
	}

	public static int isSatff(long userId) throws PortalException,
			SystemException {
		User user = UserLocalServiceUtil.getUser(userId);
		List<Role> roleList = user.getRoles();
		for (Role role : roleList) {
			if (SATFF.equals(role.getName())) {
				return 2;
			} else if (HR.equals(role.getName())) {
				return 1;
			}
		}
		return 0;
	}

	public static final double SHOULDATTENDANCE = 21.75;
	public static final String SATFF = "satff";
	public static final String HR = "hr";
}
