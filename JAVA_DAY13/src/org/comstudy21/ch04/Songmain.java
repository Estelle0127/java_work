package org.comstudy21.ch04;

public class Songmain {
	static class Song {
		String title; //����ʵ�
		Song(String title){ //������
			this.title = title;
		}
		String getTitle(){ //��� �޼ҵ�
			return this.title;
		}
	}
	
	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}
}
