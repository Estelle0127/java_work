package org.comstudy.ch07.ex;

import java.util.Scanner;
import java.util.Vector;

public class Ch07Ex01_new {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner scan = new Scanner(System.in);
		String minimum = "";
		
		System.out.println("-->");
		for (int i = 0; i < 5; i++) {
			v.add(scan.nextLine());
		}

		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).length() < minimum.length()) {
				minimum =v.get(i);
			}
		}
		System.out.println(minimum);

	}
}
