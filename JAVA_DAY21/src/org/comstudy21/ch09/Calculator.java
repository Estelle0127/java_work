package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Calculator extends MyFrame{

	
	private MenuBar mb = new MenuBar();
	private Menu V = new Menu("����(V)");
	private Menu E = new Menu("����(E)");
	private Menu H = new Menu("����(H)");
	private MenuItem V1 = new MenuItem("�Ϲݿ�(T)	");
	private MenuItem V2 = new MenuItem("���п�(S)");
	private MenuItem V3 = new MenuItem("����(A)");
	private MenuItem V4 = new MenuItem("���(Y)");
	private MenuItem V5 = new MenuItem("�ڸ��� ���� ����(I)");
	private MenuItem V6 = new MenuItem("�⺻(B)");
	private MenuItem V7 = new MenuItem("���� ��ȯ(U)");
	private MenuItem V8 = new MenuItem("��¥ ���(D)");
	private Menu V9 = new Menu("��ũ��Ʈ(W)");
	
	private MenuItem E1 = new MenuItem("����(C)");
	private MenuItem E2 = new MenuItem("�ٿ��ֱ�(P)");
	private Menu E3 = new Menu("���(H)");
	
	private MenuItem H1 = new MenuItem("���� ����(V)");
	private MenuItem H2 = new MenuItem("���� ����(A)");
	
	private Panel p1 = new Panel(new GridBagLayout());
	private Panel p2 = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
	private Panel p3 = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
	private Label label = new Label("");
	
	
	private Button MCBtn = new Button("MC");
	private Button MRBtn = new Button("MR");
	private Button MSBtn = new Button("MS");
	private Button MPlusBtn = new Button("M+");
	private Button MMinusBtn = new Button("M-");
	private Button DtBtn = new Button("��");
	private Button CEBtn = new Button("CE");
	private Button CBtn = new Button("C");
	private Button PMBtn = new Button("��");
	private Button RootBtn = new Button("��");

	private Button SevenBtn = new Button("7");
	private Button EightBtn = new Button("8");
	private Button NineBtn = new Button("9");
	private Button DivideBtn = new Button("/");
	private Button PercentBtn = new Button("%");
	private Button FourBtn = new Button("4");
	private Button FiveBtn = new Button("5");
	private Button SixBtn = new Button("6");
	private Button MultpleBtn = new Button("*");
	private Button JSPBtn = new Button("1/x");
	

	
	public Calculator() {
		setTitle("����");
		
		mb.add(V); mb.add(E); mb.add(H);
		V.add(V1); V.add(V2); V.add(V3); V.add(V4); V.add(V5); V.add(V6); V.add(V7); V.add(V8); V.add(V9);
		E.add(E1);E.add(E2);E.add(E3);
		H.add(H1);H.add(H2);
		this.setMenuBar(mb);
	
		p2.add(MCBtn);p2.add(MRBtn);p2.add(MSBtn);p2.add(MPlusBtn);p2.add(MMinusBtn);
		p3.add(DtBtn);p3.add(CEBtn);p3.add(CBtn);p3.add(PMBtn);p3.add(RootBtn);
		p2.add(SevenBtn);p2.add(EightBtn);
		p2.add(NineBtn);p2.add(DivideBtn);p2.add(PercentBtn);p2.add(FourBtn);p2.add(FiveBtn);
		p2.add(SixBtn);p2.add(MultpleBtn);p2.add(JSPBtn);
		
		this.add("North", p1);
		this.add("Center", p2);
		this.add(p2,p3);
		
		p1.setLayout(null);
		p1.setSize(200,70);
		
		
	
	}
		

	
	
	public static void main(String[] args) {
		new Calculator();
		
	}
}
