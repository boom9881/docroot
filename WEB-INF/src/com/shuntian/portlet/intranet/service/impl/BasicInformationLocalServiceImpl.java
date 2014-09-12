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
import com.shuntian.portlet.intranet.NoSuchBasicInformationException;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.impl.BasicInformationImpl;
import com.shuntian.portlet.intranet.service.base.BasicInformationLocalServiceBaseImpl;

/**
 * The implementation of the basic information local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.shuntian.portlet.intranet.service.BasicInformationLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see com.shuntian.portlet.intranet.service.base.BasicInformationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.BasicInformationLocalServiceUtil
 */
public class BasicInformationLocalServiceImpl extends
		BasicInformationLocalServiceBaseImpl {

	public List<BasicInformation> findByIsLeave(boolean isLeave)
			throws SystemException {
		if (isLeave)
			return basicInformationPersistence.findByIsLeave(1);
		else
			return basicInformationPersistence.findByIsLeave(0);
	}

	public BasicInformation findByUserId(long userId) throws SystemException {
		BasicInformation basicInformation = null;

		try {
			basicInformation = basicInformationPersistence.findByUserId(userId);
		} catch (NoSuchBasicInformationException nsbie) {
			basicInformation = new BasicInformationImpl();
		}

		return basicInformation;
	}
}