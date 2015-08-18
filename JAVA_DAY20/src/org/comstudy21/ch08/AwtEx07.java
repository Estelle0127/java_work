package org.comstudy21.ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtEx07 extends MyFrame implements ActionListener {
	CardLayout cardLayout = new CardLayout();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel btnPanel = new Panel();
	Panel cardPanel = new Panel();
	Button btn1 = new Button("01");
	Button btn2 = new Button("02");
	Button btn3 = new Button("03");

	public AwtEx07() {
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.RED);
		btnPanel.setLayout(new GridBagLayout());
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		cardPanel.setLayout(cardLayout);
		cardPanel.add(p1, "yellow");
		cardPanel.add(p2, "green");
		cardPanel.add(p3, "red");

		this.add(btnPanel,BorderLayout.NORTH);
		this.add(cardPanel,BorderLayout.CENTER);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		cardLayout.show(cardPanel, "yellow");
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)){
			cardLayout.show(cardPanel,"red");
		}else if( e.getSource().equals(btn2)){
			cardLayout.show(cardPanel,"green");
		}else if(e.getSource().equals(btn3)){
			cardLayout.show(cardPanel,"yellow");
		}
		
	}
	public static void main(String[] args) {
		new AwtEx07().setVisible(true);
	}
}
