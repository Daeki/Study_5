package com.iu.s1.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_1 {

	public static void main(String[] args) {
		//Server 프로그램
		InputStream is=null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		Socket sc = null;
		Scanner scc = new Scanner(System.in);
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		try {
			System.out.println("접속대기중");
			ServerSocket ss = new ServerSocket(8282);
			sc = ss.accept();
			System.out.println("클라인트와 접속 성공");
			
			is = sc.getInputStream(); //byte
			ir = new InputStreamReader(is);//char
			br = new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			boolean check= true;
			while(check) {
				String str =br.readLine();
				System.out.println(str);
				
				if(str.toUpperCase().equals("Q")) {
					System.out.println("종료");
					break;
				}
				
				
				System.out.println("클라이언트로 보낼 메세지 입력");
				str = scc.next();
				bw.write(str+"\r\n");
				bw.flush();
				
				if(str.toUpperCase().equals("Q")) {
					System.out.println("종료");
					break;
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
