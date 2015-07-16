package org.comstudy21.ch04;

import java.util.Scanner;

public class CH04Ex01 {
	public static void main(String[] args) {
		int no = 0;
		Scanner scan = new Scanner(System.in); //키보드로 직접 입력 받는 것을 소스로 사용하겠다
		
		System.out.println("(1)수성 (2)금성 (3)지구 (4) 목성");
		System.out.print("선택 :");
		no = scan.nextInt();
		
		switch(no) {
		case 1 : System.out.println("수성으로 가세요."); break;
		case 2 : System.out.println("금성으로 가세요."); break;
		case 3 : System.out.println("지구로 가세요."); break;
		case 4 : System.out.println("목성으로 가세요."); break;
		default : System.out.println("안드로메다로 가세요."); //기본값.
		//no는 정수가 들어간다.
		}
		
	}
	
}
