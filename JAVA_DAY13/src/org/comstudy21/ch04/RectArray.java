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
				
				System.out.print(i + "  너비와 높이 >>");
				int width = scan.nextInt();
				int height = scan.nextInt();
				r[i] = new Rect(width, height);
			}
			System.out.println("저장하였습니다. . .");
			for (int i = 1; i < r.length; i++) {
				System.out.print(r[i].getArea());
			}
			for (int i=1; i<r.length;i++){
				sum += r[i].getArea();
			}
			System.out.println("사각형의 전체 합은" );
		}
	}
}