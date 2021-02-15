package com.iu.s1.lang;

import java.util.Scanner;

public class StringEx1 {
	
	private Scanner sc;
	
	public StringEx1() {
		sc = new Scanner(System.in);
	}
	
	//메서드명 ex1
	//주민번호입력 991213-1234567
	//남자 여자 판별
	public void ex1() {
		System.out.println("주민 번호 입력");
		String jumin = sc.next();
		char ch= jumin.charAt(7);
		if(ch == '1' || ch=='3') {
			System.out.println("남성 입니다.");
		}else {
			System.out.println("여성 입니다.");
		}
	}
	
	//메서드명 ex2
	//스캐너를 이용해서 문자하나 입력 받아서  char 대입 출력 메서드
	public void ex2() {
		System.out.println("문자를 입력");
		//String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
	}

}
