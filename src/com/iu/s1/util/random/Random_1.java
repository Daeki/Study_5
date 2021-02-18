package com.iu.s1.util.random;

import java.util.Random;

public class Random_1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int num = random.nextInt();
		
		System.out.println(num);
		
		num = random.nextInt(10);//0 - bound 미만의 랜덤한수
		System.out.println(num);

	}

}
