package com.iu.s1.util.list;

import java.util.ArrayList;

public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		ArrayList<Integer> ar2= new ArrayList<>();
		ar2.add(4);
		ar2.add(5);
		ar2.add(6);
		
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		ars.add(ar);
		ars.add(ar2);
		
		ar.addAll(ar2);
		
		//ar.add(4);
		//ar.add(5);
		//ar.add(6)
		//ar+ar2
		// ArrayList<Integer>
		
		System.out.println("size : "+ar.size());
		
		
		for(int i=0;i<ars.size();i++) {
			//ArrayList<Integer> a = ars.get(i);
			for(int j=0;j<ars.get(i).size();j++) {
				System.out.println(ars.get(i).get(j));
			}
		}
		
		

	}

}
