package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {
	public static void main(String[]args) throws IOException{

		
		
		System.out.print("�Է� : "); //2. �Է�
		int ch = System.in.read();//1. �������� ����� ���̴�.
		System.in.read();// ������ '\n' ����
		System.in.read();// ������ '\r' ����
		System.out.print("�Է�2: ");
		int ch2 = System.in.read();
		//�ȵǴ� ���� �� ���ظ�����.
		
		System.out.println("ch => " + (char)ch); //3. �Է��Ѱ� ��������
		System.out.println("ch2 => " + (char)ch2);
	//����� ��Ʈ���ֿ� �ٽ� �� ����	
	//(char) ��, ���ڸ� ���ڷ� �ٲ������ ���. �ʴ� ���� ���ڰ� �ƴ϶� ���ھ�!(����)
	//�̰��� �ƽ�Ű�ڵ��� �Ѵ�. ���̳ʸ� �ڵ�. : Ű���忡 �ִ� ���ǵ鿡�� ������ ��ȣ�� �� �ִ�. 
	// ��ǻ�ʹ� �츮�� a�� �Է��ϸ� 97�� �ڵ带 �ƴٰ� �ν��Ѵ�. 
	}
}
