package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05Method02 {
	static Scanner scan = new Scanner (System.in);
	static String getName(){
		String n = scan.next();
		
	return n;
	}
	public static void main(String[] args) {

		String name = getName();
		int age = getAge();
		
		System.out.println(name);
		System.out.print(age);
	}
	private static int getAge() {
		// TODO Auto-generated method stub
		System.out.print("나이입력 :");
		int age = scan.nextInt();
		return age;
	}
}
