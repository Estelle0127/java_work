package org.comstudy21.ch07;

// �� ��Ű�� �ȿ� �ΰ��̻� �� �̸��� Ŭ���� X

class Point {
	// ����ʵ�
	int x; int y;
	// ��� �޼ҵ�
	
}

public class Ch07Ex01 {
	public static void main(String[] args) {
		
		Point pt01; //��������
		pt01 = new Point(); //pt01�� ��ü ����. ���ο� �ּһ���. 
		
		pt01.x = 10;
		pt01.y = 20;
		
		System.out.println("pt01.x	=>" + pt01.x);
		System.out.println("pt01.y	=>" + pt01.y);
	//�ϳ��ϳ� �ϸ� ���� �ɸ� ���� �ڽ��� ��Ƽ�, �����ϰ� ������(= ����) ó���ϴ� ���.
	}
}
