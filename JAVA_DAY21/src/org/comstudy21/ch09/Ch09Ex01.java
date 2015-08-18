package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch09Ex01 extends MyFrame implements ActionListener {
	private Button btn1 = new Button("버튼1");
	private Button btn2 = new Button("버튼2");
	private Panel p = new Panel(new GridBagLayout());
	private Panel p2 = new Panel(new GridBagLayout());
	private Label label = new Label("[알림] 아무것도 하지 않음.");
	
	public Ch09Ex01(){
		p.add(btn1);
		p.add(btn2);
		p2.add(label);
		
		this.add("Center",p);
		this.add("North", p2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		new Ch09Ex01();
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(btn1.equals(e.getSource())){
			//System.out.println("버튼1이 눌렸다.");
			label.setText("버튼1 누름");
		}else{
			//System.out.println("버튼2가 눌렸다.");
			label.setText("버튼2 누름");
		}
	}
}
