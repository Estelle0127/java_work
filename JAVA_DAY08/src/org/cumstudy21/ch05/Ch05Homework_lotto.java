package org.cumstudy21.ch05;

public class Ch05Homework_lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int cnt = 0;
		// 6 ������

		while (cnt < 6) {
			int number = (int) (1 + Math.random() * 45); // ����ȭ����ߵ�
			// number�� ������� ������ ������ �Էµ� �迭 ��ҿ� ���� ������?
			lotto[cnt] = number;
			cnt++;
			
			for(int i = 0; i < lotto.length ; i++){
				if(lotto[i] == number){
					number = (int) (1 + Math.random() * 45);
					i= -1;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			if (lotto[0] == lotto[1]) {
				cnt = 0;
			} else if (lotto[0] == lotto[2]) {
				cnt = 0;
			}
		} 

		// ���� : �ߺ������ϱ�
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		}

	}

}