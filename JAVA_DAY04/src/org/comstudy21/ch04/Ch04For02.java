package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04For02 {
	private static Scanner scan;
	public static void main(String[] args) {
		int start = 0; //시작할 단
		int end = 0; //종료할 단
		
		scan = new Scanner(System.in);
		System.out.print("시작단: ");
		start = scan.nextInt();
		System.out.print("종료단: ");
		end = scan.nextInt();
		//시작단 : 3
		//종료단 : 5
		//3단~5단까지 출력하도록 실행한다. 
		//시작단이 종료단보다 커도 정상실행되도록.
		
		if(start<end){
		for( int i= start ; i<=end; i ++){
			for( int j= 1; j<=9; j++){
				System.out.print(i+ "*" + j + "=" + i*j);
				System.out.print(" ");
			}
		}
		}else{
			for( int i= end ; i<=start; i ++){
			for( int j= 1; j<=9; j++){
				System.out.print(i+ "*" + j + "=" + i*j);
				System.out.print(" ");
		}
		}
		}
		scan.close();
	}
	public static void ex01(String[] args){
		
		for(int dan = 2; dan<=9; dan++) {
			
		
		for(int i =1; i<9 ; i++){
			System.out.print(dan+"*"+i+"="+dan*i+ "\t");
		}
		System.out.println();//내용을 안넣어도 줄바꾸는기능
		}
	}//end
}
