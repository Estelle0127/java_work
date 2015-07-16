package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex10 {
	private static Scanner scan = new Scanner(System.in);//퍼블릭은 외부에서 접근가능이지만 프라이빗은 불가
	public static void main(String[] args ){
		double area = 0.0; //면적
		double line = 0.0; //둘레의 길이
		double r = 0.0;	//반지름
		double PI = Math.PI; //3.141592
		//final을 변수 선언시 사용하면 상수가 된다. final double PI의 PI는 상
		
		line = PI * 2 * r ;
		
		//반지름을 입력 받아서 원의 면적과 둘레의 길이를 출력하는 프로그램
		//원의 면적과 둘레의 길이를 출력하는 프로그램
	
		System.out.print("반지름 :");//1 ""띄우기
		r = scan.nextDouble();//2입력 받아오기
		System.out.print("면적 :");
		area = PI * r * r ;//3 area정의
		System.out.println(area);
		
		System.out.print("둘레 :");
		line = PI * 2 * r ;
		System.out.println(line);
	}
	
	
}
/*식별자 명명규칙(작명규칙)
 * 1. 영문 대/소문자, 숫자 특수문자(_,$)의 조합으로 명명한다.
 * 2. 한글을 사용할 수 있다.(가급적 쓰지않는 것이 좋다)
 * 3. 대/소문자 구분을 한다. int와 INT는 다르다.
 * 4. 첫 글자로 숫자가 올 수없다.
 * 5. 예약어 사용금지
 * 7. 중복된 이름 사용 금지
 * 8. 특수문자나 공백포함 금지 &name, @age,
 * 9. int 30age;
 * 10. 
 *
 */
