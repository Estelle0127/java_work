package org.comstudy21.ch06;

import java.util.Scanner;

public class Historgram {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char alpArray [] = new char[26];
	char alp ='A'; //char�� ���� alp�� �ʱⰪ���� A�� �ִ´�.
		for(int i =0; i<alpArray.length ; i++){
			alpArray[i] = alp; //A���� ��������!
			alp++; //alp�� �������!
			System.out.println(alpArray[i]);
		}System.out.println("");
		alp = 'A';
		
scan.close();	}
}
