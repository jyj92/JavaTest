package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {
		
		/*
		 * strNation 문자열 중에서 u 라는 문자가
		 * 몇번째 위치에 있나?
		 */
		
		String strNation = "Republic of Korea";
		
		int intLength = strNation.length();
		// 'R' 이 cA 변수에 담길 것
		char cA = strNation.charAt(0);
		if(cA == 'u') System.out.println("0 번 위치에 있음");
		

	}

}
