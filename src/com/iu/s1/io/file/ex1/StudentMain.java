package com.iu.s1.io.file.ex1;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		StudentInput si = new StudentInput();
		StudentOutput so = new StudentOutput();
		
		//1. init실행
		List<StudentDTO> ar = si.init();
		//2. input실행 결과물 DTO를 1의 List에 추가
		StudentDTO studentDTO = si.input();
		ar.add(studentDTO);
		
		//3. backUpAll 실행
		try {
			so.backUpAll(ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//so.view(studentDTO);
//		try {
//			so.backUp(studentDTO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("프로그램 종료");
	}
	

}
