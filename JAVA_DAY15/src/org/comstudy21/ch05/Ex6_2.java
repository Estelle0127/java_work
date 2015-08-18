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

	figure[] Graphic = new figure[100]; // �迭����. 100���� �׸�����
	Scanner scan = new Scanner(System.in);

	public Ex6_2() {
		while (true) {
			System.out.println("����(1), ����(2), ��� ����(3), ����(4)>>");
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
				System.out.println("�ش���� �����ϴ�.");

			}// switch
		} // while
	}// end of constructor default ������.

	private void input() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� Line(1), Rect(2), Circle(3)>>");
		figure f = new figure();// ��ü����
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
		new Ex6_2(); // ���������� ������ ��ü ����.
	}
}
