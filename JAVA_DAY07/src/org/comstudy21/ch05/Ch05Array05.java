package org.comstudy21.ch05;

public class Ch05Array05 {
public static void main(String[] args) {
	int[] arr = new int[]{60, 90, 80, 70, 100};
	int[] arr2 = new int[]{6, 9, 8, 7, 1};
	int[] arr3;
	
	
	arr3 = new int[arr.length + arr2.length];
	for(int i=0; i<arr3.length; i++){
		if(i<arr.length){
			arr3[i] = arr[i];
		}else{
			arr3[i] = arr2[i -arr.length];
		}
	
	}
	for(int i = 0; i<arr3.length; i++){
		System.out.print(arr3[i] + "\t");
	}
	
	/*
	int size = arr.length;
	int size2 = arr2.length;
	
	arr3 = new int[size+size2];
	
	//arr3배열에 arr배열과 arr2배열의 내용을 합쳐라.

	for (int i =0; i<size + size2 ; i++){
		if(i<5) {
			arr3[i] = arr[i];
		}else {
			arr3[i] = arr2[i%5];
		}
		System.out.print("  " + arr3[i]);
		}
	*/
	}
}
