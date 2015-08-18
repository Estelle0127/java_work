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
	// sung ��ü�� 30�� ������� �ƴϴ�.
	// ���� ������ 30�� ���� �Ȱ��̴�.
	static int top = 0;
	static Scanner scan = new Scanner(System.in);

	static {
		Sung s1 = new Sung();
		s1.name = "A";

	}

	static void input() {
		System.out.println("*** INPUT ***");
		people[top] = new Sung(); // �迭�� ��ü�� ���� �����.

		System.out.print("����: ");
		people[top].name = scan.next();
		System.out.print("����: ");
		people[top].kor = scan.nextInt();
		System.out.print("����: ");
		people[top].eng = scan.nextInt();
		System.out.print("����: ");
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

		setRanking(); // �Է� ������ ���ÿ� ����� ���� �ȴ�.
		// ����: ȫ�浿
		// ����: 30
		// ����: 34
		// ����: 55
	}

	private static void setRanking() {
		for (int i = 0; i < top; i++) {
			people[i].rank = 1; // �߿�: ���� �Ǵ� ������ ����� �ʱ�ȭ �ʼ�.
			for (int j = 0; j < top; j++) {
				// �������ؼ� ū���� �ִٸ� ����� ��������.
				if (people[i].avg < people[j].avg) {
					people[i].rank = people[i].rank + 1;
				}
			}
		}
	}

	static void output() {
		System.out.println("*** OUTPUT ***");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("���\t");
		System.out.println("���");
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
		// ���� ���� ���� ���� ���� ��� ���
		// =====================================================
		// ȫ�浿 30 34 55 119 . 1
	}

	static void search() {
		System.out.println("*** SEARCH ***");
		System.out.println("�˻� �� �̸�: ");
		String name = scan.next();
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("���\t");
		System.out.println("���");
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

		System.out.println("�ٲ� �̸� : ");
		String name = scan.next();

		for (int i = 0; i < top; i++) {
			if (people[i].name.equals(name)) {
				System.out.print("�ٲ� ����: ");
				people[i].name = scan.next();
				System.out.print("�ٲ� ��������: ");
				people[i].kor = scan.nextInt();
				System.out.print("�ٲ� ��������: ");
				people[i].eng = scan.nextInt();
				System.out.print("�ٲ� ��������: ");
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
			System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
			System.out.print("����: ");
			int no = scan.nextInt();
			// ��ȿ�� �˻� �ϼ���.
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
	// ����: ���� ��ɰ� ���ı���� �߰��Ѵ�.
}