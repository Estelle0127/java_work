package org.comstudy21.ch08;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.WindowConstants;

public class AwtEx01 {
	public static void main(String [] args){
		Frame frame = new Frame();
		
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
		
			public void windowClosing(WindowEvent e){
				frame.dispose();
				System.exit(0);
			}
		});
	}
	
	
	
	
	
	
	
	public static void ex01(String[] args) {

		Frame frame = new Frame();
		// Frame�� ���� �ȴ�(frame��ü). �׷��� ���� �������� �ʴ´�.

		frame.setSize(300, 200);//frame ũ�� ����

		frame.setVisible(true);
		// true �ϸ� ���̰� false�ϸ� �Ⱥ���.
//window Listener�� ������ 7���Ǹ޼ҵ带 ������ ������ Windowadapter�� 7���ȸ��� ��.
		
		//�ݱ� ��� �߰�. �͸�Ŭ���� ����..
		frame.addWindowListener(new WindowListener() {	
			@Override
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
		
//		frame.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				frame.dispose();
//				System.exit(0);
//			}
//		});
	}// end of main
}
