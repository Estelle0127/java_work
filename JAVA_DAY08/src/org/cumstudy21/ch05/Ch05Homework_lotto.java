package org.cumstudy21.ch05;

public class Ch05Homework_lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int cnt = 0;
		// 6 번돈다

		while (cnt < 6) {
			int number = (int) (1 + Math.random() * 45); // 정수화해줘야됨
			// number에 만들어진 난수가 기존에 입력된 배열 요소와 같은 값인지?
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

		// 과제 : 중복제거하기
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		}

	}

}