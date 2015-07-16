package org.comstudy21;

import java.util.Scanner;

public class Day03Ex03 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			double d = Math.random()*100;
			int num = (int)Math.floor(d); //casting. double이 int보다 더 큰 데이타 타입을 작은것으로 넣기 위해서는 캐스팅이 필요하다.
			int userNum = 0;
			System.out.println("system num=> " + num);
			
			//userNum에 사용자가 숫자를 입력해서
			//num에 담긴 난수와 일치하는지 판별하는 프로그램
			//일치하지 않는 다면 더 큰 숫자인지 작은 숫자인지 구분
			System.out.println("숫자를 입력하시오");
			
			userNum =scan.nextInt();
	
			if(userNum > num) {
		System.out.println("사용자의 숫자가 더 큽니다.");
	}else if(userNum < num){
		System.out.println("사용자의 숫자가 더 작습니다.");
	}else{ System.out.println("사용사의 숫자와 일치합니다");
	}
	
	} //end
}
