package com.iu.s1.util.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add("firtst");
		ar.add(2);
		ar.add('3');
		
		ar.add(1, "add");
		
		ar.set(1, "set");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}

}
