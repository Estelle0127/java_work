package org.comstudy21.ch08;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtEx03 extends Frame {
	FlowLayout layout = new FlowLayout();

	public AwtEx03() {
		this.setTitle("��ġ������ ����");
		this.setSize(400, 300);

		// this.setVisible(true);//�ظ��ϸ� �ǳ���.
		setLayout(layout);

		this.add(new Label("���ѹα� ����!"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));
		this.add(new Button("Ȯ�� ��ư"));

		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				this.dispose();
				System.exit(0);
			}
			private void dispose() {
			
			}
		});
	}

	public static void main(String[] args) {

		new AwtEx03().setVisible(true);

	}
}
