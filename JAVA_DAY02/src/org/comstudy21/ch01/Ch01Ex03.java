package org.comstudy21.ch01;

import java.util.Scanner; //���̺귯���� ������ ����. �������� �������� Scanner

public class Ch01Ex03 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);//�ش� ��ü�� ���ڴ�. �ʵ�(��������)
		String name=""; // ��������
		
		System.out.print("����");
		name = scan.nextLine(); //���ڿ� �Է�
		
		System.out.println( name + "�� �ȳ��ϼ���?");
		

	}
}