package com.iu.s1.lang.weather;

public class WeatherView {
	
	//메서드명 view
	//WeatherDTO들을 받아서 출력
	public void view(WeatherDTO [] ar) {
		System.out.println("City\t Gion\t Huminity\t State");
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i].getCity()+"\t ");
			System.out.print(ar[i].getGion()+"\t ");
			System.out.print(ar[i].getHuminity()+"\t\t ");
			System.out.println(ar[i].getState());
			System.out.println("---------------------------------------------");
		}
		
		
	}

}
