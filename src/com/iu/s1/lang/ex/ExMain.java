package com.iu.s1.lang.ex;

public class ExMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		System.out.println(t1.name);
		System.out.println(t2.age);
		//t1과 t2를 담을 수 있는 배열 선언
		//모을려고하는데이터타입 [] 변수명 = new 모을려고하는데이터타입[갯수]
		//상속과 다형성
		Object [] tests = new Object[2];
		tests[0]=t1;
		tests[1]=t2;
		System.out.println(((Test1)tests[0]).name);
		System.out.println(((Test2)tests[1]).age);
		
		tests = new Object[0];
		
		System.out.println(tests.length);
		
		ObjectArray objectArray = new ObjectArray();
		
		System.out.println(objectArray.ar.length);//0
		
		objectArray.add(t1);
		objectArray.add(t2);
		
		System.out.println(objectArray.ar.length);//2
		
		
		
		

	}

}
