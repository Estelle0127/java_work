package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;

import org.comstudy21.namecard.model.DTO;

import static org.comstudy21.namecard.R.*;

public class Input extends View {

	@Override
	public void show() {
		String name="";
		String phone="";
		DTO dto = null;
		
		println("*** Input Menu ***");
		print("성명입력: ");
		name = scan.next();
		print("전화번호: ");
		phone = scan.next();
		//입력 받은 데이터를 dto 객체에 담는다.
		dto = new DTO(name, phone);
		//dto를 session에 담는다.
		session.put("DTO", dto);
		
		//데이터 입력이 끝나면 Controller로 자동 복귀.
	}
}
