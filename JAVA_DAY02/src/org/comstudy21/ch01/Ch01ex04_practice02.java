package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01ex04_practice02 {

	public static void main(String[]args) throws IOException{
	
		byte[] by = new byte [20];
		
		System.out.println("이름: ");
		System.in.read(by);
	
		System.out.print("입력한 이름: ");
		System.out.write(by);
		
	}
}