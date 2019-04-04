package com.yks.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
//输入日期计算相差多少天
public class TypeSort {
	public static void main(String[] args) throws ParseException {

		Calendar before = Calendar.getInstance();
		before.set(2008, 2,28);
		Calendar after = Calendar.getInstance();
		after.set(2009, 2, 28);
		System.out.println(gapday(before, after));
	}

	public static Integer gapday(Calendar before, Calendar after) {
		Integer gapday = 0;
		for (int i = (before.get(Calendar.YEAR) + 1); i <= after.get(Calendar.YEAR); i++) {
			if (isleepmonth(i)) {
				gapday = gapday + 366;
			} else
				gapday = gapday + 365;
		}


			return gapday + days(after) - days(before);
	}

	public static Integer days(Calendar cal) {
		int num = 0;
		for (int i = 0; i < cal.get(Calendar.MONTH)-1; i++) {
			num = num + getmonth(i, isleepmonth(cal.get(Calendar.YEAR)));
		}
		return num + cal.get(Calendar.DATE);

	}

	public static Integer getmonth(int month, boolean leepmonth) {
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] monthleep = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (!leepmonth)
			return months[month];
		else {
			return monthleep[month];
		}
	}

	public static Boolean isleepmonth(int year) {

		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
