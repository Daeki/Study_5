package com.iu.s1.util.random;

import java.util.Random;

public class Random_3 {

	public static void main(String[] args) {
		int [] ar = {3, 22, 15, 800, 7, 16, 24, 50, 7, 0,0,0};
		Random random = new Random();
		
		int index = random.nextInt(ar.length);
		
		index = ar[index];
		
		System.out.println(index);
		

	}

}
