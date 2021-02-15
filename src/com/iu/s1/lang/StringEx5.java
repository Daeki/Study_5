package com.iu.s1.lang;

import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		
		//파일명을 확장자 포함 입력
		//ex) test.jpg, test.txt
		//jpg, gif, png, jpeg 이미지파일
		
		//이미지파일 여부 판단 후 출력
		
		//test.jpg는 이미지 파일
		//test.txt는 이미지 파일이 아님
		//test2.text.jpg
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "gif", "png", "jpeg"};
		System.out.println("파일 명 입력");
		String name = sc.next();//
		int index = name.lastIndexOf(".");
		String result = name.substring(index+1);
		System.out.println(result);
		
		boolean check=false;//true 이미지, false 다른파일
		
		for(int i=0;i<names.length;i++) {
			if(result.equals(names[i])) {
				check=true;
				break;
			}
		}
		
		if(check) {
			System.out.println(name+" 는 이미지 파일입니다");
		}else {
			System.out.println(name+" 는 이미지 파일이 아닙니다");
		}
		
		
		
		
		

	}

}
