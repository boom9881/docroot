package com.shuntian.portlet.intranet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
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
		long attendanceId = ParamUtil.getLong(actionRequest, "attendanceId");

		String attendanceMonth = ParamUtil.getString(actionRequest,
				"attendanceMonth");
		String attendanceYear = ParamUtil.getString(actionRequest,
				"attendanceYear");
		String actualAttendance = ParamUtil.getString(actionRequest,
				"actualAttendance");
		String shouldAttendance = ParamUtil.getString(actionRequest,
				"shouldAttendance");

		validatorAttendance(actionRequest, userId, attendanceYear,
				attendanceMonth, actualAttendance, shouldAttendance);

		if (SessionErrors.isEmpty(actionRequest)) {
			AttendanceLocalServiceUtil.editAttendance(userId, attendanceId,
					Long.parseLong(attendanceYear),
					Long.parseLong(attendanceMonth),
					Double.parseDouble(actualAttendance),
					Double.parseDouble(shouldAttendance));
		}
	}

	public void processAttendance(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		int status = ParamUtil.getInteger(actionRequest, "status");
		long id = ParamUtil.getLong(actionRequest, "attendanceId");

		AttendanceLocalServiceUtil.updateAttendanceStatus(id, status);
	}

	public void deleteAttendance(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {

		long attId = ParamUtil.getLong(actionRequest, "attId");

		AttendanceLocalServiceUtil.deleteAttendance(attId);
	}

	private void validatorAttendance(ActionRequest actionRequest, long userId,
			String attendanceYear, String attendanceMonth,
			String actualAttendance, String shouldAttendance) {

		//AttendanceLocalServiceUtil.findByY_M(userId, attendanceYear,
		//		attendanceMonth);
	}
}
