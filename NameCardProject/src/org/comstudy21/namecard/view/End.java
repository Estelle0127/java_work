package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;
import static org.comstudy21.namecard.R.*;

public class End extends View {

	@Override
	public void show() {
		println("*** Good bye ***");
	}
	
	public void finish() {
		show();
		System.exit(0);
	}

}