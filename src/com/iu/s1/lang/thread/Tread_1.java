package com.iu.s1.lang.thread;

public class Tread_1 {

	public static void main(String[] args) {
		Act1 act1 = new Act1();
		Act2 act2 = new Act2();
		
		//run 메서드 직접호출 X
		//act1.start();
		//act2.start();
		Act3 act3 = new Act3();
		Act4 act4 = new Act4();
		
		Thread t1 = new Thread(act3);
		Thread t2 = new Thread(act4);
		
		t1.start();
		t2.start();
		
		
		

	}

}
