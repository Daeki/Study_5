package com.iu.s1.exception;

public class Exception_3 {

	public static void main(String[] args) {
		// 4살
		// 두자릿수
		// 10 +10
		int num1 = 25;
		int num2 = 25;
		try {
		int num3 = num1 + num2;
		
			if(num3>99) {
				//강제로 Exception 객체 생성
				throw new MyException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("3자리 수는 몰라요");
		}
		

	}

}
