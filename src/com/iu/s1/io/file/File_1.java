package com.iu.s1.io.file;

import java.io.File;

public class File_1 {

	public static void main(String[] args) {
		
		 File file = new File("C:\\test", "t1.txt");
		 
		 boolean ex= file.exists();
		 
		 System.out.println(ex);
		 
		 File file2 = new File("C:\\test\\sub");
		 
		 ex = file2.exists();
		 System.out.println(ex);
		 
		 ex = file.isFile();
		 ex = file.isDirectory();
		 System.out.println(ex);
		 
		 ex= file2.mkdir();
		 System.out.println(ex);
		 
		 File file3 = new File("C:\\test\\sub2\\sub3");
		 ex = file3.mkdirs();
		 System.out.println(ex);
		

	}

}
