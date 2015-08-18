package org.comstudy21.ch07;

// 한 패키지 안에 두개이상 한 이름의 클래스 X

class Point {
	// 멤버필드
	int x; int y;
	// 멤버 메소드
	
}

public class Ch07Ex01 {
	public static void main(String[] args) {
		
		Point pt01; //참조변수
		pt01 = new Point(); //pt01에 객체 생성. 새로운 주소생성. 
		
		pt01.x = 10;
		pt01.y = 20;
		
		System.out.println("pt01.x	=>" + pt01.x);
		System.out.println("pt01.y	=>" + pt01.y);
	//하나하나 하면 오래 걸릴 일을 박스에 담아서, 간결하고 빠르게(= 쉽게) 처리하는 방식.
	}
}
