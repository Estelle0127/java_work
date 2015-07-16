package org.comstudy21.ch05;

public class Ch05Array02 {
	public static void main(String[] args) {
		int[] arr = new int[]{60, 70, 80, 90, 100};
		int[] arr2; 
		
		//arr배열의 요소값을 arr 2배열에 복사하고 출력.
		
		//arr2를 배열로 만든다.
		//arr을 복사한다.
		
		arr2 = new int[arr.length];//arr2는 arr와 같은 크기.
		for(int i=0; i<arr.length;i++){
			arr2[i] = arr[i];
			System.out.print(" " + arr2[i]);
		}
		
	}

}
