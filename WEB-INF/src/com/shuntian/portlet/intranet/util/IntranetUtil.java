package com.shuntian.portlet.intranet.util;

import java.util.Calendar;

import com.liferay.portal.kernel.util.CalendarFactoryUtil;

public class IntranetUtil {

	public static int getCurYear() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		return calendar.get(Calendar.YEAR);
	}
}
