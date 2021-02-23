package com.iu.s1.io.file.ex1;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class StudentOutput {
	
	private FileWriter getFileWriter() throws Exception {
		File file = new File("C:\\test\\student");
		
		if(!file.exists()) {
			file.mkdir();
		}
		
		Calendar ca = Calendar.getInstance();
		//ca.get(Calendar.HOUR_OF_DAY)
		SimpleDateFormat sd = new SimpleDateFormat("-HH-mm-ss");
		String name = sd.format(ca.getTime());
		name = "student"+name+".txt";
		
		file = new File(file, name);
		
		FileWriter fw = new FileWriter(file, true);
		
		return fw;
	}
	
	//backUpAll : List를 매개변수
	//파일에 저장 형식은 backUp메서드와 동일
	public void backUpAll(List<StudentDTO> ar) throws Exception {
		FileWriter fw = this.getFileWriter();
		
		for(int i=0;i<ar.size();i++) {
			StudentDTO studentDTO = ar.get(i);
//			this.backUp(studentDTO);
			fw.write(studentDTO.getName()+",");
			fw.write(studentDTO.getNum()+",");
			fw.write(studentDTO.getKor()+",");
			fw.write(studentDTO.getEng()+",");
			fw.write(studentDTO.getMath()+",");
			fw.write(studentDTO.getTotal()+",");
			fw.write(studentDTO.getAvg()+"\n");
		}
		
		fw.flush();
		fw.close();
		
	}
	
	
	
	
	//backUp append 가능
	//StudentDTO를 파일로 저장
	//이름,번호,국어,영어,수학,총점,평균
	//c:\\test\\student 없으면 생성
	//파일명은 student-현재시-현재분-현재초.txt
	//ex) 4시 15분 16 -> student-16-15-16.txt
	public void backUp(StudentDTO studentDTO) throws Exception {
		
		FileWriter fw = this.getFileWriter();
		
		fw.write(studentDTO.getName()+",");
		fw.write(studentDTO.getNum()+",");
		fw.write(studentDTO.getKor()+",");
		fw.write(studentDTO.getEng()+",");
		fw.write(studentDTO.getMath()+",");
		fw.write(studentDTO.getTotal()+",");
		fw.write(studentDTO.getAvg()+"\n");
		
		fw.flush();
		
		fw.close();
		
		
	}
	
	//view 
	//StudentDTO 정보 출력
	public void view(StudentDTO studentDTO) {
		System.out.println("Name : "+studentDTO.getName());
		System.out.println("Num  : "+studentDTO.getNum());
		System.out.println("Kor  : "+studentDTO.getKor());
		System.out.println("Eng  : "+studentDTO.getEng());
		System.out.println("Math : "+studentDTO.getMath());
		System.out.println("Total: "+studentDTO.getTotal());
		System.out.println("Avg  : "+studentDTO.getAvg());
		System.out.println("--------------------");
	}

}
