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
import com.shuntian.portlet.intranet.model.Attendance;

public class AttendanceFinderImpl extends BasePersistenceImpl<Attendance>
		implements AttendanceFinder {

	public int search(long departmentId, long searchUserId, int status,
			long approver, String attendanceYear, String attendanceMonth,
			String name) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"select COUNT(att.id_) as COUNT_VALUE from intranet_attendance att LEFT JOIN intranet_basicinformation bi ON att.userId = bi.id_ where ");
			if (Validator.isNotNull(attendanceYear)) {
				sql.append(" att.attendanceYear = ? and ");
			}
			if (Validator.isNotNull(attendanceMonth)) {
				sql.append(" att.attendanceMonth = ? and ");
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
			if(Validator.isNotNull(status)){
				sql.append(" att.status = ? and ");
			}
			if(Validator.isNotNull(approver)){
				sql.append(" att.approver = ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(attendanceYear)) {
				qPos.add(attendanceYear);
			}
			if (Validator.isNotNull(attendanceMonth)) {
				qPos.add(attendanceMonth);
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
			if(Validator.isNotNull(status)){
				qPos.add(status);
			}
			if(Validator.isNotNull(approver)){
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
			long searchUserId, int status, long approver,
			String attendanceYear, String attendanceMonth, String name,
			int start, int end) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			StringBuffer sql = new StringBuffer(
					"SELECT att.id_,att.shouldAttendance,");
			sql.append("att.actualAttendance,att.attendanceYear,att.attendanceMonth,bi.`name`,");
			sql.append("dep.`name` AS dn,bi.id_ ");
			sql.append("FROM intranet_attendance att LEFT JOIN intranet_basicinformation bi ON att.userId = bi.id_ ");
			sql.append("LEFT JOIN intranet_department dep ON bi.departmentId = dep.id_ WHERE ");
			if (Validator.isNotNull(attendanceYear)) {
				sql.append(" att.attendanceYear = ? and ");
			}
			if (Validator.isNotNull(attendanceMonth)) {
				sql.append(" att.attendanceMonth = ? and ");
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
			if(Validator.isNotNull(status)){
				sql.append(" att.status = ? and ");
			}
			if(Validator.isNotNull(approver)){
				sql.append(" att.approver = ? and ");
			}
			sql.append(" 1 = 1");

			SQLQuery q = session.createSQLQuery(sql.toString());

			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(attendanceYear)) {
				qPos.add(attendanceYear);
			}
			if (Validator.isNotNull(attendanceMonth)) {
				qPos.add(attendanceMonth);
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
			if(Validator.isNotNull(status)){
				qPos.add(status);
			}
			if(Validator.isNotNull(approver)){
				qPos.add(approver);
			}

			List<Map<String, String>> result = new ArrayList<Map<String, String>>();

			List<Object[]> list = (List<Object[]>) QueryUtil.list(q,
					getDialect(), start, end);

			for (Object[] obj : list) {
				Map<String, String> m = new HashMap<String, String>();

				m.put("id", getValue(obj[0]));
				m.put("name", getValue(obj[5]));
				m.put("department", getValue(obj[6]));
				m.put("year", getValue(obj[3]));
				m.put("month", getValue(obj[4]));
				m.put("should", getValue(obj[1]));
				m.put("actual", getValue(obj[2]));
				m.put("biId", getValue(obj[7]));

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
