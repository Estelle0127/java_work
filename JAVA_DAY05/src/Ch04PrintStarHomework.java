import java.util.Scanner;

public class Ch04PrintStarHomework {
	//ũ�� : 
	//*********
	//*  * *  *
	//* *   * *
	//**	 **
	//*       *
	//**     **
	//* *   * *
	//*  * *  *
    //*********	
	
	public static void main(String[] args) {

	}
	public static void homework09(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ũ��: ");
		int size = scan.nextInt();
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(j==0 || i==size-1 ||i==j||i==0||j==size-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			} System.out.println();
		}
	}
	
	public static void homework08(String[] args) {
		int size = 5;
		for(int i=0; i<9; i++) {
			for (int j=0; j<9; j++){
				System.out.print(j>=size && j<9-size ? " " :"*");
			}
			System.out.println();
			size = i<4 ? size-1 : size +1;}
	}
	
	
	public static void homework07_2(String[] args) {
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				System.out.print(j<i? " " : "*");
			}
			for(int k=0; k<5-i; k++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	
	public static void homework07(String[] args) {
		int size = 5;
		for (int i=0; i<5; i++){
			for(int j=0; j<6;j++ ){
				System.out.print(j<size? " " : "*");
			}
			for(int k=0; k<5-size; k++){
				System.out.print("*");
			}
			size = i<5 ? size-1 : size +1;
			System.out.println();
		}
	
	}
	
	
	public static void homework06(String[] args) {
		int size = 4;
		for (int i=0; i<9; i++){
			for(int j=0; j<5; j++){
				//j�� 5������, ���丷�̴ϱ�! 
				System.out.print(j<size? " " : "*");
			}// j<size�� �׷��� ���� ���ذ���! ����<* �� ���� �׸��� ��
		System.out.println();
		size = i<4 ? size-1 : size +1;
		}
	}
	
	public static void homework05(String[] args) {
		
		int size = 4; //4�� �����̱� ������.
		for (int i=0; i<9; i++){	
			for(int j=0; j<5; j++){
			System.out.print(j<size ? " " : "*");		
			}
			for(int k=0; k<4-size; k++){
				System.out.print("*");
			}
			System.out.println();
			size = i<4 ? size-1 : size+1 ;
			
		}
	} /* size�� �ǹ� = ����
	/ k�� �ǹ� = �ٹٲ��� ���߱� ������, �̾ ����. */
	
	
	
	public static void homework04(String[] args) {
		for(int i =0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(j<i? " " : "*");
			}
			for(int k=0; k<4-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void homework03(String[] args) {
/*
    *
   ***
  *****
 *******
*********
*/
		for(int i=0;i<5; i++){
			for(int j=0; j<5; j++)
			{         /* 5+i =?*/
				System.out.print(j<4-i ? " " : "*");
			}
			for(int k=0; k<i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void homework2(String[] args) {
	/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
*/
		
		int size = 0;
		for (int i=0; i<9; i++){
			for(int j =0; j<5; j++)
			{
				System.out.print(j<size? " " : "*");
			}/* j<size �� ��?*/
			System.out.println();
			size = i<4? size+1 : size-1;
		}
	}
	
	public static void homework01(String[] args){
/* 
*****
****
***
**
*
**
***
****
***** 
*/
		int size = 5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<size; j++){
				System.out.print("*");
			}
			System.out.println();
			
			//size= i<4? size-1 :size+1;
			
			if(i<4) {
				size--;
			}else{
				size++;
			}
			
		}
		
		
		
	} //end of main
} //end of class
