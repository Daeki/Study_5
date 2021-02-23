package com.iu.s1.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_1 {
	
	public static void main(String[] args) {
		//client 
		
		//ip:port -> Socket
		//서버접속 요청
		OutputStream os=null;
		OutputStreamWriter ow= null;
		BufferedWriter bw=null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		InputStream is=null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("211.238.142.212", 8282);
			System.out.println("서버와 접속 성공");
			
			System.out.println("서버로 보낼 메세지 입력");
			String str=sc.next();
			
			
			os = socket.getOutputStream();//byte
			ow = new OutputStreamWriter(os);//char
			bw = new BufferedWriter(ow);
			
			bw.write(str+"\r\n");
			
			bw.flush();
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			str = br.readLine();
			
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
