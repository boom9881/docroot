package com.shuntian.portlet.intranet.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.shuntian.portlet.intranet.model.BasicInformation;
import com.shuntian.portlet.intranet.model.impl.BasicInformationImpl;

public class BasicInformationFinderImpl extends
		BasePersistenceImpl<BasicInformation> implements BasicInformationFinder {

	public int countByDepAndName(long departmentId, String name)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"select count(bi.id_) as COUNT_VALUE from intranet_basicinformation bi where ");
			if (Validator.isNotNull(departmentId)) {
				sql.append(" bi.departmentId = ? and ");
			}
			if (Validator.isNotNull(name)) {
				sql.append(" LOWER(bi.`name`) like ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(departmentId)) {
				qPos.add(departmentId);
			}
			if (Validator.isNotNull(name)) {
				qPos.add(StringPool.PERCENT + StringUtil.lowerCase(name)
						+ StringPool.PERCENT);
			}

			int count = 0;

			Iterator<Long> itr = q.iterate();

			while (itr.hasNext()) {
				Long l = itr.next();

				if (l != null) {
					count += l.intValue();
				}
			}

			return count;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<BasicInformation> findByDepAndName(long departmentId, String name,
			int start, int end) throws SystemException {
		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"select * from intranet_basicinformation bi where ");
			if (Validator.isNotNull(departmentId)) {
				sql.append(" bi.departmentId = ? and ");
			}
			if (Validator.isNotNull(name)) {
				sql.append(" LOWER(bi.`name`) like ? and ");
			}
			sql.append(" 1 = 1 order by bi.createdate asc");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addEntity("BasicInformation", BasicInformationImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(departmentId)) {
				qPos.add(departmentId);
			}
			if (Validator.isNotNull(name)) {
				qPos.add(StringPool.PERCENT + StringUtil.lowerCase(name)
						+ StringPool.PERCENT);
			}

			return (List<BasicInformation>) QueryUtil.list(q, getDialect(), start,
					end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
