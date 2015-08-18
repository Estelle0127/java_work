package org.comstudy21.ch07;

import java.util.Scanner;

public class NameCardProj2_mine {
	class People {
		int idx;
		String name;
		String phone;
	}

	int top = 0;// private �� Ŭ���� �������� ����ϰڴٶ�� ����������.

	People[] CardGroup = new People[100]; // �迭����. 100���� �׸�����

	Scanner scan = new Scanner(System.in);

	public NameCardProj2_mine() {
		System.out.println("*** ��ȭ��ȣ�� ���� ���α׷� ***");
		while (true) {
			System.out.println("1. �Է� 2. ��� 3. �˻� 4. ���� 5. ���� 6. ����");
			System.out.print("���� :");
			int no = scan.nextInt();
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
				delete();
				break;
			case 6:
				end();
				break;
			default:
				System.out.println("�ش���� �����ϴ�.");

			}// switch
		} // while
	}// end of constructor default ������.

	private void input() {
		// TODO Auto-generated method stub
		System.out.println("*** input ***");
		People p = new People();// ��ü����
		System.out.print("����: ");
		p.name = scan.next();
		System.out.print("��ȭ��ȣ: ");
		p.phone = scan.next();
		p.idx = top;
		CardGroup[top++] = p;
		System.out.println("�Է��� �Ϸ�Ǿ���.");
	}

	private void output() {

		System.out.println("*** output ***");

		for (int i = 0; i < top; i++) {
			System.out.println("idx : " + CardGroup[i].idx);
			System.out.println("���� :" + CardGroup[i].name);
			System.out.println("��ȭ��ȣ :" + CardGroup[i].phone);
			System.out.println("==================================");

		}
	}

	private void search() {

		System.out.println("*** search ***");

		System.out.println("�˻� �� �̸�: ");
		String name = scan.next();

		for (int i = 0; i < top; i++) {
			if (CardGroup[i].name.equals(name)) {
				System.out.println("idx : " + CardGroup[i].idx);
				System.out.println("���� :" + CardGroup[i].name);
				System.out.println("��ȭ��ȣ :" + CardGroup[i].phone);
				System.out.println("==================================");
			}
		}

	}

	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("*** modify ***");
		System.out.println("�ٲ� �̸� : ");
		String name = scan.next();
		for (int i = 0; i < top; i++) {
			if (CardGroup[i].name.equals(name)) {
				System.out.print("�ٲ� �̸�: ");
				CardGroup[i].name = scan.next();
				System.out.print("�ٲ� ��ȣ: ");
				CardGroup[i].phone = scan.next();
				System.out.println("==================================");
			}
		}

	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("*** delete ***");
		System.out.println("������ �̸� : ");
		String name = scan.next();
		for (int i = 0; i < top; i++) {
				if (CardGroup[i].name.equals(name)) {
					for(int j=i; j<top-1;j++){
						CardGroup[j] = CardGroup[j+1];
					}
				top--;
				break;
						}
		}
	}

	private void end() {
		// TODO Auto-generated method stub
		System.out.println("*** end ***");
		System.exit(0);
	}

	public static void main(String[] args) {
		new NameCardProj2_mine(); // ���������� ������ ��ü ����.
	}
}
