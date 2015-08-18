package org.comstudy.ch07.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ch07Ex06 {
	public static void main(String[] args) {

		HashMap<String, Integer> person = new HashMap<>();
		ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("** 포인트 관리 프로그램입니다**");
		System.out.println("이름과 포인터 입력>>");
		String name = scan.next();
		if (person.get(name) != null) {
			int point = person.get(name);
			person.put(name, scan.nextInt() + point);
		} else {
			person.put(name, scan.nextInt());
		}
		person.put(scan.next(), scan.nextInt());
		Set<String> keys = person.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + "," + person.get(name));
		}

		for (int i = 0; i < person.size(); i++) {

		}

	}
}
