package org.comstudy21.ch05;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

}

class NamedCircle extends Circle {
	String name;

	public NamedCircle() {
		super(0); // 부모생성자 임의호출
	}

	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}

	public void show() {
		System.out.println(name + ", " + getRadius());
	}

}

public class NamedCircleEx {
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}
