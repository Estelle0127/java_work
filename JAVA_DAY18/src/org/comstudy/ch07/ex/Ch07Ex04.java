package org.comstudy.ch07.ex;

import java.util.Scanner;
import java.util.Vector;

public class Ch07Ex04 {
	public static void main(String[] args) {
		int height;
		System.out.println("2000~2009����� 1�� ������ Ű( cm)�� �Է�");
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < 10; i++) {
			height = scan.nextInt();
			v.add(height);
		}
		int minus2 = 0;
		int year = 0;
		int minus = 0;

		for (int i = 1; i < v.size(); i++) {
			minus = v.get(i) - v.get(i - 1);

			if (minus2 < minus) {
				minus2 = minus;
				year = i - 1;

			}
			
		}
		System.out.println("���� Ű�� ���� �ڶ� �⵵��" + (year + 2000) + "��" + (double)minus2 + "cm");
	}// main
}
