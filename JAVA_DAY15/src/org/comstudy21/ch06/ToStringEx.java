package org.comstudy21.ch06;

class Point2{
	int x, y;
	public Point2(){}
	public Point2(int x, int y){
this.x = x;
this.y = y;
}

public String toString(){
	return x + ", " + y;
}

}


public class ToStringEx {
public static void main(String[] args) {
	Point2 p2 = new Point2(10, 15);
	System.out.println(p2.toString());
}
}
