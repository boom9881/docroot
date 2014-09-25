package com.shuntian.portlet.intranet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.NoSuchOvertimeException;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.OvertimeLocalServiceUtil;
import com.shuntian.portlet.intranet.util.IntranetUtil;

public class OvertimePortlet extends MVCPortlet {

	public void editOvertime(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {

		ThemeDisplay td = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = td.getUserId();
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

		if (Validator.isNull(usuallyOvertime)) {
			usuallyOvertime = IntranetUtil.DEFAULT_ZERO;
		}
		if (Validator.isNull(restOvertime)) {
			restOvertime = IntranetUtil.DEFAULT_ZERO;
		}
		if (Validator.isNull(legalOvertime)) {
			legalOvertime = IntranetUtil.DEFAULT_ZERO;
		}

		validatorOT(actionRequest, userId, overtimeMonthly, overtimeYear,
				usuallyOvertime, restOvertime, legalOvertime);

		if (SessionErrors.isEmpty(actionRequest)) {
			OvertimeLocalServiceUtil.editOvertime(userId, overtimeId,
					Long.parseLong(overtimeYear),
					Long.parseLong(overtimeMonthly),
					Double.parseDouble(usuallyOvertime),
					Double.parseDouble(restOvertime),
					Double.parseDouble(legalOvertime));
		}
	}

	public void updateStatus(ActionRequest actionRequest,
			ActionResponse actionResponse) throws NoSuchOvertimeException,
			SystemException {
		long id = ParamUtil.getLong(actionRequest, "id");
		int status = ParamUtil.getInteger(actionRequest, "status");

		OvertimeLocalServiceUtil.updateOTStatus(id, status);
	}

	public void deleteOT(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		long id = ParamUtil.getLong(actionRequest, "id");

		OvertimeLocalServiceUtil.deleteOvertime(id);
	}

	private void validatorOT(ActionRequest actionRequest, long userId,
			String overtimeMonthly, String overtimeYear,
			String usuallyOvertime, String restOvertime, String legalOvertime) {

		try {
			BasicInformation bi = BasicInformationLocalServiceUtil
					.findByUserId(userId);

			int count = OvertimeLocalServiceUtil.countByU_Y_M(bi.getId(),
					Long.parseLong(overtimeYear),
					Long.parseLong(overtimeMonthly));
			
			if (count > 0) {
				SessionErrors.add(actionRequest, "dhst.intranet.ot.rep");
			}
		} catch (SystemException e) {
		}

		try {
			Double.parseDouble(usuallyOvertime);
		} catch (NumberFormatException nfe) {
			SessionErrors.add(actionRequest, "dhst.intranet.ot.uot.number");
		}

		try {
			Double.parseDouble(restOvertime);
		} catch (NumberFormatException nfe) {
			SessionErrors.add(actionRequest, "dhst.intranet.ot.rot.number");
		}

		try {
			Double.parseDouble(legalOvertime);
		} catch (NumberFormatException nfe) {
			SessionErrors.add(actionRequest, "dhst.intranet.ot.lot.number");
		}
	}
}
