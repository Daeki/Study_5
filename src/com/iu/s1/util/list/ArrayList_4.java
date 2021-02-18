package com.iu.s1.util.list;

import java.util.ArrayList;

public class ArrayList_4 {

	public static void main(String[] args) {
		//? 자식, T 부모
		
		ArrayList<? extends Worker> ar = new ArrayList<>();
		ArrayList<? super WorkerEmart> www = new ArrayList<>();
		
		ArrayList<WorkerEmart> we = new ArrayList<>();
		ArrayList<WorkerHomplus> wh = new ArrayList<>();
		ar = wh;
		

	}

}
