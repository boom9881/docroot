/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.shuntian.portlet.intranet.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.shuntian.portlet.intranet.service.ClpSerializer;
import com.shuntian.portlet.intranet.service.SatffLocalServiceUtil;
import com.shuntian.portlet.intranet.service.SatffServiceUtil;
import com.shuntian.portlet.intranet.service.basic_informationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.educationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.ext_informationLocalServiceUtil;
import com.shuntian.portlet.intranet.service.familyLocalServiceUtil;
import com.shuntian.portlet.intranet.service.workLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			basic_informationLocalServiceUtil.clearService();

			educationLocalServiceUtil.clearService();

			ext_informationLocalServiceUtil.clearService();

			familyLocalServiceUtil.clearService();

			SatffLocalServiceUtil.clearService();

			SatffServiceUtil.clearService();
			workLocalServiceUtil.clearService();
		}
	}
}