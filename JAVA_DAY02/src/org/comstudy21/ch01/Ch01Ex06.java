package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex06 {

	
	public static void main(String[] args){
	
		String name;
		int age;
		double �÷�; //1���� 3��������
		
		Scanner scan = new Scanner(System.in);//2��ĳ�ʼ��� �ڹ�1.5 ���ĺ��� ���Ե�
		//java.util.Scanner�� import �ؾ� �Ѵ�.
		
		System.out.print("���� : ");
		name = scan.nextLine(); //3. next �� ���� �� nextline�� x
		System.out.print("���� : ");
		age = scan.nextInt(); //nextInt�� �����Է�
		System.out.print("�÷� : ");
		�÷� = scan.nextDouble(); //nextDouble 
		
		System.out.printf("����: %s, ����: %d, �÷�: %.1f\n", name, age, �÷�);//4 ���
	}//end of main ��������� ǥ�����ִ� �� ����
} //�÷� �ڿ� �Ҽ������� ������ �� �ִ°�.-> ����! %f�տ� %.1f ���̸� ���ڸ��� ���ѵ�




//����:
//����:
//����:
//����:
//����: