package org.comstudy21.ch01;

import java.util.Scanner;

public class Cho1Ex03_practice {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in); //�ʵ�(���� ����)
		String name = ""; //local (���� ����)
		
		System.out.print("����: ");
		name = scan.nextLine(); //���ڿ� �Է�
		
		System.out.println(name + "�� �ȳ��ϼ���?");
	}			
}