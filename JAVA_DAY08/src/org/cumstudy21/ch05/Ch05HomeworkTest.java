package org.cumstudy21.ch05;

public class Ch05HomeworkTest {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 45, 78, 65, 35, 77 };
		int number = 65;

		// arr�� �迭�� ����� number�� ���� ���� �ִ��� ���ϴ� �ݺ���
		// �������մپ��� ���
		//���° ��Ұ� ����.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.print((i +1) + "��° ��ҿ� " + "���� ���� �ִ�.");
			}
		}
	}
}
