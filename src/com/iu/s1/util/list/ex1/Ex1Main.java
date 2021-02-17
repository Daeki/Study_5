package com.iu.s1.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 회원정보 입력
		//  id, pw, name
		//2. 회원정보 출력
		//3. 프로그램 종료
		
		boolean check=true;
		ArrayList ar = new ArrayList();
		
		while(check) {
			System.out.println("1. 회원정보입력");
			System.out.println("2. 회원정보출력");
			System.out.println("3. 프로그램종료");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				MemberDTO memberDTO = new MemberDTO();
				System.out.println("Id 입력");
				memberDTO.setId(sc.next());
				System.out.println("Pw 입력");
				memberDTO.setPw(sc.next());
				System.out.println("Name 입력");
				memberDTO.setName(sc.next());
				ar.add(memberDTO);
				break;
			case 2:
				for(int i=0;i<ar.size();i++) {
					MemberDTO m = (MemberDTO)ar.get(i);
					System.out.println("Id : "+m.getId());
					System.out.println("Pw : "+m.getPw());
					System.out.println("Name : "+m.getName());
				}
				
				break;
			default:
				check=false;
			}
			
		}
		

	}

}
