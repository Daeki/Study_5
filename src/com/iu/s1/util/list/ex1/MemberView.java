package com.iu.s1.util.list.ex1;

import java.util.ArrayList;

public class MemberView {
	
	//view 메서드 생성
	//MemberDTO들의 정보를 출력
	public void view(ArrayList<MemberDTO> ar) {
		
		for(int i=0;i<ar.size();i++) {
			MemberDTO m = ar.get(i);
			System.out.println("Id : "+m.getId());
			System.out.println("Pw : "+m.getPw());
			System.out.println("Name : "+m.getName());
			System.out.println("Age : "+m.getAge());
			System.out.println("Point : "+m.getPoint());
			System.out.println("--------------------------");
		}
	}

}






