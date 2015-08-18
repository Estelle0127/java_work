package org.comstudy21.ch07;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ch07Ex03 {
	public static void main(String[] args) {
		Hashtable<String, String> map = new Hashtable<>();
		map.put("홍길동", "010-1118-1111");
		map.put("김길동", "010-1115-1111");
		map.put("박길동", "010-1113-1111");
		map.put("송길동", "010-1111-1111");
		map.put("최길동", "010-1114-1111");

		// map에 있는걸 뽑아낼때는

		Enumeration<String> keys = map.keys();
		while (keys.hasMoreElements()) {
			System.out.println(map.get(keys.nextElement()));
		}
	}
}
