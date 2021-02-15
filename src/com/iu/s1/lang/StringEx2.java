package com.iu.s1.lang;

import java.util.Scanner;

public class StringEx2 {
	

	//ex1
	//문자열 입력
	//전보 :1글자당 100원  5글자 -> 500원
	//최종 금액 출력
	//next(), nextLine()
	
	//ex2
	//문자열 입력    ex) Hello World 
	//문자 1글자 입력 ex) l
	//글자의 갯수 출력 ex) 3
	Scanner sc;
	private String word;
	private String word2;

	//전보 1글자당 100원 5ㅈ글자 500원
	//최종 금액 출력
	public StringEx2() {//생성자
		sc=new Scanner(System.in);
	}

	public void ex2() {
			StringEx2 str2 = new StringEx2();
	
			System.out.println("입력하세요");
			str2.word=sc.next();
			System.out.println("출력할 걸 적으세요");
			str2.word2=sc.next();
			System.out.println(str2.word);
			System.out.println(str2.word2);
			int num=10;
			char ch = 'a';
			
			
	}

	

}
