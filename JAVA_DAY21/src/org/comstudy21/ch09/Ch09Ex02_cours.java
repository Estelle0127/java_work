package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch09Ex02_cours extends MyFrame {
	private Panel p1 = new Panel(new GridBagLayout());
	private Panel p2 = new Panel(new GridLayout(1, 3));
	private Panel p3 = new Panel(new GridLayout(2, 1));
	private Label label = new Label("���� : �ƹ��ų� ��������");
	private Button playBtn = new Button("Play");
	private Button stopBtn = new Button("Stop");
	private Button nextBtn = new Button("Next");
	private Button prevBtn = new Button("Prev");

	// Inner Class �� �ڵ鷯 ����.
	class BtnHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(playBtn.equals(e.getSource())) {
				label.setText("����: �����ư�� ����.");
				p1.setBackground(Color.BLUE);
			}else if(stopBtn.equals(e.getSource())){
				label.setText("����: ������ư�� ����.");
				p1.setBackground(Color.RED);
			}else if(nextBtn.equals(e.getSource())){
				label.setText("����: ������ư�� ����.");
				p1.setBackground(Color.GREEN);
			}else if(prevBtn.equals(e.getSource())){
				label.setText("����: ������ư�� ����.");
				p1.setBackground(Color.ORANGE);
			}
		}
	}

	public Ch09Ex02_cours() {
		p1.add(label);
		p2.add(playBtn);
		p2.add(stopBtn);
		p2.add(p3);
		p3.add(nextBtn);
		p3.add(prevBtn);

		this.add("Center", p1);
		this.add("South", p2);

		BtnHandler handler = new BtnHandler();
		playBtn.addActionListener(handler);
		stopBtn.addActionListener(handler);
		nextBtn.addActionListener(handler);
		prevBtn.addActionListener(handler);

	}

	public static void main(String[] args) {
		new Ch09Ex02_cours();
	}
}
