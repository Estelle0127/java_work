package org.comstudy23.ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

public class Ch11Ex03 extends MyJFrame {
	Container ctxPan;
	
	public Ch11Ex03() {
		super("GUI¿¬½À",640,480);
		ctxPan = getContentPane();
		
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(200,100,100,100);
	}
	
	public static void main(String[] args) {
		new Ch11Ex03();
	}
}
