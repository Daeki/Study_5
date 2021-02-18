package com.iu.s1.util.token.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1Main {

	public static void main(String[] args) {
		
		BankInfo bankInfo = new BankInfo();
		HashMap<String, ArrayList<BankBookDTO>> map = bankInfo.init3();
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			ArrayList<BankBookDTO> ar = map.get(key);
			System.out.println("====================");
			System.out.println(key);
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i).getBank());
				System.out.println(ar.get(i).getName());
				System.out.println(ar.get(i).getRate());
				System.out.println(ar.get(i).getMoney());
				System.out.println("---------------------");
			}
		}
		
		
//		Map<String, BankBookDTO> map = bankInfo.init2();
//		
//		Set<String> set = map.keySet();
//		
//		Iterator<String> iterator = set.iterator();
//		
//		while(iterator.hasNext()) {
//			String key = iterator.next();
//			BankBookDTO bankBookDTO = map.get(key);
//			
//			System.out.println(bankBookDTO.getBank());
//			System.out.println(bankBookDTO.getName());
//			System.out.println(bankBookDTO.getRate());
//			System.out.println(bankBookDTO.getMoney());
//			System.out.println("--------------------------");
//		}
		
		
//		List<BankBookDTO> ar = bankInfo.init();
//		
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i).getBank());
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getRate());
//			System.out.println(ar.get(i).getMoney());
//			System.out.println("---------------------");
//		}
		
	}

}
