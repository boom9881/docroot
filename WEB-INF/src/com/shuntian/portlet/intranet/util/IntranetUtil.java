package com.shuntian.portlet.intranet.util;

import java.util.Calendar;

import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;

public class IntranetUtil {

	public static long getSatffRoleId(long companyId) {
		try {
			return RoleLocalServiceUtil.getRole(companyId, SATFF_ROLE_NAME)
					.getRoleId();
		} catch (Exception e) {
			return 0;
		}
	}

	public static int getAttendanceYearStart() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		if (calendar.get(Calendar.MONTH) == 0) {
			return calendar.get(Calendar.YEAR) - 1;
		} else {
			return calendar.get(Calendar.YEAR);
		}
	}

	public static int getCurMonth() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		return calendar.get(Calendar.MONTH);
	}

	public static int getCurYear() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		return calendar.get(Calendar.YEAR);
	}

	private static final String SATFF_ROLE_NAME = "satff";

	public static final int STATUS_0 = 0;// 发起、正在处理的
	public static final int STATUS_1 = 1;// 处理完成的

	public static final String DEFAULT_ZERO = "0";
}
