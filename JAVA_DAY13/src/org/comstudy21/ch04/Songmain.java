package org.comstudy21.ch04;

public class Songmain {
	static class Song {
		String title; //멤버필드
		Song(String title){ //생성자
			this.title = title;
		}
		String getTitle(){ //멤버 메소드
			return this.title;
		}
	}
	
	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
	}
}
