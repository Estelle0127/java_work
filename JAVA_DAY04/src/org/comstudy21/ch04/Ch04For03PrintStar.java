package org.comstudy21.ch04;
 //별 그림표출력
public class Ch04For03PrintStar {
	
	public static void main(String[] args) {
		for(int a=0; a<5; a++){
		for(int b=0; b<5; b++){
				System.out.print(b<a ? " ": "*");
			}System.out.println();
		}
		
		int j;
		for(int i=0; i<5; i++){ 
			for(j=0; j<5; j++){
			System.out.print(j<4-i ? " " : "*");
		}
		System.out.println();}
		
	}//end
	
	// ******
	// *****
	// ***
	// **
	// *
	// **
	// ***
	// ****
	// *****
	
	public static void ex07(String[] args) {
		//*****
		// ****
		//  ***
		//   **
		//    *
		int j;
		for(int i=0; i<5; i++){ 
			for(j=0; j<5; j++){
			System.out.print(j<i ? " " : "*");
		}
		System.out.println();}
		
	}//end of ex07
	
	public static void ex06(String[] args) {
	//*****
	//****
	//***
	//**
	//*
		int j;
		for(int i=0; i<5; i++){ 
			for(j=0; j<5; j++){
				System.out.print(j>4-i? " " : "*");
		}
		System.out.println();}
	}
	 //ex05
	
	
	public static void ex05(String[] args) {
	
		for(int i=0; i<5; i++){
			System.out.print("*");
			for(int j=1; j<5-i; j++ ){
				System.out.print("*");
		}
		System.out.println();}
	}
	
	public static void ex04(String[] args) {
			for(int i=0; i<5; i++){ 
			System.out.print("*");
			for(int j=1; j<i+1; j++ ){
				System.out.print("*");
			}
		
		System.out.println();}
	}//ex04
	
	public static void ex03(String[] args) {
			for(int j=0; j<5; j++){
				System.out.print("\t");
			for(int i=0; i<5; i++) {
			System.out.print("*");
			} System.out.println();
		}
	}
	
	public static void ex02(String[] args){
		 
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
	}
	public static void ex01(String[] args){
			System.out.print("*");
	}
}
