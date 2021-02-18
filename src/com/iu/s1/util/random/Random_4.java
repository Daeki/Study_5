package com.iu.s1.util.random;

import java.util.Random;
import java.util.Scanner;

public class Random_4 {

	public static void main(String[] args) {
		//1-45 사이의 무작위 수
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력 (1000 단위)");
		int money = sc.nextInt();//ex) 2000 => 2
		
		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;
			System.out.println(num);
		}
		
		
		

	}

}
