package org.comstudy21.ch07;

class People {	
		int no;
		String name;
}

public class ObjArrayTest_01 {
	public static void main(String[] args) {
		People []pArr = new People[5];
	
		pArr[0] = new People(); //pArr[0]�� ��ü����
		pArr[0].no = 10;
		pArr[0].name = "ȫ�浿";
	}
}
