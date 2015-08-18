package org.comstudy21.ch05;

import java.util.Scanner;

interface GraphicInterface {
	int Buttons = 20;
	void insert();
	void delete();
}

interface SecondGraphicInterface extends GraphicInterface {
	void showAll();
	void exit();
}

 class Graphic implements GraphicInterface, SecondGraphicInterface {

	
	 
	 @Override
	public void showAll() {
		
		
	}

	@Override
	public void exit() {
		
		exit();
	}

	@Override
	public void insert() {
	
		
	}

	@Override
	public void delete() {
		
		
	}
	
	
}


public class EX6 {
	public static void main(String[] args) {
		Graphic g = new Graphic ();
	Scanner scan = new Scanner(System.in);
	
	}
}
