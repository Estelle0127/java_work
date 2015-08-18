package org.comstudy21.homework;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch06test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = ""; 
		System.out.print("연산 입력 :");
		str=	scan.nextLine(); //2+5+6+10

		int sum = 0;
		StringTokenizer st = new StringTokenizer(str, "+");
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken().trim());
			sum+=num;
		}
		System.out.println("합은" + sum);
	}
	
}
