package com.iu.s1.util.token.ex1;

import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {
		
		BankInfo bankInfo = new BankInfo();
		List<BankBookDTO> ar = bankInfo.init();
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getBank());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getRate());
			System.out.println(ar.get(i).getMoney());
			System.out.println("---------------------");
		}
		
	}

}
