package org.comstudy21.ch04;

public class Ch04Homework3 {
 public static void main(String[] args){
	 	
	
		int sum = 0;//sum�� �ٱ������� ������ �ϱ� ������ for�ȿ� ������ �ȵȴ� : ������ ������.
		
		for (int pre = 0,cur=1,next=0;cur<= 21;next = pre + cur,pre = cur,cur = next ) { 
			System.out.print(cur + (cur==21?"=":"+"));
			sum = sum + cur; //����
				
		}
		System.out.println(sum);
 }
}
