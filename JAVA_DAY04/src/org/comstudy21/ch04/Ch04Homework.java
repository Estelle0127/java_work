package org.comstudy21.ch04;

public class Ch04Homework {
	public static void main(String[] args){
	
		int sum = 0;//0���� �ʱ�ȭ.
		boolean flag = true;
		for(int i=1; i<=10; i++) {
			if(flag ==true){
				
				System.out.print(i + (i==10?"=":"+"));
			sum = (i==1? sum +i : sum-1);//i�� 1�϶��� sum�� ���������� �ƴҶ� ���ش�
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
