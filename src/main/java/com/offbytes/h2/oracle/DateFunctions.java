package com.offbytes.h2.oracle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFunctions {

	public static Date toDate(String text, String format) throws Exception {
		String javaFormat = format.replace('Y', 'y')
				.replace("D", "d")
				.replace("SS", "s")
				.replace("MI", "m")
				.replace("Month", "MMMMM")
				.replace("Mon", "MMM");
		
		SimpleDateFormat sdf = new SimpleDateFormat(javaFormat, Locale.ENGLISH);
		return sdf.parse(text);
	}
	
}