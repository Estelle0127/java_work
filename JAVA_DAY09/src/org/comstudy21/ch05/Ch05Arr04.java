package org.comstudy21.ch05;

public class Ch05Arr04 {
	static int add(int x, int y){ //static���� ������ ������ static�̶�. static ���̸�, Ŭ���� ������ ��. Ŭ������ ������ �� ���� ����.
		int c = x + y; //��������
		return c;
	}
	
	public static void main(String[] args) {
	int sum = 0;
	int a = 10;
	int b = 20;
	
	sum = add(a, b); //add��� �Լ��� ����Ǿ����� ���̰�, �� �Լ��� 10�� 20�� �ְڴ�.
	
	System.out.println("sum =?" + sum);
	
}
}
