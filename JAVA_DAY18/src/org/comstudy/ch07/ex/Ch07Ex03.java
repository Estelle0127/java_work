package org.comstudy.ch07.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ch07Ex03 {
	public static void main(String[] args) {
		String name;
		int people;
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 5개 입력>>");

		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >>");
			name = scan.nextLine();
			people = scan.nextInt();
			nations.put(name, people);
		
		}
		int max = 0;
		String nation = "";
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			people = nations.get(key);
			if(max < people) {
				nation = key;
				max = people;
			}
		}
		
		System.out.println("인구가 가장 많은 나라는" );
		System.out.println(nation +", "+ nations.get(nation));

		/* Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = nation.get(key);
			System.out.println("제일 인구가 많은 나라는 (" + key + "," + value + ")");
		} 
		*/
	
	}

}
