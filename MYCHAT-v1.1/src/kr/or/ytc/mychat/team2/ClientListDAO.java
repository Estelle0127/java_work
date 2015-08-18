package kr.or.ytc.mychat.team2;

import java.util.ArrayList;
import java.util.Iterator;

import kr.or.ytc.mychat.server.model.ClientStreamMapDAO;

public final class ClientListDAO {
	private static ArrayList<String> clientNameList;
	
	private ClientListDAO() {
	}
	
	public static ArrayList<String> getClientNameList() {
		clientNameList = new ArrayList<>();
		Iterator<String> it = ClientStreamMapDAO.getClients().keySet().iterator();

		while (it.hasNext()) {
			clientNameList.add(it.next());
		}

		return clientNameList;
	}
}
