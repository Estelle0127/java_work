package org.comstudy21.ch07;

import java.util.StringTokenizer;

public class Ch07Ex02 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("ȫ�浿|");
		sb.append("32|");
		sb.append("����� ���� ���ϵ�");
		
		StringTokenizer st = new StringTokenizer(new String(sb), "|");
	
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());//������ū�� ������ ����. ��ū = �ۺ�, Ŭ���� ��� ������.
		
	}
	
	}
}
