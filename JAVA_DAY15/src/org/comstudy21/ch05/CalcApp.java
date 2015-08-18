package org.comstudy21.ch05;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	abstract protected int calc();
	protected void input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	public void run() {
		input();
		int res = calc ();
		System.out.println("���� ����" + res);
	}
}
class Adder extends Calculator {
	@Override
	protected int calc() {
		return a + b;
	}
}
class Substracter extends Calculator{
	protected int calc() {
		return a - b;
	}
}


public class CalcApp {
	public static void main(String[] args) {
		Adder adder = new Adder ();
		Substracter sub = new Substracter();
	
		adder.run();
		sub.run();
	}
}
