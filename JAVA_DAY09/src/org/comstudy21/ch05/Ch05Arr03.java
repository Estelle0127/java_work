package org.comstudy21.ch05;

public class Ch05Arr03 {
	public static void main(String[] args) {
		
	
	int[][] arr = new int[5][5];
	int num = 1;
	
	for (int i = 0; i < 5; i++) {
		int start = i<2? i : 4-i;
		int end = i<2 ? 5-i : i+1 ;
		for (int j = 0; j < end; j++) {
			arr[i][j] = num++ ;
		}
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.print(arr[i][j]==0?"  ":arr[i][j] + "\t");
		}
		System.out.println();}
	}
public static void ex02(String[] args) {
	int[][] arr = new int[5][5];
	int num = 1;
	for (int i = 0; i < 5; i++) {
		int end = i<2 ? 5-i : i+1 ;
		for (int j = 0; j < end; j++) {
			arr[i][j] = num++ ;
		}

		
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.print(arr[i][j]==0?"  ":arr[i][j] + "\t");
		}
		System.out.println();}
}
	
	
	public static void ex01(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {
					arr[i][j] = num++;
				} else {
					arr[i][4 - j] = num++;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();}
	}
}
