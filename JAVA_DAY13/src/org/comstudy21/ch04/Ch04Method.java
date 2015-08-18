package org.comstudy21.ch04;

class Circle {
	int r;

	public Circle(int r) {
		this.r = r;
	}
}

public class Ch04Method {

	static void myMethod(int n) {
		n = n + 1;
	}

	static void myMethod2(Circle c) {
		c.r = c.r + 1;
	}

	public static void main(String[] args) {
		int i = 10;
		myMethod(i); // 값에 의한 호출
		System.out.println("i =>" + i);

		Circle pizza = new Circle(10);
		myMethod2(pizza); // 참조에 의한 호출
		System.out.println("pizza.r=>" + pizza.r);

	}
}
