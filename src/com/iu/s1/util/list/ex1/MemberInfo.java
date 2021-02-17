package com.iu.s1.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {
	private Scanner sc;
	
	public MemberInfo() {
		sc = new Scanner(System.in);
	}
	
	//makeMember
	//member의 정보 입력
	public void makeMember(ArrayList ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("Id 입력");
		memberDTO.setId(sc.next());
		System.out.println("Pw 입력");
		memberDTO.setPw(sc.next());
		System.out.println("Name 입력");
		memberDTO.setName(sc.next());
		ar.add(memberDTO);
	}
	

}
