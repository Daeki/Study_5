package com.iu.s1.io.file;

import java.io.File;

public class File_3 {

	public static void main(String[] args) {
		File file = new File("C:\\test");
		
		File file2 = new File(file, "b.txt");
		boolean ex = file2.exists();
		System.out.println(ex);
		
		ex= file2.delete();
		System.out.println(ex);

		//sub directory 삭제
		
		File file3 = new File(file, "sub");
		ex = file3.exists();
		ex = file3.delete();
		System.out.println(ex);
		
		//sub2 directory 삭제
		File file4 = new File(file, "sub2");
		ex = file4.exists();
		ex = file4.delete();
		System.out.println(ex);
	}

}
