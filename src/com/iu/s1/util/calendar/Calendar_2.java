package com.iu.s1.util.calendar;

import java.util.Calendar;

public class Calendar_2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		calendar.set(Calendar.YEAR, 2017);
		
		calendar.set(Calendar.YEAR, 2100);
		
		//12월
		calendar.set(Calendar.MONTH, 12-1);
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		
		calendar.set(2020,0,1);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

	}

}
