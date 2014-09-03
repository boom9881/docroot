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
public class SatffFinderUtil {
	public static SatffFinder getFinder() {
		if (_finder == null) {
			_finder = (SatffFinder)PortletBeanLocatorUtil.locate(com.shuntian.portlet.intranet.service.ClpSerializer.getServletContextName(),
					SatffFinder.class.getName());

			ReferenceRegistry.registerReference(SatffFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(SatffFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(SatffFinderUtil.class, "_finder");
	}

	private static SatffFinder _finder;
}