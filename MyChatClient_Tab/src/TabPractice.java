import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabPractice {
	JTabbedPane tabpane = new JTabbedPane();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();

	public void go() {

		panel.setLayout(new BorderLayout());
		tabpane.addTab("First", /* ÅÇ Ãß°¡*/new Label("First Tab Pane", Label.CENTER));
		tabpane.addTab("Second", new Label("Second Tab Pane", Label.CENTER));
		tabpane.addTab("Third", new Label("Third Tab Pane", Label.CENTER));

		tabpane.setTabPlacement(JTabbedPane.RIGHT);
		//ÅÇ À§Ä¡¼³Á¤
		
		tabpane.setSelectedIndex(0);// Ã¹ ÅÇ ÁöÁ¤
		tabpane.addChangeListener(new ChangeListener() {// ¸®½º³Ê
			public void stateChanged(ChangeEvent e) {
				int index = tabpane.getSelectedIndex();
				text.setText("Current index = " + index);
			}
		});
		
		panel.add(tabpane, "Center");
		panel.add(text, "South");
		JFrame frame = new JFrame("Text Tabs Examples");
		frame.getContentPane().add(panel, "Center");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String args[]) {

		new TabPractice().go();
	}

}
