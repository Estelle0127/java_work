package org.comstudy21.ch05_arr2;

public class Ch05ArrEx01 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 4 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
