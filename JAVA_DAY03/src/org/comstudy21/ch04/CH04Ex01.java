package org.comstudy21.ch04;

import java.util.Scanner;

public class CH04Ex01 {
	public static void main(String[] args) {
		int no = 0;
		Scanner scan = new Scanner(System.in); //Ű����� ���� �Է� �޴� ���� �ҽ��� ����ϰڴ�
		
		System.out.println("(1)���� (2)�ݼ� (3)���� (4) ��");
		System.out.print("���� :");
		no = scan.nextInt();
		
		switch(no) {
		case 1 : System.out.println("�������� ������."); break;
		case 2 : System.out.println("�ݼ����� ������."); break;
		case 3 : System.out.println("������ ������."); break;
		case 4 : System.out.println("������ ������."); break;
		default : System.out.println("�ȵ�θ޴ٷ� ������."); //�⺻��.
		//no�� ������ ����.
		}
		
	}
	
}
