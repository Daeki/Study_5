package com.iu.s1.util.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		//모을려고 하는 데이터타입 -> 제네릭
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add("firtst");
		ar.add(2);
		ar.add('3');
		
		ar.add(1, "add");
		
		ar.set(1, "set");
		
		Integer obj = (Integer)ar.get(0);
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		ar2.add(10);
		//ar2.add("10");
		
		int num = ar2.get(0); 
		
		

	}

}
