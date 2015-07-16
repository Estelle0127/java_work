package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05HomeWorkAfter100_2 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	int month, day;
	int total = 0;

	System.out.print("월 입력: ");
	month = scan.nextInt();
	System.out.print("일 입력: ");
	day = scan.nextInt();
	
	System.out.println("입력한 날짜 => "+month+"월 "+day+"일 ");
	
	total = 100;
	
	int idx = month;
	total = total - (days[idx-1] - day);//초기화
	idx %= 12;
	while(days[idx] < total	) {
		total -= days[idx++];
		idx %= 12;
	}
	
	System.out.print("100일 후는 "+(idx+1)+"월");
	System.out.print(" " + total+"일");
	
	}//end of main
}
