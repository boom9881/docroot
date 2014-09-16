package com.shuntian.portlet.intranet.util;

import com.liferay.portal.kernel.util.PropsUtil;

public class ProperiesUtil {
	public static final String KEY = "dhst.intranet.user.default.password";
	public static final String DEFAULT_PASSSWORD = PropsUtil.get(KEY);
}
