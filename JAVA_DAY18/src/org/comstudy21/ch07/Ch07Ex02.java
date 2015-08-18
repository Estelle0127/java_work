package org.comstudy21.ch07;

import java.util.StringTokenizer;

public class Ch07Ex02 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("홍길동|");
		sb.append("32|");
		sb.append("서울시 은평구 응암동");
		
		StringTokenizer st = new StringTokenizer(new String(sb), "|");
	
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());//다음토큰이 있을때 까지. 토큰 = 퍼블릭, 클래스 등등 저런거.
		
	}
	
	}
}
