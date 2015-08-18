import java.io.*; 
import java.net.*; 
import java.util.*; 

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
 *  Rev.01 2015/08/    ����:        ����:        ���:(YTC Students)
 */ 

public class MyChatServer {
 
    // ��ȭ��, Ŭ���̾�Ʈ OutputStream ����� ��ȭ��(HashMap) ����
     Map<String, DataOutputStream> clients; 

    // ������ 
    MyChatServer() { 
        clients = Collections.synchronizedMap( new HashMap<String, DataOutputStream>());
     } 

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
    void broadcast(String msg) { 
        // ��ȭ�濡 ������ ������ ��ȭ�� ����Ʈ ���� 
        Iterator<String> it = clients.keySet().iterator(); 

        while (it.hasNext()) { 
            try { 
                String name = it.next(); 
                DataOutputStream out = clients.get(name); 
                out.writeUTF(msg); 
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
        DataInputStream in; 
        DataOutputStream out; 

        ServerReceiver(Socket socket) { 
            this.socket = socket; 
            try { 
                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ�� ���� �����͸� ���Źޱ� ���� InputStream ����
                 in = new DataInputStream(socket.getInputStream());
                  
                // Ŭ���̾�Ʈ ���Ͽ��� Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� OutputStream ����
                 out = new DataOutputStream(socket.getOutputStream());
             } catch (IOException e) { 
            } 
        } 

        public void run() {
             String name = ""; 
            try { 
                // Ŭ���̾�Ʈ�� ���� ����� ���������� ��ȭ���� ����ؾ� �Ѵ�. 
                 name = in.readUTF(); 
                 
                //  ���� ������ Ŭ���̾�Ʈ�� ��ȭ���� ��� Ŭ���̾�Ʈ���� �ϸ�. 
                 broadcast("#" + name + "���� �����̽��ϴ�.");
 
                // ��ȭ��, DataOutputStream ��ü��  Map�� ����.  
                clients.put(name, out); 
                System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
                  
                // Ŭ���̾�Ʈ�� ������ �޽����� �ް� ��ü Ŭ���̾�Ʈ���� �޽����� ���� 
                 while (in != null) { 
                    broadcast(in.readUTF()); 
                } 
                 
            } catch (IOException e) { 
            } finally { 
                // Ŭ���̾�Ʈ ���� 
                 broadcast("#" + name + "���� �����̽��ϴ�.");
                  
                // ��ȭ�濡�� ��ü ���� 
                clients.remove(name); 
                System.out.println("[" + socket.getInetAddress() //
                         + ":" + socket.getPort() + "]" + "���� ������ �����Ͽ����ϴ�.");
                System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
             } 
        } 
    } // ReceiverThread 
}




