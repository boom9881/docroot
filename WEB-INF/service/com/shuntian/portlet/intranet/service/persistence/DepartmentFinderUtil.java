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
public class DepartmentFinderUtil {
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByName(name);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.Department> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByName(name, start, end);
	}

	public static DepartmentFinder getFinder() {
		if (_finder == null) {
			_finder = (DepartmentFinder)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					DepartmentFinder.class.getName());

			ReferenceRegistry.registerReference(DepartmentFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DepartmentFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DepartmentFinderUtil.class,
			"_finder");
	}

	private static DepartmentFinder _finder;
}