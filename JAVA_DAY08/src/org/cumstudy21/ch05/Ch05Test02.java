package org.cumstudy21.ch05;

public class Ch05Test02 {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 1, 4, 2 };
		final int number = 1; // fianl�� ������ �ǹ�. �ٲ� �� ����.

		// arr�迭�� number�� ���� ���� ���� ��Ұ� ������
		// Math.random �� �̿��ؼ� ���� �ٲپ��.
		// ��, arr �迭���� �ߺ��Ǵ� ���� ������ �Ͽ���.
		// for (int i = 0; i < arr.length; i++) {
		//
		// if (arr[i] == number) {
		// arr[i] =(int) (1+ Math.random() * 10);
		// }
		//
		// System.out.print(" " + arr[i]);
		// }

		int cnt = 0;
		while (cnt < arr.length) {
			if (arr[cnt] == number) {
				arr[cnt] = (int) (1 + Math.random() * 10);
				// 1. arr�� 0���� ~ arr�� cnt�������� ������ ���� ���� �ִ� �� �˻�
				// 2. ���� ���� �ִٸ� �� ���� �߻�
				// 2-1. �ٽ� 0���� ���� cnt�������� ���� ���� �ִ� �� �˻�.

				int newNum = (int) (1 + Math.random() * 10);

				for (int i = 0; i < arr.length; i++) {
					if (newNum == arr[i]) {
						// System.out.print("���� - " + newNum);
						newNum = (int) (1 + Math.random() * 10);
						i = -1;
					}
				}
				// newNum�� ���� ���� ��Ұ� ����.
				arr[cnt] = newNum;
			}
			cnt++;

		}
		// arr�������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
