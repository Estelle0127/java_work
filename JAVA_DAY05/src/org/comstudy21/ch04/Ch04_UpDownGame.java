package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04_UpDownGame {
 private static Scanner scan = new Scanner(System.in);

 	public static void main(String[] args) {
 		int number = 1+ (int)(Math.random()*100);
 		int userNum = 0; //사용자 입력값
 		int min=1, max = 100;
 		int cnt=5;//시도횟수
 		char yn = 'y';
 		
 		 System.out.println("시스템이 선택한 숫자를 맞춰보세요." + "("+number+")");
 		do{
 			userNum = scan.nextInt();
 			if(!(userNum==number)){ 
 				System.out.println("오답! 시도횟수" + (cnt - 1) + "회 남았습니다.");
 				cnt =  1 ;
 					if(userNum<number){
 						System.out.println("너무 작은 숫자를 입력하였습니다.");
 						System.out.println("--------------------------");
 						min = userNum+1 ;
 						System.out.println("시스템이 선택한 숫자를 맞춰보세요." + "("+min+"~"+max);
 							if(userNum<min){ 
 								System.out.println("범위를 초과한 숫자가 들어왔습니다. 다시 입력하세요.");
 							} 								
 							
 					}else{
 						System.out.println("너무 큰 숫자를 입력하였습니다.");
 						System.out.println("--------------------------");
 						
 						max = userNum+1 ;
 						System.out.println("시스템이 선택한 숫자를 맞춰보세요." + "("+min+"~"+max);
 							if(userNum>max){
 								System.out.println("범위를 초과한 숫자가 들어왔습니다. 다시 입력하세요.");
 							}
 				}
 			}else{
 				System.out.println("정답입니다." + "("+number+")");
 				System.out.println("다시 시도하시겠습니까? [y/n]"); 	
 			
 			}
 			
 		}while(!(userNum==number));	
 		
 			
	}//main
 	
 public static void fail(String[] args) {
	//1에서 100사이의 난수 발생.
	int number = 1+ (int)(Math.random()*100);
	int userNum = 0; //사용자 입력값
	int min=1, max = 100;
	int cnt=5;//시도횟수
	
	do{
	System.out.println("시스템에서 선택한 숫자를 맞춰보세요.("+number+")");
	userNum=scan.nextInt();

	if (userNum == number){
		System.out.println("정답! ("+number+")");
		System.out.println("다시 시도하시겠습니까? [y/n]");
		
	}else{ 
		System.out.println("오답! 시도횟수"+ (cnt-1) +"회 남았습니다.");
		if(userNum<number)	{ 
			System.out.println("너무 작은 숫자를 입력하였습니다.");
			cnt= cnt-1;
			System.out.println("--------------------------");
			while(userNum<userNum+1){System.out.println("범위를 초과한 숫자가 들어왔습니다. 다시 입력하세요");
			}
			System.out.println("시스템에서 선택한 숫자를 맞춰보세요." + "("+(userNum+1)+ "~" +max+")");
			userNum=scan.nextInt();
			
	}else if(userNum>number){
			System.out.println("너무 큰 숫자를 입력하였습니다.");
			cnt= cnt-1;
			System.out.println("--------------------------");
			System.out.println("시스템에서 선택한 숫자를 맞춰보세요." + "("+min+"~"+(userNum-1)+")");
			userNum=scan.nextInt();
			if(userNum>userNum-1){System.out.println("범위를 초과한 숫자가 들어왔습니다. 다시 입력하세요");
			}
	
		}while(!(userNum==number));
	
			
	}//else
	
	}while(!(userNum==number));
	
	scan.close();	} //end of main
}//end of class

