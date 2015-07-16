                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          package org.comstudy21.ch05_arr2;

public class Ch05Arr2Ex02 {
	public static void main(String[] args) {
	int [][] arr = new int [5][5] ;
	int cnt = 1;
		
	for (int i=0 ; i<5; i++){
			for(int j =0; j<5; j++){
				if(i==0){
				arr[i][j] = cnt++;
				}else if(i==1){
					arr[i][j] = cnt-- + 4;
				}else if(i==2){
					arr[i][j] = cnt++ + 10;
				}else if(i==3){
					arr[i][j] = cnt -- +14 ;
				}else if(i==4){
					arr[i][j] = cnt -- + 20;
				}
				}
		}
	
	
	
	for(int i = 0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++){
			System.out.print(arr[i][j] + "\t");
			
		}
	System.out.println();}
	 
	
}
	
	
	public static void ex03(String[] args) {
		/*
		 *1		6	11	16	21
		 *2		7	12	17	22
		 *3		8	13	18	23
		 *4		9	14	19	24
		 *5		10	15	20	25
		 */

		int[][] arr = new int[5][5];
		int cnt = 1;//출발하는 숫자가 1. +1 씩 커지는 것.
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==0){
					arr[0][0] = 1;
					arr[i][j] = (5*cnt++)-4 ;
				}else if(i==1){
						arr[1][0] = 2;
						arr[i][j] = (5*cnt++)-28;
					}else if(i==2){
						arr[2][0] = 3;
						arr[i][j] = (5*cnt++)-52;
				}else if (i==3){
					arr[3][0] = 4;
					arr[i][j] = (5*cnt++)-76;
				}else if (i==4){
					arr[4][0] = 5;
					arr[i][j] = (5*cnt++)-100;
				}
			}
				
			}
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				
			}//열
			System.out.println();}//행
	}

	public static void ex02(String[] args) {
	int[][] arr = new int[5][5];
	/*
	 * 1 2 3 4 5 
	 * 6 7 8 9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 */
	int cnt = 1;
	for(int i =0; i<5 ; i++){
		for(int j=0; j<5;j++){
			arr[i][j] = cnt++;
		}
	}
	for(int i=0; i<arr.length;i++){
		for(int j=0; i<arr[i].length;j++){
			System.out.print(arr[i][j] + "\t"); 
		System.out.println();}
	}
	

}
	public static void ex01(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }

		};

		for(int i=0;i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
// 2차원ㅂ ㅐ열의 내용을 2중for문을 이용해서 출력하라.
