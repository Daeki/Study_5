package com.iu.s1.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\\test
		//파일명이나, 폴더명을 입력
		//파일명은 확장자가 있는것 .txt, .hwp, .jpg
		//이름만 있는것은 폴더 test
		//파일이면 파일을 생성
		//폴더면 폴더를 생성
		//ex) test.txt -> C:\\test\\test.txt
		//ex) sub3 -> C:\\test\\sub3
		//같은이름의 폴더나 파일이 있으면 이미 있습니다.
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\test");

		System.out.println("이름을 입력");
		String name = sc.next();
		//String name="abctxt";

		int index= name.indexOf(".");
		File file2 = new File(file, name);

		boolean check = file2.exists();

		if(check) {
			System.out.println("이미 있다");
			return;
		}else {

			if(index == -1) {
				//폴더
				file2.mkdir();
			}else {
				//파일
				try {
					file2.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
