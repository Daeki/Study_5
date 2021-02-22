package com.iu.s1.io.file;

import java.io.File;

public class File_5 {

	public static void main(String[] args) {

		File file = new File("c:\\test");
		
		File [] files = file.listFiles();
		
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
		
		
		

	}

}
