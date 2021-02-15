package com.iu.s1.lang;

public class ObjectMain {

	public static void main(String[] args) {
		//클래스명 참조변수명 = new 생성자();
		Object obj = new Object();
		Object obj2 = new Object();
		//메서드 선언 공식
		//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}
		
		//메서드 호출
		//참조변수명.메서드명()
		boolean check = obj.equals(obj2);
		
		System.out.println(check);
		System.out.println(obj == obj2);
		System.out.println(obj == obj);
		
		String str= obj.toString();
		System.out.println(str);
		System.out.println(obj);//== obj.toString()
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		

	}

}
