package org.comstudy21.ch04;

public class Ch04Homework3 {
 public static void main(String[] args){
	 	
	
		int sum = 0;//sum은 바깥에서도 쓰여야 하기 때문에 for안에 넣으면 안된다 : 변수의 지역성.
		
		for (int pre = 0,cur=1,next=0;cur<= 21;next = pre + cur,pre = cur,cur = next ) { 
			System.out.print(cur + (cur==21?"=":"+"));
			sum = sum + cur; //누적
				
		}
		System.out.println(sum);
 }
}
