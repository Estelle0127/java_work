package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum, computerNum = 0;
		String[] tools = {"����","����","��"};
		
		String user = "����", computer="����";
		
		System.out.println("����(1) ����(2) ��(3) ������(4)>>");
		userNum = scan.nextInt();
		if(userNum ==4){
			System.out.println("��!");
			return;
		}
			user = tools[userNum-1];
			computer = tools[(int)(Math.random()*3)];
			// from ~ to
			// from + Math.random()* (
	
			System.out.print("�����  " +user+ ":");
			System.out.println("��ǻ��  " +computer);
	
		switch(user) {
		case "����" :
			switch(computer) 
			{case "����" :
			System.out.print("�����ϴ�.");
			case "����" :
			System.out.print("����ڰ� �����ϴ�.");
			case "��" :
				System.out.print("����ڰ� �̰���ϴ�.");
			}
			break;
		case "����" :
			switch(computer) 
			{case "����" :
			System.out.print("����ڰ� �̰���ϴ�.");
			case "����" :
			System.out.print("�����ϴ�.");
			case "��" :
				System.out.print("����ڰ� �����ϴ�.");
			}
			break;
		case "��" :
			switch(computer) 
			{case "����" :
			System.out.print("����ڰ� �����ϴ�.");
			case "����" :
			System.out.print("����ڰ� �̰���ϴ�.");
			case "��" :
				System.out.print("�����ϴ�.");
			}
			
		}
	
	}
}
