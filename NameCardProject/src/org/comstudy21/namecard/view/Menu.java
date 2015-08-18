package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;
import static org.comstudy21.namecard.R.*;

public class Menu extends View {
	public Menu() { }
	public void choice() {
		int no = 0;
		println(menuStr);
		print("Choice: ");
		no = scan.nextInt();
		
		session.put("NO", no);
		
		//메뉴가 선택 후 콘트롤러로 이동
		controller.service();
	}
	@Override
	public void show() {
		
	}
}
