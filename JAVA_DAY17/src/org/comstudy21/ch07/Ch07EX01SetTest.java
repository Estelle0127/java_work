package org.comstudy21.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class Ch07EX01SetTest {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("���");
		set.add("�ٳ���");
		set.add("������");
		set.add("������");
		set.add("�ٳ���"); // �ٳ����� 2������, �����δ� 1��.

		Iterator<String> it = set.iterator(); // ������. �̾ƾ���.
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	//���� : HashSet�� �̿��ؼ� �ζǹ�ȣ �����⸦ ����� ������.
	
	}
}
