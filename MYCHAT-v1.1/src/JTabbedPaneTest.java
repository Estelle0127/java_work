
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	class JPanel011 extends JPanel {      //  1�� �г� 
	    private JButton jButton1;
	    private JScrollPane jScrollPane1;
	    private JTextArea jTextArea1;
	    
	    public JPanel011(){        // 1��° �г� ������
	        setLayout(null);
	        
	        jButton1 = new JButton("��ư");
	        jButton1.setSize(70,20);        
	        jButton1.setLocation(10, 10);
	        add(jButton1);
	        
	        jTextArea1 = new JTextArea();
	        jScrollPane1 = new JScrollPane(jTextArea1);   // ��ũ�� ���̰�!!
	        jScrollPane1.setSize(200,150);
	        jScrollPane1.setLocation(10,40);
	        add(jScrollPane1);
	    }
	}

	class JPanel022 extends JPanel{        // 2��° �г�
	    private JTextField textField;
	    private JPasswordField passwordField;
	    
	    public JPanel022() {        // 2��° �г� ������
	        
	        setLayout(null);
	        
	        JLabel lblLbl = new JLabel("���̵�:");
	        lblLbl.setBounds(31, 40, 67, 15);
	        add(lblLbl);
	        
	        textField = new JTextField();
	        textField.setBounds(123, 40, 116, 21);
	        add(textField);
	        textField.setColumns(10);
	        
	        JLabel lblLbl_1 = new JLabel("��ȣ:");
	        lblLbl_1.setBounds(31, 84, 67, 15);
	        add(lblLbl_1);
	        
	        passwordField = new JPasswordField();
	        passwordField.setBounds(123, 84, 116, 21);
	        add(passwordField);
	        
	        JButton btn = new JButton("��ư");
	        btn.setSize(70,20);
	        btn.setLocation(10,10);
	        add(btn);
	    }
	}

	class JPanel033 extends JPanel{        // 3��° �г�
	    // Ŭ���� ��� �ʵ� ����
	    private    JLabel labelName;
	    private    JLabel labelSex;
	    private    JLabel labelHobby;
	    private    JLabel labelNation;
	    private    JLabel labelIntroduce;
	            
	    private    JTextField tfName;
	        
	    private    JRadioButton radioBoy;
	    private    JRadioButton radioGirl;
	    private    JRadioButton  [] sex= new JRadioButton[2];
	    private    String sexx = "";
	            
	    private    JCheckBox  [] checkbox= new JCheckBox[3];
	    private    JCheckBox checkMovie;
	    private    JCheckBox checkReding;
	    private    JCheckBox checkCicle;
	    private    String [] check = {"","",""};
	            
	    private    JComboBox comboxNation;       
	    private    String []nationlist = {"�ѱ�","����","�̱�","�߱�","�Ϻ�","����","�����","������","������"}; 
	        
	    private    JTextArea taIntroduce;
	    private    JButton buttonSave;
	    
	    public JPanel033() {         // 3��° �г� ������
	        
	        setLayout(null);
	        // ��
	        labelName = new JLabel("��    ��:");
	        labelName.setSize(100, 20);   // setBounds�� �ƴϸ� setSize�� setLocation�� ���ÿ� ����ؾ���
	        labelName.setLocation(20, 50);
	        labelSex = new JLabel("��    ��:");
	        labelSex.setBounds(20,100,100,20);
	        labelHobby = new JLabel("��    ��:");
	        labelHobby.setBounds(20,150,100,20);
	        labelNation = new JLabel("��    ��:");
	        labelNation.setBounds(20,200,100,20);
	        labelIntroduce = new JLabel("��    ��:");
	        labelIntroduce.setBounds(20,250,100,20);
	            
	        // �ؽ�Ʈ �ʵ�
	        tfName = new JTextField();              // �̸� �Է� �κ�
	        tfName.setBounds(100,50,200,20);    //   ���� �� ������
	            
	        // ���� ��ư
	        ButtonGroup g = new ButtonGroup();      // ������ư�߿��� �Ѱ����� �����ϱ� ���� �׷� ����
	        sex[0] = new JRadioButton("��");
	        sex[0].setBounds(100,100,50,20);
	        sex[1] = new JRadioButton("��");
	        sex[1].setBounds(200,100,100,20);
	        g.add(sex[0]);
	        g.add(sex[1]);
	                
	        // üũ�ڽ�
	        checkbox[0] = new JCheckBox("��ȭ");
	        checkbox[0] .setBounds(100,150,60,20);
	        checkbox[1]= new JCheckBox("����"); 
	        checkbox[1].setBounds(160,150,60,20);
	        checkbox[2] = new JCheckBox("������");
	        checkbox[2].setBounds(220,150,80,20);
	            
	        // �޺��ڽ�
	        comboxNation = new JComboBox(nationlist);
	        comboxNation.setBounds(100,200,80,20);
	        
	        // �ؽ�Ʈ ����� , ��� ��ºκ�
	        taIntroduce = new JTextArea();
	        taIntroduce.setEditable(false);
	        // JTextArea�� JScrollPane�� ��� ��ũ�ѹٰ� �����.
	        JScrollPane scrollPane = new JScrollPane(taIntroduce);
	        scrollPane.setBounds(100,255,200,150);
	        
	        // ��ư        
	        buttonSave = new JButton("���� ");
	        buttonSave.setBounds(150,430,100,20);
	        buttonSave.addActionListener(new EventHandlerSave());   // ��ư ������ ���
	        // �������� �����̳��� ���� ������Ʈ���� ���
	        add(labelName);
	        add(labelSex);
	        add(labelHobby);
	        add(labelNation);
	        add(labelIntroduce);
	        add(tfName);
	        
	        add(sex[0]);
	        add(sex[1]);
	        
	        add(checkbox[0]);
	        add(checkbox[1]);
	        add(checkbox[2]);
	        
	        add(comboxNation);
	    
	        add(scrollPane);
	        add(buttonSave);
	    }
	    
	    class EventHandlerSave implements ActionListener{     // 
	        public void actionPerformed(ActionEvent e){    
	            
	            // �ؽ�Ʈ �ʵ尪 ��������
	            String a = tfName.getText();        
	            
	            // ���� ��ư �� ��������
	            if(sex[0].isSelected())
	                sexx="��";
	            else if(sex[1].isSelected())
	                 sexx="��";    
	            
	            // üũ�ڽ� �� ��������
	            if(checkbox[0].isSelected())
	                 check[0] = "��ȭ";
	            else check[0] = "";
	            if(checkbox[1].isSelected())
	                 check[1] = "����";
	            else check[1] = "";
	            if(checkbox[2].isSelected())
	                 check[2] = "������";
	            else check[2] = "";
	             
	            // �޺��ڽ� �� ��������
	            String d = (String) comboxNation.getSelectedItem();
	            
	            // TextArea �ʵ忡 ��� ���̱�
	            taIntroduce.append("�̸� = " + a + "\n");
	            taIntroduce.append("���� = " + sexx+"\n");
	            taIntroduce.append("��� = " + check[0] + check[1]+check[2]+"\n");
	            taIntroduce.append("���� = " +d+"\n");
	        }    
	    }     
	    //  EventHandlerSave
	}

	public class JTabbedPaneTest extends JFrame{
	    
	    public JPanel011 jpanel01 = null;
	    public JPanel022 jpanel02 = null;
	    public JPanel033 jpanel03 = null;
	    
	    public static void main(String[] args) {
	        JTabbedPaneTest win = new JTabbedPaneTest();
	        win.setTitle("frame test");
	        win.jpanel01 = new JPanel011();
	        win.jpanel02 = new JPanel022();
	        win.jpanel03 = new JPanel033();
	        
	        JTabbedPane jtab = new JTabbedPane();   //  JTabbedPane  ��ü ����
	        
	        jtab.addTab("ȭ��1", win.jpanel01 );
	        jtab.addTab("ȭ��2", win.jpanel02 );
	        jtab.addTab("ȭ��3", win.jpanel03 );
	        
	        win.add(jtab);
	        
	        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        win.setSize(500,700);
	        win.setVisible(true);    
	    }
	}

