package org.comstudy21.ch05;

class Shape{
public void draw() {System.out.println("Shape");}

}
class Circle extends Shape {
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Circle");
	}

}

public class DYnamicBingdingEx {
public static void main(String[] args) {
	Shape s = new Circle();
	s.paint();
}	
}
