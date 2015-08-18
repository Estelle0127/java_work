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
			//session에 NO키가 없다. NO키를 만들어라.
		}
		int no = (Integer)session.get("NO");
		//println("NO => " + no);
		
		switch(no) {
		case 1 : 
			input.show(); 
			//session에 새로 담긴 dto를 확인
			//println("##### input.show() 호출 후~");
			if(session.get("DTO")!=null){
				DTO dto = (DTO)session.get("DTO");
				//println(dto.toString());
				DAO.insert(dto); //DAO로 넘겨준다.
			}
			break;
		case 2 : 
			Vector<DTO> list = DAO.select();
			session.put("LIST", list);
			output.show(); 
			break;
		case 3 : 
			search.show(); 
			//검색어 입력 후 작업
			if(session.get("SERCH_NAME")!=null) {
				String name = (String)session.get("SERCH_NAME");
				DTO dto = DAO.findByName(name);
				if(dto == null) {
					println("검색한 사람이 없다.");
				}else{
					println(dto.toString());
					//원래는 출력하는 객체를 따로 View로 만든다.
				}
			}
			break;
		case 4 : end.finish(); break;
		}
		//재귀함수 호출
		//session.remove("NO");
		//service();
		
		menu.choice();
	}
}
// 실력이 좋으면 경쟁자가 많아지고
// 인성이 좋으면 조력자가 생긴다.