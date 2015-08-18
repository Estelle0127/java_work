package org.comstudy21.ch05;

class Point2 {
	private int x, y;

	public Point2() {
		this.x = this.y = 0;
	}

	public Point2(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("x=>" + x + ",y=>" + y);
	}

}

class ColorPoint2 extends Point2 {
	private String color;

	public ColorPoint2(int x, int y, String color) {
		super(x, y); //super의 생성자를 호출해서 세팅.
		this.color = color;
	}

	public void showColorPoint() {
		super.showPoint();
		System.out.println("color=>" + color);
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp2 = new ColorPoint2(10,20,"red");
		cp2.showColorPoint();
	}
}
