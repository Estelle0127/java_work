package org.comstudy21.ch08;

public class Ch08Ex02 {
	// ����ʵ�� �ʱ�ȭ ���� ������ 0�Ǵ� null�� �ʱ�ȭ�� �ȴ�.
	int count;
	static int total;
	//static�� ���� Ŭ������ ���� ������ ��ü�� ����.
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
