package org.comstudy21.ch05;

public class Ch05Arr04 {
	static int add(int x, int y){ //static붙인 이유는 메인이 static이라서. static 붙이면, 클래스 멤버라고 함. 클래스를 선언할 때 부터 생김.
		int c = x + y; //지역변수
		return c;
	}
	
	public static void main(String[] args) {
	int sum = 0;
	int a = 10;
	int b = 20;
	
	sum = add(a, b); //add라는 함수가 선언되어있을 것이고, 그 함수에 10과 20을 넣겠다.
	
	System.out.println("sum =?" + sum);
	
}
}
