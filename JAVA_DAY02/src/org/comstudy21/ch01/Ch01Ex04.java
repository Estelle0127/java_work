package org.comstudy21.ch01;
import java.io.IOException;
public class Ch01Ex04 {
	public static void main(String[ ] args) throws IOException{
		
		byte[] by = new byte[20];
		
		System.out.println("���� :");
		System.in.read(by); //byte �迭�� �Է�

//�Է¹��� ���� � ���� �Էµ��� �𸣱⿡, ���ܻ�Ȳ�� �Ͼ �� �ִ�.
//�׷��⿡, �� ��Ȳ�� �ý��ۿ� �ѱ�ڴ� - add throws declaration		
				
		System.out.print("�Է��� �̸�: ");
		System.out.write(by); //byte[] �迭�� �ִ� ���� ����Ѵ�
	}	
}