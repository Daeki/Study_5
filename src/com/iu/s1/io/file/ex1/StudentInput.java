package com.iu.s1.io.file.ex1;

import java.util.Scanner;

public class StudentInput {
	
	private StringBuffer sb;
	
	public StudentInput() {
		sb = new StringBuffer();
		sb.append("iu,1,54,54,53,");
		sb.append("choa,2,84,87,76,");
		sb.append("suji,3,48,87,100");
		
	}
	
	//init
	//sb의 데이터를 파싱해서 나온 DTO들을 List에 담아서 리턴
	
	//input 
	//학생의 이름, 번호, 국어, 영어,수학 입력
	//총점과 평균계산
	//StudentDTO리턴
	
	public StudentDTO input() {
		Scanner sc = new Scanner(System.in);
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		
		return studentDTO;
	}

}
