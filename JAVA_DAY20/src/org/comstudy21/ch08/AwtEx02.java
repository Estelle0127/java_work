package org.comstudy21.ch08;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtEx02 extends Frame implements WindowListener {
	public AwtEx02() {
		setSize(300, 200);
		setVisible(true); // this가 객체 그 자신. this.setVisible에서 this를 생략가능.
		this.addWindowListener(this);
	}
	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose();// 실행되던 메모리 회수.
		System.exit(0);
	}
	public static void main(String[] args) {
		Frame f = new AwtEx02(); // Frame 상속을 받아서 클래스 자체가 Frame이 됨. new
									// AwtEx02();만 해도 됨
									// 업캐스팅.
		// f.setVisible(true);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
