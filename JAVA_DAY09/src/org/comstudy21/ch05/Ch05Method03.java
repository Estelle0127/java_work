package org.comstudy21.ch05;

import java.util.Scanner;

public class Ch05Method03 {
	private static Scanner scan = new Scanner(System.in);
	private static char yn = 'y'; // 메소드 할때 변수는 필드로!
	private static int number = 1 + (int) (Math.random() * 100);
	private static int userNum = 1;
	private static int min = 1, max = 100;
	private static int cnt = 5;
	private static boolean flag = false;

	static void init() { // 멤버필드를 초기화하는 변수 init
		char yn = 'y'; // 메소드 할때 변수는 필드로!
		number = 1 + (int) (Math.random() * 100);
		userNum = 1;
		min = 1;
		max = 100;
		cnt = 5;
		flag = false;
		System.out.println("시스템이 선택한 숫자를 맞춰보세요." + "(" + number + ")");
	}

	static void inputNum() {
		do {
			System.out.println("입력: (" + min + "~" + max + "):");
			userNum = scan.nextInt();
			if (userNum < min || userNum > max) {
				System.out.println("범위 초과!");
			}

		} while (userNum < min || userNum > max);
		cnt = cnt - 1;
		System.out.println("시도 횟수 " + (5 - cnt) + "번 기회는 " + cnt + "번 남았습니다.");
		// 비교한다.
	}

	static void compare() {

	}

	public static void main(String[] args) {
 	
 			 do {
 			init();
 		
						while (cnt > 0) {
							inputNum();
							
				if (userNum == number) {
					flag = true;
					break; //while(cnt>0)에 적용된다.
				} else {
					//입력 범위를 바꾸어준다.
					if (userNum > number) {
						System.out.println("너무 큰 숫자가 입력되었습니다.");
						max = userNum - 1;
					} else {
						System.out.println("너무 작은 숫자가 입력되었습니다.");
						min = userNum + 1;
					}
				}
			}
			if (flag) {
				System.out.println("성공!");
			} else {
				System.out.println("모든 기회가 끝났습니다.");
			}
		 do{
			System.out.print("한번 더 하시겠습니까? [y/n]");
 			yn = scan.next().charAt(0);
		 }while(yn=='y' || yn=='n' );
 		 } while (yn == 'y'&& yn!='n');
 		 System.out.println("Good bye");
}
}