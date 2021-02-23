package com.iu.s1.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentInput {
	
	private StringBuffer sb;
	
	public StudentInput() {
		sb = new StringBuffer();
		sb.append("iu,1,54,54,53,");
		sb.append("choa,2,84,87,76,");
		sb.append("suji,3,48,87,100");
		
	}
	//init2
	//파일을 읽어서 파싱해서 나온 DTO들을 List에 담아서 리턴
	public List<StudentDTO> init2() throws Exception{
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("c:\\test\\student", "student-09-34-37.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		while(check) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str, ",");
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(Integer.parseInt(st.nextToken()));
			studentDTO.setAvg(Double.parseDouble(st.nextToken()));
			ar.add(studentDTO);
		}
		
		
		return ar;
	}
	
	
	//init
	//sb의 데이터를 파싱해서 나온 DTO들을 List에 담아서 리턴
	public List<StudentDTO> init(){
		ArrayList<StudentDTO> ar = new ArrayList<>();
		String str = sb.toString();
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
		
		return ar;
	}
	
	
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
