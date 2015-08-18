package org.comstudy21.ch06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
public static void main(String[] args) {
	String str = "�垮瘚糕冗冗|六六|今今";
			StringTokenizer st = new StringTokenizer(str,"|");

	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
}
}
