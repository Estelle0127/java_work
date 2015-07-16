package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex06_practice {

	public static void main(String[] args){
		
		String name;
		String company;
		int year;
		int pay;
		double grade;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("직장 : ");
		company = scan.nextLine();
		System.out.print("년차 : ");
		year = scan.nextInt();
		System.out.print("연봉 : ");
		pay = scan.nextInt();
		System.out.print("평점 : ");
		grade = scan.nextDouble();
		
	System.out.printf("성명: %s, 직장: %s, 년차: %d, 연봉: %d, 평점: .1%f\n", name, company, year, pay, grade);
	}
	
}
