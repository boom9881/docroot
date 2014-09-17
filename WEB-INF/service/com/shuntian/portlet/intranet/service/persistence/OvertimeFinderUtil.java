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
public class OvertimeFinderUtil {
	public static int search(long departmentId, long searchUserId,
		java.lang.String attendanceYear, java.lang.String attendanceMonth,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .search(departmentId, searchUserId, attendanceYear,
			attendanceMonth, name);
	}

	public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> search(
		long departmentId, long searchUserId, java.lang.String attendanceYear,
		java.lang.String attendanceMonth, java.lang.String name, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .search(departmentId, searchUserId, attendanceYear,
			attendanceMonth, name, start, end);
	}

	public static OvertimeFinder getFinder() {
		if (_finder == null) {
			_finder = (OvertimeFinder)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					OvertimeFinder.class.getName());

			ReferenceRegistry.registerReference(OvertimeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(OvertimeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(OvertimeFinderUtil.class, "_finder");
	}

	private static OvertimeFinder _finder;
}