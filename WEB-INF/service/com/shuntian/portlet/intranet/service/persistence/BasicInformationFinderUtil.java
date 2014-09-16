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
public class BasicInformationFinderUtil {
	public static int countByDepAndName(long departmentId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByDepAndName(departmentId, name);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByDepAndName(
		long departmentId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByDepAndName(departmentId, name, start, end);
	}

	public static BasicInformationFinder getFinder() {
		if (_finder == null) {
			_finder = (BasicInformationFinder)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					BasicInformationFinder.class.getName());

			ReferenceRegistry.registerReference(BasicInformationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(BasicInformationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(BasicInformationFinderUtil.class,
			"_finder");
	}

	private static BasicInformationFinder _finder;
}