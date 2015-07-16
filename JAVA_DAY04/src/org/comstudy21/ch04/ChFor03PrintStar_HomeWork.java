package org.comstudy21.ch04;

public class ChFor03PrintStar_HomeWork {
	public static void main(String[] args) {
		for(int a=0; a<5; a++){
			for(int b=0; b<9; b++){
				if((a+b>=4) && (a-b<=4)){
					System.out.print("*");	
				}else{System.out.print(" ");
				
			}
			}
			System.out.println();}
	}
	
	
	public static void ex03(String[] args) {
		for(int a=0; a<6; a++){
			for(int b=4; b>=a; b--){
				System.out.print(" ");}
			for(int b=0; b<(a*2)-1;b++){
				System.out.print("*");
			}
			System.out.println();}
		}/*
    *
   ***
  *****
 *******
*********

*/
	
		
	
	public static void ex02(String[] args) {
		for(int a=0; a<5; a++){
		for(int b=0; b<5; b++){
			System.out.print(a>4-b ? " ": "*");
		}
		System.out.println();} //상단
		
	 	for(int i=1; i<5; i++){
	 	for(int j=0; j<i+1; j++){
	 		System.out.print(i<j? " " : "*");
	 		}
	 		System.out.println();}//하단
	} //end
	
	public static void ex01(String[] args) {
		for(int a=0; a<5; a++){
		for(int b=0; b<5; b++){
				System.out.print(b<a ? " ": "*");
			}System.out.println();
		} //상단 
		for(int i=1; i<5; i++){ 
			for(int j=0; j<5; j++){
			System.out.print(j<4-i ? " " : "*");
		}
		System.out.println();}
	} //하단
} //end
