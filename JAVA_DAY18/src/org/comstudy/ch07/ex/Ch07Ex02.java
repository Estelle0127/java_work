package org.comstudy.ch07.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch07Ex02 {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner (System.in);
		ArrayList<Character> d = new ArrayList<Character>();
		System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		
		for (int i = 0; i < 5; i++) {
			char score = scan.next().charAt(0);
			d.add(score);
		}

		for (int i = 0; i < d.size(); i++) {
			if (d.get(i) == 'A') {
				System.out.print("4.0  ");
			} else if (d.get(i) == 'B') {
				System.out.print("3.0  ");
			} else if (d.get(i) == 'C') {
				System.out.print("2.0  ");
			} else if (d.get(i) == 'D') {
				System.out.print("1.0  ");
			} else if (d.get(i) == 'F') {
				System.out.print("0.0  ");
			}
		}

	}
}
