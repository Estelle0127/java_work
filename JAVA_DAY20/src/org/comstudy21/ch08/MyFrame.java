package org.comstudy21.ch08;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	public MyFrame(){
		this("no-title");
	}
	public MyFrame(String title){
		this(title, 300, 200);
	}
	public MyFrame(String title, int w, int h){
		this.setTitle(title);
		this.setSize(w, h); //������ �޾ƿ�. 
		//â�� ȭ�� ����� ��ġ��Ű�� ����
		Dimension scrSize  = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)scrSize.getWidth()/2 - this.getWidth()/2;
		int y = (int)scrSize.getHeight()/2 - this.getHeight()/2;
		this.setLocation(x, y); //��ġ ����. int x �� ������ ���߾����� ���� ��. 
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
	
}
}
