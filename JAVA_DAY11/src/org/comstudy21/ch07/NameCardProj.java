package org.comstudy21.ch07;

public class NameCardProj {

	// 생성자- Constructor
	// 클래스로 객체를 생성할 때 자동 호출된다.
	// 생성자는 리턴형도 없고 리턴하지 않는다.
	public void test (){
		System.out.println("test 함수 호출!");
	}
	public NameCardProj() {
		System.out.println("디폴트 생성자 호출");
		test(); //test함수 호출. 스태틱 안붙은 함수에서 스태틱 안붙은 함수호출 가능. 스태틱 붙은건 클래스 차원의 함수
			
	}

	public static void main(String[] args) {
		NameCardProj ncp = new NameCardProj();

	}
}
