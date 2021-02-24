package com.iu.s1.lang.thread;

public class Act4 implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("TV 보기");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
