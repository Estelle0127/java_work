package org.comstudy21.ch07;

class Point03 {
	//아무것도 하는 일이 없는(=매개변수가 없는) 생성자는 디폴트 생성자라고 한다.
	public Point03() {
		System.out.println("디폴트 생성자 호출");
		//클래스와 이름이 같아야하며, 초기화하는 기능. 
	}

	public void showData() {
		System.out.println("보여줄 데이터가 없다.");
	}

}

public class Ch07Ex08 {
	public static void main(String[] args) {
		Point03 pt = new Point03();// 객체생성.
		pt.showData();
	}
}
