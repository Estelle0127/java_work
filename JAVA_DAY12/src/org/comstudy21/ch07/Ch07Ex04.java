package org.comstudy21.ch07;

public class Ch07Ex04 {
	static void printStr(String str) {
		System.out.println(str);
	}

	static void printStr(int age, String name) {
		System.out.println(name + age);
	}

	public static void main(String[] args) {

		// println�Լ��� �������� �ȴ�. �̸��� ������ Ÿ���� �������� ����
		System.out.println(5000);
		System.out.println("3.141592");
		System.out.println(3.140293);
		System.out.println('D');

		printStr("���ѹα�"); // ���� print string�� ȣ���Ѵ�. �Ű�����1�� ¥��.
		printStr("������" + "23"); // ���� ���� ȣ���Ѵ�. �Ű������� �����ص� Ÿ���̴ٸ��� �ٸ��Լ��� ������.
		// = �����ε� - Ŭ���� �������� ������
	}
}
