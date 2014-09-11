package com.shuntian.portlet.intranet.util;

public class OverTimeSum {
	public static double sum(double usuallyOvertime, double restOvertime,
			double legalOvertime) {

		return (usuallyOvertime * 1.5) + (restOvertime * 2)
				+ (legalOvertime * 3);
	}
}
