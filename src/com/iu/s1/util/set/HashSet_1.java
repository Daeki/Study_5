package com.iu.s1.util.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		boolean result = hashSet.add(3);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		
		System.out.println("HashSet Size : "+hashSet.size());
		System.out.println("ArrayList size : "+arrayList.size());
		
		System.out.println(hashSet);
		System.out.println(arrayList);
		
		hashSet.remove(5);
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			 int i = iterator.next();
			 System.out.println(i);
		}
		
		

	}

}
