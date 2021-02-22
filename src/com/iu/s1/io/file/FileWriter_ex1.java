package com.iu.s1.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter_ex1 {

	public static void main(String[] args) {
		//저장할 파일명 입력
		//c:\\test\\sub4
		
		//파일에 입력할 메세지 입력
		
		//q 나 Q를 입력하면 종료
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test\\sub4");
		System.out.println("파일명 입력");
		String fileName = sc.next();
		
		file = new File(file, fileName);
		
		boolean check=true;
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(check) {
			System.out.println("메세지 입력");
			fileName = sc.next();
			
			if(fileName.equals("q") || fileName.equals("Q")) {
				System.out.println("종료");
				break;
			}
			
			try {
				fw.write(fileName+"\n");
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while
		
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		
		
		

	}

}
