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

		System.out.print("�̸��� ��ȭ��ȣ �Է�");
		name = scan.next();
		tel = scan.next();
		Phone p1 = new Phone(name, tel);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է�");
		name = scan.next();
		tel = scan.next();
		Phone p2 = new Phone(name, tel);
	
		System.out.println(p1.getName()+"�� ��ȭ��ȣ" + p1.getTel());
		System.out.println(p2.getName()+"�� ��ȭ��ȣ" + p2.getTel());
		
	}
}
