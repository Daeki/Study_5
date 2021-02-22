package com.iu.s1.io.file;

import java.io.File;

public class File_4 {

	public static void main(String[] args) {
		//경로는 C:test
		//list 메서드 호출하고 결과를 출력
		File file = new File("c:\\test");
		String [] files = file.list();
		
		//디렉토리 또는 파일인지 판별
		for(int i=0;i<files.length;i++) {
			String name = files[i];
			File file2 = new File(file, name);
			
			if(file2.isFile()) {
				System.out.println(name +" 파일이다");
			}else {
				System.out.println(name + " 디렉토리 ");
			}
			
		}
		//a.txt 는 폴더 입니다
		//t1.txt는 파일 입니다. 
		
		

	}

}
