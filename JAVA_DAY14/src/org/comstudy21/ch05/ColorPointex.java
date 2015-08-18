package org.comstudy21.ch05;

class Point{
	private int x,y;
	public void set(int x,int y	){
		this.x = x;
		this.y = y;
	}
public void showPoint(){
	System.out.println("x=>" +x+", y = "+y);
}
}
class ColorPoint extends Point{
	private String color;
	public void setColor(String color){
		this.color = color;
	}
	public void showColorPoint(){
		System.out.println("color=>>" + this.color);
		super.showPoint();
	}
}
//상속! extend만 붙여주면됨


public class ColorPointex {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(3,5);
		p.showPoint();
		
		 ColorPoint cp = new ColorPoint();
		 cp. set(10,20);
		 cp.setColor("blue");
		 cp.showPoint();

	}
}
