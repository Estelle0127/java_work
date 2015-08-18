package org.comstudy21.ch07;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

class People{

	public People(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	
}



public class SortEx02 {
	public static void main(String[] args) {
		ArrayList<People> list = new ArrayList<>();
		list.add(new People("ȫ�浿",30));	
		list.add(new People("ȫ�浿",30));
		list.add(new People("ȫ�浿",30));
		list.add(new People("ȫ�浿",30));
		list.add(new People("ȫ�浿",30));
		
		Collection.sort((List)list);
	
	
	}
}
