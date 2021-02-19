package com.iu.s1.exception;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		String name = sc.next();
		
		try {
			int num2 = Integer.parseInt(name);
		
			int num=10;
		
		
			num = num /num2;//num20
			//throw new ArithmeticException();
			String str=null;
			
			if(num2 !=0) {
				str.toString();
				//throw new NullpointExcetion();
			}
			
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("객체를 생성하세요");
		}catch (Exception e) {
			// TODO: handle exception
		}catch (Throwable e) {
			// TODO: handle exception
		}finally {
			//예외가 발생하든 안하든 무조건 실행되는 구문
		}
		System.out.println(num);
		
		System.out.println("Finish");
	}

}
