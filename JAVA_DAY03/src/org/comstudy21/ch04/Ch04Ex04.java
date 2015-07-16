package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex04 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char ch = 'F';
		
		System.out.print("점수입력: ");
		score = scan.nextInt();
		
		switch(score/10) {
		case 10 :
		case 9 : ch = 'A'; break;
		case 8 : ch = 'B'; break;
		case 7 : ch = 'C'; break;
		case 6 : ch = 'D'; break;
		default : ch = 'F';
		}
		 System.out.println("학점은 "+ ch + "학점이다.");	
		}
	}
	
	
//switch ~case 문을 이용하여 월의 총날짜를 출력하는 프로그램
//월 입력 : 2
//2월 28일까지 있다.
