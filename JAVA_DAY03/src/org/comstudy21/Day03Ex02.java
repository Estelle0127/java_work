package org.comstudy21;

import java.util.Scanner;

public class Day03Ex02 {
	private static Scanner scan= new Scanner(System.in);
 public static void main(String[] args)
 {
	 
	 	int score = 0;
	 	char grade = 'f';
	 //������ score�� �Է� �޾Ƽ� ������ grade�� ��´�
	 //������ �Է¹޾� ������ ����ϴ� ���α׷���
	 //�� 0~100�� ������ ������ �����ϵ��� �Ѵ�
	 //0~100�� ���̰� �ƴϸ� Error!�� ����ϵ��� �Ѵ�
	 	System.out.println("������ �Է��� �ּ���.");
	 	
	 	score = scan.nextInt();
	 
	 if((score>=90) &&((score<101))){
		 grade = 'A';
	 }else if(score>=80){
		 grade = 'B';
	 }else if(score>=70){
		 grade = 'C';
	 }else if(score>=60){
		 grade = 'D';
	 }else if (score>=50){
		 grade = 'E';
	 }else if((score <49) && (score>0)){
	 	grade = 'f'; // �ʱⰪ�̱� ������ ��������
	 	System.out.println("���� : " + grade);
	 }else{
			 System.out.print("error!");
	 }
	 
 }
 
}
