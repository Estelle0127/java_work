package org.comstudy21.day22;

public class Day22Ex03 implements Runnable{
	
	public void run(){
		
		for(int i =0; i<100; i++){
			System.out.println("i =>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				//e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		//Runable�������̽����� start�� ������ �� ����.
		//Runable��ü�� Thread�� ��ȯ���� ����Ѵ�.
		Thread th = new Thread(new Day22Ex03());
		//Runable�� ������ ��ü�� ���ڷ� ���� Thread ������.
	
	}
}
