package org.cumstudy21.ch05;

public class Ch05Test {
	public static void main(String[] args) {
		// 1.main �Լ� �ۼ�
		// 2. String Ÿ���� ���� name�� �����ϰ� �����̸�����
		// 3. ���� name �� ���� console ȭ�鿡 ���
		// 4. for���� �̿��Ͽ� 1 - 5 �������
		// 5. �迭 arr�� �����ϰ� 100,200,300,400,500 �ʱ�ȭ�϶�
		// 6. �迭 arr�� ��� ��Ұ��� ������� ��� �϶�.
		// 7. arr �迭�� 900�� ���� ��� ����� �� �ֵ���.

		// String name = "������"; �ʱ�ȭ
		// String name; // ����
		// name = "������"; // ����
		// System.out.println(name);
		// for (int i = 0; i < 5; i++) {
		// System.out.print(" " + i);
		// }
		int[] arr = { 100, 200, 300, 400, 500 };
		// // int[] arr = new int[]{100,200,300,400,500,};

		int size = arr.length;
		// for(int i = 0; i< size; i++){
		// System.out.print(" " + arr[i]);
		// }

		// for(int i = 0; i< size ; i++){
		// if (!(arr[i]== 900)){
		// System.out.print("arr �迭�� 900�� ����.");
		//
		// }break;
		// }
		//

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 900) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("900�� �ִ�.");
		}else {
			System.out.println("900�� ����.");
		}

	}// main

}
