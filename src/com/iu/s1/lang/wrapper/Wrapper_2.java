package com.iu.s1.lang.wrapper;

public class Wrapper_2 {

	public static void main(String[] args) {
		
		int num=10;
		
		Integer n1 = new Integer(num);
		num = n1.intValue();
		
		num = n1;//auto unboxing 
		n1 = num;//auto Boxing
		
		double d = 3.14;
		n1 = (int)d;
		
		
		
		
		

	}

}
