package org.comstudy21.homework;

public class Ch06OpenChallange {

	public static void main(String[] args) {
		String str = "Join the jQuery Foundation.";

		
		for (int a = 0; a < 26; a++) {
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == (a +'A') || str.charAt(i) == (a+'a') ) {
					cnt++;
				}
			}
			System.out.println((char)((a)+'A')+": ");
			for(int j =0; j<cnt; j++){
				System.out.print("-");
			}
		System.out.println();}
	}
}
