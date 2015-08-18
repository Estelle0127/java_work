package org.comstudy23.ch11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ch11Ex01 extends JFrame {
	private Panel pan = new Panel(new BorderLayout());
	private Button btn = new Button("OK BUTTON");
	
	public Ch11Ex01() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(640, 480);
		
		Container c = getContentPane();
		c.add(pan);
		c.setBackground(Color.yellow);
		pan.add(btn,"South");

	}
	
	
	public static void main(String[] args) {
		 new Ch11Ex01().setVisible(true);;
	}
}
