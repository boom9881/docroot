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

	public static int getCurYear() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		return calendar.get(Calendar.YEAR);
	}

	private static final String SATFF_ROLE_NAME = "satff";
}
