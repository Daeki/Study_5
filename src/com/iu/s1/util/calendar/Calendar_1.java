package com.iu.s1.util.calendar;

import java.util.Calendar;

public class Calendar_1 {

	public static void main(String[] args) {
		
		//현재날짜 현재 시간
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//년도
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year+ "년");
		//월
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month+1+"월");
		//1월 = 0
		//2월 = 1
		//12월 = 11
		
		//일
		int date = calendar.get(Calendar.DATE);
		System.out.println(date+"일");
		
		//시
		int hour = calendar.get(Calendar.HOUR_OF_DAY);//1-12
		System.out.println(hour +"시");
		//분
		int min = calendar.get(Calendar.MINUTE);
		System.out.println(min+"분");
		//초
		int second = calendar.get(Calendar.SECOND);
		System.out.println(second+"초");
		
		int mis = calendar.get(Calendar.MILLISECOND);
		System.out.println(min);
		
		

	}

}
