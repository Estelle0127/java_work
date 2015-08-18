package org.comstudy21.namecard;

//static 멤버는 클래스 멤버이므로
//import가 가능하다.
import static java.lang.System.out;

import java.util.Scanner;

public class Util {
	public static final Scanner scan = new Scanner(System.in);
	public static String getStr() {
		return scan.next();
	}
	public static char getChar() {
		return scan.next().charAt(0);
	}
	
	public static void println(String str) {
		out.println(str);
	}
	public static void println() {
		out.println();
	}
	public static void println(int i) {
		out.println(i);
	}
	public static void println(double d) {
		out.println(d);
	}
	public static void println(char ch) {
		out.println(ch);
	}
	
	public static void print(String str) {
		out.print(str);
	}
	public static void print(int i) {
		out.print(i);
	}
	public static void print(double d) {
		out.print(d);
	}
	public static void print(char ch) {
		out.print(ch);
	}
}
