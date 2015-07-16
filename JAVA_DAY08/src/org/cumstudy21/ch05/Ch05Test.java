package org.cumstudy21.ch05;

public class Ch05Test {
	public static void main(String[] args) {
		// 1.main 함수 작성
		// 2. String 타입의 변수 name을 선언하고 본인이름대입
		// 3. 변수 name 의 값을 console 화면에 출력
		// 4. for문을 이용하여 1 - 5 정수출력
		// 5. 배열 arr을 선언하고 100,200,300,400,500 초기화하라
		// 6. 배열 arr의 모든 요소값을 순서대로 출력 하라.
		// 7. arr 배열에 900은 없다 라고 출력할 수 있도록.

		// String name = "도지현"; 초기화
		// String name; // 선언
		// name = "도지현"; // 대입
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
		// System.out.print("arr 배열에 900은 없다.");
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
			System.out.println("900이 있다.");
		}else {
			System.out.println("900이 없다.");
		}

	}// main

}
