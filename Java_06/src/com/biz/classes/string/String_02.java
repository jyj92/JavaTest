package com.biz.classes.string;

public class String_02 {

	public static void main(String[] args) {
		
		/*
		 * strNation 문자열 중에서 u 라는 문자가
		 * 몇번째 위치에 있나?
		 */
		
		String strNation = "Republic of Korea";
		char cSearch = 'u';
		int index = 0;
		
		char cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index +1+ " 번 위치에 있음");
		
		index ++; // 1로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index +1+ " 번 위치에 있음");
		
		index ++; // 2로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index +1+ " 번 위치에 있음");
		
		index ++; // 3로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index +1+ " 번 위치에 있음");
		
		index ++; // 4로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index +1+ " 번 위치에 있음");
		

	}

}
