package org.comstudy21.file;

import java.io.File;
import java.io.IOException;

public class FileIOEx05 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\data2.txt");
		//객체가 생성되어도 파일은 만들어지지 않는다.
		
		if(file.exists())	{
			System.out.println("파일이 존재한다.");
		}else{
			System.out.println("파일이 존재하지 않는다.");
			if(file.createNewFile()){
				System.out.println("파일이 생성되었다.");
			}
		}
		
		
	}
}
