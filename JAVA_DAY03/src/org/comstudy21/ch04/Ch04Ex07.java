package org.comstudy21.ch04;

public class Ch04Ex07 {

	public static void main(String[] args){
		
		int sum =0;
		final int MAX = 10;
		
		for(int i=1; i<=MAX; i++) {
			System.out.print(i+ (i==MAX ? "=" : "+" ));
			sum = sum + i;
			
		}
		
		System.out.println(sum);
	}
	
}
// 과제 : 
//1+2+3+4+5+6+7+8+9+10=55
// 1+2-3+4-5+6-7+8-9+10=7 for 를 써서
// 1+1+2+3+5+8+13+21=54
// 1+1-2+3-5+8-13+21=14