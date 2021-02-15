package com.iu.s1.lang.weather;

public class WeatherMain {

	public static void main(String[] args) {
		//프로그램시작역할
		//테스트역할
		WeatheInfo weatheInfo = new WeatheInfo();
		WeatherDTO [] ar = weatheInfo.makeWeather();
		WeatherView weatherView = new WeatherView();
		weatherView.view(ar);

	}

}
