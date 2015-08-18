package org.comstudy21.ch06.stringBuffer;

public class StringBufferEx {
	
	//행맨게임을 만들어오세여
	
	/* hello
	 * 단어를 완성하세요
	 * 
	 * -----
	 * 
	 * 입력: e
	 * 
	 * -e---
	 * 
	 * 입력 : l
	 * 
	 * -ell-
	 * 입력 : k
	 * =>1번 틀렸다.
	 * 
	 * =====
	 * 
	 * 2단계 
	 * words = {"apple", "computer", "orange", "pencil", "hello"};
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		StringBuffer strBf = new StringBuffer();
		strBf.append("Korea");
		
		System.out.println(strBf.length()) ; //길이 알아볼때
		System.out.println(strBf.charAt(3)) ; //4 번째 알파벳
	
		strBf.setCharAt(3,'a'); //네번째 알파벳을 a로 바꾸어라.
		System.out.println(strBf);
	}
	
	public static void ex01(String[] args){
		
		StringBuffer sb = new StringBuffer("Korea");
		//StringBuffer는 오토박싱 안된다.
		sb.append("Japan");
		
		System.out.println(sb.toString());
		System.out.println(sb);
	}
}
