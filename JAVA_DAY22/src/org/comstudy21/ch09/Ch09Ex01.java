package org.comstudy21.ch09;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ch09Ex01 extends JFrame{
	JLabel la = new JLabel("�ڱ��");
	
	Ch09Ex01(){
		setTitle("���콺�巡��");
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
			la.setText("�����");
		}

		public void mouseExited(MouseEvent e) {	la.setText("�ڱ��");
		}
		
	}
	
	public static void main(String[] args) {
		new Ch09Ex01();
	}
}
