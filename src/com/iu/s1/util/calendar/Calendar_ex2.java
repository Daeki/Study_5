package com.iu.s1.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_ex2 {

	public static void main(String[] args) {
		//생년월일 입력
		//나이 계산
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		//int year = sc.nextInt();
		System.out.println("월 입력");
		//int month = sc.nextInt();
		System.out.println("일 입력");
		//int date = sc.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(1991, 2, 5);
		
		long ca1 = calendar.getTimeInMillis();//현재
		long ca2 = birth.getTimeInMillis();//과거
		
		long result = ca1-ca2;
		System.out.println(calendar.getTime());
		System.out.println(birth.getTime());
		System.out.println(result);
		result = result/(1000*60*60*24);
		result = result/365;
		System.out.println(result);
		

	}

}
