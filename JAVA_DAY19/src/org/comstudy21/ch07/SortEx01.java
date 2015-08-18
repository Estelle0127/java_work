package org.comstudy21.ch07;

import java.util.ArrayList;
import java.util.Comparator;

public class SortEx01 {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(20);
	list.add(10);
	list.add(40);
	list.add(50);
	list.add(70);
	list.add(60);
	
	list.sort(new Comparator(){
		public int compare(Object o1, Object o2){
			int res=0;
			if((Integer)o1 > (Integer)02) {
				res = 1;
			}else{
				res = -1;
			}
			return res;
		}
	});
	for(Integer i : list) {
		System.out.print(i+"\t");
	}
	
}
}
