package org.cumstudy21.ch05;

public class Ch05HomeworkTest {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 45, 78, 65, 35, 77 };
		int number = 65;

		// arr의 배열의 요소중 number와 같은 값이 있는지 비교하는 반복문
		// 같은게잇다없다 출력
		//몇번째 요소가 같다.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.print((i +1) + "번째 요소에 " + "같은 값이 있다.");
			}
		}
	}
}
