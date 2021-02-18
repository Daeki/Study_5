package com.iu.s1.util.token.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BankInfo {
	
	private StringBuffer sb;
	
	public BankInfo() {
		sb = new StringBuffer();
		sb.append("kb,국민,마이핏,1.2,500,");
		sb.append("woo,우리,직장인우대,1.4,2000,");
		sb.append("shin,신한,자유적금,0.8,5000,");
		sb.append("ki,기업,나라사랑,1.9,4000");
	}
	
	//init2 HashMap
	//파싱 StringTokenizer
	public Map<String, BankBookDTO> init2() {
		String str = sb.toString();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		HashMap<String, BankBookDTO> map = new HashMap<>();
		
		while(st.hasMoreTokens()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			String key = st.nextToken();
			bankBookDTO.setBank(st.nextToken());
			bankBookDTO.setName(st.nextToken());
			bankBookDTO.setRate(Double.parseDouble(st.nextToken()));
			bankBookDTO.setMoney(Integer.parseInt(st.nextToken()));
			map.put(key, bankBookDTO);
		}
		
		return map;
		
	}
	
	
	
	//init ArrayList
	//파싱 StringTokenizer
	public List<BankBookDTO> init() {
		String str = sb.toString();
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(str, ",");
		ArrayList<BankBookDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBank(st.nextToken());
			bankBookDTO.setName(st.nextToken());
			bankBookDTO.setRate(Double.parseDouble(st.nextToken()));
			bankBookDTO.setMoney(Integer.parseInt(st.nextToken()));
			ar.add(bankBookDTO);
		}
		
		return ar;
	}
}
