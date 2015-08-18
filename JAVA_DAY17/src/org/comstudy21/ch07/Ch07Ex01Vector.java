package org.comstudy21.ch07;

import java.util.Scanner;
import java.util.Vector;

public class Ch07Ex01Vector {
	public static void main(String[] args) {
		double userNum = 0;
		Scanner scan = new Scanner(System.in);
		
		userNum = scan.nextDouble();
		
		System.out.print(userNum);
		
		Vector<Integer> v = new Vector<Integer>();
	
		v.add((int)userNum);
	
	
	}
}
