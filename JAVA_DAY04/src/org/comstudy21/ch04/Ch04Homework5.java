package org.comstudy21.ch04;

public class Ch04Homework5 {

	public static void main(String[] args){
		
		boolean flag = true;
		for(int i =0; i<10; i++){
			
			if(flag == true) {
				System.out.println("��~");
				flag = false;//�ȹٲ��ָ� ��� ���� ��.
			}else{
				System.out.println("�Ʒ�~");
				flag = true;//�ȹٲ��ָ� ��-�Ʒ��Ʒ��Ʒ��Ʒ�
			}
		}
	}
	
}
