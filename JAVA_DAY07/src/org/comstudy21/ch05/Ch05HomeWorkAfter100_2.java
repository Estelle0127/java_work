package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05HomeWorkAfter100_2 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	int month, day;
	int total = 0;

	System.out.print("�� �Է�: ");
	month = scan.nextInt();
	System.out.print("�� �Է�: ");
	day = scan.nextInt();
	
	System.out.println("�Է��� ��¥ => "+month+"�� "+day+"�� ");
	
	total = 100;
	
	int idx = month;
	total = total - (days[idx-1] - day);//�ʱ�ȭ
	idx %= 12;
	while(days[idx] < total	) {
		total -= days[idx++];
		idx %= 12;
	}
	
	System.out.print("100�� �Ĵ� "+(idx+1)+"��");
	System.out.print(" " + total+"��");
	
	}//end of main
}
