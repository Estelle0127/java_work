package org.comstudy.ch07.ex;

import java.util.Scanner;
import java.util.Vector;

public class Ch07Ex01 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<>();
		Scanner scan = new Scanner(System.in);
		double max = 0.0; //�ʱ�ȭ
		
		//�Ǽ� 5�� �Է¹޴´�
		for (int i = 0; i < 5; i++) {
			v.add(scan.nextDouble());
		}
		for (int i =0; i<v.size(); i++){
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
	//vector�� �ִ� ���� �� ���� ū ���� ã�´�.
	System.out.println("���� ū ���� " + max);
	
	}
}

//���� ���Ϳ� ���ڿ� 5���� �Է¹޾Ƽ�
//����ª�� ���ڿ��� ����϶�
//���� ���� ���ڿ��� ������Ѵ�.
