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

import com.shuntian.portlet.intranet.model.SatffClp;
import com.shuntian.portlet.intranet.model.basic_informationClp;
import com.shuntian.portlet.intranet.model.educationClp;
import com.shuntian.portlet.intranet.model.ext_informationClp;
import com.shuntian.portlet.intranet.model.familyClp;
import com.shuntian.portlet.intranet.model.workClp;

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

		if (oldModelClassName.equals(basic_informationClp.class.getName())) {
			return translateInputbasic_information(oldModel);
		}

		if (oldModelClassName.equals(educationClp.class.getName())) {
			return translateInputeducation(oldModel);
		}

		if (oldModelClassName.equals(ext_informationClp.class.getName())) {
			return translateInputext_information(oldModel);
		}

		if (oldModelClassName.equals(familyClp.class.getName())) {
			return translateInputfamily(oldModel);
		}

		if (oldModelClassName.equals(SatffClp.class.getName())) {
			return translateInputSatff(oldModel);
		}

		if (oldModelClassName.equals(workClp.class.getName())) {
			return translateInputwork(oldModel);
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

	public static Object translateInputbasic_information(BaseModel<?> oldModel) {
		basic_informationClp oldClpModel = (basic_informationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getbasic_informationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputeducation(BaseModel<?> oldModel) {
		educationClp oldClpModel = (educationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.geteducationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputext_information(BaseModel<?> oldModel) {
		ext_informationClp oldClpModel = (ext_informationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getext_informationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputfamily(BaseModel<?> oldModel) {
		familyClp oldClpModel = (familyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getfamilyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSatff(BaseModel<?> oldModel) {
		SatffClp oldClpModel = (SatffClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSatffRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputwork(BaseModel<?> oldModel) {
		workClp oldClpModel = (workClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getworkRemoteModel();

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
					"com.shuntian.portlet.intranet.model.impl.basic_informationImpl")) {
			return translateOutputbasic_information(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.educationImpl")) {
			return translateOutputeducation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.ext_informationImpl")) {
			return translateOutputext_information(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.familyImpl")) {
			return translateOutputfamily(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.SatffImpl")) {
			return translateOutputSatff(oldModel);
		}

		if (oldModelClassName.equals(
					"com.shuntian.portlet.intranet.model.impl.workImpl")) {
			return translateOutputwork(oldModel);
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
					"com.shuntian.portlet.intranet.NoSuchbasic_informationException")) {
			return new com.shuntian.portlet.intranet.NoSuchbasic_informationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSucheducationException")) {
			return new com.shuntian.portlet.intranet.NoSucheducationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchext_informationException")) {
			return new com.shuntian.portlet.intranet.NoSuchext_informationException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchfamilyException")) {
			return new com.shuntian.portlet.intranet.NoSuchfamilyException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchSatffException")) {
			return new com.shuntian.portlet.intranet.NoSuchSatffException();
		}

		if (className.equals(
					"com.shuntian.portlet.intranet.NoSuchworkException")) {
			return new com.shuntian.portlet.intranet.NoSuchworkException();
		}

		return throwable;
	}

	public static Object translateOutputbasic_information(BaseModel<?> oldModel) {
		basic_informationClp newModel = new basic_informationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setbasic_informationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputeducation(BaseModel<?> oldModel) {
		educationClp newModel = new educationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.seteducationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputext_information(BaseModel<?> oldModel) {
		ext_informationClp newModel = new ext_informationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setext_informationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputfamily(BaseModel<?> oldModel) {
		familyClp newModel = new familyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setfamilyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSatff(BaseModel<?> oldModel) {
		SatffClp newModel = new SatffClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSatffRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputwork(BaseModel<?> oldModel) {
		workClp newModel = new workClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setworkRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}