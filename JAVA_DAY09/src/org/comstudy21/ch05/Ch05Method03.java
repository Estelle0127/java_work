package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05Method03 {
	private static Scanner scan = new Scanner(System.in);
	private static char yn = 'y'; // �޼ҵ� �Ҷ� ������ �ʵ��!
	private static int number = 1 + (int) (Math.random() * 100);
	private static int userNum = 1;
	private static int min = 1, max = 100;
	private static int cnt = 5;
	private static boolean flag = false;

	static void init() { // ����ʵ带 �ʱ�ȭ�ϴ� ���� init
		char yn = 'y'; // �޼ҵ� �Ҷ� ������ �ʵ��!
		number = 1 + (int) (Math.random() * 100);
		userNum = 1;
		min = 1;
		max = 100;
		cnt = 5;
		flag = false;
		System.out.println("�ý����� ������ ���ڸ� ���纸����." + "(" + number + ")");
	}

	static void inputNum() {
		do {
			System.out.println("�Է�: (" + min + "~" + max + "):");
			userNum = scan.nextInt();
			if (userNum < min || userNum > max) {
				System.out.println("���� �ʰ�!");
			}

		} while (userNum < min || userNum > max);
		cnt = cnt - 1;
		System.out.println("�õ� Ƚ�� " + (5 - cnt) + "�� ��ȸ�� " + cnt + "�� ���ҽ��ϴ�.");
		// ���Ѵ�.
	}

	static void compare() {

	}

	public static void main(String[] args) {
 	
 			 do {
 			init();
 		
						while (cnt > 0) {
							inputNum();
							
				if (userNum == number) {
					flag = true;
					break; //while(cnt>0)�� ����ȴ�.
				} else {
					//�Է� ������ �ٲپ��ش�.
					if (userNum > number) {
						System.out.println("�ʹ� ū ���ڰ� �ԷµǾ����ϴ�.");
						max = userNum - 1;
					} else {
						System.out.println("�ʹ� ���� ���ڰ� �ԷµǾ����ϴ�.");
						min = userNum + 1;
					}
				}
			}
			if (flag) {
				System.out.println("����!");
			} else {
				System.out.println("��� ��ȸ�� �������ϴ�.");
			}
		 do{
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? [y/n]");
 			yn = scan.next().charAt(0);
		 }while(yn=='y' || yn=='n' );
 		 } while (yn == 'y'&& yn!='n');
 		 System.out.println("Good bye");
}
}