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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.shuntian.portlet.intranet.model.BasicInformationClp;
import com.shuntian.portlet.intranet.model.EducationClp;
import com.shuntian.portlet.intranet.model.ExtInformationClp;
import com.shuntian.portlet.intranet.model.FamilyRelationshipClp;
import com.shuntian.portlet.intranet.model.WorkExperienceClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"intranet-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"intranet-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "intranet-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(BasicInformationClp.class.getName())) {
			return translateInputBasicInformation(oldModel);
		}

		if (oldModelClassName.equals(EducationClp.class.getName())) {
			return translateInputEducation(oldModel);
		}

		if (oldModelClassName.equals(ExtInformationClp.class.getName())) {
			return translateInputExtInformation(oldModel);
		}

		if (oldModelClassName.equals(FamilyRelationshipClp.class.getName())) {
			return translateInputFamilyRelationship(oldModel);
		}

		if (oldModelClassName.equals(WorkExperienceClp.class.getName())) {
			return translateInputWorkExperience(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputBasicInformation(BaseModel<?> oldModel) {
		BasicInformationClp oldClpModel = (BasicInformationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBasicInformationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEducation(BaseModel<?> oldModel) {
		EducationClp oldClpModel = (EducationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEducationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputExtInformation(BaseModel<?> oldModel) {
		ExtInformationClp oldClpModel = (ExtInformationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getExtInformationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFamilyRelationship(BaseModel<?> oldModel) {
		FamilyRelationshipClp oldClpModel = (FamilyRelationshipClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFamilyRelationshipRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputWorkExperience(BaseModel<?> oldModel) {
		WorkExperienceClp oldClpModel = (WorkExperienceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getWorkExperienceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.BasicInformationImpl")) {
			return translateOutputBasicInformation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.EducationImpl")) {
			return translateOutputEducation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.ExtInformationImpl")) {
			return translateOutputExtInformation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.FamilyRelationshipImpl")) {
			return translateOutputFamilyRelationship(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.WorkExperienceImpl")) {
			return translateOutputWorkExperience(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchBasicInformationException")) {
			return new com.shuntian.portlet.intranet.NoSuchBasicInformationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchEducationException")) {
			return new com.shuntian.portlet.intranet.NoSuchEducationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchExtInformationException")) {
			return new com.shuntian.portlet.intranet.NoSuchExtInformationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException")) {
			return new com.shuntian.portlet.intranet.NoSuchFamilyRelationshipException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchWorkExperienceException")) {
			return new com.shuntian.portlet.intranet.NoSuchWorkExperienceException();
		}

		return throwable;
	}

	public static Object translateOutputBasicInformation(BaseModel<?> oldModel) {
		BasicInformationClp newModel = new BasicInformationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBasicInformationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEducation(BaseModel<?> oldModel) {
		EducationClp newModel = new EducationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEducationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputExtInformation(BaseModel<?> oldModel) {
		ExtInformationClp newModel = new ExtInformationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setExtInformationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFamilyRelationship(
		BaseModel<?> oldModel) {
		FamilyRelationshipClp newModel = new FamilyRelationshipClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFamilyRelationshipRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputWorkExperience(BaseModel<?> oldModel) {
		WorkExperienceClp newModel = new WorkExperienceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setWorkExperienceRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}