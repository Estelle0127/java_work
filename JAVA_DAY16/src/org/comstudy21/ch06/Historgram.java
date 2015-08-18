package org.comstudy21.ch06;

import java.util.Scanner;

public class Historgram {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char alpArray [] = new char[26];
	char alp ='A'; //char형 변수 alp에 초기값으로 A를 넣는다.
		for(int i =0; i<alpArray.length ; i++){
			alpArray[i] = alp; //A부터 차곡차곡!
			alp++; //alp는 계속증가!
			System.out.println(alpArray[i]);
		}System.out.println("");
		alp = 'A';
		
scan.close();	}
}
