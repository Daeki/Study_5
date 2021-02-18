package com.iu.s1.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("n1", 10);
		map.put("iu", 27);
		map.put("choa", 31);
		
		//키를 알아야 밸류를 알 수 있음
		Set<String> set = map.keySet();
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			Integer value = map.get(key);
			System.out.println(value);
		}
		
		
		
		
		

	}

}
