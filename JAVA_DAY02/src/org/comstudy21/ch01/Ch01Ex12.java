package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex12 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		int max, mid, min;
		
		//���� 3���� �Է� �޾Ƽ� ū ��, ��� ��, ���� ���� ���.
		System.out.print("���� �ٸ� ���� 3���� �Է��ϼ���.");
		
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		 num3 = scan.nextInt();
		 //System.out.print(num1);
		 //System.out.print(num2);
		 //System.out.print(num3);
	 if((num1 > num2) && (num2 > num3)) {
		 System.out.println("max " + "=" + num1);
	 }else if((num3> num2) && (num2 > num1)) {
		 System.out.println("max " + "=" + num3);
	 }else if((num3>num1) && (num1 > num2)) {
		 System.out.println("max " + "=" + num3);
	 }else if((num2>num1) && (num1>num3)) {
		 System.out.println("max" + "=" + num2);
	 }else if((num2>num3) && (num3>num1)) {
		 System.out.println("max" + "=" + num2);
	 }else if((num1>num3) && (num3>num2)) {
		 System.out.println("max" + "=" + num1);
	 }
	
	 
	 
	 
	 
	 
	 
	} 
}	/*end*/