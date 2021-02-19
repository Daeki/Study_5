package com.iu.s1.util.calendar;

import java.util.Calendar;

public class Calendar_4 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.roll(Calendar.HOUR_OF_DAY, 24);
		
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.HOUR_OF_DAY, 24);
		System.out.println(calendar.getTime());

	}

}
