package org.sung.controller;

import static java.lang.System.out;
import static java.lang.System.err;
import java.util.Hashtable;

import org.sung.R;

public class Controller {
	public void service() {

		Hashtable<String, Object> session = R.session;
		if (session.get("NO") == null) {
			err.println("NO°¡ ¾ø´Ù.");
			R.menu.show();
		}
		int no=(int)session.get("NO");
		out.println(no);
		
		session.remove("NO");
		R.menu.show();
	}
}
