package com.iu.s1.exception;

public class Exception_2 {

	public static void main(String[] args) {
		ExTest exTest = new ExTest();
		try {
			exTest.ex1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("0으로 나눌 수 없음");
		}

	}

}
