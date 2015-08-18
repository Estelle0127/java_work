package org.comstudy23.ch11;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	public MyJFrame(){
		this("no-title");
	}
	public MyJFrame(String title){
		this(title,300,200);
	}
	
	public MyJFrame(String title, int width, int height){
		setTitle(title);
		setSize(width,height);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension srcSize = toolkit.getScreenSize();
		int srcX = srcSize.width/2 - getWidth()/2 ;
		int srcY = srcSize.height/2 - getHeight()/2 ;
		setLocation(srcX, srcY);
	
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MyJFrame();
}
}
