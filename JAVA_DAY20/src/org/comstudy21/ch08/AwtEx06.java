package org.comstudy21.ch08;

import java.awt.Button;
import java.awt.GridBagLayout;

public class AwtEx06 extends MyFrame {
	//������� ����ũ��� ���δ�.
	GridBagLayout layout = new GridBagLayout();
	Button button = new Button("���������Ͽ���!");
	public AwtEx06(){
		setLayout(layout);
	
	this.add(button);
	
	
	}
	public static void main(String[] args) {
		new AwtEx06();
	}
}
