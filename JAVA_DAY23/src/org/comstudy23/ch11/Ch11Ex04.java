package org.comstudy23.ch11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch11Ex04 extends MyJFrame implements Runnable, ActionListener {
	int x = 20, y = 40, width = 50, height = 50, speed = 10;
	boolean flag = false;
	Button startBtn = new Button("Start");
	Button stopBtn = new Button("Stop");
	Container ctx;
	Panel pan = new Panel(new GridLayout(1, 2));
	
	public Ch11Ex04() {
		super("paint 연습", 640, 480);
	
		ctx = getContentPane();
		
		ctx.setLayout(new BorderLayout());
		ctx.add("South", pan);
		pan.add(startBtn);
		pan.add(stopBtn);
		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int speed = 10;
		while (true) {
			if(flag){
				
			
			x += speed;}
			if(x>500){
				speed *= -1;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			} // 0.1초에 한번씩
			repaint();
		}
	}

	public void paint(Graphics g) {
		g.clearRect(x - (speed * 2), y, width, height);
		g.fillRect(x, y, width, height);

	}

	public static void main(String[] args) {
		new Ch11Ex04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(startBtn)){
			flag = true;
		}else if(e.getSource().equals(stopBtn)){
			flag= false;
		}
	}
}
