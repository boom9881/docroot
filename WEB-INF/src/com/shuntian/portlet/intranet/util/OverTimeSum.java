package com.shuntian.portlet.intranet.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.shuntian.portlet.intranet.model.Attendance;
import com.shuntian.portlet.intranet.model.ExtInformation;
import com.shuntian.portlet.intranet.model.Overtime;

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

	public static double getBasePay(ExtInformation extInformation,
			Attendance attendance) throws PortalException, SystemException {

		if (Validator.isNull(attendance)) {
			return 0;
		} else {
			if (attendance.getActualAttendance() < attendance
					.getShouldAttendance()) {
				return extInformation.getBasicWage()
						- extInformation.getBasicWage()
						/ attendance.getShouldAttendance()
						* (attendance.getShouldAttendance() - attendance
								.getActualAttendance());
			} else {
				return extInformation.getBasicWage();
			}
		}
	}

	public static double getOvertimeWages(ExtInformation extInformation,
			Attendance attendance, Overtime overtime) throws PortalException,
			SystemException {

		if (Validator.isNull(attendance) || Validator.isNull(overtime)) {
			return 0;
		} else {
			return (extInformation.getBasicWage() + extInformation
					.getOtherWage())
					/ attendance.getShouldAttendance()
					* (OverTimeSum.sum(overtime.getUsuallyOvertime(),
							overtime.getRestOvertime(),
							overtime.getLegalOvertime()));
		}
	}

	public static double getPerformanceScores() {
		return 100;
	}

	public static double getPerformanceSalary(ExtInformation extInformation,
			Attendance attendance) throws PortalException, SystemException {

		if (Validator.isNull(attendance) || (getPerformanceScores() < 60)) {
			return 0;
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

	public static double getTotalWages(double basicWage, double preWage,
			double overtimeWages) {
		return basicWage + preWage + overtimeWages;
	}

	public static double getSocialCompanyBearPart(ExtInformation extInformation)
			throws PortalException, SystemException {

		return extInformation.getBasicWage() * 0.2
				+ extInformation.getBasicWage() * 0.01
				+ extInformation.getBasicWage() * 0.005
				+ extInformation.getBasicWage() * 0.008
				+ extInformation.getBasicWage() * 0.1
				+ extInformation.getBasicWage() * 0.12;
	}

	public static double getSocialIndividualsBearPart(
			ExtInformation extInformation) throws PortalException,
			SystemException {

		return extInformation.getBasicWage() * 0.08
				+ extInformation.getBasicWage() * 0.002
				+ (extInformation.getBasicWage() * 0.02 + 3)
				+ extInformation.getBasicWage() * 0.12;
	}

	public static double getTaxableIncome(ExtInformation extInformation,
			double basicWage, double preWage, double overtimeWages)
			throws PortalException, SystemException {

		double taxableIncome = getTotalWages(basicWage, preWage, overtimeWages)
				- getSocialIndividualsBearPart(extInformation) - getAllowance();

		if (taxableIncome < 0) {
			return 0;
		} else {
			return taxableIncome;
		}

	}

	public static int getTaxRate(ExtInformation extInformation,
			double basicWage, double preWage, double overtimeWages)
			throws PortalException, SystemException {

		if (getTaxableIncome(extInformation, basicWage, preWage, overtimeWages) > 83500) {
			return 45;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 58500) {
			return 35;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 38500) {
			return 30;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 12500) {
			return 25;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 8000) {
			return 20;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 5000) {
			return 10;
		} else if (getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) >= 3500) {
			return 3;
		}

		return 0;
	}

	public static double getTaxes(ExtInformation extInformation,
			double basicWage, double preWage, double overtimeWages)
			throws PortalException, SystemException {

		if ((getTaxableIncome(extInformation, basicWage, preWage, overtimeWages) - 3500) >= 80000) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.45 - 13505;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 55000) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.35 - 5505;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 35000) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.3 - 2755;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 9000) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.25 - 1005;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 4500) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.2 - 555;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 1500) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.1 - 105;
		} else if ((getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages) - 3500) >= 0) {
			return (getTaxableIncome(extInformation, basicWage, preWage,
					overtimeWages) - 3500) * 0.03;
		}

		return 0;
	}

	public static double getRealWages(ExtInformation extInformation,
			double basicWage, double preWage, double overtimeWages)
			throws PortalException, SystemException {

		double realWages = getTaxableIncome(extInformation, basicWage, preWage,
				overtimeWages)
				- getTaxes(extInformation, basicWage, preWage, overtimeWages);

		if (realWages < 0) {
			return 0;
		} else {
			return realWages;
		}

	}

	public static final double SHOULDATTENDANCE = 21.75;
}
