package org.comstudy21ch06.bonus;

class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "x:"+x+", y:"+y+", radius:" + radius;
	}
	public boolean equals(Circle b){
	
		if(this.radius == b.radius){
			return true;
		}
		return false;
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Circle a = new Circle(1, 2, 10);
		Circle b = new Circle(5, 6, 10);
		System.out.println("원 1 : " + a);
		System.out.println("원 2 : " + b);
		if (a.equals(b))
			System.out.println("같은 원이다.");
		else
			System.out.println("다른 원이다.");

	}
}
