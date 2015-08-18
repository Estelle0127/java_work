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
 * [변경이력]
 *  Rev.00 2015/08/02  승인:        조사:        담당:(CUBICNOW)박 sam
 *    -초판작성 [제품이력번호:mc1501]
 *  Rev.01 2015/08/17    승인:        조사:        담당:(YTC Students)서 승현
 *    - 기존의 DataStream방식의 소켓통신이 여러가지 타입의 메세지 송신용으로 용이하지 않아 
 *       ObjectStream방식으로 변경함.(대상: ClientSender, ClientReciver)
 */ 
public class MyChatClient4 implements ActionListener {
    Frame f; 
    Panel p; 
    Button bSend; 
    TextField tfInput; //입력창
    TextArea taOutput; //대화내용 표시창

    String name; //대화명
    ClientSender sender; 

    //초기화
    public MyChatClient4(String name) { 
        this.name = name; 
        f = new Frame(name); 
        p = new Panel(); 
        bSend = new Button("전송");
        tfInput = new TextField(); 
        taOutput = new TextArea(20, 50);

    	//창닫기
        f.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0); 
            } 
        }); 

        // frame의 아래쪽에 패널 배치
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

        // frame 가운데에 textarea 배치
        f.add(BorderLayout.CENTER, taOutput); 

        f.setVisible(true); 
        f.pack(); 

        // ======================socket 통신===========================
        Socket socket = null; 
        try { 
            String serverIP = "localhost"; 

            socket = new Socket(serverIP, 7777); // 소켓을 생성하여 연결을 요청
            System.out.println("서버에 연결되었습니다.");
 
            // 메시지 전송용 객체 생성 
            sender = new ClientSender(socket);
 
            // 메시지 수신용 Thread 생성 
            Thread receiver = new Thread(new ClientReceiver(socket));
            receiver.start(); 
 
        } catch (ConnectException ce) { 
            ce.printStackTrace(); 
        } catch (Exception e) { 
        } 
        // ======================socket 통신===========================
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

     
     
     // ====================== 메시지 전송용 클래스  (Event를 받아서 처리함) =====================
     class ClientSender { 
//        DataOutputStream out;  
    	 ObjectOutputStream out; //modified 0817. team2

        // 생성자 
        ClientSender(Socket socket) { 
            try { 
//                this.out = new DataOutputStream(socket.getOutputStream()); 
                this.out = new ObjectOutputStream(socket.getOutputStream()); //modified 0817. team2
 
                // 최초실행시 자신의 대화명을 서버로 전송 
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
                    // 키보드로 입력받은 데이터를 서버로 전송
//                     out.writeUTF("[" + name + "] " + message);
                	 out.writeObject("[" + name + "] " + message);  //modified 0817. team2
                 } catch (IOException e) { 
                } 
            } 
        } 
    } 

     
    // ====================== 메시지 수신용 Thread =====================
    class ClientReceiver implements Runnable {
//        DataInputStream in;
        ObjectInputStream in; //modified 0817. team2

        // 생성자 
        ClientReceiver(Socket socket) { 

            try { 
                // 서버로 부터 데이터를 받을 수 있도록 DataInputStream 생성
//                 this.in = new DataInputStream(socket.getInputStream());
                 this.in = new ObjectInputStream(socket.getInputStream());  //modified 0817. team2
             } catch (IOException e) { 
            } 
        } 

        public void run() {
             while (in != null) { 
                try { 
                    // 서버로 부터 전송되는 데이터를 출력 
//                    MyChatClient.this.appendMessage(in.readUTF());
                	Object obj = in.readObject(); //modified 0817. team2
                	if (obj instanceof String) {  //modified 0817. team2
                		MyChatClient4.this.appendMessage((String)obj);  //modified 0817. team2
                	}  else if (obj instanceof ArrayList) {
                		for (String s : (ArrayList<String>)obj) {
                			//To do. 접속자 명단을 하나씩 접속자명단 화면에 출력 by team2
                			
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
            System.out.println("대화명을 입력하세요.");
            System.out.print(">>> ");
            name = scanner.nextLine(); 
            if (name.isEmpty()) { 
                System.out.println("대화명은 한글자 이상 입력해야 합니다.\n\n");
             } 
        } while (name.isEmpty()); 

        new MyChatClient4(name);
     } 
}
