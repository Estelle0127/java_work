package org.comstudy21.ch07;

import java.util.Scanner;

import org.comstudy21.ch07.SungEx03_mine.Sung;

public class SungEx03 {
	static class Sung {
		String name;
		int kor, eng, mat;
		int total, rank;
		char grade;
		double avg;
	}

	static Sung[] people = new Sung[30];
	// sung 객체가 30개 생긴것이 아니다.
	// 참조 변수가 30개 생성 된것이다.
	static int top = 0;
	static Scanner scan = new Scanner(System.in);

	static {
		Sung s1 = new Sung();
		s1.name = "A";

	}

	static void input() {
		System.out.println("*** INPUT ***");
		people[top] = new Sung(); // 배열에 객체를 먼저 만든다.

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
		top++;

		setRanking(); // 입력 받음과 동시에 등수가 결정 된다.
		// 성명: 홍길동
		// 국어: 30
		// 영어: 34
		// 수학: 55
	}

	private static void setRanking() {
		for (int i = 0; i < top; i++) {
			people[i].rank = 1; // 중요: 누적 되는 변수는 사용전 초기화 필수.
			for (int j = 0; j < top; j++) {
				// 각각비교해서 큰것이 있다면 등수가 내려간다.
				if (people[i].avg < people[j].avg) {
					people[i].rank = people[i].rank + 1;
				}
			}
		}
	}

	static void output() {
		System.out.println("*** OUTPUT ***");
		System.out.print("성명\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("총점\t");
		System.out.print("평균\t");
		System.out.println("등수");
		System.out.println("==================================================");
		for (int i = 0; i < top; i++) {
			System.out.print(people[i].name + "\t");
			System.out.print(people[i].kor + "\t");
			System.out.print(people[i].eng + "\t");
			System.out.print(people[i].mat + "\t");
			System.out.print(people[i].total + "\t");
			System.out.printf("%.2f\t", people[i].avg);
			System.out.println(people[i].rank + "\t");
		}
		// 성명 국어 영어 수학 총점 평균 등수
		// =====================================================
		// 홍길동 30 34 55 119 . 1
	}

	static void search() {
		System.out.println("*** SEARCH ***");
		System.out.println("검색 할 이름: ");
		String name = scan.next();
		System.out.print("성명\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("총점\t");
		System.out.print("평균\t");
		System.out.println("등수");
		for (int i = 0; i < top; i++) {
			if (people[i].name.equals(name)) {
				System.out.print(people[i].name + "\t");
				System.out.print(people[i].kor + "\t");
				System.out.print(people[i].eng + "\t");
				System.out.print(people[i].mat + "\t");
				System.out.print(people[i].total + "\t");
				System.out.print(people[i].avg + "\t");
				System.out.println(people[i].rank + "\t");
			}
		}
	}

	static void end() {
		System.out.println("*** END ***");
		System.exit(0);
	}

	static void modify() {
		System.out.println("*** MODIFY ***");

		System.out.println("바꿀 이름 : ");
		String name = scan.next();

		for (int i = 0; i < top; i++) {
			if (people[i].name.equals(name)) {
				System.out.print("바뀐 성명: ");
				people[i].name = scan.next();
				System.out.print("바뀐 국어점수: ");
				people[i].kor = scan.nextInt();
				System.out.print("바뀐 영어점수: ");
				people[i].eng = scan.nextInt();
				System.out.print("바뀐 수학점수: ");
				people[i].mat = scan.nextInt();

				people[i].total = people[i].kor + people[i].eng + people[i].mat;
				people[i].avg = people[i].total / 3.0;
				switch ((int) (people[i].total) / 10) {
				case 10:
				case 9:
					people[i].grade = 'A';
				case 8:
					people[i].grade = 'B';
				case 7:
					people[i].grade = 'C';
				case 6:
					people[i].grade = 'D';
				default:
					people[i].grade = 'F';
				}
				setRanking();
			}
		}

	}

	static void sort() {
		System.out.println("*** SORT ***");
		for (int i = 0; i < top; i++) {
			for (int j = 0; j < top; j++) {
				if (people[i].rank < people[j].rank) {

					Sung tmp = people[i];
					people[i] = people[j];
					people[j] = tmp;
				}
			}
		}

	}

	public static void main(String[] args) {
		do {
			System.out.println("1.입력 2.출력 3.검색 4.수정 5.정렬 6.종료");
			System.out.print("선택: ");
			int no = scan.nextInt();
			// 유효성 검사 하세요.
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
				modify();
				break;
			case 5:
				sort();
				break;
			case 6:
				end();
			}
		} while (true);
	}
	// 과제: 수정 기능과 정렬기능을 추가한다.
}