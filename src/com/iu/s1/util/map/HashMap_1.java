package com.iu.s1.util.map;

import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(map.get("test"));
		
		//요소 넣기: put
		map.put("n1", 10);
		map.put("n2", 20);
		
		System.out.println(map);
		
		int num = map.get("n2");
		
		System.out.println(num);
		
		map.put("n1", 1111);
		
		map.remove("n1");
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		map.clear();
		
		System.out.println(map);
		

	}

}
