package org.comstudy21.ch07;

public class ObjArrayTest {
	static class People{
		int no;
		String name;
	}	
	public static void main(String[] args) {
		People[] pArr = new People[5];

		pArr[0] = new People(); //�迭�� ù��° ��ҿ� ��ü ����.
		pArr[0].no = 10;
		pArr[0].name = "�浿";
		
		People p = new People();
		p.no=20;
		p.name = "���";
		
		pArr[1] = p;
		
		System.out.println("pArr[1].no =>" + pArr[1].no);
		
	}
}
