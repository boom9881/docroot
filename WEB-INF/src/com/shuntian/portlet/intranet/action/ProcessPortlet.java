package com.shuntian.portlet.intranet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.service.AttendanceLocalServiceUtil;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;
import com.shuntian.portlet.intranet.util.IntranetUtil;

public class ProcessPortlet extends MVCPortlet {

	public void process(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {

		long id = ParamUtil.getLong(request, "id");
		String className = ParamUtil.getString(request, "className");

		if (className.equals(O_T)) {
			OvertimeLocalServiceUtil.updateOTStatus(id, IntranetUtil.STATUS_1);
		} else if (className.equals(ATTENDANCE)) {
			AttendanceLocalServiceUtil.updateAttendanceStatus(id,
					IntranetUtil.STATUS_1);
		}
	}

	public void delete(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {

		long id = ParamUtil.getLong(request, "id");
		String className = ParamUtil.getString(request, "className");

		if (className.equals(O_T)) {
			OvertimeLocalServiceUtil.deleteOvertime(id);
		} else if (className.equals(ATTENDANCE)) {
			AttendanceLocalServiceUtil.deleteAttendance(id);
		}
	}

	private static final String O_T = "overtime";
	private static final String ATTENDANCE = "attendance";
}
