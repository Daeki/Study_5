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
		
		if(this.ar.length>0) {
		
			Object [] newAr = new Object[this.ar.length-1];
			
			for(int i=1;i<ar.length;i++) {
				newAr[i-1]= ar[i];
			}
			
			this.ar = newAr;
		}
		
		return ar.length;
	}
	
	//메서드명 shift
	//배열의 길이 리턴
	//배열의 마지막 인덱스 지우는 효과
	public int shift() {
		
		if(this.ar.length<1) {
			return ar.length;
		}
		
		Object [] newAr = new Object[this.ar.length-1];
		
		for(int i=0;i<newAr.length;i++) {
			newAr[i]=ar[i];
		}
		
		this.ar = newAr;
		
		
		return ar.length;
	}
	
	//remove
	//리턴 배열의 길이
	//매개변수로 지우려고 하는 인덱번호 받아서 해당 인덱스번호의 배열 요소 삭제
	
	
	
	
	//메서드명 removeAll
	//리턴 없음
	//배열을 모두 지우는 효과
	public int removeAll() {
		
		this.ar = new Object[0];
		
		return ar.length;
	}
	
	
	//메서드명 size
	//배열의 길이 리턴
	public int size() {
		return ar.length;
	}
	

}
