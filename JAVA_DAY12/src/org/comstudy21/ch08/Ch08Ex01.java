package org.comstudy21.ch08;

class Point {
	private int x;
	private int y;

	public void setX(int x){
		//this 는 객체 자신의 참조값 주소
		
		this.x = x;
	}
	public void setY(int y){
		//this 는 객체 자신의 참조값 주소
		
		this.y = y;
	}
	
	public int getX(){
		//this 는 객체 자신의 참조값 주소
		
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	public Point() {
		this(10,10);
		//생성자에서 생성자 호출
		//생성자 호출 보다 다른 문장이 먼저 올 수 없다.
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ch08Ex01 {
public static void main(String[] args) {
	
}
}
