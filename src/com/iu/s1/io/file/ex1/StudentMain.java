package com.iu.s1.io.file.ex1;

public class StudentMain {

	public static void main(String[] args) {
		StudentInput si = new StudentInput();
		StudentOutput so = new StudentOutput();
		
		//1. init실행
		
		//2. input실행 결과물 DTO를 1의 List에 추가
		StudentDTO studentDTO = si.input();
		
		
		
		//3. backUpAll 실행
		
		
		//so.view(studentDTO);
//		try {
//			so.backUp(studentDTO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
