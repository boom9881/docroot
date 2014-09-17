package com.shuntian.portlet.intranet.service.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import com.shuntian.portlet.intranet.model.Overtime;

public class OvertimeFinderImpl extends BasePersistenceImpl<Overtime> implements
		OvertimeFinder {

	public int search(long departmentId, long searchUserId, String searchYear,
			String searchMonth, String name) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"SELECT COUNT(ot.id_) as COUNT_VALUE ");
			sql.append("FROM intranet_overtime ot LEFT JOIN intranet_basicinformation bi ON ot.userId = bi.id_ ");
			sql.append("LEFT JOIN intranet_department dep ON bi.departmentId = dep.id_ WHERE ");
			if (Validator.isNotNull(searchYear)) {
				sql.append(" ot.overtimeYear = ? and ");
			}
			if (Validator.isNotNull(searchMonth)) {
				sql.append(" ot.overtimeMonthly = ? and ");
			}

			if (Validator.isNotNull(departmentId)) {
				sql.append(" bi.departmentId = ? and ");
			}
			if (Validator.isNotNull(name)) {
				sql.append(" LOWER(bi.`name`) like ? and ");
			}
			if (Validator.isNotNull(searchUserId)) {
				sql.append(" bi.userId = ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(searchYear)) {
				qPos.add(searchYear);
			}
			if (Validator.isNotNull(searchMonth)) {
				qPos.add(searchMonth);
			}
			if (Validator.isNotNull(departmentId)) {
				qPos.add(departmentId);
			}
			if (Validator.isNotNull(name)) {
				qPos.add(StringPool.PERCENT + StringUtil.lowerCase(name)
						+ StringPool.PERCENT);
			}
			if (Validator.isNotNull(searchUserId)) {
				qPos.add(searchUserId);
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

	public List<Map<String, String>> search(long departmentId,
			long searchUserId, String searchYear, String searchMonth,
			String name, int start, int end) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"SELECT ot.id_,bi.name,ot.usuallyOvertime,ot.restOvertime,ot.legalOvertime,");
			sql.append("ot.overtimeYear,ot.overtimeMonthly,bi.id_ as biId,dep.`name` AS dn ");
			sql.append("FROM intranet_overtime ot LEFT JOIN intranet_basicinformation bi ON ot.userId = bi.id_ ");
			sql.append("LEFT JOIN intranet_department dep ON bi.departmentId = dep.id_ WHERE ");
			if (Validator.isNotNull(searchYear)) {
				sql.append(" ot.overtimeYear = ? and ");
			}
			if (Validator.isNotNull(searchMonth)) {
				sql.append(" ot.overtimeMonthly = ? and ");
			}
			if (Validator.isNotNull(departmentId)) {
				sql.append(" bi.departmentId = ? and ");
			}
			if (Validator.isNotNull(name)) {
				sql.append(" LOWER(bi.`name`) like ? and ");
			}
			if (Validator.isNotNull(searchUserId)) {
				sql.append(" bi.userId = ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(searchYear)) {
				qPos.add(searchYear);
			}
			if (Validator.isNotNull(searchMonth)) {
				qPos.add(searchMonth);
			}
			if (Validator.isNotNull(departmentId)) {
				qPos.add(departmentId);
			}
			if (Validator.isNotNull(name)) {
				qPos.add(StringPool.PERCENT + StringUtil.lowerCase(name)
						+ StringPool.PERCENT);
			}
			if (Validator.isNotNull(searchUserId)) {
				qPos.add(searchUserId);
			}

			List<Map<String, String>> result = new ArrayList<Map<String, String>>();

			List<Object[]> list = (List<Object[]>) QueryUtil.list(q,
					getDialect(), start, end);

			for (Object[] obj : list) {
				Map<String, String> m = new HashMap<String, String>();

				m.put("id", obj[0].toString());
				m.put("name", obj[1].toString());
				m.put("biId", obj[7].toString());
				m.put("usuallyOvertime", obj[2].toString());
				m.put("restOvertime", obj[3].toString());
				m.put("legalOvertime", obj[4].toString());
				m.put("year", obj[5].toString());
				m.put("month", obj[6].toString());
				m.put("dep", obj[8].toString());

				result.add(m);
			}

			return result;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
