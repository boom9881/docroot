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

package com.shuntian.portlet.intranet.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.shuntian.portlet.intranet.model.WorkExperience;
import com.shuntian.portlet.intranet.service.base.WorkExperienceLocalServiceBaseImpl;

/**
 * The implementation of the work experience local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.WorkExperienceLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.WorkExperienceLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.WorkExperienceLocalServiceUtil
 */
public class WorkExperienceLocalServiceImpl extends
		WorkExperienceLocalServiceBaseImpl {

	public List<WorkExperience> findByUserId(long userId)
			throws SystemException {
		return workExperiencePersistence.findByUserId(userId);
	}
}