package org.comstudy21.Java_practice_04;

public class Song {
	class title {
	}

	private String getTitle() {
		return null;
	}

	public Song(String mySong) {
	}

	public static void main(String[] args) {

		Song mySong = new Song("Let it go");
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}

}
