package org.comstudy21;

import java.util.Scanner;

public class Day03Ex02 {
	private static Scanner scan= new Scanner(System.in);
 public static void main(String[] args)
 {
	 
	 	int score = 0;
	 	char grade = 'f';
	 //성적을 score에 입력 받아서 학점을 grade에 담는다
	 //성적을 입력받아 학점을 출력하는 프로그래밍
	 //단 0~100점 사이의 점수만 가능하도록 한다
	 //0~100점 사이가 아니면 Error!를 출력하도록 한다
	 	System.out.println("성적을 입력해 주세요.");
	 	
	 	score = scan.nextInt();
	 
	 if((score>=90) &&((score<101))){
		 grade = 'A';
	 }else if(score>=80){
		 grade = 'B';
	 }else if(score>=70){
		 grade = 'C';
	 }else if(score>=60){
		 grade = 'D';
	 }else if (score>=50){
		 grade = 'E';
	 }else if((score <49) && (score>0)){
	 	grade = 'f'; // 초기값이기 때문에 생략가능
	 	System.out.println("학점 : " + grade);
	 }else{
			 System.out.print("error!");
	 }
	 
 }
 
}
