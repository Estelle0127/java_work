package kr.or.ytc.mychat.client;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;



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
 *  Rev.01 2015/08/17    ����:        ����:        ���:(YTC Students)�� ����
 *    - ������ DataStream����� ��������� �������� Ÿ���� �޼��� �۽ſ����� �������� �ʾ� 
 *       ObjectStream������� ������.(���: ClientSender, ClientReciver)
 */ 
public class MyChatClient4 implements ActionListener {
    Frame f; 
    Panel p; 
    Button bSend; 
    TextField tfInput; //�Է�â
    TextArea taOutput; //��ȭ���� ǥ��â

    String name; //��ȭ��
    ClientSender sender; 

    //�ʱ�ȭ
    public MyChatClient4(String name) { 
        this.name = name; 
        f = new Frame(name); 
        p = new Panel(); 
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
        f.add(BorderLayout.CENTER, taOutput); 

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
//        DataOutputStream out;  
    	 ObjectOutputStream out; //modified 0817. team2

        // ������ 
        ClientSender(Socket socket) { 
            try { 
//                this.out = new DataOutputStream(socket.getOutputStream()); 
                this.out = new ObjectOutputStream(socket.getOutputStream()); //modified 0817. team2
 
                // ���ʽ���� �ڽ��� ��ȭ���� ������ ���� 
                if (out != null) {
//                     out.writeUTF(name);  
                	out.writeObject(name);  //modified 0817. team2
                } 

            } catch (Exception e) { 
            } 
        } 

        public void send(String message) {
             if (out != null) {
                 try { 
                    // Ű����� �Է¹��� �����͸� ������ ����
//                     out.writeUTF("[" + name + "] " + message);
                	 out.writeObject("[" + name + "] " + message);  //modified 0817. team2
                 } catch (IOException e) { 
                } 
            } 
        } 
    } 

     
    // ====================== �޽��� ���ſ� Thread =====================
    class ClientReceiver implements Runnable {
//        DataInputStream in;
        ObjectInputStream in; //modified 0817. team2

        // ������ 
        ClientReceiver(Socket socket) { 

            try { 
                // ������ ���� �����͸� ���� �� �ֵ��� DataInputStream ����
//                 this.in = new DataInputStream(socket.getInputStream());
                 this.in = new ObjectInputStream(socket.getInputStream());  //modified 0817. team2
             } catch (IOException e) { 
            } 
        } 

        public void run() {
             while (in != null) { 
                try { 
                    // ������ ���� ���۵Ǵ� �����͸� ��� 
//                    MyChatClient.this.appendMessage(in.readUTF());
                	Object obj = in.readObject(); //modified 0817. team2
                	if (obj instanceof String) {  //modified 0817. team2
                		MyChatClient4.this.appendMessage((String)obj);  //modified 0817. team2
                	}  else if (obj instanceof ArrayList) {
                		for (String s : (ArrayList<String>)obj) {
                			//To do. ������ ����� �ϳ��� �����ڸ�� ȭ�鿡 ��� by team2
                			
                		}
                	}  //modified 0817. team2
                 } catch (IOException e) { 
                 } catch (Exception e) { 
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

        new MyChatClient4(name);
     } 
}
