package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex07 {

	public static void main(String[] args){
		
		String name;
		String company;
		int year;
		int pay;
		double grade;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("이름 : ");
		name = scan.nextLine();//띄어쓰기가 됨
		System.out.print("직장 : ");
		company = scan.next();//띄어쓰기가 안됨.
		System.out.print("년차 : ");
		year = scan.nextInt();
		System.out.print("연봉 : ");
		pay = scan.nextInt();
		System.out.print("평점 : ");
		grade = scan.nextDouble();
		
	System.out.print(name + "\t");
	System.out.print(company + "\t");
	System.out.print(year + "년\t");
	System.out.print(pay + "만원\t");
	System.out.print(grade + "점\t");
		
	
	}
}