package org.comstudy21.ch01;

public class Ch01Ex09 {
	public static void main(String[] args){
		
		//변수선언
		//자료형 변수명;
		//자료형 변수명 = 초기값
		//주의 ; 멤버필드 초기화 하지 않으면 기본값이 초기값.
		//		 정수타입은 0으로 객체 타입은 null로 초기화
		//local변수(지역변수) - 함수내부에 선언 -
		//지역변수는 초기화하지 않으면 쓰레기 값.
		//즉, 지역변수는 선언과 동시에 초기화 하는 것이 관례
		
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		result = num1 + num2; //+는 정수를 연산하는 산술 연산.

		System.out.println(num1 + " + " + num2 + "+" + result ); //
		System.out.println(10 + "+" + 20 + "=" + 30);
						
		
	}
		
}
