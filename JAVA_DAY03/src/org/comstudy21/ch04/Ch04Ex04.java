package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex04 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char ch = 'F';
		
		System.out.print("�����Է�: ");
		score = scan.nextInt();
		
		switch(score/10) {
		case 10 :
		case 9 : ch = 'A'; break;
		case 8 : ch = 'B'; break;
		case 7 : ch = 'C'; break;
		case 6 : ch = 'D'; break;
		default : ch = 'F';
		}
		 System.out.println("������ "+ ch + "�����̴�.");	
		}
	}
	
	
//switch ~case ���� �̿��Ͽ� ���� �ѳ�¥�� ����ϴ� ���α׷�
//�� �Է� : 2
//2�� 28�ϱ��� �ִ�.
