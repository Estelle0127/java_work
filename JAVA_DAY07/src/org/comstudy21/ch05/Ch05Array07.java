package org.comstudy21.ch05;

//�ζǹ�ȣ ������ �����
//6���� �迭�� ���� 1~45������ ���� �ߺ������ʰ��ϴ°�
//1~45�� ����ִ� �迭���� �ߺ����� �ʴ�6���� ��ȣ�� �̾Ƽ� ���.
public class Ch05Array07 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		int number = 1;
		for (int i = 0; i < ball.length; i++) {
			ball[i] = number++;
		}
		
			int cnt = 0;
			while (cnt < 6) {
				// ��ġ�� �����ؾߵ�.
				int idx = (int) (Math.random() * 45);
				//System.out.println(ball[idx]);
			if(ball[idx] !=0){
				System.out.println(ball[idx]);
				ball[idx]=0;
				cnt++;// cnt����
			}
				
				
			
			}
		}
	



	// ball �迭�� ��Ҹ� 6��, �ߺ����� �ʰ� �̾Ƽ� ����϶�.

	public static void lotto_02(String[] args) {
		int[] lotto = new int[6];
		int cnt = 0; // 6 ������

		while (cnt < 6) {
			int number = (int) (1 + Math.random() * 45); // ����ȭ����ߵ�
			boolean flag = false;
			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == number) {
					flag = true;
					break; // �ߺ��Ǹ� ������
				}
			}
			if (!flag) {
				lotto[cnt] = number;
				cnt++;
			}
		}
		// ���� : �ߺ������ϱ�
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		}

	}
}
