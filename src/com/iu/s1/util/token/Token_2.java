package com.iu.s1.util.token;

import java.util.StringTokenizer;

public class Token_2 {

	public static void main(String[] args) {
		String str = "iu-20-suji-30-choa-35";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
		}

	}

}
