package org.comstudy21.ch06;

class Point {// extend Object �����Ǿ���.
	int x, y;
	public Point() {}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args){
		Point p = new Point (); //��ü����
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.getClass());
	}
}
