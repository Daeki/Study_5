package com.iu.s1.lang;

public class StringEx3 {

	public static void main(String[] args) {
		
		//String str1 = new String("Hello World");
		String str1 = "Hello World";
		String str2 = null;
		
		str2 = str1.replace('l', 'A');
		System.out.println(str1);
		System.out.println(str2);
		
		str2 = str1.replace("World", "Iu");
		System.out.println(str1);
		System.out.println(str2);
		
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(str1.toString());
		System.out.println(str1);
		
		str1 = "iu";
		str2 = " i u ";
		str2 = str2.trim();
		str2 = str2.replace(" ", "");
		System.out.println(str1.equals(str2));
		
		int num=10;
		String str3 = String.valueOf(true);
		System.out.println(str3);
		
		str3 ="hello world";
		//subString 사용하고 결과물 출력
		str3 = str3.substring(6, 7);
		System.out.println(str3);
		
		
		
		
		
		

	}

}
