package org.comstudy21.ch08;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtEx08 extends MyFrame implements ActionListener{
	
	Button btn01 = new Button("btn 01");
	Button btn02 = new Button("btn 02");
	Button btn03 = new Button("btn 03");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	Label label = new Label("대한민국 만세");
	
	public AwtEx08(){
		p1.add(btn01);
		p1.add(btn02);
		p1.add(btn03);
		p2.setLayout(new GridBagLayout());
		p2.add(label);
		
		
		this.add(p1,"South");
		this.add(p2,"Center");
	
		btn01.addActionListener(this);
		btn02.addActionListener(this);
		btn03.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new AwtEx08();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn01)){
		
		}else if( e.getSource().equals(btn02)){
			
		}else if(e.getSource().equals(btn03)){
			
		}
		
	}
	
}
