package org.comstudy21.ch04;

public class Ch04For01 {

	public static void main(String[] args) {
		int dan=2;
		for(dan=2; dan<=9; dan++){
			System.out.println("***"+dan+"***");
		
			for(int i=1; i< 10; i++) {
			System.out.print(dan + "*" + i + "=" + dan * i);
			System.out.print(" ");
			}
		}
		
		
		
	}
	
	public static void ex04(String[] args){
		
		int dan=2;
		//구구단 2단
		
		for(int i=1; i< 10; i++) {
			System.out.print(dan + "*" + i + "=" + dan * i);
			System.out.print(" ");
			}
		
	}
	
	public static void ex03(String[] args){
		for(int i=2; i<= 10; i+=2) {
			System.out.print(i + "\t");
		}
	}
	public static void ex02(String[] args){
		System.out.println("새로운 메인");
		//ex01(new String[1]);
	}
	public static void ex01(String[] args){
	
		for(int i = 1; i<10; i+=2) { //증가식을 바꿀 수 있다.
			System.out.print(i+"\t");
			
		}
		
	}//일반적인 사용자 정의 함수
	
}
