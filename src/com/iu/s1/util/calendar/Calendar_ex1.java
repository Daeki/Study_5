package com.iu.s1.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_ex1 {

	public static void main(String[] args) {
		//년, 월, 일, 시 입력 //2010, 1, 2, 13 
		//15시 후 날짜 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		int year = sc.nextInt();
		System.out.println("월 입력");
		int month = sc.nextInt();
		System.out.println("일 입력");
		int date = sc.nextInt();
		System.out.println("시 입력");
		int hour = sc.nextInt();
		
		Calendar calendar =Calendar.getInstance();
		calendar.set(year, month-1, date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		
		System.out.println(calendar.getTime());
		
		long time = calendar.getTimeInMillis();
		time = time + 1000*60*60*15;
		
		calendar.setTimeInMillis(time);
		
		System.out.println(calendar.getTime());
		
		

	}

}
