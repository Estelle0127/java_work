package org.comstudy.ch05;

public class Ch05ArrayEx02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		
		//÷�ڴ� ����� ���� ��� ��� ����.
		
		arr[i++]= 30; //0->1
		arr[i++]= 70; //0->2
		arr[i++]= 40;
		arr[i++]= 90;
		arr[i++]= 80;		
		
		System.out.println("i=>" + i); 
		// �迭�� for���� �� ��︰��.
		
		for(i =0; i<arr.length;i++){
			System.out.println("arr["+i+"] => " + arr[i]);
		}
	
	}
}
