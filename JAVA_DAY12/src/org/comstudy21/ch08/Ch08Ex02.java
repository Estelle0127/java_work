package org.comstudy21.ch08;

public class Ch08Ex02 {
	// 멤버필드는 초기화 하지 않으면 0또는 null로 초기화가 된다.
	int count;
	static int total;
	//static은 같은 클래스로 만든 생성된 객체가 공유.
	public Ch08Ex02(){
		count++;
		total += count;
	}
	
	
	public static void main(String[] args) {
		Ch08Ex02 obj01 = new Ch08Ex02();
		Ch08Ex02 obj02 = new Ch08Ex02();
		Ch08Ex02 obj03 = new Ch08Ex02();
		Ch08Ex02 obj04 = new Ch08Ex02();
	
		System.out.println("count=>"+obj04.count);
		System.out.println("total=>"+obj04.total);
		System.out.println("total=>"+total);
		System.out.println("total=>"+Ch08Ex02.total);
	}
}
