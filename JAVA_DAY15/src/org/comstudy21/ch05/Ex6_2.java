package org.comstudy21.ch05;

import java.util.Scanner;

abstract class Shape{
	public abstract void draw();
}
 class Line extends Shape{
	 public void draw() {
		 System.out.println("Line");
		
	 }
 }
 class Rect extends Shape {
	 public void draw(){
		 System.out.println("Rect");
	 }
 }

 class Circle extends Shape {
	 public void draw(){
		 System.out.println("Circle");
	 }
 }



public class Ex6_2 {
	class figure {
		int idx;
	
	}

	int top = 0;

	figure[] Graphic = new figure[100]; // 배열생성. 100개의 그릇생성
	Scanner scan = new Scanner(System.in);

	public Ex6_2() {
		while (true) {
			System.out.println("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int no = scan.nextInt();
			switch (no) {
			case 1:
				input();
				break;
			case 2:
				delete();
				break;
			case 3:
				output();
				break;
			case 4:
				end();
				break;

			default:
				System.out.println("해당사항 없습니다.");

			}// switch
		} // while
	}// end of constructor default 생성자.

	private void input() {
		// TODO Auto-generated method stub
		System.out.println("도형 종류 Line(1), Rect(2), Circle(3)>>");
		figure f = new figure();// 객체생성
		int idx = scan.nextInt();
		
		
		f.idx = top;
		Graphic[top++] = f;
		
	}

	private void output() {

		}


	private void delete() {

	}

	private void end() {
		
		System.exit(0);
	}

	public static void main(String[] args) {
		new Ex6_2(); // 참조변수를 생략한 객체 생성.
	}
}
