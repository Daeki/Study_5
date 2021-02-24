package com.iu.s1.lang.thread;

public class Act1 extends Thread {
	
	@Override
	public void run() {
//		for(int i=0;i<24;i++) {
//			System.out.println("Act1 : "+i);
//		}
		this.go();
	}
	
	
	public void go() {
		for(int i=0;i<24;i++) {
			System.out.println("Act1 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
