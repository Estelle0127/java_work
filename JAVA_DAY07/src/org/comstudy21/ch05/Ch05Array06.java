package org.comstudy21.ch05;

public class Ch05Array06 {
public static void main(String[] args) {
	int[] arr 	= {1,2,3,4,5};
	int[] arr2	= {6,7,8,9};
	
	//arr배열에 arr2를 연결.
	
	int[]arr3 = new int [arr.length + arr2.length];
	
	for(int i = 0; i<arr3.length ;i++){
		if(i<5){
			arr3[i] = arr[i];
		}else{
			arr3[i] = arr2[i-5];
		}
		arr3 = arr;
		System.out.print(" "+ arr[i]);
	}
}

}