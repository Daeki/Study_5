package com.iu.s1.lang.ex;

public class ObjectArray {
	
	Object [] ar;
	
	public ObjectArray() {
		ar = new Object[0];
	}
	
	public int add(Object obj) {
		//받은 obj를 배열 ar에 추가
		Object [] newAr = new Object[ar.length+1];
		
		for(int i=0;i<ar.length;i++) {
			newAr[i]=ar[i];
		}
		
		newAr[ar.length]=obj;
		
		this.ar = newAr;
		
		return ar.length;
	}
	
	//메서드명 pop
	//배열의 길이 리턴
	//배열의 0 번인덱스 지우는 효과
	public int pop() {
		
		return ar.length;
	}
	
	//메서드명 shift
	//배열의 길이 리턴
	//배열의 마지막 인덱스 지우는 효과
	
	//메서드명 removeAll
	//리턴 없음
	//배열을 모두 지우는 효과
	
	
	//메서드명 size
	//배열의 길이 리턴
	

}
