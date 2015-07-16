package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex12 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		int max, mid, min;
		
		//숫자 3개를 입력 받아서 큰 수, 가운데 수, 작은 수를 출력.
		System.out.print("서로 다른 숫자 3개를 입력하세요.");
		
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