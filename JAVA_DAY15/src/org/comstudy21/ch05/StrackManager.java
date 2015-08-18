package org.comstudy21.ch05;

import java.util.Scanner;

interface StackInterFace {
	int length();
	String pop();
	boolean push(String op);
	
}

class StringStack implements StackInterFace{
	String [] arr = new String [5];
	int top = 0;
	@Override
	public int length() {
		
		return this.top;
	}
	@Override
	public String pop() {
		String str = "";
		if(top >0){
			str = arr[--top];
		}
		return str;	}
	@Override
	public boolean push(String str) {
		if(top < 5) {
			arr[top++] = str;
			return true;
		}
			return false;
		}
		
	}

public class StrackManager {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	StringStack ss = new StringStack();
	ss.push(scan.next());
	ss.push(scan.next());
	ss.push(scan.next());
	ss.push(scan.next());
	ss.push(scan.next());
	
	for(int i=0; i<5; i++){
		System.out.print(ss.pop() + "\t");
	}
}
}
