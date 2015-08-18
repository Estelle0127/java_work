package org.comstudy21.ch07;

class Object {
	public String toString() {
		return this.getClass() + "";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		return false;
	}
}

class Point extends Object {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("x:" + x + ", y:" + y);
	}

	public String toString() {
		return "x:" + x + ", y:" + y;
	}

	public boolean equals(Point p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
}

public class Ch07Ex01 {
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(20,30);
		
		boolean isTrue = p1.equals(p2);
		System.out.println(isTrue ? "같다" : "같지않다");
		System.out.println(p1.toString());
	}
}
//모든 클래스는 object를 상속받는다.