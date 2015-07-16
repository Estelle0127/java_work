package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex05 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("월 입력");
		int month = scan.nextInt();
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
				break;
			case 2:
				System.out.println("28");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30"); break;
		default :
			System.out.println("잘못된 입력입니다.");
			
	}
		scan.close();
	}
}