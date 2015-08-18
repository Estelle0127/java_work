package org.comstudy21.ch07;

public class Ch07Ex04 {
	static void printStr(String str) {
		System.out.println(str);
	}

	static void printStr(int age, String name) {
		System.out.println(name + age);
	}

	public static void main(String[] args) {

		// println함수는 다형성이 된다. 이름은 같은데 타입이 여러가지 가능
		System.out.println(5000);
		System.out.println("3.141592");
		System.out.println(3.140293);
		System.out.println('D');

		printStr("대한민국"); // 위의 print string을 호출한다. 매개변수1개 짜리.
		printStr("도지현" + "23"); // 밑의 것을 호출한다. 매개변수가 같다해도 타입이다르면 다른함수로 생각함.
		// = 오버로딩 - 클래스 내에서의 다형성
	}
}
