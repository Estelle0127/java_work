package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05HomeWorkAfter100 {
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
	int nextMonth, nextDay;
	int idx = month;
	total = days[month-1] - day; //남은 날짜

	for(int i=0; i<3; i++){
		idx = idx%12; //12로 나누면 절대 12는 안됨. 12가 되면 0이되고 13이되면 1이될 예정
		total = total + days[idx];
		System.out.println("idx =>" + idx );
		idx++;
	}
//total 이 100보다 큰지 . 100보다 크면 인덱스에서 빠져야함.
 System.out.println("totaㅣ = >? "+ total);
 if(total>100){
	 nextMonth = idx;
	 nextDay = days[idx-1] - (total - 100);
 }else{
 
	 nextMonth = idx+1;
	 nextDay = 100 - total;
 }
 	System.out.println("100일 후는 "+nextMonth+"월"+nextDay+"일입니다."	);
 	
	}
}
