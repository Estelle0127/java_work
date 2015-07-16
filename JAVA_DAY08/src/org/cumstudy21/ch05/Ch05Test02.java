package org.cumstudy21.ch05;

public class Ch05Test02 {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 1, 4, 2 };
		final int number = 1; // fianl은 상수라는 의미. 바꿀 수 없음.

		// arr배열에 number와 같은 값을 가진 요소가 있으면
		// Math.random 을 이용해서 값을 바꾸어라.
		// 단, arr 배열에는 중복되는 값이 없도록 하여라.
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
				// 1. arr의 0번지 ~ arr의 cnt번지까지 난수가 같은 것이 있는 지 검사
				// 2. 같은 것이 있다면 새 난수 발생
				// 2-1. 다시 0번지 부터 cnt번지까지 같은 것이 있는 지 검사.

				int newNum = (int) (1 + Math.random() * 10);

				for (int i = 0; i < arr.length; i++) {
					if (newNum == arr[i]) {
						// System.out.print("같다 - " + newNum);
						newNum = (int) (1 + Math.random() * 10);
						i = -1;
					}
				}
				// newNum과 같은 값의 요소가 없다.
				arr[cnt] = newNum;
			}
			cnt++;

		}
		// arr내용출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
