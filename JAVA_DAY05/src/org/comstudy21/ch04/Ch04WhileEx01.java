package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04WhileEx01 {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char yn = 'y';
		String name = "";
		
		do{
			System.out.println("성명입력 :");
			name = scan.nextLine();
			System.out.println("성명: " + name);
		
			//y나 n이 아니면 다시 입력 받도록 하세요.
			
			do{
				System.out.print("또 하시겠습니까?[y/n]");
				yn=scan.nextLine().charAt(0);
			}while(!(yn=='y'||yn=='n'));
		}while(yn=='y');
		System.out.println("시스템 종료! 다음기회에~");
	}
}
