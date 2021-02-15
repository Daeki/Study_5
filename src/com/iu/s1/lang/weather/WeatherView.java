package com.iu.s1.lang.weather;

public class WeatherView {
	
	public void view(String str) {
		System.out.println("======================");
		System.out.println(str);
		System.out.println("======================");
	}
	
	//메서드명 view
	//WeatherDTO 하나를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("City\t Gion\t Huminity\t State");
		System.out.print(weatherDTO.getCity()+"\t ");
		System.out.print(weatherDTO.getGion()+"\t ");
		System.out.print(weatherDTO.getHuminity()+"\t\t ");
		System.out.println(weatherDTO.getState());
	}
	
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
