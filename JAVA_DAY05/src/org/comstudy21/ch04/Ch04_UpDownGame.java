package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04_UpDownGame {
 private static Scanner scan = new Scanner(System.in);

 	public static void main(String[] args) {
 		int number = 1+ (int)(Math.random()*100);
 		int userNum = 0; //����� �Է°�
 		int min=1, max = 100;
 		int cnt=5;//�õ�Ƚ��
 		char yn = 'y';
 		
 		 System.out.println("�ý����� ������ ���ڸ� ���纸����." + "("+number+")");
 		do{
 			userNum = scan.nextInt();
 			if(!(userNum==number)){ 
 				System.out.println("����! �õ�Ƚ��" + (cnt - 1) + "ȸ ���ҽ��ϴ�.");
 				cnt =  1 ;
 					if(userNum<number){
 						System.out.println("�ʹ� ���� ���ڸ� �Է��Ͽ����ϴ�.");
 						System.out.println("--------------------------");
 						min = userNum+1 ;
 						System.out.println("�ý����� ������ ���ڸ� ���纸����." + "("+min+"~"+max);
 							if(userNum<min){ 
 								System.out.println("������ �ʰ��� ���ڰ� ���Խ��ϴ�. �ٽ� �Է��ϼ���.");
 							} 								
 							
 					}else{
 						System.out.println("�ʹ� ū ���ڸ� �Է��Ͽ����ϴ�.");
 						System.out.println("--------------------------");
 						
 						max = userNum+1 ;
 						System.out.println("�ý����� ������ ���ڸ� ���纸����." + "("+min+"~"+max);
 							if(userNum>max){
 								System.out.println("������ �ʰ��� ���ڰ� ���Խ��ϴ�. �ٽ� �Է��ϼ���.");
 							}
 				}
 			}else{
 				System.out.println("�����Դϴ�." + "("+number+")");
 				System.out.println("�ٽ� �õ��Ͻðڽ��ϱ�? [y/n]"); 	
 			
 			}
 			
 		}while(!(userNum==number));	
 		
 			
	}//main
 	
 public static void fail(String[] args) {
	//1���� 100������ ���� �߻�.
	int number = 1+ (int)(Math.random()*100);
	int userNum = 0; //����� �Է°�
	int min=1, max = 100;
	int cnt=5;//�õ�Ƚ��
	
	do{
	System.out.println("�ý��ۿ��� ������ ���ڸ� ���纸����.("+number+")");
	userNum=scan.nextInt();

	if (userNum == number){
		System.out.println("����! ("+number+")");
		System.out.println("�ٽ� �õ��Ͻðڽ��ϱ�? [y/n]");
		
	}else{ 
		System.out.println("����! �õ�Ƚ��"+ (cnt-1) +"ȸ ���ҽ��ϴ�.");
		if(userNum<number)	{ 
			System.out.println("�ʹ� ���� ���ڸ� �Է��Ͽ����ϴ�.");
			cnt= cnt-1;
			System.out.println("--------------------------");
			while(userNum<userNum+1){System.out.println("������ �ʰ��� ���ڰ� ���Խ��ϴ�. �ٽ� �Է��ϼ���");
			}
			System.out.println("�ý��ۿ��� ������ ���ڸ� ���纸����." + "("+(userNum+1)+ "~" +max+")");
			userNum=scan.nextInt();
			
	}else if(userNum>number){
			System.out.println("�ʹ� ū ���ڸ� �Է��Ͽ����ϴ�.");
			cnt= cnt-1;
			System.out.println("--------------------------");
			System.out.println("�ý��ۿ��� ������ ���ڸ� ���纸����." + "("+min+"~"+(userNum-1)+")");
			userNum=scan.nextInt();
			if(userNum>userNum-1){System.out.println("������ �ʰ��� ���ڰ� ���Խ��ϴ�. �ٽ� �Է��ϼ���");
			}
	
		}while(!(userNum==number));
	
			
	}//else
	
	}while(!(userNum==number));
	
	scan.close();	} //end of main
}//end of class

