package com.iu.s1.util.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ex1Main {

	public static void main(String[] args) {
		Test t1 = new Test();
		List<Integer> ar = t1.makeList();
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
