package org.comstudy21.ch07;

public class Ch07Ex06 {
	
	static void prn(int ... args) {
		//����Ÿ������ �󸶵��� �޾Ƶ鿩 ó���� �� �ִ�.
		for(int i =0; i<args.length; i++){
			System.out.print(args[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String ... args) {
		prn(10);
		prn(10,20);
		prn(10,20,30);
	}
}
