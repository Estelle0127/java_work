package org.comstudy21.ch04;

import java.util.Scanner;

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
}

public class Ch04ObjArr {
	public static void main(String[] args) {
//		Book book = new Book("����� �ô�", "����ī�� �Ϸ�Ű");
//		System.out.println("���� : " +book.title);
		Scanner scan = new Scanner(System.in);
		
		Book [] bArr =new Book[2];
		for(int i =0; i<bArr.length;i++){
			System.out.print("���� :");
			String title = scan.nextLine();
			System.out.print("���� :");
			String author = scan.nextLine();
					
					bArr[i] = new Book(title, author);
		}
		
		
	}
}