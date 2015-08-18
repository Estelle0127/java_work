package org.comstudy21.io.homework;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkIO {
	
	public HomeworkIO() throws IOException{
		readFile();
	}
	private void readFile() throws IOException {
		File file = new File("D:\\saram.txt");
		if(file.exists()== false){
			out.println("파일이 존재하지 않습니다.");
			return;
		}
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
	
			String str = in.readLine();
			while((str =in.readLine())!=null){
				System.out.println(str);	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	
	}

public static void main(String[] args) throws IOException {
	new HomeworkIO();
}
}
