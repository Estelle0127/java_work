package org.comstudy.ch05;

public class Ch05ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = {50, 30, 80, 70, 20, 90};
				// 	  i   j
		//오름차순 정렬을 해서 출력하라.
		//선택 정렬, 삽입정렬, 버블정렬 등은 이해를 해야함. 이건 선택정렬.
		for(int i =0; i<arr.length; i++){
			for(int j=i+1;j< arr.length; j++ ){
				//제일 앞에꺼랑은 비교할 필요가 없어서 i+1. j는 끝까지 가줘야함.
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
