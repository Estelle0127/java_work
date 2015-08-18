package org.comstudy21.ch04;

import java.util.Scanner;

public class RectArray {

	static class Rect {
		private int width, height;

		public Rect(int width, int height) {
			this.width = width;
			this.height = height;
		}

		
		public int getArea() {
			return width * height;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int getArea;
			int sum = 0;
			Rect[] r = new Rect[5];
			for (int i = 1; i < r.length; i++) {
				
				System.out.print(i + "  �ʺ�� ���� >>");
				int width = scan.nextInt();
				int height = scan.nextInt();
				r[i] = new Rect(width, height);
			}
			System.out.println("�����Ͽ����ϴ�. . .");
			for (int i = 1; i < r.length; i++) {
				System.out.print(r[i].getArea());
			}
			for (int i=1; i<r.length;i++){
				sum += r[i].getArea();
			}
			System.out.println("�簢���� ��ü ����" );
		}
	}
}