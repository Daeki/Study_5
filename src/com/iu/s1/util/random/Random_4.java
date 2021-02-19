package com.iu.s1.util.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Random_4 {

	public static void main(String[] args) {
		//1-45 사이의 무작위 수
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력 (1000 단위)");
		int money = sc.nextInt();//ex) 2000 => 2
		
		int [] nums = new int[6];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("==============================");
		//Set
		ArrayList<HashSet<Integer>> ars = new ArrayList<>();
	//start
		for(int i=0;i<money/1000;i++) {
			HashSet<Integer> set = new HashSet<>();
	
			while(set.size() != 6) {
				set.add(random.nextInt(45)+1);
			}
			ars.add(set);
		}
	//end
		
		
	//start print
		for(int i=0;i<ars.size();i++) {
			Iterator<Integer> iterator = ars.get(i).iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			System.out.println("++++++++++++++++++++++++");
			
		}
	//end print	
		
		
		
		
		

	}

}
