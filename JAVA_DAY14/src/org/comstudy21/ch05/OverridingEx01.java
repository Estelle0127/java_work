package org.comstudy21.ch05;

class �Һ� {
	void ���� (){
		System.out.println("�Һ��� ���� ��~");
	}
}
class �ƺ� extends �Һ�{
	void ���� (){
	System.out.println("�ƺ��� ���� ��~");
}//������ �������̵� ��.
	
}

class ���� extends �Һ� {
	void ����(){
		
			System.out.println("������ ���� �߸���~");
		
	}
}

public class OverridingEx01 {
	public static void main (String[] args){
		�Һ� h = new �ƺ�();
		h.����(); //���� ���ε� �ȴ�. ���������� ��� ����, ���� ������Ʈ�� ������ �ִ� �� ��µȴ�.
	
		h = new ����();
		h.����();
	}
}
