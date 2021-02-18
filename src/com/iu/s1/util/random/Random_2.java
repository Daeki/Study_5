package com.iu.s1.util.random;

import java.util.Random;

public class Random_2 {

	public static void main(String[] args) {
		//확률
		//10% 확률로 A 
		//30% 확률로 B
		//60% 확률로 C
		Random random = new Random();
		int num = random.nextInt(10);
		
		if(num==0) {
			System.out.println("A");
		}else if(num<4 ){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		

	}

}
