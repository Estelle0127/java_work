package org.comstudy21.ch05;

public class Ch05Array04 {
	public static void main(String[] args) {
		// arr�迭���� ���� ū���� max�� ���� �������� min
		// for��.
		int[] arr = new int[] { 60, 90, 80, 70, 100 };
		int size = arr.length;
		
		int max = 0;
		int min = 100;
		for(int i =0; i<size; i++){
			if(max<arr[i]){
				max = arr[i];
			}
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		/*for (int i = 0; i < size; i++) {//arr.length���� size�� �ϴ� ���� �� �������̴�.
			for (int j = i; j < size; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		max = arr[0];
		min = arr[size - 1];
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min); */

	}// main
}
