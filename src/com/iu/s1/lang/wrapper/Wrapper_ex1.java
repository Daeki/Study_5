package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin = sc.next();
		
		
		//String s = jumin.substring(1,2);
		//char ch = jumin.charAt(0);
		//System.out.println(ch);
		char [] ar = jumin.toCharArray();
		int total=0;
		int count=2;
		for(int i=0;i<jumin.length()-1;i++) {
			if(jumin.charAt(i)=='-') { //i==6
				continue;
			}
			char ch = jumin.charAt(i);
			//1+"1" -> 11
			//int num = Integer.parseInt(ch+"");
			int num = Integer.parseInt(String.valueOf(ch));
			total=total+num*count;
			count++;
			if(count==10) {
				count=2;
			}
			System.out.println(num);
		}
		
		System.out.println("Total : "+total);
		//11로 나눈 나머지
		total = total%11;
		
		//나머지를 11에서 빼기
		total = 11-total;
		
		if(total>=10) {
			total=total%10; //total=0;
		}
		
		int check =  Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		System.out.println(check);
		if(total==check) {
			System.out.println("정상 발행 한 주민번호");
		}else {
			System.out.println("주민 센터 방문 ");
		}
		
	}
	
	//juminCheck
	
	//주민번호입력 941224-1234567
	//9   4   1   2   2   4   -   1   2   3   4   5   6   7(체크용번호)
//  * 2   3   4   5   6   7       8   9   2   3   4   5   
//    18 +12+ 4 + 10 +12+ 28  +   8 + 18 +6  +12+ 20 +30
//    122
///2)  133 / 11 =12,... 1 (나머지를 구하기)
///3)  11에서 나머지를 뺀후 체크용 번호와 같으면 올바른 주민번호,
//     11-1= 10
// 4)  만약에 결과가 10 이상이면	다시 10으로 나눈 나머지를 체크용 번호 비교
//     10 /10 = 1...0(나머지)	
	
	//getAge
	//주민번호 입력 주민번호입력 001224-4234567
	//나이를 출력
	//태어난 계절 출력 
	// 3 - 5 : 봄
	// 6 - 8 : 여름
	// 9 - 11: 가을
	// 12 - 2 : 겨울
	
}
