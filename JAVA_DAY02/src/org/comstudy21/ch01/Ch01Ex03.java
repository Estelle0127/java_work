package org.comstudy21.ch01;

import java.util.Scanner; //라이브러리를 가져다 쓴다. 누군가가 만들어놓은 Scanner

public class Ch01Ex03 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);//해당 객체를 쓰겠다. 필드(전역변수)
		String name=""; // 지역변수
		
		System.out.print("성명");
		name = scan.nextLine(); //문자열 입력
		
		System.out.println( name + "님 안녕하세요?");
		

	}
}