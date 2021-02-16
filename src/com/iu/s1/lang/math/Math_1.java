package com.iu.s1.lang.math;

public class Math_1 {

	public static void main(String[] args) {
		
		double d = 3.1245;
		
		d = Math.ceil(d);//올림
		
		System.out.println(d);
		
		d= 3.555;
		
		d = Math.floor(d);//내림
		System.out.println(d);
		
		d= 3.455; 
		d = Math.round(d);//반올림
		System.out.println(d);
		
		d = Math.random();//0.0 ~ 1.0 미만 랜덤한 수
		System.out.println(d);

	}

}
