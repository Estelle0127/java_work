package org.comstudy.ch05;

public class Ch05ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = {50, 30, 80, 70, 20, 90};
				// 	  i   j
		//�������� ������ �ؼ� ����϶�.
		//���� ����, ��������, �������� ���� ���ظ� �ؾ���. �̰� ��������.
		for(int i =0; i<arr.length; i++){
			for(int j=i+1;j< arr.length; j++ ){
				//���� �տ������� ���� �ʿ䰡 ��� i+1. j�� ������ �������.
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} //end of for
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
