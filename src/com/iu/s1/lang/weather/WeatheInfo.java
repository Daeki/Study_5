package com.iu.s1.lang.weather;

import java.util.Scanner;

public class WeatheInfo {
	
	private String info;
	
	public WeatheInfo() {
		//날씨정보 : 도시명 기온 습도 상태
		this.info = "서울 22 60% 흐림";
		this.info = this.info + " 대전 -32 10% 맑음";
		this.info = this.info + " 제주 45 90% 비";
		this.info = this.info + " 부산 0 80% 눈";
		
		StringBuffer sb = new StringBuffer();
		sb.append("서울 22 60% 흐림");
		sb.append(" 대전 -32 10% 맑음");
		
		this.info = sb.toString();
	}
	
	
	//메서드명은 makeWeather
	//info를 파싱해서 weatherDTO를 생성하고
	//weatherDTO들을 리턴
	public WeatherDTO [] makeWeather() {
		System.out.println(this.info);
		String [] ar = this.info.split(" ");
		WeatherDTO [] weDtos = new WeatherDTO[ar.length/4];
		int index=0;
		for(int i=0;i<ar.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(ar[i]);
			weatherDTO.setGion(ar[++i]);
			weatherDTO.setHuminity(ar[++i]);
			weatherDTO.setState(ar[++i]);
			weDtos[index]=weatherDTO;
			index++;
		}
		
//		for(int i=0;i<weDtos.length;i++) {
//			System.out.println(weDtos[i].getCity());
//			System.out.println(weDtos[i].getState());
//			System.out.println("---------------------");
//		}
		
		return weDtos;
	}
	
	//메서드명 searchWeather
	//날씨정보들을 매개변수로 받아서
	//검색하고자하는 도시명 입력
	//검색된 DTO를 리턴,
	public WeatherDTO searchWeather(WeatherDTO [] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도시명 입력");
		String name = sc.next();
		WeatherDTO weatherDTO=null;
		for(int i=0;i<ar.length;i++) {
			if(name.equals(ar[i].getCity())) {
				weatherDTO = ar[i];
				break;
			}
		}
		
		return weatherDTO;
	}

}
