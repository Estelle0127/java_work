package org.comstudy21.ch04;

public class Ch04Homework {
	public static void main(String[] args){
	
		int sum = 0;//0으로 초기화.
		boolean flag = true;
		for(int i=1; i<=10; i++) {
			if(flag ==true){
				
				System.out.print(i + (i==10?"=":"+"));
			sum = (i==1? sum +i : sum-1);//i가 1일때는 sum에 더해주지만 아닐땐 빼준다
			flag = false;
			}else{
			
			System.out.print(i +(i==10?"=":"-") );
			sum += i; //sum = sum + i;
			flag = true;
		}
		
	}
System.out.println(sum);
	}
}
