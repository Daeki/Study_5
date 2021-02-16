package com.iu.s1.lang.phoneBook;

public class PhoneBookInfo {
	
	private String data;
	
	public PhoneBookInfo() {
		//이름 전화번호 나이 메모
		//V1
		this.data="iu-01055555555-26-singer";
		this.data=this.data+"+choa+01022222222+36+actor";
		this.data=this.data+"-suji+01033333333+27-test";
		//V2
//		this.data="iu-01055555555-26-singer";
//		this.data=this.data+"-choa-01022222222-36-actor";
//		this.data=this.data+"-suji-01033333333-27-test";
	}
	
	public void info() {
		this.data=this.data.replace("-", "+");
		System.out.println(this.data);
		
		String str1 = "hello";
		String str2 = " world";
		str1 = str1+str2;
		System.out.println(str1+"1"+"test"+"3"+"4");
	}

}
