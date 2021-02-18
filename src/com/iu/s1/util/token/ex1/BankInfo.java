package com.iu.s1.util.token.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BankInfo {
	
	private StringBuffer sb;
	
	public BankInfo() {
		sb = new StringBuffer();
		sb.append("국민,마이핏,1.2,500,");
		sb.append("우리,직장인우대,1.4,2000,");
		sb.append("신한,자유적금,0.8,5000,");
		sb.append("기업,나라사랑,1.9,4000");
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
