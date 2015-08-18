package org.comstudy21.ch08;

import java.awt.Button;
import java.awt.GridLayout;

public class AwtEx05 extends MyFrame {
	GridLayout layout = new GridLayout(3, 2); //За, ї­
	Button btn01 = new Button("01");
	Button btn02 = new Button("02");
	Button btn03 = new Button("03");
	Button btn04 = new Button("04");
	Button btn05 = new Button("05");
	Button btn06 = new Button("06");
	
	public AwtEx05() {
		setLayout(layout);
		this.add(btn01);
		this.add(btn02);
		this.add(btn03);
		this.add(btn04);
		this.add(btn05);
		this.add(btn06);
	}
	public static void main(String[] args){
		new AwtEx05();
	}
}
