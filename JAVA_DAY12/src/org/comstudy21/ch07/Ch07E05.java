package org.comstudy21.ch07;

class MyCls{
	//static member는 클래스 멤버라고도 한다
	//클래스 멤버는 클래스 선언과 동시에 생성된다.
	//static이 생략된 선언은 인스탄스 멤버이다
	//인스턴스 멤버는 객체를 선언해야 사용가능하다
	//객체를 다룬 말을 인스턴스 라 한다.
	static int number = 100;
	
	static void myMethod(){
		System.out.println("my methodc");
	}
}

public class Ch07E05 {
	public static void main(String[] args) {
		//static 멤버는 객체를 선언하지 않고도 접근가능
		
	}
}
