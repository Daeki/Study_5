package com.iu.s1.lang.weather;

import java.util.Scanner;

public class WeatherController {
	
	private Scanner sc;
	private WeatheInfo weatheInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		weatheInfo = new WeatheInfo();
		weatherView = new WeatherView();
	}
	
	
	

	//메서드명 start
	//1. 날씨 초기화 : makeWeather
	//2. 날씨 정보 출력 : view
	//3. 프로 그램 종료 
	public void start() {
		boolean check=true;
		WeatherDTO [] weatherDTOs= null;
		while(check) {
			System.out.println("1. 날씨 초기화");
			System.out.println("2. 날씨 정보 출력");
			System.out.println("3. 날씨 정보 검색");
			System.out.println("4. 프로 그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				weatherDTOs=weatheInfo.makeWeather();
				break;
			case 2:
				if(weatherDTOs != null) {
					weatherView.view(weatherDTOs);
				}else {
					weatherView.view("초기화를 먼저 진행 하세요");
				}
				break;
			case 3:
				WeatherDTO weatherDTO = weatheInfo.searchWeather(weatherDTOs);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					weatherView.view("찾는 정보가 없습니다");
				}
				break;
			default:
				check=false;
			}
			
			
		}
		
		
	}
	
	
	
}
