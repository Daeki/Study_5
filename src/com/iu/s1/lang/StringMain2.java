package com.iu.s1.lang;

public class StringMain2 {

	public static void main(String[] args) {
		String str = "Hello World";
		
		//indexOf 메서드 호출 결과 출력
		int result = str.indexOf('o');
		System.out.println(result);
		
		result = str.indexOf('o', result+1);
		System.out.println(result);
		
		StringEx2 s2 = new StringEx2();
		s2.ex2();
		
	}

}
