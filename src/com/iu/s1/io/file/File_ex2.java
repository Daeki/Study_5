package com.iu.s1.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class File_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일을 생성
		//C:\\test\\sub
		//파일명의 확장자는 .txt
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		File file = new File("c:\\test\\sub");
		while(check) {
			String name = ".txt";
			System.out.println("1. 파일 생성");
			//파일이 자동으로 생성, 이름이 같지 않아야 함(보장)
			System.out.println("2. 파일 리스트 출력");
			System.out.println("3. 종     료");
			int select = sc.nextInt();
			if(select == 1) {
//				Random random = new Random();
//				int num = random.nextInt();
				//Calendar ca = Calendar.getInstance();	
				//name = ca.getTimeInMillis()+name;
				name = UUID.randomUUID().toString()+name;
				
				File file2 = new File(file, name);
				
				try {
					file2.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(select==2) {
				String [] names = file.list();
				for(int i=0;i<names.length;i++) {
					System.out.println(names[i]);
				}
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
	}

}
