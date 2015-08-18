package TAB;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TAB1 extends JPanel{
	public TAB1(){
	
	}

	public static void appendUserList(String string) {
		JLabel label1 = new JLabel();
		label1.setText(string);
	}


	public static void main(String[] args) {
		new TAB1();
	}
}
