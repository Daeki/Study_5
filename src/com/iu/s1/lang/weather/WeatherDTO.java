package com.iu.s1.lang.weather;

public class WeatherDTO {
	//날씨정보를 가지고 있는 클래스
	//도시명
	private String city;
	
	//기온
	private String gion;

	//습도
	private String huminity;
	
	//상태
	private String state;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGion() {
		return gion;
	}

	public void setGion(String gion) {
		this.gion = gion;
	}

	public String getHuminity() {
		return huminity;
	}

	public void setHuminity(String huminity) {
		this.huminity = huminity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
