package org.comstudy21.ch08;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtEx02 extends Frame implements WindowListener {
	public AwtEx02() {
		setSize(300, 200);
		setVisible(true); // this�� ��ü �� �ڽ�. this.setVisible���� this�� ��������.
		this.addWindowListener(this);
	}
	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose();// ����Ǵ� �޸� ȸ��.
		System.exit(0);
	}
	public static void main(String[] args) {
		Frame f = new AwtEx02(); // Frame ����� �޾Ƽ� Ŭ���� ��ü�� Frame�� ��. new
									// AwtEx02();�� �ص� ��
									// ��ĳ����.
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
