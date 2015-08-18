package org.comstudy21.day22;

public class Day22Ex01 {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i =0; i<100; i++){
			System.out.println("i=> "+ i);
			
			Thread.sleep(100);//강제로 인터럽터를 발생.
		}

	}
}
