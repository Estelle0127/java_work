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
		
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("���� : ");
		company = scan.nextLine();
		System.out.print("���� : ");
		year = scan.nextInt();
		System.out.print("���� : ");
		pay = scan.nextInt();
		System.out.print("���� : ");
		grade = scan.nextDouble();
		
	System.out.printf("����: %s, ����: %s, ����: %d, ����: %d, ����: .1%f\n", name, company, year, pay, grade);
	}
	
}
