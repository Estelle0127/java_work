package org.comstudy21.ch04;

public class Ch04MethodArr {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5} ;
		myMethod(arr); //배열도 객체이므로 참조에 의한 호출이다.
		
		for(int i =0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

static void myMethod(int[] arr) {
	for(int i=0; i<arr.length;i++){
		arr[i]++;
	}
		
	}


}
