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
 * [변경이력]
 *  Rev.00 2015/08/02  승인:        조사:        담당:(CUBICNOW)박 sam
 *    -초판작성 [제품이력번호:mc1501]
 *  Rev.01 2015/08/17    승인:        조사:        담당:(YTC Students)서 승현
 *    - 기능확장을 용이하게 하기 위해 MyChatServer 클래스의 clients 맵컬렉션을 외부 클래스
 *      (kr.or.ytc.mychat.model.ClientStreamMapDAO)로 분리함
 *    - 기존의 DataStream방식의 소켓통신이 여러가지 타입의 메세지 송신용으로 용이하지 않아 
 *       ObjectStream방식으로 변경함.(대상: MychatServer.broadcast(), ServerReciver)
 */ 

public class MyChatServer {
 
    // 대화명, 클라이언트 OutputStream 저장용 대화방(HashMap) 정의
//    Map<String, DataOutputStream> clients; 
// 	   생성자 
//    MyChatServer() { 
//        clients = Collections.synchronizedMap( new HashMap<String, DataOutputStream>());
//     } 
	Map<String, OutputStream> clients = ClientStreamMapDAO.getClients(); //modified 0817. team2
	

    // 비즈니스 로직을 처리하는 메서드 
    public void start() {
        ServerSocket serverSocket = null; 
        Socket socket = null; 

        try { 
            // 7777 포트에 바인딩된 서버 소켓 생성 
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 시작되었습니다.");
 
            while (true) { 
                // 클라이언트 접속 대기 accept() 
                socket = serverSocket.accept(); 
                System.out.println("[" + socket.getInetAddress() // 
                         + ":" + socket.getPort() + "]" + "에서 접속하였습니다.");
 
                // 서버에서 클라이언트로 메시지를 전송할 Thread 생성
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

    // 대화방에 있는 전체 유저에게 메시지 전송 
//    void broadcast(String msg) { 
    void broadcast(Object obj) { //modified 0817. team2
        // 대화방에 접속한 유저의 대화명 리스트 추출 
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

    // Inner Class로 정의 하여, 대화방 field에 접근 할 수 있도록 한다. 
     // 서버에서 클라이언트로 메시지를 전송할 Thread 
    class ServerReceiver extends Thread {
        Socket socket;  
//        DataInputStream in; 
//        DataOutputStream out;
        ObjectInputStream in; //modified 0817. team2
        ObjectOutputStream out; //modified 0817. team2
   


        ServerReceiver(Socket socket) { 
            this.socket = socket;  
//            try { 
//                // 클라이언트 소켓에서 클라이언트가 보댄 데이터를 수신받기 위한 InputStream 생성
//                 in = new DataInputStream(socket.getInputStream());
//                  
//                // 클라이언트 소켓에서 클라이언트에세 데이터를 전송하기 위한 OutputStream 생성
//                 out = new DataOutputStream(socket.getOutputStream());
//             } catch (IOException e) { 
//            }  
            try { 
                // 클라이언트 소켓에서 클라이언트가 보댄 데이터를 수신받기 위한 InputStream 생성
                 in = new ObjectInputStream(socket.getInputStream());
                  
                // 클라이언트 소켓에서 클라이언트에세 데이터를 전송하기 위한 OutputStream 생성
                 out = new ObjectOutputStream(socket.getOutputStream());
             } catch (IOException e) { 
            }  //modified 0817. team2

        } 

        public void run() {
             String name = ""; 
            try { 
                // 클라이언트가 최초 입장시 서버에서는 대화명을 기록해야 한다. 
//                    name = in.readUTF(); 
            		name = (String)(in.readObject()); //modified 0817. team2

                 
                //  새로 입장한 클라이언트의 대화명을 모든 클라이언트에게 암림. 
                broadcast("#" + name + "님이 들어오셨습니다.");
 
                // 대화명, DataOutputStream 객체를  Map에 저장.  
                clients.put(name, out);  
                broadcast(ClientListDAO.getClientNameList()); //modified 0817. team2

                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
                  
                // 클라이언트가 전송한 메시지를 받고 전체 클라이언트에게 메시지를 전송 
//                 while (in != null) { 
//                    broadcast(in.readUTF()); 
//                } 
                
                while (in != null) { 
                    broadcast(in.readObject()); 
                } //modified 0817. team2
                 
//            } catch (IOException e) {
            } catch (Exception e) { //modified 0817. team2 
            } finally { 
            	
                  
                // 대화방에서 객체 삭제 
                clients.remove(name); 

                // 클라이언트 퇴장 
                broadcast(ClientListDAO.getClientNameList());  //modified 0817. team2
            	broadcast("#" + name + "님이 나가셨습니다.");

                System.out.println("[" + socket.getInetAddress() 
                         + ":" + socket.getPort() + "]" + "에서 접속을 종료하였습니다.");
                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
             } 
        } 
    } // ReceiverThread 
}
