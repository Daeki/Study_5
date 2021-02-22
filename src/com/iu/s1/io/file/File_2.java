package com.iu.s1.io.file;

import java.io.File;
import java.io.IOException;

public class File_2 {

	public static void main(String[] args) {
		File file = new File("C:\\test");
		
		File file2 = new File(file, "a.txt");
		
		boolean ex = file2.exists();
		
		System.out.println(ex);
		
		ex= file2.mkdir();
		System.out.println(ex);
		
		try {
			file2 = new File(file, "b.txt");
			ex =file2.createNewFile();
			System.out.println(ex);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
