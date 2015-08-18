package org.comstudy21.ch06;

import java.util.Scanner;

class Hangman {
	
	String str = "hello";
	StringBuffer strbf = new StringBuffer();
	Scanner scan = new Scanner(System.in);
	int cnt = 0;
	int chance = 0;

	public Hangman() {
		for (int i = 0; i < str.length() && chance > 0; i++) {
			strbf.append("-");
		}
		check('0');
		while (cnt != str.length()) { // 맞추면 더이상 반복불가.
			start();
		}

	}

	public void start() {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(strbf.charAt(i));
		}
		System.out.print("\n입력: ");
		char ch = scan.next().charAt(0);
		check(ch);
	}

	public void check(char ch) {
		boolean flag = false;
		for (int i = 0; i < strbf.length(); i++) {
			if (strbf.charAt(i) == ch && strbf.charAt(i) == '-') {
				cnt++;
				strbf.setCharAt(i, ch);
				flag = true;
			}
		}

		if (flag == false && ch != '0') {
			chance--;
			System.out.println("오답! 기회는 " + chance + "번 남음!");
		}
	}
}// end of class Hangman

 class Hangmans2 extends Hangman {
	static String[] words = {"hello","apple","pencil"} ;
	 public Hangman2() {
	
 }
}

public class HangmanGame {
	public static void main(String[] args) {
		new Hangman2();
		
	}
}
