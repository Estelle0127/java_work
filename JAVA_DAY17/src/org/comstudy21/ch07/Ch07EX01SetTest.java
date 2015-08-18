package org.comstudy21.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class Ch07EX01SetTest {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("사과");
		set.add("바나나");
		set.add("오렌지");
		set.add("복숭아");
		set.add("바나나"); // 바나나가 2개지만, 실제로는 1개.

		Iterator<String> it = set.iterator(); // 열거자. 뽑아쓰기.
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	//예제 : HashSet을 이용해서 로또번호 생성기를 만들어 보세요.
	
	}
}
