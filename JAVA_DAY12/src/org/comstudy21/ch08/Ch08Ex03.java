package org.comstudy21.ch08;

class Circle {
	private double r; //멤버필드

	public Circle(double r) { //생성자
		this.r = r;
 
	}

	public double getArea() { //멤버 메소드
		return Math.PI * r * r;
	}
}

public class Ch08Ex03 {
	public static void main(String[] args) {
		Circle[] cArr; //배열을 담는(참조하는) 참조변수.
		cArr = new Circle[5];
		for(int i =0; i<cArr.length;i++){
			cArr[i] = new Circle(i);
			
		} for(int i =0; i<cArr.length;i++){
			System.out.println((cArr[i].getArea()+"").substring(0,5));
		}
	}
}
