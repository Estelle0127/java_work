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
//		Book book = new Book("상실의 시대", "무라카미 하루키");
//		System.out.println("제목 : " +book.title);
		Scanner scan = new Scanner(System.in);
		
		Book [] bArr =new Book[2];
		for(int i =0; i<bArr.length;i++){
			System.out.print("제목 :");
			String title = scan.nextLine();
			System.out.print("저자 :");
			String author = scan.nextLine();
					
					bArr[i] = new Book(title, author);
		}
		
		
	}
}