package org.comstudy21.ch04;

public class Ch04MethodArr {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5} ;
		myMethod(arr); //�迭�� ��ü�̹Ƿ� ������ ���� ȣ���̴�.
		
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
