package org.comstudy21.ch05;

public class Ch05Array02 {
	public static void main(String[] args) {
		int[] arr = new int[]{60, 70, 80, 90, 100};
		int[] arr2; 
		
		//arr�迭�� ��Ұ��� arr 2�迭�� �����ϰ� ���.
		
		//arr2�� �迭�� �����.
		//arr�� �����Ѵ�.
		
		arr2 = new int[arr.length];//arr2�� arr�� ���� ũ��.
		for(int i=0; i<arr.length;i++){
			arr2[i] = arr[i];
			System.out.print(" " + arr2[i]);
		}
		
	}

}
