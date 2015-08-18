package org.comstudy.ch07.ex;

import java.util.Scanner;
import java.util.Vector;

public class Ch07Ex01 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<>();
		Scanner scan = new Scanner(System.in);
		double max = 0.0; //초기화
		
		//실수 5개 입력받는다
		for (int i = 0; i < 5; i++) {
			v.add(scan.nextDouble());
		}
		for (int i =0; i<v.size(); i++){
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
	//vector에 있는 숫자 중 제일 큰 수를 찾는다.
	System.out.println("가장 큰 수는 " + max);
	
	}
}

//문제 벡터에 문자열 5개를 입력받아서
//가장짧은 문자열을 출력하라
//같은 길이 문자열은 없어야한다.
