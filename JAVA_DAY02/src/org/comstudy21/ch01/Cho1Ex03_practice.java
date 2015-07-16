package org.comstudy21.ch01;

import java.util.Scanner;

public class Cho1Ex03_practice {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in); //필드(전역 변수)
		String name = ""; //local (지역 변수)
		
		System.out.print("성명: ");
		name = scan.nextLine(); //문자열 입력
		
		System.out.println(name + "님 안녕하세요?");
	}			
}