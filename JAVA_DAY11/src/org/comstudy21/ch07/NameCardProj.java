package org.comstudy21.ch07;

public class NameCardProj {

	// ������- Constructor
	// Ŭ������ ��ü�� ������ �� �ڵ� ȣ��ȴ�.
	// �����ڴ� �������� ���� �������� �ʴ´�.
	public void test (){
		System.out.println("test �Լ� ȣ��!");
	}
	public NameCardProj() {
		System.out.println("����Ʈ ������ ȣ��");
		test(); //test�Լ� ȣ��. ����ƽ �Ⱥ��� �Լ����� ����ƽ �Ⱥ��� �Լ�ȣ�� ����. ����ƽ ������ Ŭ���� ������ �Լ�
			
	}

	public static void main(String[] args) {
		NameCardProj ncp = new NameCardProj();

	}
}
