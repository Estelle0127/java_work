package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex04_practice01 {
	public static void main(String[]args) throws IOException{
		byte[] by = new byte[20];
		
		System.out.println("���� :");
		System.in.read(by);
		
		System.out.print("�Է��� �̸� : ");
		System.out.write(by);
	}
}