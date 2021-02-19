package com.iu.s1.exception;

public class Exception_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int num=0;
			
			num = 10 / num;
			
			String str= null;
			str.toString();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("오류 발생 했습니다");
		}

	}

}
