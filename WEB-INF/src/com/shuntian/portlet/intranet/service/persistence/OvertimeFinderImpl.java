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

	public int search(long departmentId, long searchUserId, int status,
			long approver, String searchYear, String searchMonth, String name)
			throws SystemException {

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
			if (Validator.isNotNull(status)) {
				sql.append(" ot.status = ? and ");
			}
			if (Validator.isNotNull(approver)) {
				sql.append(" ot.approver = ? and ");
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
			if (Validator.isNotNull(status)) {
				qPos.add(status);
			}
			if (Validator.isNotNull(approver)) {
				qPos.add(approver);
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
			long searchUserId, int status, long approver, String searchYear,
			String searchMonth, String name, int start, int end)
			throws SystemException {

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
			if (Validator.isNotNull(status)) {
				sql.append(" ot.status = ? and ");
			}
			if (Validator.isNotNull(approver)) {
				sql.append(" ot.approver = ? and ");
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
			if (Validator.isNotNull(status)) {
				qPos.add(status);
			}
			if (Validator.isNotNull(approver)) {
				qPos.add(approver);
			}

			List<Map<String, String>> result = new ArrayList<Map<String, String>>();

			List<Object[]> list = (List<Object[]>) QueryUtil.list(q,
					getDialect(), start, end);

			for (Object[] obj : list) {
				Map<String, String> m = new HashMap<String, String>();

				m.put("id", getValue(obj[0]));
				m.put("name", getValue(obj[1]));
				m.put("biId", getValue(obj[7]));
				m.put("usuallyOvertime", getValue(obj[2]));
				m.put("restOvertime", getValue(obj[3]));
				m.put("legalOvertime", getValue(obj[4]));
				m.put("year", getValue(obj[5]));
				m.put("month", getValue(obj[6]));
				m.put("dep", getValue(obj[8]));

				result.add(m);
			}

			return result;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	private String getValue(Object v) {
		if (Validator.isNull(v)) {
			return StringPool.BLANK;
		}

		return v.toString();
	}
}
