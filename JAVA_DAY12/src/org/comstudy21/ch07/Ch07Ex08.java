package org.comstudy21.ch07;

class Point03 {
	//�ƹ��͵� �ϴ� ���� ����(=�Ű������� ����) �����ڴ� ����Ʈ �����ڶ�� �Ѵ�.
	public Point03() {
		System.out.println("����Ʈ ������ ȣ��");
		//Ŭ������ �̸��� ���ƾ��ϸ�, �ʱ�ȭ�ϴ� ���. 
	}

	public void showData() {
		System.out.println("������ �����Ͱ� ����.");
	}

}

public class Ch07Ex08 {
	public static void main(String[] args) {
		Point03 pt = new Point03();// ��ü����.
		pt.showData();
	}
}
