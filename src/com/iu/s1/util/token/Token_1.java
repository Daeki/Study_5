package com.iu.s1.util.token;

import java.util.StringTokenizer;

public class Token_1 {

	public static void main(String[] args) {
		String str="iu-suji-choa-hani";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		int count = st.countTokens();
		System.out.println(count);
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		
//		for(int i=0;i<count;i++) {
//			System.out.println(st.nextToken());
//		}
		
//		while(st.hasMoreTokens()) {
//			String name = st.nextToken();
//			System.out.println(name);
//		}
		

	}

}
