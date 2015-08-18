package org.comstudy21.namecard;

import java.util.Hashtable;

import org.comstudy21.namecard.control.Controller;
import org.comstudy21.namecard.view.End;
import org.comstudy21.namecard.view.Input;
import org.comstudy21.namecard.view.Menu;
import org.comstudy21.namecard.view.Output;
import org.comstudy21.namecard.view.Search;

public class R {
	public static final String appTitle = "*** 전화번호부 ***";
	public static final String menuStr = "(1)입력 (2)출력 (3)검색 (4)종료";
	
	public static final Hashtable<String, Object> session = new Hashtable<>();
	
	public static final Controller controller = new Controller();
	public static final Menu menu = new Menu();
	public static final Input input = new Input();
	public static final Output output = new Output();
	public static final Search search = new Search();
	public static final End end = new End();
}
