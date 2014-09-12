package com.shuntian.portlet.intranet.action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.shuntian.portlet.intranet.NoSuchDepartmentException;
import com.shuntian.portlet.intranet.model.Department;
import com.shuntian.portlet.intranet.service.DepartmentLocalServiceUtil;

public class DepartmentPortlet extends MVCPortlet {

	public void editDepartment(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		ThemeDisplay td = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = td.getUserId();
		long id = ParamUtil.getLong(actionRequest, "id");
		long leaderId = ParamUtil.getLong(actionRequest, "leader");
		String name = ParamUtil.getString(actionRequest, "name");
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		validator(id, cmd, name, actionRequest);

		if (SessionErrors.isEmpty(actionRequest)) {
			if (cmd.equals(Constants.ADD)) {
				DepartmentLocalServiceUtil.addDepartment(userId, leaderId,
						name, new Date());
			} else {
				DepartmentLocalServiceUtil.updateDepartment(id, userId,
						leaderId, name, new Date());
			}
		}
	}

	public void deleteDepartment(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		long id = ParamUtil.getLong(actionRequest, "id");

		DepartmentLocalServiceUtil.deleteDepartment(id);
	}

	private void validator(long id, String cmd, String name,
			ActionRequest actionRequest) throws SystemException,
			NoSuchDepartmentException {

		if (Validator.isNull(name)) {
			SessionErrors.add(actionRequest,
					"dhst-intranet-department-name-null");
		}
		if (name.length() > 10) {
			SessionErrors.add(actionRequest,
					"dhst-intranet-department-name-len");
		}

		Department d = DepartmentLocalServiceUtil.findByName(name);

		if (Validator.isNotNull(d)) {
			if (cmd.equals(Constants.ADD)) {
				SessionErrors.add(actionRequest,
						"dhst-intranet-department-name-rep");
			} else {
				if (id != d.getId()) {
					SessionErrors.add(actionRequest,
							"dhst-intranet-department-name-rep");
				}
			}
		}
	}
}
