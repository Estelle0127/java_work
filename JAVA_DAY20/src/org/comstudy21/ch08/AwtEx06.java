package org.comstudy21.ch08;

import java.awt.Button;
import java.awt.GridBagLayout;

public class AwtEx06 extends MyFrame {
	//정가운데에 실제크기로 붙인다.
	GridBagLayout layout = new GridBagLayout();
	Button button = new Button("만사형통하여라!");
	public AwtEx06(){
		setLayout(layout);
	
	this.add(button);
	
	
	}
	public static void main(String[] args) {
		new AwtEx06();
	}
}
