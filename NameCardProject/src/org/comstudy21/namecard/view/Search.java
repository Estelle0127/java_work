package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;
import static org.comstudy21.namecard.R.*;

public class Search extends View {

	@Override
	public void show() {
		println("*** Search Menu ***");
		print("�˻� �� �Է�: ");
		String name = scan.next();
		session.put("SERCH_NAME", name);
	}

}