package com.iu.s1.exception;

import java.util.Random;

public class ExTest {
	
	
	
	public void ex1() throws Exception {
		Random random = new Random();
		int num = 10;
		int num2 = random.nextInt(2);
		num2 = num/num2;
		
		System.out.println(num2);
		
	}

}
