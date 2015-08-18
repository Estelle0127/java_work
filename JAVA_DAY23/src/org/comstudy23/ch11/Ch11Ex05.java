package org.comstudy23.ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ch11Ex05 extends MyJFrame implements Runnable {
	int x = 20, y = 40, width = 20, height = 30, speed = 10;

	public Ch11Ex05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton playbtn = new JButton("play");
		JButton stopbtn = new JButton("stop");

		c.add(playbtn);
		c.add(stopbtn);

		playbtn.addActionListener(new MyActionListener());
		stopbtn.addActionListener(new MyActionListener());

		Thread th = new Thread(this);
		th.start();

	}

	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if(b.getText().equals("play")){
				
			}else{
				
			}
				
		}

	}

	public void paint(Graphics g) {
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.clearRect(x - (speed * 2), y, width, height);
	}

	public void run() {
		int speed = 10;
	
		
		while (true) {
			x += speed;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			} // 0.1초에 한번씩
			repaint();

		}
	}
	
	public static void main(String[] args) {
		new Ch11Ex05().setVisible(true);
		;
	}

}
