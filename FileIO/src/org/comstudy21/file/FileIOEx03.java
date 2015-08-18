package org.comstudy21.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileIOEx03 {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\data.txt");
		PrintStream myout = System.out;
	
		int data =0;
		
		while((data=fis.read())!= -1){
			myout.write(data);
		}fis.close();
		
	}
}
