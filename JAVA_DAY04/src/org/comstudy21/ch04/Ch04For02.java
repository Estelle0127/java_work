package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04For02 {
	private static Scanner scan;
	public static void main(String[] args) {
		int start = 0; //������ ��
		int end = 0; //������ ��
		
		scan = new Scanner(System.in);
		System.out.print("���۴�: ");
		start = scan.nextInt();
		System.out.print("�����: ");
		end = scan.nextInt();
		//���۴� : 3
		//����� : 5
		//3��~5�ܱ��� ����ϵ��� �����Ѵ�. 
		//���۴��� ����ܺ��� Ŀ�� �������ǵ���.
		
		if(start<end){
		for( int i= start ; i<=end; i ++){
			for( int j= 1; j<=9; j++){
				System.out.print(i+ "*" + j + "=" + i*j);
				System.out.print(" ");
			}
		}
		}else{
			for( int i= end ; i<=start; i ++){
			for( int j= 1; j<=9; j++){
				System.out.print(i+ "*" + j + "=" + i*j);
				System.out.print(" ");
		}
		}
		}
		scan.close();
	}
	public static void ex01(String[] args){
		
		for(int dan = 2; dan<=9; dan++) {
			
		
		for(int i =1; i<9 ; i++){
			System.out.print(dan+"*"+i+"="+dan*i+ "\t");
		}
		System.out.println();//������ �ȳ־ �ٹٲٴ±��
		}
	}//end
}
