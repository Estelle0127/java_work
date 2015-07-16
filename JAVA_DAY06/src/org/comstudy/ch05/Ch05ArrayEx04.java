package org.comstudy.ch05;

import java.util.Scanner;

public class Ch05ArrayEx04 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		int month, day;
		int total = 0;
		//1. 월을 입력 받아서 해당 월의 날짜수를 출력한다.
		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
		day = scan.nextInt();
		int hday ;
		int hmonth ;
	System.out.println(month + "월은 " + days[month-1] +"일이다.");	
		
	//1월 1일부터 입력 월일까지의 총 날짜를 total에 누적하여 출력하라.
	//1월 1일부터 x월 x일 까지는 총 xx일이 지났다.
		  
	for(int i=0; i<month-1;i++){
		total += days[i];
	}
	System.out.println("1월 1일 부터 " + month +"월"+ day+"일 까지는 총"+(total+day)+"일이 지났다.");

	
	System.out.println("12월 31일까지 남은 날짜는" +(365-total-day )+ "일이다.");
	if (day<15){
		hmonth = month + 2;
	}else{ hmonth = month +3;}
	
	hday = 99 - (days[month-1] + days[month] + days[month+1])+day  ;
	System.out.println(month + "월" + day+ "일의 100일 는" + (month+3) + "월" + hday +"일 이다.");
	} //main
}
