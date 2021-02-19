package com.iu.s1.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream_1 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		InputStream is = System.in;
		System.out.println("입력");
		int result=0;
		try {
			result = is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println((char)result);
		
		System.out.println("프로그램 종료");

	}

}
