package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01ex11If {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		String Ÿ�� = "";
				
		System.out.print("�����Է�: ");
		number = scan.nextInt();
		
		if(number < 0) {
			Ÿ�� = "����"; 
		} else {
			
			Ÿ�� = "���";
		}
	System.out.println("�Է��� ���� "+number+"�� "+Ÿ��+"�Դϴ�.");
	}
}
