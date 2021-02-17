package com.iu.s1.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	
	//start
	//
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		//1. 회원정보 입력
		//  id, pw, name
		//2. 회원정보 출력
		//3. 프로그램 종료
		
		boolean check=true;
		ArrayList ar = new ArrayList();
		MemberView mv = new MemberView();
		MemberInfo mi = new MemberInfo();
		
		//init 호출
		//ArrayList ar= mi.init();
		mi.init(ar);
		
		while(check) {
			System.out.println("1. 회원정보입력");
			System.out.println("2. 회원정보출력");
			System.out.println("3. 프로그램종료");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				mi.makeMember(ar);
				break;
			case 2:
				mv.view(ar);
				break;
			default:
				check=false;
			}
			
		}
	}

}
