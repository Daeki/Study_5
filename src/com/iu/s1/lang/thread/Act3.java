package com.iu.s1.lang.thread;

public class Act3 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Act3 : 밥먹고");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
