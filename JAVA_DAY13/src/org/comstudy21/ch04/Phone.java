package org.comstudy21.ch04;

import java.util.Scanner;

public class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;

	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, tel;

		System.out.print("이름과 전화번호 입력");
		name = scan.next();
		tel = scan.next();
		Phone p1 = new Phone(name, tel);
		
		System.out.print("이름과 전화번호 입력");
		name = scan.next();
		tel = scan.next();
		Phone p2 = new Phone(name, tel);
	
		System.out.println(p1.getName()+"의 전화번호" + p1.getTel());
		System.out.println(p2.getName()+"의 전화번호" + p2.getTel());
		
	}
}
