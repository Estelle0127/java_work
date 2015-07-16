package org.comstudy21.ch07;

import java.util.Scanner;



public class SungEx {

	static String name = ""; //성명
	static int kor, eng, mat; //국어,영어,수학점수
	static int total, avg; //총점,평균
	static char ch;//학점

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1명의 성명, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균, 학점,  출력하는 프로그램을 구현.
	
	
	
	if(kor>=100){
		System.out.println("국어 : A");
	}else if(kor>=80){
		System.out.println("국어 : B");
	}else if(kor>=70){
		System.out.println("국어 : C");
	}else if(kor>=60){
		System.out.println("국어 : D");
	}else if(kor>=50){
		System.out.println("국어 : E");
	}else{
		System.out.println("국어 : F");
	}
	
	if(mat>=100){
		System.out.println("수학 : A");
	}else if(mat>=80){
		System.out.println("수학 : B");
	}else if(mat>=70){
		System.out.println("수학 : C");
	}else if(mat>=60){
		System.out.println("수학 : D");
	}else if(mat>=50){
		System.out.println("수학 : E");
	}else{
		System.out.println("수학 : F");
	}
	
	if(eng>=100){
		System.out.println("영어 : A");
	}else if(eng>=80){
		System.out.println("영어 : B");
	}else if(eng>=70){
		System.out.println("영어 : C");
	}else if(eng>=60){
		System.out.println("영어 : D");
	}else if(eng>=50){
		System.out.println("영어 : E");
	}else{
		System.out.println("영어 : F");
	}
}
}