package com.iu.s1.lang.thread;

public class Act2 extends Thread {
	
	@Override
	public void run() {
		this.go2();
	}
	
	
	public void go2() {
		
		for(int i='A';i<='Z';i++) {
			System.out.println("Act2 : "+(char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
