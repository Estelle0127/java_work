package TAB;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabPane extends JFrame {
	public TAB1 jpanel01 = null;
	public TAB2 jpanel02 = null;
	public TAB3 jpanel03 = null;

		public static void main(String[] args) {

			TabPane a = new TabPane();
			a.setTitle("My chat");
			a.jpanel01 = new TAB1();
			a.jpanel02 = new TAB2();
			a.jpanel03 = new TAB3();

			JTabbedPane tabpane = new JTabbedPane();

			tabpane.addTab("이름1", a.jpanel01);
			tabpane.addTab("이름2", a.jpanel02);
			tabpane.addTab("이름3", a.jpanel03);

			a.add(tabpane);

			a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			a.setSize(500, 700);
			a.setResizable(false);
			a.setVisible(true);
			
		}
	}


