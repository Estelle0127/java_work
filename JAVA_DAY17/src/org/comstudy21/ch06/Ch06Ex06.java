package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum, computerNum = 0;
		String[] tools = {"가위","바위","보"};
		
		String user = "가위", computer="가위";
		
		System.out.println("가위(1) 바위(2) 보(3) 끝내기(4)>>");
		userNum = scan.nextInt();
		if(userNum ==4){
			System.out.println("끝!");
			return;
		}
			user = tools[userNum-1];
			computer = tools[(int)(Math.random()*3)];
			// from ~ to
			// from + Math.random()* (
	
			System.out.print("사용자  " +user+ ":");
			System.out.println("컴퓨터  " +computer);
	
		switch(user) {
		case "가위" :
			switch(computer) 
			{case "가위" :
			System.out.print("비겼습니다.");
			case "바위" :
			System.out.print("사용자가 졌습니다.");
			case "보" :
				System.out.print("사용자가 이겼습니다.");
			}
			break;
		case "바위" :
			switch(computer) 
			{case "가위" :
			System.out.print("사용자가 이겼습니다.");
			case "바위" :
			System.out.print("비겼습니다.");
			case "보" :
				System.out.print("사용자가 졌습니다.");
			}
			break;
		case "보" :
			switch(computer) 
			{case "가위" :
			System.out.print("사용자가 졌습니다.");
			case "바위" :
			System.out.print("사용자가 이겼습니다.");
			case "보" :
				System.out.print("비겼습니다.");
			}
			
		}
	
	}
}
