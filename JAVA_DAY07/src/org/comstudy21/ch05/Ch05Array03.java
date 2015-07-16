package org.comstudy21.ch05;

public class Ch05Array03 {
public static void main(String[] args) {
	int[] arr = new int[]{90, 100, 80, 60, 70};
	//int[] arr2; 
	//arr2 = new int[arr.length];
	
	//for(int i=0; i<arr2.length; i++){
	//	 arr[i]=arr2[i] ;}
	
	
	for(int i=0; i< arr.length; i++){
		for(int j=i; j< arr.length; j++){
			if(arr[i]<arr[j]){
			int tmp = arr[i];
			arr [i]= arr[j];
			arr[j] = tmp;
			}
			
		} //for문
	System.out.print("오름차순으로 배열 :  "+arr[i]);}
	}
}
