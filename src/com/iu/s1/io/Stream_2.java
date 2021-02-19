package com.iu.s1.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream_2 {

	public static void main(String[] args) {
		//키보드 입력 준비
		InputStream is = System.in; //byte
		InputStreamReader ir = new InputStreamReader(is);//char
		BufferedReader br = new BufferedReader(ir);//String
		
		System.out.println("입력");
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//연결된 역순으로 close

		
	}

}
