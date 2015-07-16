package org.comstudy21.ch05;

//로또번호 생성기 만들기
//6개의 배열을 만들어서 1~45사이의 수를 중복되지않게하는것
//1~45를 담고있는 배열에서 중복되지 않는6개의 번호를 뽑아서 출력.
public class Ch05Array07 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		int number = 1;
		for (int i = 0; i < ball.length; i++) {
			ball[i] = number++;
		}
		
			int cnt = 0;
			while (cnt < 6) {
				// 위치가 랜덤해야됨.
				int idx = (int) (Math.random() * 45);
				//System.out.println(ball[idx]);
			if(ball[idx] !=0){
				System.out.println(ball[idx]);
				ball[idx]=0;
				cnt++;// cnt증가
			}
				
				
			
			}
		}
	



	// ball 배열의 요소를 6개, 중복되지 않게 뽑아서 출력하라.

	public static void lotto_02(String[] args) {
		int[] lotto = new int[6];
		int cnt = 0; // 6 번돈다

		while (cnt < 6) {
			int number = (int) (1 + Math.random() * 45); // 정수화해줘야됨
			boolean flag = false;
			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == number) {
					flag = true;
					break; // 중복되면 걍나감
				}
			}
			if (!flag) {
				lotto[cnt] = number;
				cnt++;
			}
		}
		// 과제 : 중복제거하기
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		}

	}
}
