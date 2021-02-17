package com.iu.s1.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {
	private Scanner sc;
	private StringBuffer sb;
	
	public MemberInfo() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("id1,pw1,name1,32,42.3,");
		sb.append("id2, pw2, name2, 27, 3.14,");
		sb.append("id3-pw3-name3+28+4.23");
		
	}
	

	
	//
	public ArrayList init(ArrayList<MemberDTO> ars) {
		//ArrayList ars = new ArrayList();
		String str = sb.toString();
		System.out.println(str);
		str = str.replace("-", ",");
		System.out.println(str);
		str = str.replace("+", ",");
		System.out.println(str);
		String [] ar = str.split(",");
		
		for(int i=0;i<ar.length;i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(ar[i]);
			memberDTO.setPw(ar[++i]);
			memberDTO.setName(ar[++i]);
			memberDTO.setAge(Integer.parseInt(ar[++i].trim()));
			memberDTO.setPoint(Double.parseDouble(ar[++i].trim()));
			ars.add(memberDTO);
			
		}
		
		return ars;

	}
	
	//makeMember
	//member의 정보 입력
	public void makeMember(ArrayList<MemberDTO> ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("Id 입력");
		memberDTO.setId(sc.next());
		System.out.println("Pw 입력");
		memberDTO.setPw(sc.next());
		System.out.println("Name 입력");
		memberDTO.setName(sc.next());
		System.out.println("Age 입력");
		memberDTO.setAge(sc.nextInt());
		System.out.println("Point 입력");
		memberDTO.setPoint(sc.nextDouble());
		ar.add(memberDTO);
	}
	

}
