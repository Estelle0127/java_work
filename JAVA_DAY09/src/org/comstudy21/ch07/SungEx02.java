package org.comstudy21.ch07;

import java.util.Scanner;

public class SungEx02 {
	static class Sung {
		String name;
		int kor, eng, mat;
		int total, rank;
		char grade;
		double avg;
	}

	// 메인에서 쓰기위해 static을 붙여준다
	static Sung[] people = new Sung[30]; // sung 객체가 30개 만들어진게 아니라 참조변수가 30개
											// 만들어진것이다.

	static int top = 0;
	static Scanner scan = new Scanner(System.in);

	static void input() {
		System.out.println("*** INPUT ***");
		
		for (top = 0; top < 2; top++) {
			people[top] = new Sung(); // 배열에 객체를 먼저 만들어준다. //공간을 만들어 주는것.
			
			System.out.print("성명: ");
			people[top].name = scan.next();
			System.out.print("국어: ");
			people[top].kor = scan.nextInt();
			System.out.print("영어: ");
			people[top].eng = scan.nextInt();
			System.out.print("수학: ");
			people[top].mat = scan.nextInt();

			people[top].total = people[top].kor + people[top].eng + people[top].mat;
			people[top].avg = people[top].total / 3.0;
			switch ((int) (people[top].total) / 10) {
			case 10:
			case 9:
				people[top].grade = 'A';
			case 8:
				people[top].grade = 'B';
			case 7:
				people[top].grade = 'C';
			case 6:
				people[top].grade = 'D';
			default:
				people[top].grade = 'F';
			}
			people[top].rank = 1;
		}
	}

	static void output() {
		System.out.println("*** OUTPUT ***");
		System.out.println("성명" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "등수");
		System.out.println("===========================================================");
		for (top = 0; top < 2; top++) {
			System.out.println(people[top].name + "\t" + people[top].kor + "\t" + people[top].eng + "\t"
					+ people[top].mat + "\t" + people[top].total + "\t" + people[top].avg + "\t" + people[top].rank);
		}
		// 성명 국어 영어 수학 총점 평균 등수
		// ========================================
		// 홍길동 30 34 55 119 . 1

	}

	static void search() {
		System.out.println("*** SEARCH ***");
	}

	static void end() {
		System.out.println("*** END ***");
		System.exit(0);

	}

	public static void main(String[] args) {
		do {
			System.out.println("1. 입력 2.출력 3.검색 4. 종료");
			System.out.print("선택 :");
			int no = scan.nextInt();
			// 유효성 검사하세요.
			switch (no) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				end();
			}
		} while (true);
	}
}
