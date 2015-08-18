package kr.or.ytc.mychat.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;

import kr.or.ytc.mychat.server.model.ClientStreamMapDAO;
import kr.or.ytc.mychat.team2.ClientListDAO;

/** 
 * Software Engineering Department
 * System Solutions Division
 * (c)COPYRIGHT 2015 BY CUBICNOW ALL RIGHTS RESERVED
 * 
 * [TITLE] myChat server module
 * 
 * [�����̷�]
 *  Rev.00 2015/08/02  ����:        ����:        ���:(CUBICNOW)�� sam
 *    -�����ۼ� [��ǰ�̷¹�ȣ:mc1501]
 *  Rev.01 2015/08/17    ����:        ����:        ���:(YTC Students)�� ����
 *    - ���Ȯ���� �����ϰ� �ϱ� ���� MyChatServer Ŭ������ clients ���÷����� �ܺ� Ŭ����
 *      (kr.or.ytc.mychat.model.ClientStreamMapDAO)�� �и���
 *    - ������ DataStream����� ��������� �������� Ÿ���� �޼��� �۽ſ����� �������� �ʾ� 
 *       ObjectStream������� ������.(���: MychatServer.broadcast(), ServerReciver)
 */ 

public class MyChatServer {
 
    // ��ȭ��, Ŭ���̾�Ʈ OutputStream ����� ��ȭ��(HashMap) ����
//    Map<String, DataOutputStream> clients; 
// 	   ������ 
//    MyChatServer() { 
//        clients = Collections.synchronizedMap( new HashMap<String, DataOutputStream>());
//     } 
	Map<String, OutputStream> clients = ClientStreamMapDAO.getClients(); //modified 0817. team2
	

    // ����Ͻ� ������ ó���ϴ� �޼��� 
    public void start() {
        ServerSocket serverSocket = null; 
        Socket socket = null; 

        try { 
            // 7777 ��Ʈ�� ���ε��� ���� ���� ���� 
            serverSocket = new ServerSocket(7777);
            System.out.println("������ ���۵Ǿ����ϴ�.");
 
            while (true) { 
                // Ŭ���̾�Ʈ ���� ��� accept() 
                socket = serverSocket.accept(); 
                System.out.println("[" + socket.getInetAddress() // 
                         + ":" + socket.getPort() + "]" + "���� �����Ͽ����ϴ�.");
 
                // �������� Ŭ���̾�Ʈ�� �޽����� ������ Thread ����
                 ServerReceiver thread = new ServerReceiver(socket);
                 thread.start(); 
            }

        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
        	try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
        } 
    } 

    // ��ȭ�濡 �ִ� ��ü �������� �޽��� ���� 
//    void broadcast(String msg) { 
    void broadcast(Object obj) { //modified 0817. team2
        // ��ȭ�濡 ������ ������ ��ȭ�� ����Ʈ ���� 
        Iterator<String> it = clients.keySet().iterator(); 

        while (it.hasNext()) { 
            try { 
                String name = it.next(); 
//                DataOutputStream out = clients.get(name); 
//                out.writeUTF(msg); 
                  ObjectOutputStream out = (ObjectOutputStream)(clients.get(name));  //modified 0817. team2
                  out.writeObject(obj); //modified 0817. team2
            } catch (IOException e) { 
            } 
        } 
    }

    public static void main(String[] args) {
         new MyChatServer().start(); 
    } 

    // Inner Class�� ���� �Ͽ�, ��ȭ�� field�� ���� �� �� �ֵ��� �Ѵ�. 
     // �������� Ŭ���̾�Ʈ�� �޽����� ������ Thread 
    class ServerReceiver extends Thread {
        Socket socket;  
//        DataInputStream in; 
//        DataOutputStream out;
        ObjectInputStream in; //modified 0817. team2
        ObjectOutputStream out; //modified 0817. team2
   


        ServerReceiver(Socket socket) { 
            this.socket = socket;  
//            try { 
//                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ�� ���� �����͸� ���Źޱ� ���� InputStream ����
//                 in = new DataInputStream(socket.getInputStream());
//                  
//                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� OutputStream ����
//                 out = new DataOutputStream(socket.getOutputStream());
//             } catch (IOException e) { 
//            }  
            try { 
                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ�� ���� �����͸� ���Źޱ� ���� InputStream ����
                 in = new ObjectInputStream(socket.getInputStream());
                  
                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� OutputStream ����
                 out = new ObjectOutputStream(socket.getOutputStream());
             } catch (IOException e) { 
            }  //modified 0817. team2

        } 

        public void run() {
             String name = ""; 
            try { 
                // Ŭ���̾�Ʈ�� ���� ����� ���������� ��ȭ���� ����ؾ� �Ѵ�. 
//                    name = in.readUTF(); 
            		name = (String)(in.readObject()); //modified 0817. team2

                 
                //  ���� ������ Ŭ���̾�Ʈ�� ��ȭ���� ��� Ŭ���̾�Ʈ���� �ϸ�. 
                broadcast("#" + name + "���� �����̽��ϴ�.");
 
                // ��ȭ��, DataOutputStream ��ü��  Map�� ����.  
                clients.put(name, out);  
                broadcast(ClientListDAO.getClientNameList()); //modified 0817. team2

                System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
                  
                // Ŭ���̾�Ʈ�� ������ �޽����� �ް� ��ü Ŭ���̾�Ʈ���� �޽����� ���� 
//                 while (in != null) { 
//                    broadcast(in.readUTF()); 
//                } 
                
                while (in != null) { 
                    broadcast(in.readObject()); 
                } //modified 0817. team2
                 
//            } catch (IOException e) {
            } catch (Exception e) { //modified 0817. team2 
            } finally { 
            	
                  
                // ��ȭ�濡�� ��ü ���� 
                clients.remove(name); 

                // Ŭ���̾�Ʈ ���� 
                broadcast(ClientListDAO.getClientNameList());  //modified 0817. team2
            	broadcast("#" + name + "���� �����̽��ϴ�.");

                System.out.println("[" + socket.getInetAddress() 
                         + ":" + socket.getPort() + "]" + "���� ������ �����Ͽ����ϴ�.");
                System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
             } 
        } 
    } // ReceiverThread 
}
