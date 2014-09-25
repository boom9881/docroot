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

package com.shuntian.portlet.intranet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BasicInformation. This utility wraps
 * {@link com.shuntian.portlet.intranet.service.impl.BasicInformationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BasicInformationLocalService
 * @see com.shuntian.portlet.intranet.service.base.BasicInformationLocalServiceBaseImpl
 * @see com.shuntian.portlet.intranet.service.impl.BasicInformationLocalServiceImpl
 * @generated
 */
public class BasicInformationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.shuntian.portlet.intranet.service.impl.BasicInformationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the basic information to the database. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation addBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBasicInformation(basicInformation);
	}

	/**
	* Creates a new basic information with the primary key. Does not add the basic information to the database.
	*
	* @param id the primary key for the new basic information
	* @return the new basic information
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation createBasicInformation(
		long id) {
		return getService().createBasicInformation(id);
	}

	/**
	* Deletes the basic information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the basic information
	* @return the basic information that was removed
	* @throws PortalException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation deleteBasicInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBasicInformation(id);
	}

	/**
	* Deletes the basic information from the database. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation deleteBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBasicInformation(basicInformation);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.shuntian.portlet.intranet.model.BasicInformation fetchBasicInformation(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBasicInformation(id);
	}

	/**
	* Returns the basic information with the primary key.
	*
	* @param id the primary key of the basic information
	* @return the basic information
	* @throws PortalException if a basic information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation getBasicInformation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBasicInformation(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the basic informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.shuntian.portlet.intranet.model.impl.BasicInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basic informations
	* @param end the upper bound of the range of basic informations (not inclusive)
	* @return the range of basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> getBasicInformations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBasicInformations(start, end);
	}

	/**
	* Returns the number of basic informations.
	*
	* @return the number of basic informations
	* @throws SystemException if a system exception occurred
	*/
	public static int getBasicInformationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBasicInformationsCount();
	}

	/**
	* Updates the basic information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param basicInformation the basic information
	* @return the basic information that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.shuntian.portlet.intranet.model.BasicInformation updateBasicInformation(
		com.shuntian.portlet.intranet.model.BasicInformation basicInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBasicInformation(basicInformation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void editStaff(long companyId, java.lang.String portletName,
		long id, long userId, long curUserId, java.lang.String newPassword1,
		java.lang.String newPassword2,
		com.shuntian.portlet.intranet.model.BasicInformation bi,
		com.shuntian.portlet.intranet.model.ExtInformation ei,
		java.util.List<com.shuntian.portlet.intranet.model.Education> edus,
		java.util.List<com.shuntian.portlet.intranet.model.WorkExperience> wes,
		java.util.List<com.shuntian.portlet.intranet.model.FamilyRelationship> frs,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.editStaff(companyId, portletName, id, userId, curUserId,
			newPassword1, newPassword2, bi, ei, edus, wes, frs, serviceContext);
	}

	public static void leave(long id, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().leave(id, userId);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		boolean isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByIsLeave(isLeave);
	}

	public static int countByIsLeave(boolean isLeave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByIsLeave(isLeave);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByIsLeave(
		boolean isLeave, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByIsLeave(isLeave, start, end);
	}

	public static com.shuntian.portlet.intranet.model.BasicInformation findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUserId(userId);
	}

	public static int countByDepAndName(long departmentId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByDepAndName(departmentId, name);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findByDepAndName(
		long departmentId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDepAndName(departmentId, name, start, end);
	}

	public static java.util.List<com.shuntian.portlet.intranet.model.BasicInformation> findListByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findListByUserId(userId);
	}

	public static int countByListUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByListUserId(userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static BasicInformationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BasicInformationLocalService.class.getName());

			if (invokableLocalService instanceof BasicInformationLocalService) {
				_service = (BasicInformationLocalService)invokableLocalService;
			}
			else {
				_service = new BasicInformationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BasicInformationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BasicInformationLocalService service) {
	}

	private static BasicInformationLocalService _service;
}