package org.comstudy21.ch04;

import java.util.Scanner;

public class PhoneManager {
static class Phone {
	String name;
	String tel;
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
}
	
	
	
	public static void main(String[] args) {
		int size = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("�ο��� >>");
		size = scan.nextInt();
		Phone[] phone = new Phone[size];
		
		for(int i =0; i<phone.length; i++){
			System.out.println((i+1) + "   �̸��� ��ȭ��ȣ: ");
			String n = scan.next();
			String t = scan.next();
			phone[i] = new Phone(n,t);
			
		}
System.out.print("�˻��� �̸�: ");
		String name = scan.next();
		for(int i=0; i<phone.length;i++){
			if(name.equals(phone[i].name)) {
				System.out.println(name+"�� ��ȣ��" + phone[i].tel);
			}
		}
	}
}
