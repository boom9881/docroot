package com.shuntian.portlet.intranet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;

public class AttendancePortlet extends MVCPortlet {
	public void editAttendance(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {

		ThemeDisplay td = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = td.getUserId();
		long basicId = ParamUtil.getLong(actionRequest, "basicId");
		long attendanceId = ParamUtil.getLong(actionRequest, "attendanceId");

		String attendanceMonthly = ParamUtil.getString(actionRequest,
				"attendanceMonthly");
		String actualAttendance = ParamUtil.getString(actionRequest,
				"actualAttendance");
		String shouldAttendance = ParamUtil.getString(actionRequest,
				"shouldAttendance");

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if (cmd.equals(Constants.ADD)) {
			AttendanceLocalServiceUtil.addAttendance(userId, basicId,
					Long.parseLong(attendanceMonthly),
					Double.parseDouble(actualAttendance),
					Double.parseDouble(shouldAttendance));

		} else {
			AttendanceLocalServiceUtil.updateAttendance(userId, attendanceId,
					Long.parseLong(attendanceMonthly),
					Double.parseDouble(actualAttendance),
					Double.parseDouble(shouldAttendance));
		}
	}
}
