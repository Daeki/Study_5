package com.iu.s1.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("c:\\test\\sub4", "t1.txt");
		FileWriter fw=null;
		try {
			fw = new FileWriter(file, true);
			fw.write("\n hello5 world5 \n");
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
