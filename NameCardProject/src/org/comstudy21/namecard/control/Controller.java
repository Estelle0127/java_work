package org.comstudy21.namecard.control;

import static org.comstudy21.namecard.Util.*;
import java.util.Hashtable;
import java.util.Vector;

import org.comstudy21.namecard.R;
import org.comstudy21.namecard.model.DAO;
import org.comstudy21.namecard.model.DTO;

import static org.comstudy21.namecard.R.*;

public class Controller {
	public void service() {
		if(session.get("NO") == null) {
			menu.choice();
			//session�� NOŰ�� ����. NOŰ�� ������.
		}
		int no = (Integer)session.get("NO");
		//println("NO => " + no);
		
		switch(no) {
		case 1 : 
			input.show(); 
			//session�� ���� ��� dto�� Ȯ��
			//println("##### input.show() ȣ�� ��~");
			if(session.get("DTO")!=null){
				DTO dto = (DTO)session.get("DTO");
				//println(dto.toString());
				DAO.insert(dto); //DAO�� �Ѱ��ش�.
			}
			break;
		case 2 : 
			Vector<DTO> list = DAO.select();
			session.put("LIST", list);
			output.show(); 
			break;
		case 3 : 
			search.show(); 
			//�˻��� �Է� �� �۾�
			if(session.get("SERCH_NAME")!=null) {
				String name = (String)session.get("SERCH_NAME");
				DTO dto = DAO.findByName(name);
				if(dto == null) {
					println("�˻��� ����� ����.");
				}else{
					println(dto.toString());
					//������ ����ϴ� ��ü�� ���� View�� �����.
				}
			}
			break;
		case 4 : end.finish(); break;
		}
		//����Լ� ȣ��
		//session.remove("NO");
		//service();
		
		menu.choice();
	}
}
// �Ƿ��� ������ �����ڰ� ��������
// �μ��� ������ �����ڰ� �����.