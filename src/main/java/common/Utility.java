package common;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.math.NumberUtils;

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

	public static void closeObject(Closeable manager) {
		if (manager == null) { 
			return;
		}
		try {
			manager.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String NullToEmty(String string) {
		return (string == null) ? "" : string;
	}
	

	public static String formatString(String string) {
		return NullToEmty(string).trim();
	}

	public static Date fomatDateTime(String date) throws Exception {
		if (date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		dateformt.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateformt.parse(date);
	}

	public static Date fomatDate(String date) throws Exception {
		if (date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd");
		dateformt.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateformt.parse(date);
	}

    /**
     *
     * @param date
     * @return DATE
     * @throws Exception
     */
    public static Date fomatDate(long date) throws Exception {
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd");
		dateformt.setTimeZone(TimeZone.getTimeZone("UTC"));
		return fomatDate(dateformt.format(new Date(date)));
	}

	public static String dateTimeToString(Date date) throws Exception {
		if (date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		return dateformt.format(date);
	}

	public static String dateToString(Date date) throws Exception {
		if (date == null) {
			return null;
		}
		DateFormat dateformt = new SimpleDateFormat("yyyy/MM/dd");
		return dateformt.format(date);
	}

	public static void copyFileUsingStream(File source, File dest) throws Exception {
		InputStream is = null;
		OutputStream os = null;
		//if (!dest.mkdir()){
			//dest.mkdirs(); 
                            if(!dest.exists()) 
                                dest.createNewFile();
               // }
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			Utility.closeObject(is);
			Utility.closeObject(os);
		}
	}
	
	public static String hash (String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		if(string == null) {
			return "";
		}
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedhash = digest.digest(
				string.getBytes(StandardCharsets.UTF_8));
		return String.format("%064x", new BigInteger(1, encodedhash)); 
	}
	
	public static byte[] base64Decode (String string){
		return Base64.getDecoder().decode(string);
	}
}