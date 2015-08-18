package org.comstudy21.ch09;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ch09Ex01 extends JFrame{
	JLabel la = new JLabel("자기야");
	
	Ch09Ex01(){
		setTitle("마우스드래그");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.add(la);
		setSize(200,200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener{
	
		public void mouseClicked(MouseEvent e) {}

		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {
			la.setText("사랑해");
		}

		public void mouseExited(MouseEvent e) {	la.setText("자기야");
		}
		
	}
	
	public static void main(String[] args) {
		new Ch09Ex01();
	}
}
