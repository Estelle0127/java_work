package org.comstudy21.day22;
//thread를 상속받아서 구현. thread = 추상클래스.
public class Day22Ex02 extends Thread{

	
	@Override
	public void run() {
		for(int i =0; i<100; i++){
			System.out.println("run의 i=>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}//thread를 try catch로 감싸줌. 예외가 발생하면, catch블록을 발생하고 끝내겠다는 의미.
		}
	
	}
	//thread 클래스를 상속받거나
	//Runable 인터페이스를 구현해줘야한다.
	//자바는 다중상속이 안되므로 Runable이 필요하다.
	
	public static void main(String[] args) {
		Thread th = new Day22Ex02();
		th.start();
		for(int i =0; i<100; i++){
			System.out.println("main의 i=>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	}
}
