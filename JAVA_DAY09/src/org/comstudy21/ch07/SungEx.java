package org.comstudy21.ch07;

import java.util.Scanner;



public class SungEx {

	static String name = ""; //����
	static int kor, eng, mat; //����,����,��������
	static int total, avg; //����,���
	static char ch;//����

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1���� ����, ����, ����, ���� ������ �Է¹޾Ƽ�
		// ����, ���, ����,  ����ϴ� ���α׷��� ����.
	
	
	
	if(kor>=100){
		System.out.println("���� : A");
	}else if(kor>=80){
		System.out.println("���� : B");
	}else if(kor>=70){
		System.out.println("���� : C");
	}else if(kor>=60){
		System.out.println("���� : D");
	}else if(kor>=50){
		System.out.println("���� : E");
	}else{
		System.out.println("���� : F");
	}
	
	if(mat>=100){
		System.out.println("���� : A");
	}else if(mat>=80){
		System.out.println("���� : B");
	}else if(mat>=70){
		System.out.println("���� : C");
	}else if(mat>=60){
		System.out.println("���� : D");
	}else if(mat>=50){
		System.out.println("���� : E");
	}else{
		System.out.println("���� : F");
	}
	
	if(eng>=100){
		System.out.println("���� : A");
	}else if(eng>=80){
		System.out.println("���� : B");
	}else if(eng>=70){
		System.out.println("���� : C");
	}else if(eng>=60){
		System.out.println("���� : D");
	}else if(eng>=50){
		System.out.println("���� : E");
	}else{
		System.out.println("���� : F");
	}
}
}