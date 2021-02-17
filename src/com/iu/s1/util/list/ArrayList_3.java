package com.iu.s1.util.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		WorkerEmart we = new WorkerEmart();
		WorkerHomplus wh = new WorkerHomplus();
		
		ArrayList<Worker> ar = new ArrayList<>();
		ar.add(we);
		ar.add(wh);
		
		
		for(int i=0;i<ar.size();i++) {
			Worker w = ar.get(i);
			w.doIt();
			
			if(w instanceof WorkerHomplus) {
				WorkerHomplus wh2 = (WorkerHomplus)w;
				System.out.println(wh2.toy);
			}
		}
		
		
		

	}

}
