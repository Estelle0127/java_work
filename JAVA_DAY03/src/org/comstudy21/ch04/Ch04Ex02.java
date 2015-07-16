package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex02 {
	public static void main(String[] args){
		String mode = "";
		int no = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(7)읽기 (4)쓰기 (5)실행");
		System.out.print("선택: ");
		no = scan.nextInt();
		
		switch(no) {
		case 7: mode += "w";
		case 5: mode += "x";
		case 4: mode += "r";
		}
 	
		System.out.println("기능: "+ mode); 
	}
}
