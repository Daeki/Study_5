package com.iu.s1.util.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_5 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//2020-02-19 12:42
		String format="yyyy-MM-dd HH:mm:ss E";
		
		SimpleDateFormat sd = new SimpleDateFormat(format);
		String str = sd.format(calendar.getTime());
		System.out.println(str);
		
		System.out.println(sd.toPattern());
		
		format = "yyyy+MM+dd";
		sd.applyPattern(format);
		str=sd.format(calendar.getTime());
		System.out.println(str);
		
		
		sd = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sd.parse("2002-03-12");
			
			long t = date.getTime();
			
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(t);
			//Calendar
			
			System.out.println(date);
			System.out.println(c.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
