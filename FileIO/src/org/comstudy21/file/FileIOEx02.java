package org.comstudy21.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIOEx02 {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\data.txt");
		InputStream myIn = System.in;
	
		int data = 0;
		System.out.print("ют╥б : ");
		while((data=myIn.read())!=-1){
			fos.write(data);
		}
		fos.close();
	
	}
}
