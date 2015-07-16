package org.comstudy21.ch01;

public class Ch01Ex01 {
	public static void main(String[]args){
		System.out.print("성명: ");//개행x
		System.out.println("홍길동");//자동개행
		
		System.out.printf("성명: %s \n", "홍길동");//c언어출력st
		//변환문자열 : %s, %d, %f, %l
		System.out.printf("나이: %d \n", 45);//자주안쓰임. 가끔 어떤 테스트 시 필요함
		//특수문자 
		// 개행 \n
		// 탭 	\t
		// 비프(삐삐삐삐) \a
		// 리턴(맨앞으로감) \r
	}
}