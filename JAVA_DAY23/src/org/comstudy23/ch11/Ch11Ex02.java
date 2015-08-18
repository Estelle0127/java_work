package org.comstudy23.ch11;

import java.awt.Graphics;

public class Ch11Ex02 extends MyJFrame{
	public Ch11Ex02(){
		
	}
	
	public Ch11Ex02(String title, int width, int height){
		super(title,width,height);
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g); super은 myJFrame 때문에.

	}
	
	public static void main(String[] args) {
		new Ch11Ex02("스윙ㅇ연습", 640, 480);
	}
}
