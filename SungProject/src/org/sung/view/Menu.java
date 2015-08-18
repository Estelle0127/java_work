package org.sung.view;

import static java.lang.System.out;

public class Menu extends ViewCls {

	public void show() {
		out.println(menuStr);
		out.print(menuStr2);
		int no = scan.nextInt();
		
		session.put("NO", no);
		
		controller.service();
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

}
