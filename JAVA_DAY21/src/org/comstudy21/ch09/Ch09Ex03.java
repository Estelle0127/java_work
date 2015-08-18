package org.comstudy21.ch09;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ch09Ex03 extends MyFrame {

	private MenuBar mb = new MenuBar();
	private Menu fileMenu = new Menu("File");
	private Menu subMenu = new Menu("Submenu");
	private MenuItem openItem = new MenuItem("Open");
	private MenuItem closeItem = new MenuItem("Close");
	private MenuItem saveItem = new MenuItem("Save");
	private MenuItem exitItem = new MenuItem("Exit");

	public Ch09Ex03() {

		mb.add(fileMenu);
		fileMenu.add(openItem);
		fileMenu.add(closeItem);
		fileMenu.add(subMenu);
		subMenu.add(saveItem);
		fileMenu.add(exitItem);
		this.setMenuBar(mb);

	}

	public static void main(String[] args) {
		new Ch09Ex03();
	}

}
