package org.comstudy21;

import java.util.Scanner;

public class Day03Ex03 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			double d = Math.random()*100;
			int num = (int)Math.floor(d); //casting. double�� int���� �� ū ����Ÿ Ÿ���� ���������� �ֱ� ���ؼ��� ĳ������ �ʿ��ϴ�.
			int userNum = 0;
			System.out.println("system num=> " + num);
			
			//userNum�� ����ڰ� ���ڸ� �Է��ؼ�
			//num�� ��� ������ ��ġ�ϴ��� �Ǻ��ϴ� ���α׷�
			//��ġ���� �ʴ� �ٸ� �� ū �������� ���� �������� ����
			System.out.println("���ڸ� �Է��Ͻÿ�");
			
			userNum =scan.nextInt();
	
			if(userNum > num) {
		System.out.println("������� ���ڰ� �� Ů�ϴ�.");
	}else if(userNum < num){
		System.out.println("������� ���ڰ� �� �۽��ϴ�.");
	}else{ System.out.println("������ ���ڿ� ��ġ�մϴ�");
	}
	
	} //end
}
