package org.comstudy.ch05;

import java.util.Scanner;

public class Ch05ArrayEx04 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		int month, day;
		int total = 0;
		//1. ���� �Է� �޾Ƽ� �ش� ���� ��¥���� ����Ѵ�.
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();
		int hday ;
		int hmonth ;
	System.out.println(month + "���� " + days[month-1] +"���̴�.");	
		
	//1�� 1�Ϻ��� �Է� ���ϱ����� �� ��¥�� total�� �����Ͽ� ����϶�.
	//1�� 1�Ϻ��� x�� x�� ������ �� xx���� ������.
		  
	for(int i=0; i<month-1;i++){
		total += days[i];
	}
	System.out.println("1�� 1�� ���� " + month +"��"+ day+"�� ������ ��"+(total+day)+"���� ������.");

	
	System.out.println("12�� 31�ϱ��� ���� ��¥��" +(365-total-day )+ "���̴�.");
	if (day<15){
		hmonth = month + 2;
	}else{ hmonth = month +3;}
	
	hday = 99 - (days[month-1] + days[month] + days[month+1])+day  ;
	System.out.println(month + "��" + day+ "���� 100�� ��" + (month+3) + "��" + hday +"�� �̴�.");
	} //main
}
