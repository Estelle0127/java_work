package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04WhileEx01 {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char yn = 'y';
		String name = "";
		
		do{
			System.out.println("�����Է� :");
			name = scan.nextLine();
			System.out.println("����: " + name);
		
			//y�� n�� �ƴϸ� �ٽ� �Է� �޵��� �ϼ���.
			
			do{
				System.out.print("�� �Ͻðڽ��ϱ�?[y/n]");
				yn=scan.nextLine().charAt(0);
			}while(!(yn=='y'||yn=='n'));
		}while(yn=='y');
		System.out.println("�ý��� ����! ������ȸ��~");
	}
}
