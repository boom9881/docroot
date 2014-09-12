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
import com.shuntian.portlet.intranet.model.Department;
import com.shuntian.portlet.intranet.model.impl.DepartmentImpl;

public class DepartmentFinderImpl extends BasePersistenceImpl<Department>
		implements DepartmentFinder {

	public int countByName(String name) throws SystemException {
		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"select count(d.id_) as COUNT_VALUE from intranet_department d where ");
			if (Validator.isNotNull(name)) {
				sql.append("LOWER(d.`name`) like ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
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

	public List<Department> findByName(String name, int start, int end)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"select * from intranet_department d where ");
			if (Validator.isNotNull(name)) {
				sql.append(" LOWER(d.`name`) like ? and ");
			}
			sql.append(" 1 = 1 order by d.createdate asc");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addEntity("Department", DepartmentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(name)) {
				qPos.add(StringPool.PERCENT + StringUtil.lowerCase(name)
						+ StringPool.PERCENT);
			}

			return (List<Department>) QueryUtil.list(q, getDialect(), start,
					end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
