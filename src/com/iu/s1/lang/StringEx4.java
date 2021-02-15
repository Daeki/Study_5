package com.iu.s1.lang;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		
		String str="hello,world,My Country";
		//1. 
		//str1 = "hello"
		//str2 = "world"
		int index = str.indexOf(",");
		String str1 = str.substring(0, index);
		int endindex= str.indexOf(",", index+1);
		String str2 = str.substring(index+1, endindex);
		System.out.println(str1);
		System.out.println(str2);
		
		
		//2. Scanner로 입력 받은 문자열을
		// , 기준으로 잘라서 출력
		// ex) test,world
		// test
		// world 
		Scanner sc =new Scanner(System.in);
		System.out.println("문자열 입력");
		str = sc.nextLine();
		// test,test2,test3
		boolean check=true;
		int startIndex=0;
		int lastIndex=0;
		while(check) {
			
			lastIndex = str.indexOf(",", startIndex);//10
			
//			if(lastIndex == -1) {
//				lastIndex = str.length();
//				check=false;
//			}
//			
//			str1 = str.substring(startIndex, lastIndex);
			
			if(lastIndex == -1) {
				str1 = str.substring(startIndex);
				check=false;
			}else {
		
				str1 = str.substring(startIndex, lastIndex);
			}
			System.out.println(str1);
			startIndex=lastIndex+1;//11
			
		}
		
		
		

	}

}
