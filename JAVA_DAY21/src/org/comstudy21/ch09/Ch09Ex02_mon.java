package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Ch09Ex02_mon extends MyFrame implements ActionListener {
	CardLayout cardLayout = new CardLayout();
	
	private Button btnplay = new Button("play");
	private Button btnstop = new Button("stop");
	private Button btnnext = new Button("next");
	private Button btnprev = new Button("prev");
	
	private Panel p = new Panel(new GridLayout(1,3));
	private Panel p2 = new Panel(new GridBagLayout());
	private Panel p3 = new Panel(new GridLayout(2,1));
	private Label label = new Label("[�˸�] �ƹ��͵� ���� ����.");
	
	public Ch09Ex02_mon(){
		
		p.add(btnplay);
		p.add(btnstop);
		p3.add(btnnext);
		p3.add(btnprev);		
		p2.add(label);
		
		this.add("South",p);
		this.add("Center", p2);
		p.add("South",p3);
		
		btnplay.addActionListener(this);
		btnstop.addActionListener(this);
		btnnext.addActionListener(this);
		btnprev.addActionListener(this);
		
		p2.setBackground(Color.WHITE);
	}
	
	
	public static void main(String []args) {
		new Ch09Ex02_mon();
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(btnplay.equals(e.getSource())){
			//System.out.println("��ư1�� ���ȴ�.");
			label.setText("[����]  play ����");
			p2.setBackground(Color.BLUE);;
		}else if(btnstop.equals(e.getSource())){
			//System.out.println("��ư2�� ���ȴ�.");
			label.setText("[����]  stop ����");
			p2.setBackground(Color.red);;
		}else if(btnnext.equals(e.getSource())){
			label.setText("[����]  next ����");
			p2.setBackground(Color.green);;
		}else if(btnprev.equals(e.getSource())){
			label.setText("[����]  prev ����");
			p2.setBackground(Color.orange);;
		}
	}
}
