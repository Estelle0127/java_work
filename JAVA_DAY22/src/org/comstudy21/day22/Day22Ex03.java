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
		//Runable인터페이스에는 start가 구현될 수 없다.
		//Runable객체를 Thread로 변환시켜 줘야한다.
		Thread th = new Thread(new Day22Ex03());
		//Runable을 구현한 객체를 인자로 받은 Thread 생성자.
	
	}
}
