package org.comstudy.ch05;

import java.util.Scanner;

public class Ch04UpAndDownGame {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
 	
 		char yn = 'y';
 		
 		 do {
 			 int number = 1+ (int)(Math.random()*100);
 			 int userNum =1 ; //����� �Է°�
 			 int min=1, max = 100;
 			 int cnt=5;//�õ�Ƚ��
 			 //�ٽý����ϸ� �ʱ�ȭ �Ǿ� �ϱ� ������.
 			 boolean flag = false;
 		
		System.out.println("�ý����� ������ ���ڸ� ���纸����." + "(" + number + ")");
				while (cnt > 0) {
				do {
					System.out.println("�Է�: (" + min + "~" + max + "):");
					userNum = scan.nextInt();
					if (userNum < min || userNum > max) {
						System.out.println("���� �ʰ�!");
					}

				} while (userNum < min || userNum > max);
				cnt = cnt - 1;
				System.out.println("�õ� Ƚ�� " + (5 - cnt) + "�� ��ȸ�� " + cnt + "�� ���ҽ��ϴ�.");
				//���Ѵ�.
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