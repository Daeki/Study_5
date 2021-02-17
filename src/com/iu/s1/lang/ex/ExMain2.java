package com.iu.s1.lang.ex;

public class ExMain2 {

	public static void main(String[] args) {
		
		ObjectArray objectArray = new ObjectArray();
		
		//Object -> reference
		// 1     -> int primitive
		// "iu"  -> refernce
		Test1 test1 = new Test1();
		int num = 10;
		//Integer n1 = new Integer(10);
		//n1 = num; //auto Boxing
		objectArray.add(num);
		
		objectArray.add(2.12);
		
		Object o = objectArray.get(0);
		System.out.println(o);
		System.out.println(objectArray.get(0));
		
		//auto unboxing
		int num2 = (int)objectArray.get(0);
		System.out.println(num2);
		//auto UnBoxing
		//Double num3 = (Double)objectArray.get(1);
		//double num4 = num3;
		double num3 = (Double)objectArray.get(1);
		System.out.println(num3);
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		Object obj1 = t1;
		Object obj2 = t2;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		

	}

}









