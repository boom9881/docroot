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

package com.shuntian.portlet.intranet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the WorkExperience service. Represents a row in the &quot;Intranet_WorkExperience&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.shuntian.portlet.intranet.model.impl.WorkExperienceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkExperience
 * @see com.shuntian.portlet.intranet.model.impl.WorkExperienceImpl
 * @see com.shuntian.portlet.intranet.model.impl.WorkExperienceModelImpl
 * @generated
 */
public interface WorkExperienceModel extends BaseModel<WorkExperience> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a work experience model instance should use the {@link WorkExperience} interface instead.
	 */

	/**
	 * Returns the primary key of this work experience.
	 *
	 * @return the primary key of this work experience
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this work experience.
	 *
	 * @param primaryKey the primary key of this work experience
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this work experience.
	 *
	 * @return the ID of this work experience
	 */
	public long getId();

	/**
	 * Sets the ID of this work experience.
	 *
	 * @param id the ID of this work experience
	 */
	public void setId(long id);

	/**
	 * Returns the user ID of this work experience.
	 *
	 * @return the user ID of this work experience
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this work experience.
	 *
	 * @param userId the user ID of this work experience
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this work experience.
	 *
	 * @return the user uuid of this work experience
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this work experience.
	 *
	 * @param userUuid the user uuid of this work experience
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the we witness of this work experience.
	 *
	 * @return the we witness of this work experience
	 */
	@AutoEscape
	public String getWeWitness();

	/**
	 * Sets the we witness of this work experience.
	 *
	 * @param weWitness the we witness of this work experience
	 */
	public void setWeWitness(String weWitness);

	/**
	 * Returns the we once job of this work experience.
	 *
	 * @return the we once job of this work experience
	 */
	@AutoEscape
	public String getWeOnceJob();

	/**
	 * Sets the we once job of this work experience.
	 *
	 * @param weOnceJob the we once job of this work experience
	 */
	public void setWeOnceJob(String weOnceJob);

	/**
	 * Returns the we work unit of this work experience.
	 *
	 * @return the we work unit of this work experience
	 */
	@AutoEscape
	public String getWeWorkUnit();

	/**
	 * Sets the we work unit of this work experience.
	 *
	 * @param weWorkUnit the we work unit of this work experience
	 */
	public void setWeWorkUnit(String weWorkUnit);

	/**
	 * Returns the we contact phone of this work experience.
	 *
	 * @return the we contact phone of this work experience
	 */
	@AutoEscape
	public String getWeContactPhone();

	/**
	 * Sets the we contact phone of this work experience.
	 *
	 * @param weContactPhone the we contact phone of this work experience
	 */
	public void setWeContactPhone(String weContactPhone);

	/**
	 * Returns the we start time year of this work experience.
	 *
	 * @return the we start time year of this work experience
	 */
	@AutoEscape
	public String getWeStartTimeYear();

	/**
	 * Sets the we start time year of this work experience.
	 *
	 * @param weStartTimeYear the we start time year of this work experience
	 */
	public void setWeStartTimeYear(String weStartTimeYear);

	/**
	 * Returns the we start time month of this work experience.
	 *
	 * @return the we start time month of this work experience
	 */
	@AutoEscape
	public String getWeStartTimeMonth();

	/**
	 * Sets the we start time month of this work experience.
	 *
	 * @param weStartTimeMonth the we start time month of this work experience
	 */
	public void setWeStartTimeMonth(String weStartTimeMonth);

	/**
	 * Returns the we stop time year of this work experience.
	 *
	 * @return the we stop time year of this work experience
	 */
	@AutoEscape
	public String getWeStopTimeYear();

	/**
	 * Sets the we stop time year of this work experience.
	 *
	 * @param weStopTimeYear the we stop time year of this work experience
	 */
	public void setWeStopTimeYear(String weStopTimeYear);

	/**
	 * Returns the we stop time month of this work experience.
	 *
	 * @return the we stop time month of this work experience
	 */
	@AutoEscape
	public String getWeStopTimeMonth();

	/**
	 * Sets the we stop time month of this work experience.
	 *
	 * @param weStopTimeMonth the we stop time month of this work experience
	 */
	public void setWeStopTimeMonth(String weStopTimeMonth);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(WorkExperience workExperience);

	@Override
	public int hashCode();

	@Override
	public CacheModel<WorkExperience> toCacheModel();

	@Override
	public WorkExperience toEscapedModel();

	@Override
	public WorkExperience toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}