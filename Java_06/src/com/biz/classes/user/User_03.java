package com.biz.classes.user;

public class User_03 {
	/*
	 * class 변수 영역(scope)
	 * class 멤버변수 영역
	 */
	
	// public static int nCount = 0;
	public static void count() {
		// count() 메서드가 호출될때마다
		// nCount는 새로 생성이되고 0으로 clear
		int nCount = 0;
		nCount ++;
		System.out.println(nCount + "번째 호출");
		
	}

}
