
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
 * [변경이력]
 *  Rev.00 2015/08/02  승인:        조사:        담당:(CUBICNOW)박 sam
 *    -초판작성 [제품이력번호:mc1501]
 *  Rev.01 2015/08/    승인:        조사:        담당:(YTC Students)
 */ 
public class MyChatClient implements ActionListener {
    Frame f; 
    Panel p; 
    Panel p2;
    Button bSend; 
    TextField tfInput; //입력창
    TextArea taOutput; //대화내용 표시창

    String name; //대화명
    ClientSender sender; 
    JTabbedPane tabpane = new JTabbedPane();
    //초기화
    public MyChatClient(String name) { 
        this.name = name; 
        f = new Frame(name); 
        p = new Panel(); 
        p2 = new Panel();
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

        // frame 가운데에 textarea 배치
        
        p2.add(BorderLayout.CENTER, taOutput);
    	tabpane.addTab("First", /* 탭 추가*/new Label("First Tab Pane", Label.CENTER));
		tabpane.addTab("Second", new Label("Second Tab Pane", Label.CENTER));
		tabpane.addTab("Third", new Label("Third Tab Pane", Label.CENTER));

		tabpane.setTabPlacement(JTabbedPane.RIGHT); //탭 위치설정
		p2.add(tabpane, "EAST");
		
          
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
        DataOutputStream out; 

        // 생성자 
        ClientSender(Socket socket) { 
            try { 
                this.out = new DataOutputStream(socket.getOutputStream());
 
                // 최초실행시 자신의 대화명을 서버로 전송 
                if (out != null) {
                     out.writeUTF(name); 
                } 

            } catch (Exception e) { 
            } 
        } 

        public void send(String message) {
             if (out != null) {
                 try { 
                    // 키보드로 입력받은 데이터를 서버로 전송
                     out.writeUTF("[" + name + "] " + message);
                 } catch (IOException e) { 
                } 
            } 
        } 
    } 

     
    // ====================== 메시지 수신용 Thread =====================
    class ClientReceiver implements Runnable {
        DataInputStream in; 

        // 생성자 
        ClientReceiver(Socket socket) { 

            try { 
                // 서버로 부터 데이터를 받을 수 있도록 DataInputStream 생성
                 this.in = new DataInputStream(socket.getInputStream());
             } catch (IOException e) { 
            } 
        } 

        public void run() {
             while (in != null) { 
                try { 
                    // 서버로 부터 전송되는 데이터를 출력 
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
            System.out.println("대화명을 입력하세요.");
            System.out.print(">>> ");
            name = scanner.nextLine(); 
            if (name.isEmpty()) { 
                System.out.println("대화명은 한글자 이상 입력해야 합니다.\n\n");
             } 
        } while (name.isEmpty()); 

        new MyChatClient(name);
     } 
}
