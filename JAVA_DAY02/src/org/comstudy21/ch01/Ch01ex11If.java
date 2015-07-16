package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01ex11If {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		String 타입 = "";
				
		System.out.print("정수입력: ");
		number = scan.nextInt();
		
		if(number < 0) {
			타입 = "음수"; 
		} else {
			
			타입 = "양수";
		}
	System.out.println("입력한 숫자 "+number+"는 "+타입+"입니다.");
	}
}
