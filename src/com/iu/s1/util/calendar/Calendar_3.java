package com.iu.s1.util.calendar;

import java.util.Calendar;

public class Calendar_3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(time);
		time = time + 1000*60*60*24;
		calendar.setTimeInMillis(time);
		
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.DATE));
		
		
		
	}

}
