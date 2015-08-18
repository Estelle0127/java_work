package org.comstudy21.ch08;

import java.awt.BorderLayout;
import java.awt.Button;

//유능한 개발자 일 수록, 짠 코드를 또 짜지 않는다. 활용한다.
public class AwtEx04 extends MyFrame {
	
	Button btn01 = new Button("North");
	Button btn02 = new Button("South");
	Button btn03 = new Button("West");
	Button btn04 = new Button("East");
	Button btn05 = new Button("Center");
BorderLayout layout = new BorderLayout();
	public AwtEx04(String t, int w, int h) {
		super(t, w, h);
		setLayout(layout);
		this.add(btn01,BorderLayout.NORTH);
		this.add(btn02,"South");
		this.add(btn03,"West");
		this.add(btn04,"East");
		this.add(btn05,"Center");
	}
		//Frame은 디폴트 레이아웃 매너지가 BorderLayout. setLayout을 안해줘도 상관없음
	
	
	public static void main(String[] args) {
		new AwtEx04("BorderLayout ex", 600, 400);
	}
}
