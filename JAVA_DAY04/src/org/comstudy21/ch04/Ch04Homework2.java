package org.comstudy21.ch04;

public class Ch04Homework2 {
	public static void main(String[] args) {
		int pre = 0; //����
		int cur = 1; //����
		int next = 0;
		int sum = 0;
		
		while(cur<=21) {
			System.out.print(cur + (cur==21?"=":"+"));
			sum = sum + cur; //����
			
			next = pre + cur;
			pre = cur ;
			cur = next ;
			
		}
		System.out.println(sum);
	}
}
