package kr.or.ytc.mychat.server.model;

import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClientStreamMapDAO {
	private static Map<String, OutputStream> clients = 
			Collections.synchronizedMap( new HashMap<String, OutputStream>());
	
	private ClientStreamMapDAO() { }
	
	public static Map<String, OutputStream> getClients() {
		return clients;
	}
	
}
