package org.comstudy21.day22;
//thread�� ��ӹ޾Ƽ� ����. thread = �߻�Ŭ����.
public class Day22Ex02 extends Thread{

	
	@Override
	public void run() {
		for(int i =0; i<100; i++){
			System.out.println("run�� i=>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}//thread�� try catch�� ������. ���ܰ� �߻��ϸ�, catch����� �߻��ϰ� �����ڴٴ� �ǹ�.
		}
	
	}
	//thread Ŭ������ ��ӹްų�
	//Runable �������̽��� ����������Ѵ�.
	//�ڹٴ� ���߻���� �ȵǹǷ� Runable�� �ʿ��ϴ�.
	
	public static void main(String[] args) {
		Thread th = new Day22Ex02();
		th.start();
		for(int i =0; i<100; i++){
			System.out.println("main�� i=>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	}
}
