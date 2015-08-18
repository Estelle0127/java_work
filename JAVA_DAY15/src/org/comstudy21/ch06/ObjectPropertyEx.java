package org.comstudy21.ch06;

class Point {// extend Object 생략되었다.
	int x, y;
	public Point() {}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args){
		Point p = new Point (); //객체생성
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.getClass());
	}
}
