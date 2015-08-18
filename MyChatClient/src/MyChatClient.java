
import java.awt.BorderLayout; 
import java.awt.Button; 
import java.awt.Color; 
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel; 
import java.awt.TextArea; 
import java.awt.TextField; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ConnectException; 
import java.net.Socket; 
import java.util.Scanner;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; 

/** 
 * Software Engineering Department
 * System Solutions Division
 * (c)COPYRIGHT 2015 BY CUBICNOW ALL RIGHTS RESERVED
 * 
 * [TITLE] myChat client module
 * 
 * [�����̷�]
 *  Rev.00 2015/08/02  ����:        ����:        ���:(CUBICNOW)�� sam
 *    -�����ۼ� [��ǰ�̷¹�ȣ:mc1501]
 *  Rev.01 2015/08/    ����:        ����:        ���:(YTC Students)
 */ 
public class MyChatClient implements ActionListener {
    Frame f; 
    Panel p; 
    Panel p2;
    Button bSend; 
    TextField tfInput; //�Է�â
    TextArea taOutput; //��ȭ���� ǥ��â

    String name; //��ȭ��
    ClientSender sender; 
    JTabbedPane tabpane = new JTabbedPane();
    //�ʱ�ȭ
    public MyChatClient(String name) { 
        this.name = name; 
        f = new Frame(name); 
        p = new Panel(); 
        p2 = new Panel();
        bSend = new Button("����");
        tfInput = new TextField(); 
        taOutput = new TextArea(20, 50);

    	//â�ݱ�
        f.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0); 
            } 
        }); 

        // frame�� �Ʒ��ʿ� �г� ��ġ
        f.add(BorderLayout.SOUTH, p); 
        f.add(BorderLayout.EAST, p2);
        bSend.addActionListener(this); 
        bSend.setBackground(Color.LIGHT_GRAY); 
        
        tfInput.setColumns(40); 
        tfInput.addKeyListener(new KeyAdapter() { 
            public void keyReleased(KeyEvent e) {
                 char keyCode = e.getKeyChar();
                 if (keyCode == KeyEvent.VK_ENTER) {
                     actionPerformed(null); 
                } 
            } 
        }); 
        
        p.setBackground(Color.ORANGE); 
        p.add(tfInput); 
        p.add(bSend); 

        // frame ����� textarea ��ġ
        
        p2.add(BorderLayout.CENTER, taOutput);
    	tabpane.addTab("First", /* �� �߰�*/new Label("First Tab Pane", Label.CENTER));
		tabpane.addTab("Second", new Label("Second Tab Pane", Label.CENTER));
		tabpane.addTab("Third", new Label("Third Tab Pane", Label.CENTER));

		tabpane.setTabPlacement(JTabbedPane.RIGHT); //�� ��ġ����
		p2.add(tabpane, "EAST");
		
          
        f.setVisible(true); 
        f.pack(); 
        
        // ======================socket ���===========================
        Socket socket = null; 
        try { 
            String serverIP = "localhost"; 

            socket = new Socket(serverIP, 7777); // ������ �����Ͽ� ������ ��û
            System.out.println("������ ����Ǿ����ϴ�.");
 
            // �޽��� ���ۿ� ��ü ���� 
            sender = new ClientSender(socket);
 
            // �޽��� ���ſ� Thread ���� 
            Thread receiver = new Thread(new ClientReceiver(socket));
            receiver.start(); 
 
        } catch (ConnectException ce) { 
            ce.printStackTrace(); 
        } catch (Exception e) { 
        } 
        // ======================socket ���===========================
     } 


    public void actionPerformed(ActionEvent e) {
        sender.send(tfInput.getText()); 
        tfInput.setText(""); 
        tfInput.requestFocus(); 
    } 

     public void appendMessage(String message) {
        taOutput.append(message); 
        taOutput.append("\n"); 
    } 

     
     
     // ====================== �޽��� ���ۿ� Ŭ����  (Event�� �޾Ƽ� ó����) =====================
     class ClientSender { 
        DataOutputStream out; 

        // ������ 
        ClientSender(Socket socket) { 
            try { 
                this.out = new DataOutputStream(socket.getOutputStream());
 
                // ���ʽ���� �ڽ��� ��ȭ���� ������ ���� 
                if (out != null) {
                     out.writeUTF(name); 
                } 

            } catch (Exception e) { 
            } 
        } 

        public void send(String message) {
             if (out != null) {
                 try { 
                    // Ű����� �Է¹��� �����͸� ������ ����
                     out.writeUTF("[" + name + "] " + message);
                 } catch (IOException e) { 
                } 
            } 
        } 
    } 

     
    // ====================== �޽��� ���ſ� Thread =====================
    class ClientReceiver implements Runnable {
        DataInputStream in; 

        // ������ 
        ClientReceiver(Socket socket) { 

            try { 
                // ������ ���� �����͸� ���� �� �ֵ��� DataInputStream ����
                 this.in = new DataInputStream(socket.getInputStream());
             } catch (IOException e) { 
            } 
        } 

        public void run() {
             while (in != null) { 
                try { 
                    // ������ ���� ���۵Ǵ� �����͸� ��� 
                    MyChatClient.this.appendMessage(in.readUTF());
                 } catch (IOException e) { 
                } 
            } 
        } 
    } 

    public static void main(String[] args) {
         String name = null; 
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
 
        do { 
            System.out.println("��ȭ���� �Է��ϼ���.");
            System.out.print(">>> ");
            name = scanner.nextLine(); 
            if (name.isEmpty()) { 
                System.out.println("��ȭ���� �ѱ��� �̻� �Է��ؾ� �մϴ�.\n\n");
             } 
        } while (name.isEmpty()); 

        new MyChatClient(name);
     } 
}
