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

package com.shuntian.portlet.intranet.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 */
public class WagesFinderUtil {
	public static int search(long departmentId, long searchUserId,
		java.lang.String searchYear, java.lang.String searchMonth,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .search(departmentId, searchUserId, searchYear, searchMonth,
			name);
	}

	public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> search(
		long departmentId, long searchUserId, java.lang.String searchYear,
		java.lang.String searchMonth, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .search(departmentId, searchUserId, searchYear, searchMonth,
			name, start, end);
	}

	public static WagesFinder getFinder() {
		if (_finder == null) {
			_finder = (WagesFinder)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					WagesFinder.class.getName());

			ReferenceRegistry.registerReference(WagesFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(WagesFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(WagesFinderUtil.class, "_finder");
	}

	private static WagesFinder _finder;
}