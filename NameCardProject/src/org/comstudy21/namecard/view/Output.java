package org.comstudy21.namecard.view;

import static org.comstudy21.namecard.Util.*;

import java.util.Vector;

import org.comstudy21.namecard.model.DTO;

import static org.comstudy21.namecard.R.*;

public class Output extends View {

	@Override
	public void show() {
		println("*** Output Menu ***");
		if(session.get("LIST")!=null) {
			Vector<DTO> list = (Vector<DTO>)session.get("LIST");
			for(int i=0; i<list.size(); i++){
				println(list.get(i).toString());
			}
		}
	}

}
