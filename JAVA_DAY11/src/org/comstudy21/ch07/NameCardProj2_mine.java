package org.comstudy21.ch07;

import java.util.Scanner;

public class NameCardProj2_mine {
	class People {
		int idx;
		String name;
		String phone;
	}

	int top = 0;// private 는 클래스 내에서만 사용하겠다라는 접근지정자.

	People[] CardGroup = new People[100]; // 배열생성. 100개의 그릇생성

	Scanner scan = new Scanner(System.in);

	public NameCardProj2_mine() {
		System.out.println("*** 전화번호부 관리 프로그램 ***");
		while (true) {
			System.out.println("1. 입력 2. 출력 3. 검색 4. 수정 5. 삭제 6. 종료");
			System.out.print("선택 :");
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
				System.out.println("해당사항 없습니다.");

			}// switch
		} // while
	}// end of constructor default 생성자.

	private void input() {
		// TODO Auto-generated method stub
		System.out.println("*** input ***");
		People p = new People();// 객체생성
		System.out.print("성명: ");
		p.name = scan.next();
		System.out.print("전화번호: ");
		p.phone = scan.next();
		p.idx = top;
		CardGroup[top++] = p;
		System.out.println("입력이 완료되었다.");
	}

	private void output() {

		System.out.println("*** output ***");

		for (int i = 0; i < top; i++) {
			System.out.println("idx : " + CardGroup[i].idx);
			System.out.println("성명 :" + CardGroup[i].name);
			System.out.println("전화번호 :" + CardGroup[i].phone);
			System.out.println("==================================");

		}
	}

	private void search() {

		System.out.println("*** search ***");

		System.out.println("검색 할 이름: ");
		String name = scan.next();

		for (int i = 0; i < top; i++) {
			if (CardGroup[i].name.equals(name)) {
				System.out.println("idx : " + CardGroup[i].idx);
				System.out.println("성명 :" + CardGroup[i].name);
				System.out.println("전화번호 :" + CardGroup[i].phone);
				System.out.println("==================================");
			}
		}

	}

	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("*** modify ***");
		System.out.println("바꿀 이름 : ");
		String name = scan.next();
		for (int i = 0; i < top; i++) {
			if (CardGroup[i].name.equals(name)) {
				System.out.print("바뀐 이름: ");
				CardGroup[i].name = scan.next();
				System.out.print("바뀐 번호: ");
				CardGroup[i].phone = scan.next();
				System.out.println("==================================");
			}
		}

	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("*** delete ***");
		System.out.println("삭제할 이름 : ");
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
		new NameCardProj2_mine(); // 참조변수를 생략한 객체 생성.
	}
}
