package org.comstudy21.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class Ch07Ex02Lotto {
	public static void main(String[] args) {

		HashSet<Integer> lotto = new HashSet<Integer>();

		for(int i =0; lotto.size()<6 ; i++){
			
		lotto.add(new Integer(1+(int)(Math.random()*45)+""));
		
		}
		
		Iterator<Integer> it = lotto.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() + "\t");
		}
	}
}
