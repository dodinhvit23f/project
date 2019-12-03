package common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.math.NumberUtils;
import org.hibernate.Session;

public final class Utility {
	public static int convertInt(String number) {
		if (number == null || number.length() == 0) {
			throw new NullPointerException(" chuyen vao null hoac rong");
		}
		if (!NumberUtils.isParsable(number)) {
			throw new NumberFormatException(" chuoi truyen vao khong phai la so");
		}
		return Integer.parseInt(number);
	}

	public static long convertLong(String number) {
		if (number == null || number.length() == 0) {
			throw new NullPointerException(" chuyen vao null hoac rong");
		}
		if (!NumberUtils.isParsable(number)) {
			throw new NumberFormatException(" chuoi truyen vao khong phai la so");
		}
		return Long.parseLong(number);
	}

	public static Double convertDouble(String number) {
		if (number == null || number.length() == 0) {
			throw new NullPointerException(" chuyen vao null hoac rong");
		}
		if (!NumberUtils.isParsable(number)) {
			throw new NumberFormatException(" chuoi truyen vao khong phai la so");
		}
		return Double.parseDouble(number);
	}

	public static void closeSession(Session session) {
		if (session == null) {
			return;
		}
		session.close();
	}

	public static String stringCN(String string) {
		return (string == null) ? "" : string;
	}

	public static String formatString(String string) {
		return stringCN(string).trim();
	}

	public static Date fomatDate(String date) throws Exception {
		if (date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		dateformt.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateformt.parse(date);
	}
	
	public static String dateToString(Date date) throws Exception{
		if(date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		return dateformt.format(date);
	}
}
