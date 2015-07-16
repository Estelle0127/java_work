package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex06 {

	
	public static void main(String[] args){
	
		String name;
		int age;
		double 시력; //1변수 3가지설정
		
		Scanner scan = new Scanner(System.in);//2스캐너설정 자바1.5 이후부터 포함됨
		//java.util.Scanner를 import 해야 한다.
		
		System.out.print("성명 : ");
		name = scan.nextLine(); //3. next 는 띄어쓰기 ㅇ nextline은 x
		System.out.print("나이 : ");
		age = scan.nextInt(); //nextInt는 정수입력
		System.out.print("시력 : ");
		시력 = scan.nextDouble(); //nextDouble 
		
		System.out.printf("성명: %s, 나이: %d, 시력: %.1f\n", name, age, 시력);//4 출력
	}//end of main 길어질때는 표시해주는 게 좋음
} //시력 뒤에 소숫점수를 제한할 수 있는가.-> 가능! %f앞에 %.1f 붙이면 한자리로 제한됨




//성명:
//직장:
//년차:
//연봉:
//평점: