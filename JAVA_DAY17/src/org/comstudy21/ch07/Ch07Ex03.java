package org.comstudy21.ch07;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ch07Ex03 {
	public static void main(String[] args) {
		Hashtable<String, String> map = new Hashtable<>();
		map.put("ȫ�浿", "010-1118-1111");
		map.put("��浿", "010-1115-1111");
		map.put("�ڱ浿", "010-1113-1111");
		map.put("�۱浿", "010-1111-1111");
		map.put("�ֱ浿", "010-1114-1111");

		// map�� �ִ°� �̾Ƴ�����

		Enumeration<String> keys = map.keys();
		while (keys.hasMoreElements()) {
			System.out.println(map.get(keys.nextElement()));
		}
	}
}
