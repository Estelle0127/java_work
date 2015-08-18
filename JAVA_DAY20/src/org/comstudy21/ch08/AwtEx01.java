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
		// Frame이 생성 된다(frame객체). 그러나 아직 보이지는 않는다.

		frame.setSize(300, 200);//frame 크기 지정

		frame.setVisible(true);
		// true 하면 보이고 false하면 안보임.
//window Listener은 무조건 7개의메소드를 만들어야 하지만 Windowadapter는 7개안만들어도 됨.
		
		//닫기 기능 추가. 익명클래스 선언..
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
