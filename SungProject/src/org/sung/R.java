package org.sung;

import java.util.Hashtable;
import java.util.Scanner;

import org.sung.controller.Controller;
import org.sung.view.Menu;

public interface R {
 Scanner scan = new Scanner(System.in);
	
	String menuStr= "1. Input 2.output 3.search 4.modify 5.delete 6.exit";
	String menuStr2 = "Choice: ";
	
	Hashtable<String, Object> session = new Hashtable<>();
	Controller controller = new Controller();
	
	Menu menu = new Menu();
}//interface�ȿ��� ��� (public static)�� �� �� �ֱ⿡ ����.

