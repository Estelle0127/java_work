package org.comstudy21.ch04;

public class ArrayParameter {
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
	}

	static void pointCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		char c[] = { 'T','h','i','s',' ','i','s',' ', 'a', ' ','p','e','n','c','i','l','e'};
		pointCharArray(c);
		replaceSpace(c);
		pointCharArray(c); 
	}
}
