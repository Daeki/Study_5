package com.iu.s1.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\test\\student", "student-09-34-37.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			boolean check=true;
			while(check) {
				String str = br.readLine();//\n 만날때 까지 읽어 오기
				System.out.println(str);
				if(str == null) {
					break;
				}
			}
			br.close();
			fr.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		System.out.println("종료");

	}

}
