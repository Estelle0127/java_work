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

	// ���ο��� �������� static�� �ٿ��ش�
	static Sung[] people = new Sung[30]; // sung ��ü�� 30�� ��������� �ƴ϶� ���������� 30��
											// ����������̴�.

	static int top = 0;
	static Scanner scan = new Scanner(System.in);

	static void input() {
		System.out.println("*** INPUT ***");
		
		for (top = 0; top < 2; top++) {
			people[top] = new Sung(); // �迭�� ��ü�� ���� ������ش�. //������ ����� �ִ°�.
			
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
		}
	}

	static void output() {
		System.out.println("*** OUTPUT ***");
		System.out.println("����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���" + "\t" + "���");
		System.out.println("===========================================================");
		for (top = 0; top < 2; top++) {
			System.out.println(people[top].name + "\t" + people[top].kor + "\t" + people[top].eng + "\t"
					+ people[top].mat + "\t" + people[top].total + "\t" + people[top].avg + "\t" + people[top].rank);
		}
		// ���� ���� ���� ���� ���� ��� ���
		// ========================================
		// ȫ�浿 30 34 55 119 . 1

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
			System.out.println("1. �Է� 2.��� 3.�˻� 4. ����");
			System.out.print("���� :");
			int no = scan.nextInt();
			// ��ȿ�� �˻��ϼ���.
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
