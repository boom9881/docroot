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
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;

public class OvertimePortlet extends MVCPortlet {
	public void editOvertime(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {

		ThemeDisplay td = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = td.getUserId();
		long basicId = ParamUtil.getLong(actionRequest, "basicId");
		long overtimeId = ParamUtil.getLong(actionRequest, "overtimeId");

		String overtimeMonthly = ParamUtil.getString(actionRequest,
				"overtimeMonthly");
		String overtimeYear = ParamUtil
				.getString(actionRequest, "overtimeYear");
		String usuallyOvertime = ParamUtil.getString(actionRequest,
				"usuallyOvertime");
		String restOvertime = ParamUtil
				.getString(actionRequest, "restOvertime");
		String legalOvertime = ParamUtil.getString(actionRequest,
				"legalOvertime");

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if (cmd.equals(Constants.ADD)) {

			OvertimeLocalServiceUtil.addOvertime(userId, basicId,
					Long.parseLong(overtimeYear),
					Long.parseLong(overtimeMonthly),
					Double.parseDouble(usuallyOvertime),
					Double.parseDouble(restOvertime),
					Double.parseDouble(legalOvertime));

		} else {
			OvertimeLocalServiceUtil.updateOvertime(userId, overtimeId,
					Long.parseLong(overtimeYear),
					Long.parseLong(overtimeMonthly),
					Double.parseDouble(usuallyOvertime),
					Double.parseDouble(restOvertime),
					Double.parseDouble(legalOvertime));
		}
	}
}
